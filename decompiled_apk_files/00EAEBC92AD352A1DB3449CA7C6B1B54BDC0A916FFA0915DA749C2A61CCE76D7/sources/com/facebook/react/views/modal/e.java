package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class e extends com.facebook.react.uimanager.events.c<e> {
    /* JADX INFO: Access modifiers changed from: protected */
    public e(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), null);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topRequestClose";
    }
}
