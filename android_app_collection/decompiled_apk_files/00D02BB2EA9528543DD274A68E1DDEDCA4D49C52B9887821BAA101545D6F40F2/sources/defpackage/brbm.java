package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: brbm  reason: default package */
/* loaded from: classes4.dex */
public final class brbm extends bbuq {
    private final dcdc<bvrt<dwfl>> c;
    private final List<bvrt<dwfl>> d = new ArrayList();
    private boolean e = false;
    private final ckng f = new ckng();
    private final boolean g;

    public brbm(dcdc<dwfl> dcdcVar, boolean z) {
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dccxVar.g(bvrt.b(dcdcVar.get(i)));
        }
        this.c = dccxVar.f();
        this.g = z;
    }

    private static dcdc<dwfl> x(dcdc<bvrt<dwfl>> dcdcVar) {
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dccxVar.g(dcdcVar.get(i).e((dssr) dwfl.w.cu(7), dwfl.w));
        }
        return dccxVar.f();
    }

    @Override // defpackage.bbuq
    public final void a(int i, int i2) {
        this.f.b(i, i2);
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.d.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        return this.f.a(this.d.get(i).e((dssr) dwfl.w.cu(7), dwfl.w));
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.c.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final boolean g() {
        return !this.e;
    }

    @Override // defpackage.bbuq
    public final void h(buti butiVar) {
        if (g()) {
            super.t(bbuo.a);
            dcdc<dwfl> x = x(this.c);
            dccx dccxVar = new dccx();
            int size = x.size();
            for (int i = 0; i < size; i++) {
                dizh dizhVar = x.get(i).p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                dggg dgggVar = dizhVar.b;
                if (dgggVar == null) {
                    dgggVar = dggg.d;
                }
                dccxVar.g(dgggVar);
            }
            dcdc f = dccxVar.f();
            dwfy bZ = dwge.m.bZ();
            dwfs bZ2 = dwfv.m.bZ();
            dwev bZ3 = dwew.e.bZ();
            drcf bZ4 = drcg.e.bZ();
            dgge dggeVar = dgge.IMAGE_ALLEYCAT;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drcg drcgVar = (drcg) bZ4.b;
            drcgVar.b = dggeVar.l;
            int i2 = drcgVar.a | 1;
            drcgVar.a = i2;
            drcgVar.a = i2 | 2;
            drcgVar.c = false;
            dggc dggcVar = dggc.PHOTO;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drcg drcgVar2 = (drcg) bZ4.b;
            drcgVar2.d = dggcVar.f;
            drcgVar2.a |= 4;
            bZ3.a(bZ4);
            drcf bZ5 = drcg.e.bZ();
            dgge dggeVar2 = dgge.IMAGE_FIFE;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            drcg drcgVar3 = (drcg) bZ5.b;
            drcgVar3.b = dggeVar2.l;
            int i3 = drcgVar3.a | 1;
            drcgVar3.a = i3;
            drcgVar3.a = i3 | 2;
            drcgVar3.c = false;
            dggc dggcVar2 = dggc.PHOTO;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            drcg drcgVar4 = (drcg) bZ5.b;
            drcgVar4.d = dggcVar2.f;
            drcgVar4.a |= 4;
            bZ3.a(bZ5);
            drcf bZ6 = drcg.e.bZ();
            dgge dggeVar3 = dgge.IMAGE_CONTENT_FIFE;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drcg drcgVar5 = (drcg) bZ6.b;
            drcgVar5.b = dggeVar3.l;
            int i4 = drcgVar5.a | 1;
            drcgVar5.a = i4;
            drcgVar5.a = i4 | 2;
            drcgVar5.c = false;
            dggc dggcVar3 = dggc.PHOTO;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drcg drcgVar6 = (drcg) bZ6.b;
            drcgVar6.d = dggcVar3.f;
            drcgVar6.a |= 4;
            bZ3.a(bZ6);
            drcf bZ7 = drcg.e.bZ();
            dgge dggeVar4 = dgge.MEDIA_GUESSABLE_FIFE;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drcg drcgVar7 = (drcg) bZ7.b;
            drcgVar7.b = dggeVar4.l;
            int i5 = drcgVar7.a | 1;
            drcgVar7.a = i5;
            drcgVar7.a = i5 | 2;
            drcgVar7.c = false;
            dggc dggcVar4 = dggc.PHOTO;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drcg drcgVar8 = (drcg) bZ7.b;
            drcgVar8.d = dggcVar4.f;
            drcgVar8.a |= 4;
            bZ3.a(bZ7);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwfv dwfvVar = (dwfv) bZ2.b;
            dwew bK = bZ3.bK();
            bK.getClass();
            dwfvVar.b = bK;
            dwfvVar.a |= 1;
            dwfp bZ8 = dwfr.h.bZ();
            bZ8.a(drbz.ATTRIBUTION);
            if (this.g) {
                bZ8.a(drbz.OCR_INFO);
            }
            dwfr bK2 = bZ8.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwfv dwfvVar2 = (dwfv) bZ2.b;
            bK2.getClass();
            dwfvVar2.c = bK2;
            dwfvVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwge dwgeVar = (dwge) bZ.b;
            dwfv bK3 = bZ2.bK();
            bK3.getClass();
            dwgeVar.h = bK3;
            dwgeVar.a |= 128;
            bZ.a(f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwge dwgeVar2 = (dwge) bZ.b;
            dwgeVar2.b = 5;
            dwgeVar2.a |= 1;
            butiVar.a(bZ.bK(), new brbl(this), bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
    }

    @Override // defpackage.bbuq
    public final void l(String str, List list) {
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
    }

    public final synchronized void w(List<dwfl> list) {
        int i;
        dcdc<dwfl> x = x(this.c);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (dwfl dwflVar : list) {
            if ((32768 & dwflVar.a) != 0) {
                dizh dizhVar = dwflVar.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                dggg dgggVar = dizhVar.b;
                if (dgggVar == null) {
                    dgggVar = dggg.d;
                }
                if ((dwflVar.a & 1024) != 0) {
                    dwfh dwfhVar = dwflVar.k;
                    if (dwfhVar == null) {
                        dwfhVar = dwfh.d;
                    }
                    hashMap.put(dgggVar, dwfhVar);
                }
                dizh dizhVar2 = dwflVar.p;
                if (dizhVar2 == null) {
                    dizhVar2 = dizh.j;
                }
                if ((dizhVar2.a & 64) != 0) {
                    dizh dizhVar3 = dwflVar.p;
                    if (dizhVar3 == null) {
                        dizhVar3 = dizh.j;
                    }
                    dizl dizlVar = dizhVar3.i;
                    if (dizlVar == null) {
                        dizlVar = dizl.e;
                    }
                    hashMap2.put(dgggVar, dizlVar);
                }
            }
        }
        dccx dccxVar = new dccx();
        Iterator<dwfl> it = x.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dwfl next = it.next();
            dsqp dsqpVar = (dsqp) next.cu(5);
            dsqpVar.bC(next);
            dwfi dwfiVar = (dwfi) dsqpVar;
            dizh dizhVar4 = next.p;
            if (dizhVar4 == null) {
                dizhVar4 = dizh.j;
            }
            dggg dgggVar2 = dizhVar4.b;
            if (dgggVar2 == null) {
                dgggVar2 = dggg.d;
            }
            dwfh dwfhVar2 = (dwfh) hashMap.get(dgggVar2);
            dizl dizlVar2 = (dizl) hashMap2.get(dgggVar2);
            if (dwfhVar2 != null) {
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar2 = (dwfl) dwfiVar.b;
                dwfhVar2.getClass();
                dwflVar2.k = dwfhVar2;
                dwflVar2.a |= 1024;
            }
            if (dizlVar2 != null) {
                dizh dizhVar5 = ((dwfl) dwfiVar.b).p;
                if (dizhVar5 == null) {
                    dizhVar5 = dizh.j;
                }
                dsqp dsqpVar2 = (dsqp) dizhVar5.cu(5);
                dsqpVar2.bC(dizhVar5);
                dizg dizgVar = (dizg) dsqpVar2;
                if (dizgVar.c) {
                    dizgVar.bF();
                    dizgVar.c = false;
                }
                dizh dizhVar6 = (dizh) dizgVar.b;
                dizlVar2.getClass();
                dizhVar6.i = dizlVar2;
                dizhVar6.a |= 64;
                dizh bK = dizgVar.bK();
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar3 = (dwfl) dwfiVar.b;
                bK.getClass();
                dwflVar3.p = bK;
                dwflVar3.a |= 32768;
            }
            dccxVar.g(dwfiVar.bK());
        }
        dcdc f = dccxVar.f();
        int size = f.size();
        for (i = 0; i < size; i++) {
            this.d.add(bvrt.b((dwfl) f.get(i)));
        }
        this.e = true;
    }
}
