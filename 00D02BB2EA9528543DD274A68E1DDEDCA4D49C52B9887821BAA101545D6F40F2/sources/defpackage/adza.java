package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: adza  reason: default package */
/* loaded from: classes.dex */
public final class adza implements acyr {
    public final dbty<dkur> a;
    public final dxio<aczn> b;
    private final dbty<dksx> c;
    private final qbv d;

    public adza(final btvo btvoVar, dxio<aczn> dxioVar, qbv qbvVar) {
        this.b = dxioVar;
        this.d = qbvVar;
        this.a = dbud.a(new dbty(btvoVar) { // from class: adyy
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btvo btvoVar2 = this.a;
                if (!btvoVar2.getPassiveAssistParameters().b()) {
                    dktl bZ = dkur.av.bZ();
                    dktg bZ2 = dkti.e.bZ();
                    dktk dktkVar = dktk.EXPLORE;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dkti dktiVar = (dkti) bZ2.b;
                    dktiVar.b = dktkVar.o;
                    dktiVar.a |= 1;
                    dkti dktiVar2 = (dkti) bZ2.b;
                    dktiVar2.c = 3;
                    dktiVar2.a |= 2;
                    dkti dktiVar3 = (dkti) bZ2.b;
                    dktiVar3.d = 2;
                    dktiVar3.a |= 16;
                    dkti bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dkur dkurVar = (dkur) bZ.b;
                    bK.getClass();
                    dsrj<dkti> dsrjVar = dkurVar.e;
                    if (!dsrjVar.a()) {
                        dkurVar.e = dsqw.cl(dsrjVar);
                    }
                    dkurVar.e.add(bK);
                    dkuo dkuoVar = dkuo.ICON_AND_TEXT;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dkur dkurVar2 = (dkur) bZ.b;
                    dkurVar2.f = dkuoVar.h;
                    dkurVar2.a |= 8;
                    dkur dkurVar3 = (dkur) bZ.b;
                    dkurVar3.ao = 3;
                    dkurVar3.c |= 8388608;
                    dkurVar3.b |= ImageMetadata.LENS_APERTURE;
                    dkurVar3.Z = true;
                    dkur dkurVar4 = (dkur) bZ.b;
                    dkurVar4.as = 1;
                    dkurVar4.d |= 32768;
                    return bZ.bK();
                }
                return btvoVar2.getPassiveAssistParameters().a();
            }
        });
        this.c = dbud.a(new dbty(btvoVar) { // from class: adyz
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getPassiveAssistParameters().f();
            }
        });
    }

    @Override // defpackage.acyr
    public final dkur a() {
        return this.a.a();
    }

    @Override // defpackage.acyr
    public final dksx b() {
        return this.c.a();
    }

    @Override // defpackage.acyr
    public final boolean c() {
        return this.a.a().at;
    }

    @Override // defpackage.acyr
    public final boolean d() {
        dktd dktdVar = this.a.a().an;
        if (dktdVar == null) {
            dktdVar = dktd.c;
        }
        int a = dktc.a(dktdVar.a);
        if (a == 0) {
            a = 2;
        }
        return (a == 2 || a == 1) ? false : true;
    }

    @Override // defpackage.acyr
    public final boolean e() {
        dktd dktdVar = this.a.a().an;
        if (dktdVar == null) {
            dktdVar = dktd.c;
        }
        int a = dktc.a(dktdVar.a);
        if (a == 0) {
            a = 2;
        }
        return d() && a == 4;
    }

    @Override // defpackage.acyr
    public final boolean f() {
        return !g() && this.a.a().ak;
    }

    @Override // defpackage.acyr
    public final boolean g() {
        return ((uim) this.d).c();
    }

    public final boolean h(dktk dktkVar) {
        int a;
        for (dkti dktiVar : this.a.a().e) {
            dktk b = dktk.b(dktiVar.b);
            if (b == null) {
                b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
            if (b == dktkVar && (a = dktf.a(dktiVar.c)) != 0 && a == 4) {
                return true;
            }
        }
        return false;
    }
}
