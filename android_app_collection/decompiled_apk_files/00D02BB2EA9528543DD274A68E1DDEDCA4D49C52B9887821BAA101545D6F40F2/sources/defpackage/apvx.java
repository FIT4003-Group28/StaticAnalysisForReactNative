package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apvx  reason: default package */
/* loaded from: classes2.dex */
public final class apvx implements apyt {
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public final dehq b;
    public final aqwp c;
    public final dxio<aqav> d;
    private final ConcurrentHashMap<String, crzo<apsi<dbsg<apzp>>>> e = new ConcurrentHashMap<>();

    public apvx(dehq dehqVar, aqwp aqwpVar, dxio<aqav> dxioVar) {
        this.b = dehqVar;
        this.c = aqwpVar;
        this.d = dxioVar;
    }

    @Override // defpackage.apyt
    public final dehn<apzp> a(final ctyy ctyyVar, final btlu btluVar, final boolean z) {
        return deha.f(new deff(this, ctyyVar, btluVar, z) { // from class: apvv
            private final apvx a;
            private final ctyy b;
            private final btlu c;
            private final boolean d;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = btluVar;
                this.d = z;
            }

            @Override // defpackage.deff
            public final dehn a() {
                apvx apvxVar = this.a;
                ctyy ctyyVar2 = this.b;
                btlu btluVar2 = this.c;
                boolean z2 = this.d;
                ContactId e = ctyyVar2.b().e();
                apvxVar.b(btluVar2, 1);
                deig d = deig.d();
                ctue ctueVar = ((cteb) apvxVar.d.a().g()).a;
                ctmm c = ctmn.c();
                c.b(ctmr.c);
                ((ctmh) c).a = "set read receipt";
                ctmn a2 = c.a();
                cuig b = cuih.b();
                b.b(z2);
                deha.q(deew.h(ctueVar.a.a(UUID.randomUUID(), new ctxa(ctyyVar2, e, b.a(), dcdc.f(1)), ctueVar.a.d.g(), ctyyVar2, a2, true), ctea.a, dege.a), new apvw(apvxVar, btluVar2, d), apvxVar.b);
                return d;
            }
        }, this.b);
    }

    public final void b(btlu btluVar, int i) {
        crzo<apsi<dbsg<apzp>>> crzoVar;
        String t = btluVar.t();
        if (t == null || (crzoVar = this.e.get(t)) == null) {
            return;
        }
        crzoVar.b(apsi.c(i, this.c.b(btluVar)));
    }

    public final void c(btlu btluVar, dbsg<apzp> dbsgVar) {
        if (!dbsgVar.a()) {
            b(btluVar, 2);
            throw new IllegalStateException("Error updating read receipts for user.");
        }
        b(btluVar, 3);
        dbsgVar.b();
    }
}
