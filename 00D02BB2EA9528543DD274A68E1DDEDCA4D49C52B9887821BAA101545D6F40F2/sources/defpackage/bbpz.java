package defpackage;
/* compiled from: PG */
/* renamed from: bbpz  reason: default package */
/* loaded from: classes3.dex */
public final class bbpz implements bbtu {
    private static final dcqe a = dcqe.c("bbpz");
    private final bbpx b;

    public bbpz(bbpx bbpxVar) {
        this.b = bbpxVar;
    }

    private static dhpf d(dfwe dfweVar) {
        dhpe bZ = dhpf.i.bZ();
        int i = dfweVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar = (dhpf) bZ.b;
        int i2 = dhpfVar.a | 1;
        dhpfVar.a = i2;
        dhpfVar.b = i;
        int i3 = dfweVar.c;
        int i4 = i2 | 2;
        dhpfVar.a = i4;
        dhpfVar.c = i3;
        int i5 = dfweVar.d;
        int i6 = i4 | 4;
        dhpfVar.a = i6;
        dhpfVar.d = i5;
        int i7 = dfweVar.e;
        int i8 = i6 | 8;
        dhpfVar.a = i8;
        dhpfVar.e = i7;
        int i9 = dfweVar.f;
        dhpfVar.a = i8 | 16;
        dhpfVar.f = i9;
        return bZ.bK();
    }

    private static dhpf e(long j, eaou eaouVar) {
        eaol eaolVar = new eaol(j, eaouVar);
        dhpe bZ = dhpf.i.bZ();
        int y = eaolVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar = (dhpf) bZ.b;
        dhpfVar.a |= 1;
        dhpfVar.b = y;
        int z = eaolVar.z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar2 = (dhpf) bZ.b;
        dhpfVar2.a |= 2;
        dhpfVar2.c = z;
        int A = eaolVar.A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar3 = (dhpf) bZ.b;
        dhpfVar3.a |= 4;
        dhpfVar3.d = A;
        int C = eaolVar.C();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar4 = (dhpf) bZ.b;
        dhpfVar4.a |= 8;
        dhpfVar4.e = C;
        int D = eaolVar.D();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhpf dhpfVar5 = (dhpf) bZ.b;
        dhpfVar5.a |= 16;
        dhpfVar5.f = D;
        return bZ.bK();
    }

    private static dbsg<Long> f(dhpf dhpfVar, eaou eaouVar) {
        try {
            return dbsg.i(Long.valueOf(new eaol(dhpfVar.b, dhpfVar.c, dhpfVar.d, dhpfVar.e, dhpfVar.f, eaouVar).a));
        } catch (eapb | eapc unused) {
            return dbpy.a;
        }
    }

    @Override // defpackage.bbtu
    public final bbtm a(dwfl dwflVar, eaou eaouVar) {
        bbtl v = bbtm.v(dwflVar.h);
        v.b(dwflVar.g);
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        dgge dggeVar = dgge.MEDIA_GUESSABLE_FIFE;
        dgge b = dgge.b(dgggVar.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        if (dggeVar.equals(b) && (dgggVar.a & 2) != 0) {
            v.k(dgggVar.c);
        }
        if ((dwflVar.a & 1024) != 0) {
            dfyb bZ = dfyc.e.bZ();
            dszp bZ2 = dszq.c.bZ();
            dwfh dwfhVar = dwflVar.k;
            if (dwfhVar == null) {
                dwfhVar = dwfh.d;
            }
            String str = dwfhVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dszq dszqVar = (dszq) bZ2.b;
            str.getClass();
            dszqVar.a |= 1;
            dszqVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfyc dfycVar = (dfyc) bZ.b;
            dszq bK = bZ2.bK();
            bK.getClass();
            dfycVar.b = bK;
            dfycVar.a |= 1;
            dwfh dwfhVar2 = dwflVar.k;
            if (dwfhVar2 == null) {
                dwfhVar2 = dwfh.d;
            }
            dnpq dnpqVar = dwfhVar2.c;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            String str2 = dnpqVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfyc dfycVar2 = (dfyc) bZ.b;
            str2.getClass();
            dfycVar2.a |= 2;
            dfycVar2.c = str2;
            dwfh dwfhVar3 = dwflVar.k;
            if (dwfhVar3 == null) {
                dwfhVar3 = dwfh.d;
            }
            dnpq dnpqVar2 = dwfhVar3.c;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            String str3 = dnpqVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfyc dfycVar3 = (dfyc) bZ.b;
            str3.getClass();
            dfycVar3.a |= 4;
            dfycVar3.d = str3;
            dfyc bK2 = bZ.bK();
            dfvv bZ3 = dfvw.b.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfvw dfvwVar = (dfvw) bZ3.b;
            bK2.getClass();
            dsrj<dfyc> dsrjVar = dfvwVar.a;
            if (!dsrjVar.a()) {
                dfvwVar.a = dsqw.cl(dsrjVar);
            }
            dfvwVar.a.add(bK2);
            dfvw bK3 = bZ3.bK();
            dfxr bZ4 = dfxs.h.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dfxs dfxsVar = (dfxs) bZ4.b;
            bK3.getClass();
            dfxsVar.e = bK3;
            dfxsVar.a |= 16;
            v.u(bZ4.bK());
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        if ((diisVar.a & 2) != 0) {
            diis diisVar2 = dizhVar.g;
            if (diisVar2 == null) {
                diisVar2 = diis.h;
            }
            dhpf dhpfVar = diisVar2.e;
            if (dhpfVar == null) {
                dhpfVar = dhpf.i;
            }
            dbsg<Long> f = f(dhpfVar, eaouVar);
            if (f.a()) {
                v.c(f.b());
            }
        } else {
            long j = dwflVar.o;
            if (j > 0) {
                v.c(Long.valueOf(j));
            }
        }
        diis diisVar3 = dizhVar.g;
        if (diisVar3 == null) {
            diisVar3 = diis.h;
        }
        if ((diisVar3.a & 4) != 0) {
            diis diisVar4 = dizhVar.g;
            if (diisVar4 == null) {
                diisVar4 = diis.h;
            }
            dhpf dhpfVar2 = diisVar4.f;
            if (dhpfVar2 == null) {
                dhpfVar2 = dhpf.i;
            }
            dbsg<Long> f2 = f(dhpfVar2, eaouVar);
            if (f2.a()) {
                v.t(f2.b());
            }
        }
        dghk dghkVar = dizhVar.c;
        if (dghkVar == null) {
            dghkVar = dghk.g;
        }
        dggc b2 = dggc.b(dghkVar.b);
        if (b2 == null) {
            b2 = dggc.UNKNOWN;
        }
        if (b2.equals(dggc.VIDEO)) {
            v.g(bbti.VIDEO);
            dkea dkeaVar = dwflVar.j;
            if (dkeaVar == null) {
                dkeaVar = dkea.d;
            }
            if (dkeaVar.c.size() == 0) {
                bvoo.h("Video stream missing for uri: %s", dwflVar.h);
            } else {
                dkea dkeaVar2 = dwflVar.j;
                if (dkeaVar2 == null) {
                    dkeaVar2 = dkea.d;
                }
                dkec dkecVar = dkeaVar2.c.get(0);
                v.g(bbti.VIDEO);
                v.q(Integer.valueOf(dkecVar.c));
                v.p(Integer.valueOf(dkecVar.d));
                v.n(0);
                dkea dkeaVar3 = dwflVar.j;
                if (dkeaVar3 == null) {
                    dkeaVar3 = dkea.d;
                }
                v.d(Long.valueOf(dkeaVar3.b));
            }
        } else if (b2.equals(dggc.PANO) || b2.equals(dggc.PHOTO)) {
            v.g(bbti.PHOTO);
            dizh dizhVar2 = dwflVar.p;
            if (dizhVar2 == null) {
                dizhVar2 = dizh.j;
            }
            dghk dghkVar2 = dizhVar2.c;
            if (dghkVar2 == null) {
                dghkVar2 = dghk.g;
            }
            if ((dghkVar2.a & 4) != 0) {
                dizh dizhVar3 = dwflVar.p;
                if (dizhVar3 == null) {
                    dizhVar3 = dizh.j;
                }
                dghk dghkVar3 = dizhVar3.c;
                if (dghkVar3 == null) {
                    dghkVar3 = dghk.g;
                }
                dhkd dhkdVar = dghkVar3.c;
                if (dhkdVar == null) {
                    dhkdVar = dhkd.d;
                }
                v.q(Integer.valueOf(dhkdVar.b));
                v.p(Integer.valueOf(dhkdVar.c));
                v.n(0);
            }
        } else {
            bvoo.h("Unsupported format %s for uri %s", b2, dwflVar.h);
        }
        return v.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01e1  */
    @Override // defpackage.bbtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dwfl b(defpackage.bbtm r12, defpackage.eaou r13) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbpz.b(bbtm, eaou):dwfl");
    }

    @Override // defpackage.bbtu
    public final bbtm c(dnwl dnwlVar) {
        return bqsf.b(dnwlVar);
    }
}
