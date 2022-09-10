package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: crfs  reason: default package */
/* loaded from: classes5.dex */
public final class crfs implements crgx {
    public final asik a;
    public boolean b;
    public boolean c;
    private final btrm d;
    private final crfm e;

    public crfs(btrm btrmVar, crfm crfmVar, asik asikVar) {
        this.d = btrmVar;
        this.e = crfmVar;
        this.a = asikVar;
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.crgx
    public final void a() {
        this.b = ((asio) this.a).b;
        this.c = false;
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(asin.class, new crft(0, asin.class, this, bvrj.UI_THREAD));
        a.b(GmmCarProjectionStateEvent.class, new crft(1, GmmCarProjectionStateEvent.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgx
    public final void b() {
        this.d.a(this);
    }

    public final void d() {
        if (this.b || this.c) {
            return;
        }
        this.e.d(false);
    }
}
