package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bynh  reason: default package */
/* loaded from: classes4.dex */
public final class bynh implements btzi<dwnn, dwnp> {
    final /* synthetic */ bynq a;

    public bynh(bynq bynqVar) {
        this.a = bynqVar;
    }

    private final void c(@dzsi dwnp dwnpVar, @dzsi bttq bttqVar) {
        if (!this.a.d.a()) {
            return;
        }
        if (dwnpVar == null || bttqVar != null) {
            bynq bynqVar = this.a;
            bynqVar.i = bynqVar.e.getString(R.string.UNABLE_TO_LOAD_DATA);
            this.a.j = cqrt.f(2131231711);
            this.a.h = bynf.ERROR;
        } else if (!dwnpVar.a.isEmpty()) {
            dwnl dwnlVar = dwnpVar.a.get(0);
            amwb D = amwb.D(dwnlVar);
            this.a.P(D);
            bykw bykwVar = this.a.u;
            if (bykwVar != null) {
                bykwVar.a(D);
            }
            if (!TextUtils.isEmpty(dwnlVar.q) && !TextUtils.isEmpty(dwnlVar.r)) {
                bynq bynqVar2 = this.a;
                bynqVar2.l = dwnlVar.q;
                bynqVar2.m = dwnlVar.r;
            }
            this.a.h = bynf.LOADED;
        } else {
            bynq bynqVar3 = this.a;
            bynqVar3.i = bynqVar3.e.getString(R.string.TRAFFIC_INCIDENT_CLEARED_UP);
            this.a.h = bynf.LOADED;
        }
        cqkx.p(this.a);
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwnn> btzrVar, btzy btzyVar) {
        c(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwnn> btzrVar, dwnp dwnpVar) {
        c(dwnpVar, null);
    }
}
