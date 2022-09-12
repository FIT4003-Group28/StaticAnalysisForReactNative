package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bteq  reason: default package */
/* loaded from: classes4.dex */
public final class bteq extends aug {
    public cqkj ad;
    public cqhn ae;
    public vpd af;
    public cklf ag;
    public btrm ai;
    @dzsi
    public btey aj;
    @dzsi
    private cqkf<btex> ak;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        cqkf<btex> cqkfVar = this.ak;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.aug
    public final void aM(qx qxVar) {
        if (this.ak == null) {
            this.ak = this.ad.e(new btew());
        }
        cqhn cqhnVar = this.ae;
        cklf cklfVar = this.ag;
        boolean z = true;
        boolean z2 = this.af.f(vpc.JAKARTA) == dowl.JAKARTA_EVEN;
        if (this.af.f(vpc.JAKARTA) != dowl.JAKARTA_ODD) {
            z = false;
        }
        this.aj = new btey(cqhnVar, cklfVar, z2, z);
        cqkf<btex> cqkfVar = this.ak;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.aj);
        cqkf<btex> cqkfVar2 = this.ak;
        dbsk.s(cqkfVar2);
        qxVar.k(cqkfVar2.c());
        qxVar.o(R.string.SAVE, new bteo(this));
        qxVar.l(R.string.CANCEL_BUTTON, new btep());
    }
}
