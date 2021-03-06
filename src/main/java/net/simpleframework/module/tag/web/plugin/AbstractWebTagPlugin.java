package net.simpleframework.module.tag.web.plugin;

import net.simpleframework.common.ID;
import net.simpleframework.ctx.InjectCtx;
import net.simpleframework.module.common.plugin.AbstractModulePlugin;
import net.simpleframework.module.tag.ITagContext;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public abstract class AbstractWebTagPlugin extends AbstractModulePlugin implements IWebTagPlugin {

	@InjectCtx
	protected ITagContext tagContext;

	@Override
	public void updateTag(final ID contentId, final String text, final String description) {
		tagContext.getTagService().updateTag(getMark(), contentId, text, description);
	}
}
