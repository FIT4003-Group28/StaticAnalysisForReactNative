package com.facebook.react.flat;

import com.facebook.react.views.textinput.ReactTextInputManager;
/* loaded from: classes.dex */
public class RCTTextInputManager extends ReactTextInputManager {
    static final String REACT_CLASS = "AndroidTextInput";

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public ab mo168createShadowNodeInstance() {
        return new ab();
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    public Class<ab> getShadowNodeClass() {
        return ab.class;
    }
}
