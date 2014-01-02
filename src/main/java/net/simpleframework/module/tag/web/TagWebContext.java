package net.simpleframework.module.tag.web;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ctx.Module;
import net.simpleframework.ctx.ModuleFunctions;
import net.simpleframework.module.tag.impl.TagContext;
import net.simpleframework.module.tag.web.page.TagsPage;
import net.simpleframework.mvc.ctx.WebModuleFunction;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class TagWebContext extends TagContext {

	@Override
	protected Module createModule() {
		return super.createModule().setDefaultFunction(FUNC_TAGS);
	}

	@Override
	protected ModuleFunctions getFunctions() {
		return ModuleFunctions.of(FUNC_TAGS);
	}

	public static final WebModuleFunction FUNC_TAGS = (WebModuleFunction) new WebModuleFunction(
			TagsPage.class).setName(MODULE_NAME + "-TagsPage").setText($m("TagContext.1"))
			.setDisabled(true);
}
