package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
/* compiled from: PG */
/* renamed from: ogi  reason: default package */
/* loaded from: classes3.dex */
public abstract class ogi extends oil {
    private boolean w = false;

    public ogi() {
        addOnContextAvailableListener(new ogh(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ogk
    public final void f() {
        if (!this.w) {
            this.w = true;
            WatchWhileActivity watchWhileActivity = (WatchWhileActivity) this;
            dwq dwqVar = (dwq) lI();
            watchWhileActivity.a = (zah) dwqVar.a.av.get();
            watchWhileActivity.b = (fpg) dwqVar.ad.get();
            watchWhileActivity.c = (taq) dwqVar.hX.get();
            watchWhileActivity.d = (yvs) dwqVar.jE.get();
            watchWhileActivity.e = axot.a(dwqVar.iQ);
            watchWhileActivity.f = (yiv) dwqVar.fS.get();
            watchWhileActivity.g = (yni) dwqVar.a.y.get();
            ((okb) watchWhileActivity).h = axot.a(dwqVar.a.jT);
            watchWhileActivity.i = axot.a(dwqVar.kv);
            watchWhileActivity.j = (Handler) dwqVar.a.an.get();
            watchWhileActivity.k = axot.a(dwqVar.ix);
            watchWhileActivity.l = axot.a(dwqVar.kw);
            watchWhileActivity.m = axot.a(dwqVar.kz);
            watchWhileActivity.n = axot.a(dwqVar.ad);
            aacz aaczVar = (aacz) dwqVar.a.D.get();
            watchWhileActivity.o = axot.a(dwqVar.a.a.Y);
            azqb azqbVar = dwqVar.gT;
            watchWhileActivity.p = axot.a(dwqVar.af);
            watchWhileActivity.q = axot.a(dwqVar.a.uC);
            watchWhileActivity.r = axot.a(dwqVar.a.my);
            watchWhileActivity.s = axot.a(dwqVar.a.jp);
            watchWhileActivity.t = axot.a(dwqVar.kB);
        }
    }
}
