package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ShowEvent.java */
/* loaded from: classes.dex */
class e extends com.facebook.react.uimanager.events.b<e> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topShow";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), null);
    }
}
