package defpackage;

import android.app.Activity;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aklu  reason: default package */
/* loaded from: classes2.dex */
public final class aklu implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ djsd c;
    final /* synthetic */ akkz d;
    final /* synthetic */ dxio e;
    final /* synthetic */ Activity f;

    public aklu(String str, dbsg dbsgVar, djsd djsdVar, akkz akkzVar, dxio dxioVar, Activity activity) {
        this.a = str;
        this.b = dbsgVar;
        this.c = djsdVar;
        this.d = akkzVar;
        this.e = dxioVar;
        this.f = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.a.isEmpty()) {
            aaan g = aaao.g();
            g.e(this.a);
            dhxu dhxuVar = this.c.b;
            if (dhxuVar == null) {
                dhxuVar = dhxu.s;
            }
            dpuk b = dpuk.b(dhxuVar.d);
            if (b == null) {
                b = dpuk.MAJOR_EVENT;
            }
            g.d(b);
            g.c(true);
            this.d.a(g.a());
            return;
        }
        dhxu dhxuVar2 = this.c.b;
        if (dhxuVar2 == null) {
            dhxuVar2 = dhxu.s;
        }
        if ((dhxuVar2.a & 8) == 0) {
            return;
        }
        afha afhaVar = (afha) this.e.a();
        Activity activity = this.f;
        dhxu dhxuVar3 = this.c.b;
        if (dhxuVar3 == null) {
            dhxuVar3 = dhxu.s;
        }
        dnpq dnpqVar = dhxuVar3.e;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        afhaVar.k(activity, dnpqVar.c, 1);
    }
}
