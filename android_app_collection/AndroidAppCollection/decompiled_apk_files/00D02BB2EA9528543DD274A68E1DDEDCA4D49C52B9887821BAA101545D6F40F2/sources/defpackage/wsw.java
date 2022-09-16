package defpackage;

import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wsw  reason: default package */
/* loaded from: classes7.dex */
public final class wsw implements nxe {
    private final gfw a;
    private final String b;
    private final boolean c;

    public wsw(gfw gfwVar, String str, btvo btvoVar) {
        this.a = gfwVar;
        this.b = str;
        this.c = btvoVar.getEnableFeatureParameters().ah;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        dtqw dtqwVar = dthbVar.r;
        if (dtqwVar == null) {
            dtqwVar = dtqw.h;
        }
        return dtqwVar.c;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        gfv w;
        if (!((fd) this.a).U()) {
            return;
        }
        ff J = ((fd) this.a).J();
        aneb z = anee.z();
        z.g(dtxn.bS);
        z.c(dtxn.bT);
        z.e(dtxn.bU);
        if (this.c) {
            z.r(J.getString(R.string.CHOOSE_ON_MAP_TITLE));
            z.q(J.getString(R.string.CHOOSE_A_PLACE_SUBTITLE));
            w = andm.g(z.a());
        } else {
            z.r(this.b);
            z.q(J.getString(R.string.DIRECTIONS_HEADER_PAN_ZOOM_MAP_UNDER_PIN));
            w = ancv.w(z.a());
        }
        this.a.aZ(w);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.UPDATE_DIRECTIONS_STATE);
    }
}
