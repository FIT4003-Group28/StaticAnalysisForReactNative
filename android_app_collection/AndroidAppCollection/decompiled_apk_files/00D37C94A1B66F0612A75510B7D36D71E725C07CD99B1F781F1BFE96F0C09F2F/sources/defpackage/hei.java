package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hei  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hei implements Runnable {
    public final /* synthetic */ hes a;

    public /* synthetic */ hei(hes hesVar) {
        this.a = hesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp e;
        hes hesVar = this.a;
        if (!hesVar.aN() || (e = hesVar.mL().e(R.id.reel_container)) == null) {
            return;
        }
        acti oi = e instanceof acth ? ((acth) e).oi() : null;
        if (oi != null) {
            oi.n(new acte(hesVar.ap.n));
            apok apokVar = hesVar.ap.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            oi.n(new acte(apojVar.t));
            apok apokVar2 = hesVar.ap.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            oi.n(new acte(apojVar2.t));
        }
        ajgx.o(hesVar.at, hesVar.ap, hesVar.af, oi, false, new heq(hesVar), null, null);
    }
}
