package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: betx  reason: default package */
/* loaded from: classes3.dex */
public class betx implements bnif, bega {
    private final dxio<zza> a;
    private final Activity b;
    @dzsi
    private bwrs<ilo> c;
    private cjtd d = cjtd.b;

    public betx(dxio<zza> dxioVar, Activity activity) {
        this.a = dxioVar;
        this.b = activity;
    }

    @Override // defpackage.bnif
    public Boolean a() {
        return w();
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(2131231789, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo iloVar = (ilo) bwrs.b(this.c);
        if (iloVar != null) {
            zza a = this.a.a();
            akqq aj = iloVar.aj();
            if (aj != null) {
                gga ggaVar = a.a;
                zyy zyyVar = new zyy();
                zyyVar.B(bvrs.d(new zzk(aj).a()));
                ggaVar.D(zyyVar);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.d;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.b.getString(R.string.DISTANCE_TOOL);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.f20if;
        this.d = c2.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
        this.d = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
