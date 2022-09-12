package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chkv  reason: default package */
/* loaded from: classes4.dex */
public final class chkv {
    public final Resources a;
    private final chjl b;
    private final chjt c;
    private final chjr d;
    private final chjv e;
    private final chjz f;
    private final chko g;
    private final chkr h;
    private final chku i;
    private final chlv j;
    private final chly k;

    public chkv(chjl chjlVar, chjt chjtVar, chjr chjrVar, chjv chjvVar, chjz chjzVar, chko chkoVar, chkr chkrVar, chku chkuVar, chlv chlvVar, chly chlyVar, Resources resources) {
        this.b = chjlVar;
        this.c = chjtVar;
        this.d = chjrVar;
        this.e = chjvVar;
        this.f = chjzVar;
        this.g = chkoVar;
        this.h = chkrVar;
        this.i = chkuVar;
        this.j = chlvVar;
        this.k = chlyVar;
        this.a = resources;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<chmv> a(chmu chmuVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        chjc chjyVar;
        bwrs<ilo> bwrsVar;
        chjc chluVar;
        chle chleVar;
        chjd chlxVar;
        chmu chmuVar2;
        int i6;
        chle chleVar2 = (chle) chmuVar;
        chik chikVar = chleVar2.a;
        int i7 = chikVar.a;
        int i8 = 0;
        int i9 = 1;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 3 : 2 : 1 : 4;
        int i11 = i10 - 1;
        chmr chmrVar = null;
        if (i10 != 0) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return dbpy.a;
                    }
                    chku chkuVar = this.i;
                    Executor a = chkuVar.a.a();
                    chku.a(a, 1);
                    buqs a2 = chkuVar.b.a();
                    chku.a(a2, 2);
                    chku.a(chmuVar, 3);
                    chkt chktVar = new chkt(a, a2, chmuVar);
                    chktVar.f();
                    return dbsg.i(chktVar);
                }
                djfl djflVar = (i7 == 2 ? (chig) chikVar.b : chig.f).b;
                if (djflVar == null) {
                    djflVar = djfl.e;
                }
                int i12 = djflVar.b;
                int i13 = i12 != 0 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? 0 : 4 : 3 : 2 : 1 : 5;
                int i14 = i13 - 1;
                if (i13 == 0) {
                    throw null;
                }
                if (i14 != 0) {
                    if (i14 == 1) {
                        chko chkoVar = this.g;
                        Activity activity = (Activity) ((dxjd) chkoVar.a).a;
                        chko.a(activity, 1);
                        chko.a(chkoVar.b.a(), 2);
                        Executor a3 = chkoVar.c.a();
                        chko.a(a3, 3);
                        buqs a4 = chkoVar.d.a();
                        chko.a(a4, 4);
                        cklf a5 = chkoVar.e.a();
                        chko.a(a5, 5);
                        bmdv a6 = chkoVar.f.a();
                        chko.a(a6, 6);
                        dxio a7 = ((dxjh) chkoVar.g).a();
                        chko.a(a7, 7);
                        axru a8 = chkoVar.h.a();
                        chko.a(a8, 8);
                        axrx a9 = chkoVar.i.a();
                        chko.a(a9, 9);
                        bbut a10 = chkoVar.j.a();
                        chko.a(a10, 10);
                        Resources a11 = chkoVar.k.a();
                        chko.a(a11, 11);
                        cdfx a12 = chkoVar.l.a();
                        chko.a(a12, 12);
                        chkg a13 = chkoVar.m.a();
                        chko.a(a13, 13);
                        chko.a(chmuVar, 14);
                        chleVar = chleVar2;
                        chkn chknVar = new chkn(activity, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, chmuVar);
                        chmuVar2 = chmuVar;
                        chlxVar = chknVar;
                        i9 = 1;
                    } else if (i14 != 2) {
                        chleVar = chleVar2;
                        chmuVar2 = chmuVar;
                        chlxVar = null;
                    } else {
                        chjr chjrVar = this.d;
                        cchz a14 = chjrVar.a.a();
                        chjr.a(a14, 1);
                        chjr.a(chjrVar.b.a(), 2);
                        Executor a15 = chjrVar.c.a();
                        chjr.a(a15, 3);
                        ccif a16 = chjrVar.d.a();
                        chjr.a(a16, 4);
                        Resources a17 = chjrVar.e.a();
                        chjr.a(a17, 5);
                        chjr.a(chmuVar, 6);
                        chlxVar = new chjq(a14, a15, a16, a17, chmuVar);
                        chleVar = chleVar2;
                        chmuVar2 = chmuVar;
                    }
                    i6 = 2;
                } else {
                    chleVar = chleVar2;
                    bqji a18 = this.k.a.a();
                    chly.a(a18, 1);
                    chmuVar2 = chmuVar;
                    i9 = 1;
                    i6 = 2;
                    chly.a(chmuVar2, 2);
                    chlxVar = new chlx(a18, chmuVar2);
                }
                if (chlxVar != null) {
                    chlxVar.f();
                    chik chikVar2 = chleVar.a;
                    chid chidVar = (chikVar2.a == i6 ? (chig) chikVar2.b : chig.f).c;
                    if (chidVar == null) {
                        chidVar = chid.c;
                    }
                    djft djftVar = chidVar.b;
                    if (djftVar == null) {
                        djftVar = djft.c;
                    }
                    int i15 = djftVar.a;
                    if (i15 == 0) {
                        i8 = 4;
                    } else if (i15 == i9) {
                        i8 = 1;
                    } else if (i15 == i6) {
                        i8 = 2;
                    } else if (i15 == 3) {
                        i8 = 3;
                    }
                    int i16 = i8 - 1;
                    if (i8 == 0) {
                        throw null;
                    }
                    chje chizVar = i16 != 0 ? i16 != i9 ? i16 != i6 ? null : new chiz(chmuVar2) : new chjn(chmuVar2) : new chks(chmuVar2);
                    if (chizVar != null) {
                        chlxVar.a = chizVar;
                    }
                }
                return dbsg.j(chlxVar);
            }
            djdm djdmVar = (i7 == 1 ? (chhy) chikVar.b : chhy.e).b;
            if (djdmVar == null) {
                djdmVar = djdm.c;
            }
            int i17 = djdmVar.a;
            if (i17 == 0) {
                i = 4;
                i2 = 6;
            } else if (i17 == 1) {
                i = 4;
                i2 = 1;
            } else if (i17 == 2) {
                i = 4;
                i2 = 2;
            } else if (i17 != 3) {
                i = 4;
                i2 = i17 != 4 ? i17 != 5 ? 0 : 5 : 4;
            } else {
                i = 4;
                i2 = 3;
            }
            int i18 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 == 2) {
                        i3 = 4;
                        i4 = 3;
                        chlv chlvVar = this.j;
                        cchz a19 = chlvVar.a.a();
                        chlv.a(a19, 1);
                        btvo a20 = chlvVar.b.a();
                        chlv.a(a20, 2);
                        chjx a21 = chlvVar.c.a();
                        chlv.a(a21, 3);
                        chkd a22 = chlvVar.d.a();
                        chlv.a(a22, 4);
                        chiu a23 = chlvVar.e.a();
                        chlv.a(a23, 5);
                        chlv.a(chmuVar, 6);
                        chluVar = new chlu(a19, a20, a21, a22, a23, chmuVar);
                    } else if (i18 != 3) {
                        if (i18 != i) {
                            chjyVar = null;
                        } else {
                            chjt chjtVar = this.c;
                            cchz a24 = chjtVar.a.a();
                            chjt.a(a24, 1);
                            chiu a25 = chjtVar.b.a();
                            chjt.a(a25, 2);
                            Resources a26 = chjtVar.c.a();
                            chjt.a(a26, 3);
                            chjt.a(chmuVar, i);
                            chjyVar = new chjs(a24, a25, a26, chmuVar);
                        }
                        i3 = 4;
                        i5 = 6;
                        i4 = 3;
                    } else {
                        chkr chkrVar = this.h;
                        btvo a27 = chkrVar.a.a();
                        chkr.a(a27, 1);
                        chjx a28 = chkrVar.b.a();
                        chkr.a(a28, 2);
                        chkd a29 = chkrVar.c.a();
                        chkr.a(a29, 3);
                        chiu a30 = chkrVar.d.a();
                        chkr.a(a30, i);
                        chkr.a(chmuVar, 5);
                        i3 = 4;
                        i4 = 3;
                        chluVar = new chkq(a27, a28, a29, a30, chmuVar);
                    }
                    chjyVar = chluVar;
                } else {
                    i3 = 4;
                    i4 = 3;
                    chjv chjvVar = this.e;
                    cchz a31 = chjvVar.a.a();
                    chjv.a(a31, 1);
                    chiu a32 = chjvVar.b.a();
                    chjv.a(a32, 2);
                    chjv.a(chmuVar, 3);
                    chjyVar = new chju(a31, a32, chmuVar);
                }
                i5 = 6;
            } else {
                i3 = 4;
                i4 = 3;
                chjz chjzVar = this.f;
                cchz a33 = chjzVar.a.a();
                chjz.a(a33, 1);
                btvo a34 = chjzVar.b.a();
                chjz.a(a34, 2);
                chjx a35 = chjzVar.c.a();
                chjz.a(a35, 3);
                chkd a36 = chjzVar.d.a();
                chjz.a(a36, 4);
                chiu a37 = chjzVar.e.a();
                chjz.a(a37, 5);
                chjz.a(chmuVar, 6);
                i5 = 6;
                chjyVar = new chjy(a33, a34, a35, a36, a37, chmuVar);
            }
            if (chjyVar != null) {
                chik chikVar3 = chleVar2.a;
                djgh djghVar = (chikVar3.a == 1 ? (chhy) chikVar3.b : chhy.e).d;
                if (djghVar == null) {
                    djghVar = djgh.b;
                }
                int i19 = djghVar.a;
                if (i19 == 0) {
                    i8 = 2;
                } else if (i19 == i5) {
                    i8 = 1;
                }
                int i20 = i8 - 1;
                if (i8 == 0) {
                    throw null;
                }
                if (i20 == 0 && (bwrsVar = chleVar2.b.g) != null) {
                    chjl chjlVar = this.b;
                    gga a38 = chjlVar.a.a();
                    chjl.a(a38, 1);
                    chjl.a(chjlVar.b.a(), 2);
                    beya a39 = chjlVar.c.a();
                    chjl.a(a39, i4);
                    bfct a40 = chjlVar.d.a();
                    chjl.a(a40, i3);
                    bfbc a41 = chjlVar.e.a();
                    chjl.a(a41, 5);
                    bfaq a42 = chjlVar.f.a();
                    chjl.a(a42, i5);
                    dbpk a43 = chjlVar.g.a();
                    chjl.a(a43, 7);
                    bwqv a44 = chjlVar.h.a();
                    chjl.a(a44, 8);
                    bvrb a45 = chjlVar.i.a();
                    chjl.a(a45, 9);
                    dxio a46 = ((dxjh) chjlVar.j).a();
                    chjl.a(a46, 10);
                    Executor a47 = chjlVar.k.a();
                    chjl.a(a47, 11);
                    bfbl a48 = chjlVar.l.a();
                    chjl.a(a48, 12);
                    bfbn a49 = chjlVar.m.a();
                    chjl.a(a49, 13);
                    chjl.a(bwrsVar, 14);
                    chmrVar = new chjk(a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, bwrsVar);
                }
                chmr chmrVar2 = chmrVar;
                if (chmrVar2 != null) {
                    chjyVar.a(chmrVar2);
                }
            }
            return dbsg.j(chjyVar);
        }
        throw null;
    }
}
