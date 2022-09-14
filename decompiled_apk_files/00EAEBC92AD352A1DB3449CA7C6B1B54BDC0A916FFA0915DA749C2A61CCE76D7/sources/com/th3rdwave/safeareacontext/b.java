package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: f  reason: collision with root package name */
    private a f10090f;

    /* renamed from: g  reason: collision with root package name */
    private c f10091g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i, a aVar, c cVar) {
        super(i);
        this.f10090f = aVar;
        this.f10091g = cVar;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", l.b(this.f10090f));
        createMap.putMap("frame", l.b(this.f10091g));
        rCTEventEmitter.receiveEvent(g(), d(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topInsetsChange";
    }
}
