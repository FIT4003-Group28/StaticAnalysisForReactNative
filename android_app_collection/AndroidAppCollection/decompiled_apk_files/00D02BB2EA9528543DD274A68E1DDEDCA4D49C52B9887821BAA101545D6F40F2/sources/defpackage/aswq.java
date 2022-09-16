package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aswq  reason: default package */
/* loaded from: classes2.dex */
public final class aswq implements Runnable {
    final /* synthetic */ aswz a;

    public aswq(aswz aswzVar) {
        this.a = aswzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.ay.b()) {
            if (!((asio) this.a.ar).b) {
                return;
            }
            bvoo.j(new IllegalStateException("Navigation not running in vanagon mode"));
            return;
        }
        aswz aswzVar = this.a;
        dqvj dqvjVar = aswzVar.ay.l.f;
        Resources Rn = aswzVar.Rn();
        aswz aswzVar2 = this.a;
        bwqv bwqvVar = aswzVar2.al;
        dtjq bZ = dtjt.e.bZ();
        dtju bZ2 = dtjv.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjv dtjvVar = (dtjv) bZ2.b;
        dtjvVar.b = dqvjVar.k;
        dtjvVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar = (dtjt) bZ.b;
        dtjv bK = bZ2.bK();
        bK.getClass();
        dtjtVar.b = bK;
        dtjtVar.a |= 1;
        bZ.b(bwnd.e(amvh.a));
        bZ.b(bwnd.e(amvh.a));
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.SEARCH);
        bxkoVar.g(Rn.getString(R.string.DIRECTIONS_CHOOSE_END_POINT));
        bxkoVar.e("");
        bxkoVar.q(false);
        bxkoVar.F(true);
        bxkoVar.w(1);
        bxkoVar.ad();
        bxkoVar.z(301989891);
        bwnj bwnjVar = new bwnj();
        bwnjVar.p(bwnl.a);
        bwnjVar.c(dtja.FREE_NAV_DESTINATIONS);
        bwnjVar.k(dtjs.DESTINATION);
        bwnjVar.E(bZ.bK());
        bwnjVar.e(true);
        bwnjVar.g(true);
        bwnjVar.M(false);
        asxz asxzVar = new asxz();
        asxzVar.a = aswzVar2;
        asxzVar.aU(bwqvVar, bxkoVar, bwnjVar, null);
        this.a.aE.D(asxzVar);
    }
}
