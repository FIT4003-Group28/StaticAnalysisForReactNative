package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: afhj  reason: default package */
/* loaded from: classes2.dex */
public final class afhj {
    private final dxio<ahjq> a;
    private final akpm b;
    private final dxio<hwd> c;
    private final gga d;

    public afhj(dxio<ahjq> dxioVar, akpm akpmVar, dxio<hwd> dxioVar2, gga ggaVar) {
        this.a = dxioVar;
        this.b = akpmVar;
        this.c = dxioVar2;
        this.d = ggaVar;
    }

    public static dhjx b(afia afiaVar, akpm akpmVar, Resources resources, ahjq ahjqVar) {
        dhkd dhkdVar = akpmVar.aa().d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        akqq c = c(afiaVar, akpmVar, ahjqVar);
        double m = akqo.m(d(afiaVar, akpmVar, resources, ahjqVar), c.a, 30.0d, dhkdVar.c);
        dhjw bZ = dhjx.f.bZ();
        dhjy bZ2 = dhjz.e.bZ();
        double d = c.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d;
        double d2 = c.b;
        int i2 = i | 1;
        dhjzVar.a = i2;
        dhjzVar.b = d2;
        dhjzVar.a = i2 | 4;
        dhjzVar.d = m;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ.b;
        dhjz bK = bZ2.bK();
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        dhka bZ3 = dhkb.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkb dhkbVar = (dhkb) bZ3.b;
        int i3 = dhkbVar.a | 1;
        dhkbVar.a = i3;
        dhkbVar.b = 0.0f;
        int i4 = i3 | 2;
        dhkbVar.a = i4;
        dhkbVar.c = 0.0f;
        dhkbVar.a = i4 | 4;
        dhkbVar.d = 0.0f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ.b;
        dhkb bK2 = bZ3.bK();
        bK2.getClass();
        dhjxVar2.c = bK2;
        dhjxVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ.b;
        dhkdVar.getClass();
        dhjxVar3.d = dhkdVar;
        int i5 = dhjxVar3.a | 4;
        dhjxVar3.a = i5;
        dhjxVar3.a = i5 | 8;
        dhjxVar3.e = 30.0f;
        return bZ.bK();
    }

    public static akqq c(afia afiaVar, akpm akpmVar, ahjq ahjqVar) {
        akqq d = afiaVar.d();
        if (d != null) {
            return d;
        }
        dhjx Z = akpmVar.Z();
        GmmLocation a = ahjqVar.a();
        if (a != null) {
            return a.B();
        }
        dhjz dhjzVar = Z.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        return akqq.j(dhjzVar);
    }

    public static double d(afia afiaVar, akpm akpmVar, Resources resources, ahjq ahjqVar) {
        akqq akqqVar = afiaVar.g;
        if (akqqVar == null) {
            akqqVar = afiaVar.f;
        }
        if (akqqVar == null) {
            Float f = afiaVar.h;
            if (f == null) {
                return 15.0d;
            }
            return f.floatValue();
        }
        akqs akqsVar = new akqs(c(afiaVar, akpmVar, ahjqVar), akqqVar.a, akqqVar.b);
        dhkd dhkdVar = akpmVar.Z().d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        return akqo.l(akqsVar, dhkdVar.c, dhkdVar.b, resources.getDisplayMetrics().density);
    }

    public final void a(afia afiaVar) {
        akqq d = afiaVar.d();
        if (d == null) {
            return;
        }
        alaa a = alad.a();
        a.c(d);
        a.c = (float) d(afiaVar, this.b, this.d.getResources(), this.a.a());
        alad a2 = a.a();
        bvrj.UI_THREAD.c();
        akpm akpmVar = this.b;
        akyc e = akyt.e(a2);
        e.b = 0;
        akpmVar.p(e);
        this.c.a().j();
    }
}
