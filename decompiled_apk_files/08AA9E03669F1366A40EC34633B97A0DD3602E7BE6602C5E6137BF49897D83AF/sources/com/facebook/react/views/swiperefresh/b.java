package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: RefreshEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<b> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topRefresh";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), null);
    }
}
