package net.simpleframework.module.tag.web;

import static net.simpleframework.common.I18n.$m;

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
	protected ModuleFunctions getFunctions() {
		return ModuleFunctions.of((WebModuleFunction) new WebModuleFunction(this, TagsPage.class)
				.setName(MODULE_NAME + "-TagsPage").setText($m("TagContext.1")).setDisabled(true));
	}
}
