package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
/* compiled from: PG */
/* renamed from: cxkf  reason: default package */
/* loaded from: classes5.dex */
public final class cxkf implements cxkb {
    private final coxz a;

    public cxkf(coxz coxzVar) {
        this.a = coxzVar;
    }

    private static <T> dehn<T> c(cpcq<T> cpcqVar) {
        return deee.h(csac.a(cpcqVar), cnob.class, cxke.a, dege.a);
    }

    @Override // defpackage.cxkb
    public final dehn<Void> a(String str) {
        dbsk.s(str);
        return c(this.a.k(str));
    }

    @Override // defpackage.cxkb
    public final dehn<cxjy> b(String str, String str2) {
        dbsk.s(str);
        dbsk.s(str2);
        return c(this.a.b(str, str2, null).f(new cpbu() { // from class: cxkd
            @Override // defpackage.cpbu
            public final Object a(cpcq cpcqVar) {
                cxka bK;
                Configurations configurations = (Configurations) cpcqVar.d();
                cxjx bZ = cxjy.i.bZ();
                String str3 = configurations.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cxjy cxjyVar = (cxjy) bZ.b;
                str3.getClass();
                int i = cxjyVar.a | 1;
                cxjyVar.a = i;
                cxjyVar.b = str3;
                String str4 = configurations.c;
                str4.getClass();
                int i2 = 4;
                int i3 = i | 4;
                cxjyVar.a = i3;
                cxjyVar.d = str4;
                boolean z = configurations.f;
                int i4 = i3 | 8;
                cxjyVar.a = i4;
                cxjyVar.g = z;
                long j = configurations.g;
                cxjyVar.a = i4 | 16;
                cxjyVar.h = j;
                byte[] bArr = configurations.b;
                int i5 = 2;
                if (bArr != null) {
                    dspd x = dspd.x(bArr);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cxjy cxjyVar2 = (cxjy) bZ.b;
                    x.getClass();
                    cxjyVar2.a |= 2;
                    cxjyVar2.c = x;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i6 = 0;
                while (i6 < length) {
                    Configuration configuration = configurationArr[i6];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        Flag flag = flagArr[i7];
                        int i8 = flag.g;
                        if (i8 == 1) {
                            cxjz bZ2 = cxka.e.bZ();
                            String str5 = flag.a;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            cxka cxkaVar = (cxka) bZ2.b;
                            str5.getClass();
                            cxkaVar.a |= 1;
                            cxkaVar.d = str5;
                            long a = flag.a();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            cxka cxkaVar2 = (cxka) bZ2.b;
                            cxkaVar2.b = 1;
                            cxkaVar2.c = Long.valueOf(a);
                            bK = bZ2.bK();
                        } else if (i8 == i5) {
                            cxjz bZ3 = cxka.e.bZ();
                            String str6 = flag.a;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            cxka cxkaVar3 = (cxka) bZ3.b;
                            str6.getClass();
                            cxkaVar3.a |= 1;
                            cxkaVar3.d = str6;
                            boolean b = flag.b();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            cxka cxkaVar4 = (cxka) bZ3.b;
                            cxkaVar4.b = 2;
                            cxkaVar4.c = Boolean.valueOf(b);
                            bK = bZ3.bK();
                        } else if (i8 == 3) {
                            cxjz bZ4 = cxka.e.bZ();
                            String str7 = flag.a;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            cxka cxkaVar5 = (cxka) bZ4.b;
                            str7.getClass();
                            cxkaVar5.a |= 1;
                            cxkaVar5.d = str7;
                            double c = flag.c();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            cxka cxkaVar6 = (cxka) bZ4.b;
                            cxkaVar6.b = 3;
                            cxkaVar6.c = Double.valueOf(c);
                            bK = bZ4.bK();
                        } else if (i8 == i2) {
                            cxjz bZ5 = cxka.e.bZ();
                            String str8 = flag.a;
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            cxka cxkaVar7 = (cxka) bZ5.b;
                            str8.getClass();
                            cxkaVar7.a |= 1;
                            cxkaVar7.d = str8;
                            String d = flag.d();
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            cxka cxkaVar8 = (cxka) bZ5.b;
                            d.getClass();
                            cxkaVar8.b = 4;
                            cxkaVar8.c = d;
                            bK = bZ5.bK();
                        } else if (i8 != 5) {
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Unrecognized flag type: ");
                            sb.append(i8);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            cxjz bZ6 = cxka.e.bZ();
                            String str9 = flag.a;
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            cxka cxkaVar9 = (cxka) bZ6.b;
                            str9.getClass();
                            cxkaVar9.a |= 1;
                            cxkaVar9.d = str9;
                            dspd x2 = dspd.x(flag.e());
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            cxka cxkaVar10 = (cxka) bZ6.b;
                            x2.getClass();
                            cxkaVar10.b = 5;
                            cxkaVar10.c = x2;
                            bK = bZ6.bK();
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        cxjy cxjyVar3 = (cxjy) bZ.b;
                        bK.getClass();
                        dsrj<cxka> dsrjVar = cxjyVar3.e;
                        if (!dsrjVar.a()) {
                            cxjyVar3.e = dsqw.cl(dsrjVar);
                        }
                        cxjyVar3.e.add(bK);
                        i7++;
                        i5 = 2;
                        i2 = 4;
                    }
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            cxjy cxjyVar4 = (cxjy) bZ.b;
                            str10.getClass();
                            dsrj<String> dsrjVar2 = cxjyVar4.f;
                            if (!dsrjVar2.a()) {
                                cxjyVar4.f = dsqw.cl(dsrjVar2);
                            }
                            cxjyVar4.f.add(str10);
                        }
                    }
                    i6++;
                    i5 = 2;
                    i2 = 4;
                }
                return bZ.bK();
            }
        }));
    }
}
