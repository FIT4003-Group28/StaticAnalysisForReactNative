package com.reactnativecommunity.webview.c;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public final class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: f  reason: collision with root package name */
    private final WritableMap f9847f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f.c.a.a aVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i, WritableMap writableMap) {
        super(i);
        f.c.a.b.b(writableMap, "mData");
        this.f9847f = writableMap;
        this.f9847f.putString("navigationType", "other");
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        f.c.a.b.b(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(g(), "topShouldStartLoadWithRequest", this.f9847f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topShouldStartLoadWithRequest";
    }
}
