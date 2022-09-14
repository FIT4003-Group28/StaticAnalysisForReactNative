package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: RequestCloseEvent.java */
/* loaded from: classes.dex */
class d extends com.facebook.react.uimanager.events.b<d> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topRequestClose";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), null);
    }
}
