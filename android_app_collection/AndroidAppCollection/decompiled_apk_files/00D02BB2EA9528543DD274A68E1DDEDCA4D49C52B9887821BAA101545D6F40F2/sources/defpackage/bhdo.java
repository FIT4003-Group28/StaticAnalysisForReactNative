package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhdo  reason: default package */
/* loaded from: classes3.dex */
public class bhdo implements bhdi {
    public final bhdr a;
    public boolean b;
    private final Activity e;
    private final bhdh f;
    private boolean g;
    @dzsi
    private bwrs<ilo> h;
    final bhdn d = new bhdn(this);
    public List<dged> c = dcdc.e();

    public bhdo(Activity activity, bhdh bhdhVar, cqhn cqhnVar, bhdr bhdrVar) {
        this.e = activity;
        this.f = bhdhVar;
        this.a = bhdrVar;
    }

    private static boolean k(@dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        return iloVar != null && !TextUtils.isEmpty(iloVar.cQ());
    }

    private final boolean l() {
        return !this.c.isEmpty() && this.a.a().a().isEmpty();
    }

    @Override // defpackage.bhdi
    public Boolean a() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bhdi
    public Boolean b() {
        boolean z = false;
        if (!this.g && !this.b && !this.c.isEmpty() && !l()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhdi
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bhdi
    public Boolean d() {
        boolean z = true;
        if (this.g || this.b || (!this.c.isEmpty() && !l())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhdi
    public bhdj e() {
        return this.a;
    }

    @Override // defpackage.bhdi
    public cqkl f() {
        i();
        return cqkl.a;
    }

    @Override // defpackage.bhdi
    public cjtd g(ddho ddhoVar) {
        ilo iloVar = (ilo) bwrs.b(this.h);
        cjta c = cjtd.c(iloVar == null ? null : iloVar.bZ());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bhdi
    public Boolean h() {
        return Boolean.valueOf(bvox.b(this.e));
    }

    public void i() {
        if (this.g || !w().booleanValue() || !this.a.a().a().isEmpty()) {
            return;
        }
        bwrs<ilo> bwrsVar = this.h;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        bhdh bhdhVar = this.f;
        bhdn bhdnVar = this.d;
        String cQ = c.cQ();
        bvdn bvdnVar = bhdhVar.e;
        dilz bZ = dimc.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dimc dimcVar = (dimc) bZ.b;
        cQ.getClass();
        dimcVar.a |= 4;
        dimcVar.c = cQ;
        dnqg bZ2 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        int i = ddda.cO.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ2.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dimc dimcVar2 = (dimc) bZ.b;
        dnqh bK = bZ2.bK();
        bK.getClass();
        dimcVar2.b = bK;
        dimcVar2.a |= 2;
        dcdc<dgef> dcdcVar = bhdh.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dgef dgefVar = dcdcVar.get(i2);
            dima bZ3 = dimb.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dimb dimbVar = (dimb) bZ3.b;
            dimbVar.b = dgefVar.x;
            dimbVar.a = 1 | dimbVar.a;
            bZ.a(bZ3.bK());
        }
        apyx apyxVar = bhdhVar.d;
        if (apyxVar.d() && apyxVar.b.a().getMerchantExperienceParameters().g) {
            dima bZ4 = dimb.c.bZ();
            dgef dgefVar2 = dgef.ENABLE_MESSAGING;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dimb dimbVar2 = (dimb) bZ4.b;
            dimbVar2.b = dgefVar2.x;
            dimbVar2.a |= 1;
            bZ.a(bZ4.bK());
        }
        bvdnVar.b(bZ.bK(), new bhdf(bhdnVar), bhdhVar.b);
        this.g = true;
        this.b = false;
        cqkx.p(this);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!k(bwrsVar)) {
            return;
        }
        this.h = bwrsVar;
        this.a.t(bwrsVar);
        i();
    }

    @Override // defpackage.bega
    public void u() {
        this.a.u();
        this.h = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(k(this.h));
    }
}
