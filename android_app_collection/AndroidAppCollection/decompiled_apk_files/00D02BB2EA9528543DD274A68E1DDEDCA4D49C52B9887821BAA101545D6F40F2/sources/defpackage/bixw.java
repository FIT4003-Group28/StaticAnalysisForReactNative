package defpackage;

import com.google.android.apps.gmm.place.placeinfo.webview.PlaceInfoLinkWebviewCallbacks;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bixw  reason: default package */
/* loaded from: classes3.dex */
public class bixw implements biwe {
    public final dxio<afha> a;
    public final gce b;
    public final dxio<bvvw> c;
    public final btvo d;
    public final gga e;
    public final ilo f;
    public final ddho g;
    private final List<dgia> h;
    private dcdc<biwg> i = dcdc.e();

    public bixw(dxio<afha> dxioVar, gce gceVar, dxio<bvvw> dxioVar2, btvo btvoVar, gga ggaVar, List<dgia> list, ilo iloVar, ddho ddhoVar) {
        this.a = dxioVar;
        this.b = gceVar;
        this.c = dxioVar2;
        this.d = btvoVar;
        this.e = ggaVar;
        this.h = list;
        this.f = iloVar;
        this.g = ddhoVar;
    }

    @Override // defpackage.biwe
    public List<biwg> a() {
        return this.i;
    }

    @Override // defpackage.biwe
    public Integer b() {
        return Integer.valueOf(this.i.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.i = dcbg.b(this.h).s(new dbrn(this) { // from class: bixo
            private final bixw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg i;
                final bixw bixwVar = this.a;
                dgia dgiaVar = (dgia) obj;
                dgly[] dglyVarArr = new dgly[1];
                dgly dglyVar = dgiaVar.c;
                if (dglyVar == null) {
                    dglyVar = dgly.c;
                }
                dglyVarArr[0] = dglyVar;
                dcdc z = dcbg.b(Arrays.asList(dglyVarArr)).m(dgiaVar.d).s(bixr.a).o(bixs.a).z();
                if (z.isEmpty()) {
                    return dbpy.a;
                }
                final biwt biwtVar = new biwt();
                biwtVar.a = false;
                biwtVar.a(biyg.a);
                biwtVar.d = false;
                biwtVar.e = biyh.a;
                biwtVar.m = false;
                biwtVar.f = null;
                Integer num = biyj.a;
                if (num != null) {
                    biwtVar.g = num;
                    String str = "";
                    biwtVar.h = str;
                    biwtVar.c = false;
                    String str2 = dgiaVar.h;
                    if (str2 != null) {
                        biwtVar.k = str2;
                        ilo iloVar = bixwVar.f;
                        ddho ddhoVar = bixwVar.g;
                        cjta c = cjtd.c(iloVar.bZ());
                        c.d = ddhoVar;
                        c.g(dgiaVar.b);
                        biwtVar.l = c.a();
                        int size = z.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            biww biwwVar = new biww(Integer.MAX_VALUE, (CharSequence) z.get(i2));
                            if (biwtVar.i == null) {
                                if (biwtVar.j == null) {
                                    biwtVar.i = dcdc.F();
                                } else {
                                    biwtVar.i = dcdc.F();
                                    biwtVar.i.i(biwtVar.j);
                                    biwtVar.j = null;
                                }
                            }
                            biwtVar.i.g(biwwVar);
                        }
                        dgbo dgboVar = dgiaVar.e;
                        if (dgboVar == null) {
                            dgboVar = dgbo.e;
                        }
                        final String str3 = dgboVar.c;
                        if (dbsj.d(str3)) {
                            i = dbpy.a;
                        } else {
                            int a = dgbn.a(dgboVar.d);
                            if (a == 0 || a != 2) {
                                i = dbsg.i(new mw(bixwVar, str3) { // from class: bixv
                                    private final bixw a;
                                    private final String b;

                                    {
                                        this.a = bixwVar;
                                        this.b = str3;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj2) {
                                        bixw bixwVar2 = this.a;
                                        cjqm cjqmVar = (cjqm) obj2;
                                        bixwVar2.a.a().r(this.b, 1);
                                    }
                                });
                            } else {
                                i = dbsg.i(new mw(bixwVar, str3) { // from class: bixu
                                    private final bixw a;
                                    private final String b;

                                    {
                                        this.a = bixwVar;
                                        this.b = str3;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj2) {
                                        bixw bixwVar2 = this.a;
                                        String str4 = this.b;
                                        cjqm cjqmVar = (cjqm) obj2;
                                        bvvw a2 = bixwVar2.c.a();
                                        bvxn bZ = bvxu.A.bZ();
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        bvxu bvxuVar = (bvxu) bZ.b;
                                        str4.getClass();
                                        int i3 = bvxuVar.a | 1;
                                        bvxuVar.a = i3;
                                        bvxuVar.b = str4;
                                        bvxuVar.a = i3 | 512;
                                        bvxuVar.k = true;
                                        bvxp f = bvoa.f(ibm.b(), bixwVar2.e);
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        bvxu bvxuVar2 = (bvxu) bZ.b;
                                        f.getClass();
                                        bvxuVar2.x = f;
                                        bvxuVar2.a |= 4194304;
                                        bvxu.d(bvxuVar2);
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        bvxu.b((bvxu) bZ.b);
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        bvxu bvxuVar3 = (bvxu) bZ.b;
                                        int i4 = bvxuVar3.a | 8;
                                        bvxuVar3.a = i4;
                                        bvxuVar3.e = true;
                                        int i5 = i4 | 4;
                                        bvxuVar3.a = i5;
                                        bvxuVar3.d = false;
                                        int i6 = i5 | 2048;
                                        bvxuVar3.a = i6;
                                        bvxuVar3.m = true;
                                        bvxuVar3.a = i6 | 32;
                                        bvxuVar3.g = true;
                                        dkyx Z = bixwVar2.d.getPlaceSheetParameters().Z();
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        bvxu bvxuVar4 = (bvxu) bZ.b;
                                        Z.getClass();
                                        bvxuVar4.j = Z;
                                        bvxuVar4.a |= 256;
                                        a2.k(bZ.bK(), new PlaceInfoLinkWebviewCallbacks(), dtxy.nG);
                                    }
                                });
                            }
                        }
                        bvor.a(i, new mw(biwtVar) { // from class: bixt
                            private final biyi a;

                            {
                                this.a = biwtVar;
                            }

                            @Override // defpackage.mw
                            public final void a(Object obj2) {
                                biyi biyiVar = this.a;
                                ((biwt) biyiVar).a = true;
                                biyiVar.a((mw) obj2);
                            }
                        });
                        int i3 = dgiaVar.a;
                        if ((i3 & 32) != 0) {
                            String str4 = dgiaVar.f;
                            String str5 = (i3 & 64) != 0 ? dgiaVar.g : str4;
                            if (true == bixwVar.b.h()) {
                                str4 = str5;
                            }
                            biwtVar.f = new jic(str4, ckqc.FULLY_QUALIFIED, 0);
                        }
                        dccx<biwf> dccxVar = biwtVar.i;
                        if (dccxVar != null) {
                            biwtVar.j = dccxVar.f();
                        } else if (biwtVar.j == null) {
                            biwtVar.j = dcdc.e();
                        }
                        if (biwtVar.a == null) {
                            str = " isClickable";
                        }
                        if (biwtVar.b == null) {
                            str = str.concat(" onClickAction");
                        }
                        if (biwtVar.c == null) {
                            str = String.valueOf(str).concat(" isGone");
                        }
                        if (biwtVar.d == null) {
                            str = String.valueOf(str).concat(" isLongClickable");
                        }
                        if (biwtVar.e == null) {
                            str = String.valueOf(str).concat(" onLongClickAction");
                        }
                        if (biwtVar.g == null) {
                            str = String.valueOf(str).concat(" maxLines");
                        }
                        if (biwtVar.h == null) {
                            str = String.valueOf(str).concat(" text");
                        }
                        if (biwtVar.k == null) {
                            str = String.valueOf(str).concat(" contentDescription");
                        }
                        if (biwtVar.l == null) {
                            str = String.valueOf(str).concat(" loggingParams");
                        }
                        if (biwtVar.m == null) {
                            str = String.valueOf(str).concat(" hasUserSuggestedEdit");
                        }
                        if (str.isEmpty()) {
                            return dbsg.i(new biwu(biwtVar.a, biwtVar.b, biwtVar.c, biwtVar.d.booleanValue(), biwtVar.e, biwtVar.f, biwtVar.g, biwtVar.h, biwtVar.j, biwtVar.k, biwtVar.l, biwtVar.m));
                        }
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    throw new NullPointerException("Null contentDescription");
                }
                throw new NullPointerException("Null maxLines");
            }
        }).o(bixp.a).s(bixq.a).z();
    }
}
