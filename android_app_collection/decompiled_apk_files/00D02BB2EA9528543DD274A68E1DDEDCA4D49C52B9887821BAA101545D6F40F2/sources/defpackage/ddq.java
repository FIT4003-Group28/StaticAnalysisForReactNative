package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ddq  reason: default package */
/* loaded from: classes6.dex */
final class ddq implements akzt {
    final /* synthetic */ ddr a;

    public ddq(ddr ddrVar) {
        this.a = ddrVar;
    }

    @Override // defpackage.akzt
    public final void a() {
    }

    @Override // defpackage.akzt
    public final void b() {
        final ddr ddrVar = this.a;
        if (!ddrVar.a.aZ) {
            return;
        }
        dds.e(ddrVar.d, ddrVar.b, new dbsz(ddrVar) { // from class: ddl
            private final ddr a;

            {
                this.a = ddrVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ddr ddrVar2 = this.a;
                ddx ddxVar = (ddx) obj;
                if (!ddrVar2.a.aZ || ddxVar.d) {
                    return;
                }
                View af = ddrVar2.f.af();
                jlo a = ddrVar2.i.a(ddrVar2.a.getString(R.string.CALIBRATOR_TOOLTIP_MESSAGE), af);
                a.t(jln.GM2_BLUE);
                a.b(((-af.getHeight()) / 2) + 100);
                a.o(true);
                a.m(5000);
                ddrVar2.q = a.a();
                ddrVar2.j.f(af, ddrVar2.a.getString(R.string.CALIBRATOR_TOOLTIP_MESSAGE));
                dds.f(ddrVar2.d, ddrVar2.e, ddd.a);
            }
        });
        this.a.b.execute(new Runnable(this) { // from class: ddp
            private final ddq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ddq ddqVar = this.a;
                ddr ddrVar2 = ddqVar.a;
                if (!ddrVar2.a.aZ || !ddrVar2.m.a().booleanValue()) {
                    return;
                }
                ddqVar.a.g.a().m().h(amwd.COMPASS);
                ddqVar.a.p = true;
            }
        });
    }

    @Override // defpackage.akzt
    public final void c() {
    }
}
