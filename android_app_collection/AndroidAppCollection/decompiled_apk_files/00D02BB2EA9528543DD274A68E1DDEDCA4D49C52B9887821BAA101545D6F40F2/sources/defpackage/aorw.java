package defpackage;

import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aorw  reason: default package */
/* loaded from: classes2.dex */
public final class aorw implements nxe {
    private final ges a;
    private final akpm b;
    private final akqq c;

    public aorw(ges gesVar, akpm akpmVar, akqq akqqVar) {
        this.a = gesVar;
        this.b = akpmVar;
        this.c = akqqVar;
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
        gga ggaVar = this.a.aE;
        if (ggaVar == null || (ggaVar.K() instanceof ancv)) {
            return;
        }
        akpm akpmVar = this.b;
        alaa a = alad.a();
        a.c(this.c);
        a.c = 16.0f;
        alao.d(akpmVar, a.a());
        ges gesVar = this.a;
        gesVar.aZ(ancv.w(anee.A(gesVar.Rp(R.string.DIRECTIONS_CARD_CHOOSE_FROM_MAP), this.a.Rp(R.string.DIRECTIONS_HEADER_PAN_ZOOM_MAP_UNDER_PIN), null, null, dtyi.az, dtyi.ay, dtyi.aA)));
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.UPDATE_DIRECTIONS_STATE);
    }
}
