package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pja  reason: default package */
/* loaded from: classes7.dex */
public class pja implements piu {
    public final gga a;
    private final List<piv> b;

    public pja(gga ggaVar, cqat cqatVar, cqhn cqhnVar, pff pffVar, final pjc pjcVar) {
        final ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = ggaVar;
        pffVar.d(pfb.a, cqatVar.b() - TimeUnit.DAYS.toMillis(7L)).k(new dbrn(pjcVar) { // from class: piw
            private final pjc a;

            {
                this.a = pjcVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                pjc pjcVar2 = this.a;
                dfoe dfoeVar = (dfoe) ((pfm) obj).e;
                dbsk.s(dfoeVar);
                begg a = pjcVar2.a.a();
                pjc.a(a, 1);
                pjc.a(dfoeVar, 2);
                return new pjb(a, dfoeVar);
            }
        }).g(new mw(arrayList) { // from class: pix
            private final List a;

            {
                this.a = arrayList;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.add((pjb) obj);
            }
        }, new Runnable(this) { // from class: piy
            private final pja a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.piu
    public jib a() {
        jhz a = jhz.a();
        a.a = this.a.getString(pes.RECENT);
        a.f(new View.OnClickListener(this) { // from class: piz
            private final pja a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        a.x = false;
        return a.b();
    }

    @Override // defpackage.piu
    public List<piv> b() {
        return this.b;
    }
}
