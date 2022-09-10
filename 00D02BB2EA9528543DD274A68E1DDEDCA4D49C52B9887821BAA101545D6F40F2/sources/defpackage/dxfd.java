package defpackage;

import com.spotify.protocol.types.Message;
/* compiled from: PG */
/* renamed from: dxfd  reason: default package */
/* loaded from: classes6.dex */
public final class dxfd {
    public static final dxga a;
    public static final dxfc g;
    public volatile boolean b;
    public final dxfu c;
    public final dxfs d;
    public final dxgc e;
    public final dxfp f;
    private final dxgx h;
    private final dxfy i;

    static {
        dxga dxgaVar = new dxga();
        a = dxgaVar;
        g = new dxfc(dxgaVar);
        dxfo dxfoVar = new dxfo();
        dxgt.a = dxfoVar;
        dxgt.b = dxfoVar;
    }

    public dxfd(dxgx dxgxVar, dxfu dxfuVar, dxfs dxfsVar, dxgc dxgcVar, dxfp dxfpVar, dxfy dxfyVar) {
        this.h = dxgxVar;
        this.c = dxfuVar;
        this.d = dxfsVar;
        this.e = dxgcVar;
        this.f = dxfpVar;
        this.i = dxfyVar;
    }

    public static void a(dxfd dxfdVar) {
        if (dxfdVar.b) {
            dxfdVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = false;
        try {
            ((dxgz) ((dxgb) this.h).a).b.a(new Object[]{6, new Message("The client is shutting down"), "wamp.client_request.system_shutdown"});
        } catch (dxhn unused) {
        }
        this.i.a();
    }
}
