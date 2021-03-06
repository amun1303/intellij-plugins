package com.intellij.lang.javascript.flex;

import com.intellij.icons.AllIcons;
import com.intellij.ide.highlighter.XmlLikeFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * User: Maxim.Mossienko
 * Date: 12.04.11
 * Time: 13:50
 */
public class MxmlFileType extends XmlLikeFileType {
  public MxmlFileType() {
    super(MxmlLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "MXML";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "MXML files";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "mxml";
  }

  @Override
  public Icon getIcon() {
    return AllIcons.FileTypes.Xml; // TODO own icon
  }
}
