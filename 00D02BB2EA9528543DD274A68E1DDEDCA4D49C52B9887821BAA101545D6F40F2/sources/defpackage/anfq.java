package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anfq  reason: default package */
/* loaded from: classes2.dex */
public final class anfq implements apkp {
    public transient gfq a;
    public transient anft b;
    public transient ckcw c;
    private final aogb d;
    private final dbsg<anho> e;
    private final dbsg<String> f;
    private final dbsg<dvay> g;
    private final transient dbsg<gfw> h;

    public anfq(dbsg<dvay> dbsgVar, aogb aogbVar, dbsg<anho> dbsgVar2, dbsg<String> dbsgVar3, dbsg<gfw> dbsgVar4) {
        this.d = aogbVar;
        this.e = dbsgVar2;
        this.f = dbsgVar3;
        this.h = dbsgVar4;
        this.g = dbsgVar;
    }

    @Override // defpackage.apkp
    public final void a(Activity activity) {
        ((anfy) btsq.c(anfy.class, activity)).wO(this);
        if (!(this.a.d() instanceof aoou)) {
            dbsg<dvay> dbsgVar = this.g;
            aogb aogbVar = this.d;
            dbsg<anho> dbsgVar2 = this.e;
            dbsg<String> dbsgVar3 = this.f;
            aoou aoouVar = new aoou();
            Bundle bundle = new Bundle();
            bundle.putSerializable("initial-day-identifier", aogbVar);
            if (dbsgVar2.a()) {
                bundle.putSerializable("initial-duration", dbsgVar2.b());
            }
            if (dbsgVar3.a()) {
                bundle.putString("token-identifier", dbsgVar3.b());
            }
            if (dbsgVar.a()) {
                bundle.putSerializable("original-segment", bvrt.b(dbsgVar.b()));
            }
            aoouVar.B(bundle);
            if (this.h.a()) {
                this.h.b().aZ(aoouVar);
            } else {
                this.b.H(aoouVar);
            }
        }
    }

    @Override // defpackage.apkp
    public final void b(Activity activity) {
        ((anfy) btsq.c(anfy.class, activity)).wO(this);
        ((ckcn) this.c.a(ckgo.s)).a();
    }

    @Override // defpackage.apkp
    public final void c(Activity activity) {
        ((anfy) btsq.c(anfy.class, activity)).wO(this);
        ((ckcn) this.c.a(ckgo.v)).a();
    }
}
