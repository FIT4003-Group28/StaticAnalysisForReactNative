package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
/* compiled from: PG */
/* renamed from: vca  reason: default package */
/* loaded from: classes4.dex */
public final class vca {
    private final qst a;

    public vca(qst qstVar) {
        this.a = qstVar;
    }

    private static ankt c(rve rveVar) {
        return anhq.i(tjk.e(rveVar), qsp.class, urc.c, anjk.a);
    }

    public final ankt a(String str) {
        str.getClass();
        return c(this.a.A(str));
    }

    public final ankt b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return c(this.a.C(str, str2).b(anjk.a, new rui() { // from class: vbz
            @Override // defpackage.rui
            public final Object a(rve rveVar) {
                vbx vbxVar;
                Configurations configurations = (Configurations) rveVar.g();
                aopa createBuilder = vbw.a.createBuilder();
                String str3 = configurations.a;
                createBuilder.copyOnWrite();
                vbw vbwVar = (vbw) createBuilder.instance;
                str3.getClass();
                vbwVar.b |= 1;
                vbwVar.c = str3;
                String str4 = configurations.c;
                createBuilder.copyOnWrite();
                vbw vbwVar2 = (vbw) createBuilder.instance;
                str4.getClass();
                vbwVar2.b |= 4;
                vbwVar2.e = str4;
                boolean z = configurations.f;
                createBuilder.copyOnWrite();
                vbw vbwVar3 = (vbw) createBuilder.instance;
                vbwVar3.b |= 8;
                vbwVar3.h = z;
                long j = configurations.g;
                createBuilder.copyOnWrite();
                vbw vbwVar4 = (vbw) createBuilder.instance;
                vbwVar4.b |= 16;
                vbwVar4.i = j;
                byte[] bArr = configurations.b;
                int i = 2;
                if (bArr != null) {
                    aoob x = aoob.x(bArr);
                    createBuilder.copyOnWrite();
                    vbw vbwVar5 = (vbw) createBuilder.instance;
                    vbwVar5.b |= 2;
                    vbwVar5.d = x;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Configuration configuration = configurationArr[i2];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        Flag flag = flagArr[i3];
                        int i4 = flag.g;
                        if (i4 == 1) {
                            aopa createBuilder2 = vbx.a.createBuilder();
                            String str5 = flag.a;
                            createBuilder2.copyOnWrite();
                            vbx vbxVar2 = (vbx) createBuilder2.instance;
                            str5.getClass();
                            vbxVar2.b |= 1;
                            vbxVar2.e = str5;
                            if (flag.g == 1) {
                                long j2 = flag.b;
                                createBuilder2.copyOnWrite();
                                vbx vbxVar3 = (vbx) createBuilder2.instance;
                                vbxVar3.c = 1;
                                vbxVar3.d = Long.valueOf(j2);
                                vbxVar = (vbx) createBuilder2.mo39build();
                            } else {
                                throw new IllegalArgumentException("Not a long type");
                            }
                        } else if (i4 == i) {
                            aopa createBuilder3 = vbx.a.createBuilder();
                            String str6 = flag.a;
                            createBuilder3.copyOnWrite();
                            vbx vbxVar4 = (vbx) createBuilder3.instance;
                            str6.getClass();
                            vbxVar4.b |= 1;
                            vbxVar4.e = str6;
                            if (flag.g == 2) {
                                boolean z2 = flag.c;
                                createBuilder3.copyOnWrite();
                                vbx vbxVar5 = (vbx) createBuilder3.instance;
                                vbxVar5.c = 2;
                                vbxVar5.d = Boolean.valueOf(z2);
                                vbxVar = (vbx) createBuilder3.mo39build();
                            } else {
                                throw new IllegalArgumentException("Not a boolean type");
                            }
                        } else if (i4 == 3) {
                            aopa createBuilder4 = vbx.a.createBuilder();
                            String str7 = flag.a;
                            createBuilder4.copyOnWrite();
                            vbx vbxVar6 = (vbx) createBuilder4.instance;
                            str7.getClass();
                            vbxVar6.b |= 1;
                            vbxVar6.e = str7;
                            if (flag.g == 3) {
                                double d = flag.d;
                                createBuilder4.copyOnWrite();
                                vbx vbxVar7 = (vbx) createBuilder4.instance;
                                vbxVar7.c = 3;
                                vbxVar7.d = Double.valueOf(d);
                                vbxVar = (vbx) createBuilder4.mo39build();
                            } else {
                                throw new IllegalArgumentException("Not a double type");
                            }
                        } else if (i4 == 4) {
                            aopa createBuilder5 = vbx.a.createBuilder();
                            String str8 = flag.a;
                            createBuilder5.copyOnWrite();
                            vbx vbxVar8 = (vbx) createBuilder5.instance;
                            str8.getClass();
                            vbxVar8.b |= 1;
                            vbxVar8.e = str8;
                            if (flag.g == 4) {
                                String str9 = flag.e;
                                qnm.b(str9);
                                createBuilder5.copyOnWrite();
                                vbx vbxVar9 = (vbx) createBuilder5.instance;
                                vbxVar9.c = 4;
                                vbxVar9.d = str9;
                                vbxVar = (vbx) createBuilder5.mo39build();
                            } else {
                                throw new IllegalArgumentException("Not a String type");
                            }
                        } else if (i4 == 5) {
                            aopa createBuilder6 = vbx.a.createBuilder();
                            String str10 = flag.a;
                            createBuilder6.copyOnWrite();
                            vbx vbxVar10 = (vbx) createBuilder6.instance;
                            str10.getClass();
                            vbxVar10.b |= 1;
                            vbxVar10.e = str10;
                            if (flag.g == 5) {
                                aoob x2 = aoob.x((byte[]) qnm.b(flag.f));
                                createBuilder6.copyOnWrite();
                                vbx vbxVar11 = (vbx) createBuilder6.instance;
                                vbxVar11.c = 5;
                                vbxVar11.d = x2;
                                vbxVar = (vbx) createBuilder6.mo39build();
                            } else {
                                throw new IllegalArgumentException("Not a bytes type");
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Unrecognized flag type: ");
                            sb.append(i4);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        createBuilder.copyOnWrite();
                        vbw vbwVar6 = (vbw) createBuilder.instance;
                        vbxVar.getClass();
                        aopu aopuVar = vbwVar6.f;
                        if (!aopuVar.c()) {
                            vbwVar6.f = aopi.mutableCopy(aopuVar);
                        }
                        vbwVar6.f.add(vbxVar);
                        i3++;
                        i = 2;
                    }
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str11 : strArr) {
                            createBuilder.copyOnWrite();
                            vbw vbwVar7 = (vbw) createBuilder.instance;
                            str11.getClass();
                            aopu aopuVar2 = vbwVar7.g;
                            if (!aopuVar2.c()) {
                                vbwVar7.g = aopi.mutableCopy(aopuVar2);
                            }
                            vbwVar7.g.add(str11);
                        }
                    }
                    i2++;
                    i = 2;
                }
                return (vbw) createBuilder.mo39build();
            }
        }));
    }
}
