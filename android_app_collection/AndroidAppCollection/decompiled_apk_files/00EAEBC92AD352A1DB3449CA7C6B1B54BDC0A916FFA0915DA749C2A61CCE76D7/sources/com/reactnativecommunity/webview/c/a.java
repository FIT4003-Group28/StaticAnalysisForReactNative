package com.reactnativecommunity.webview.c;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public final class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: f  reason: collision with root package name */
    private final WritableMap f9840f;

    /* renamed from: com.reactnativecommunity.webview.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0197a {
        private C0197a() {
        }

        public /* synthetic */ C0197a(f.c.a.a aVar) {
            this();
        }
    }

    static {
        new C0197a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, WritableMap writableMap) {
        super(i);
        f.c.a.b.b(writableMap, "mEventData");
        this.f9840f = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        f.c.a.b.b(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(g(), d(), this.f9840f);
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
        return "topHttpError";
    }
}
