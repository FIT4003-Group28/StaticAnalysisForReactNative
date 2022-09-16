package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axsr  reason: default package */
/* loaded from: classes3.dex */
final class axsr implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ axss b;

    public axsr(axss axssVar, boolean z) {
        this.b = axssVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ilo iloVar;
        if (this.a) {
            ilo iloVar2 = (ilo) this.b.a.c();
            dbsk.s(iloVar2);
            ily g = iloVar2.g();
            g.C(this.b.b);
            g.b.y = true;
            this.b.a.d(g.d());
            axss axssVar = this.b;
            if (axssVar.b && (iloVar = (ilo) axssVar.a.c()) != null) {
                axtp axtpVar = this.b.c;
                axtpVar.p.a().f(iloVar, 2);
                axtpVar.f.b(bwka.a(iloVar, axtpVar.g));
            }
            this.b.c.f.b(azrg.c(1, this.b.a));
            return;
        }
        axss axssVar2 = this.b;
        axssVar2.c.S(axssVar2.a);
        ckos.a(this.b.c.b.findViewById(16908290), this.b.c.b.getString(R.string.FAILED_TO_SAVE_PLACE), -1).c();
    }
}
