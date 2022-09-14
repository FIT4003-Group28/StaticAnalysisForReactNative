package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
/* loaded from: classes.dex */
public class b extends c<b> {
    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), null);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topRefresh";
    }
}
