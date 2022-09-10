package defpackage;

import android.net.NetworkInfo;
import com.google.ar.core.ImageMetadata;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: crvq  reason: default package */
/* loaded from: classes5.dex */
public abstract class crvq {
    public abstract crvr a();

    public abstract void b(crxb crxbVar);

    public final void c(int i) {
        NetworkInfo activeNetworkInfo;
        final crvr a = a();
        cnjz a2 = a.a();
        final dtbe bZ = dtbi.y.bZ();
        dtbh e = a.e();
        int i2 = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbi dtbiVar = (dtbi) bZ.b;
        dtbiVar.e = e.f;
        dtbiVar.a |= 8;
        int a3 = dgps.a(a.d().b().d);
        int i3 = 1;
        if (a3 == 0) {
            a3 = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbi dtbiVar2 = (dtbi) bZ.b;
        dtbiVar2.b = a3 - 1;
        dtbiVar2.a |= 1;
        String a4 = a.d().a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbi dtbiVar3 = (dtbi) bZ.b;
        a4.getClass();
        dtbiVar3.a |= 128;
        dtbiVar3.i = a4;
        if (a.d().c().size() > 0) {
            dcdc<String> c = a.d().c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtbi dtbiVar4 = (dtbi) bZ.b;
            dsrj<String> dsrjVar = dtbiVar4.v;
            if (!dsrjVar.a()) {
                dtbiVar4.v = dsqw.cl(dsrjVar);
            }
            dsod.bv(c, dtbiVar4.v);
        }
        crvr.q(a.g(), new dbsz(bZ) { // from class: crvg
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                crts crtsVar = (crts) obj;
                dgpu b = dgpu.b(crtsVar.k);
                if (b == null) {
                    b = dgpu.LOCAL;
                }
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar5 = (dtbi) dtbeVar.b;
                dtbi dtbiVar6 = dtbi.y;
                dtbiVar5.c = b.g;
                int i4 = dtbiVar5.a | 2;
                dtbiVar5.a = i4;
                boolean z = crtsVar.g;
                dtbiVar5.a = i4 | 512;
                dtbiVar5.k = z;
            }
        });
        dgpw h = a.h();
        bZ.getClass();
        crvr.q(h, new dbsz(bZ) { // from class: crvh
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                dgpw dgpwVar = (dgpw) obj;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar5 = (dtbi) dtbeVar.b;
                dtbi dtbiVar6 = dtbi.y;
                dtbiVar5.d = dgpwVar.Q;
                dtbiVar5.a |= 4;
            }
        });
        dgpm i4 = a.i();
        bZ.getClass();
        crvr.q(i4, new dbsz(bZ) { // from class: crvi
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                dgpm dgpmVar = (dgpm) obj;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar5 = (dtbi) dtbeVar.b;
                dtbi dtbiVar6 = dtbi.y;
                dtbiVar5.f = dgpmVar.v;
                dtbiVar5.a |= 16;
            }
        });
        String c2 = a.c();
        if (!dbsj.d(c2)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtbi dtbiVar5 = (dtbi) bZ.b;
            c2.getClass();
            dtbiVar5.a |= 32;
            dtbiVar5.g = c2;
        }
        cruf j = a.j();
        bZ.getClass();
        crvr.q(j, new dbsz(bZ) { // from class: crvj
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                cruf crufVar = (cruf) obj;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar6 = (dtbi) dtbeVar.b;
                dtbi dtbiVar7 = dtbi.y;
                dtbiVar6.s = crufVar.l;
                dtbiVar6.a |= ImageMetadata.LENS_APERTURE;
            }
        });
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbi dtbiVar6 = (dtbi) bZ.b;
        dtbiVar6.h = 2;
        dtbiVar6.a |= 64;
        crvr.q(a.f(), new dbsz(a, bZ) { // from class: crvk
            private final crvr a;
            private final dtbe b;

            {
                this.a = a;
                this.b = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                crvr crvrVar = this.a;
                dtbe dtbeVar = this.b;
                crwb crwbVar = (crwb) obj;
                boolean z = crwbVar.e;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar7 = (dtbi) dtbeVar.b;
                dtbi dtbiVar8 = dtbi.y;
                int i5 = dtbiVar7.a | 256;
                dtbiVar7.a = i5;
                dtbiVar7.j = z;
                dtbiVar7.a = i5 | 1024;
                dtbiVar7.l = true;
                boolean z2 = crwbVar.j;
                dtbi dtbiVar9 = (dtbi) dtbeVar.b;
                int i6 = dtbiVar9.a | 2048;
                dtbiVar9.a = i6;
                dtbiVar9.m = z2;
                dtbiVar9.a = i6 | 4096;
                dtbiVar9.n = true;
                crwd crwdVar = crwbVar.g;
                if (crwdVar == null) {
                    crwdVar = crwd.f;
                }
                boolean z3 = crwdVar.d;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar10 = (dtbi) dtbeVar.b;
                dtbiVar10.a |= 8192;
                dtbiVar10.o = z3;
                if (Boolean.TRUE.equals(crvrVar.o())) {
                    ddja bZ2 = ddjb.z.bZ();
                    if ((crwbVar.a & 1) != 0) {
                        crvz b = crvz.b(crwbVar.b);
                        if (b == null) {
                            b = crvz.TEST;
                        }
                        int a5 = ddiz.a(b.d);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar = (ddjb) bZ2.b;
                        int i7 = a5 - 1;
                        if (a5 == 0) {
                            throw null;
                        }
                        ddjbVar.b = i7;
                        ddjbVar.a |= 1;
                    }
                    if ((crwbVar.a & 2) != 0) {
                        String str = crwbVar.c;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar2 = (ddjb) bZ2.b;
                        str.getClass();
                        ddjbVar2.a |= 2;
                        ddjbVar2.c = str;
                    }
                    if ((crwbVar.a & 4) != 0) {
                        boolean z4 = crwbVar.d;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar3 = (ddjb) bZ2.b;
                        ddjbVar3.a |= 4;
                        ddjbVar3.d = z4;
                    }
                    if ((crwbVar.a & 8) != 0) {
                        boolean z5 = crwbVar.e;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar4 = (ddjb) bZ2.b;
                        ddjbVar4.a |= 8;
                        ddjbVar4.e = z5;
                    }
                    if ((crwbVar.a & 16) != 0) {
                        int i8 = crwbVar.f;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar5 = (ddjb) bZ2.b;
                        ddjbVar5.a |= 16;
                        ddjbVar5.f = i8;
                    }
                    if ((crwbVar.a & 32) != 0) {
                        crwd crwdVar2 = crwbVar.g;
                        if (crwdVar2 == null) {
                            crwdVar2 = crwd.f;
                        }
                        ddjc bZ3 = ddjd.f.bZ();
                        if ((crwdVar2.a & 1) != 0) {
                            int i9 = crwdVar2.b;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            ddjd ddjdVar = (ddjd) bZ3.b;
                            ddjdVar.a |= 1;
                            ddjdVar.b = i9;
                        }
                        if ((crwdVar2.a & 2) != 0) {
                            String str2 = crwdVar2.c;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            ddjd ddjdVar2 = (ddjd) bZ3.b;
                            str2.getClass();
                            ddjdVar2.a |= 2;
                            ddjdVar2.c = str2;
                        }
                        if ((crwdVar2.a & 4) != 0) {
                            boolean z6 = crwdVar2.d;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            ddjd ddjdVar3 = (ddjd) bZ3.b;
                            ddjdVar3.a |= 4;
                            ddjdVar3.d = z6;
                        }
                        if ((crwdVar2.a & 8) != 0) {
                            boolean z7 = crwdVar2.e;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            ddjd ddjdVar4 = (ddjd) bZ3.b;
                            ddjdVar4.a |= 8;
                            ddjdVar4.e = z7;
                        }
                        ddjd bK = bZ3.bK();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar6 = (ddjb) bZ2.b;
                        bK.getClass();
                        ddjbVar6.g = bK;
                        ddjbVar6.a |= 32;
                    }
                    if ((crwbVar.a & 64) != 0) {
                        boolean z8 = crwbVar.h;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar7 = (ddjb) bZ2.b;
                        ddjbVar7.a |= 128;
                        ddjbVar7.h = z8;
                    }
                    if ((crwbVar.a & 128) != 0) {
                        int i10 = crwbVar.i;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar8 = (ddjb) bZ2.b;
                        ddjbVar8.a |= 256;
                        ddjbVar8.i = i10;
                    }
                    if ((crwbVar.a & 256) != 0) {
                        boolean z9 = crwbVar.j;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar9 = (ddjb) bZ2.b;
                        ddjbVar9.a |= 2048;
                        ddjbVar9.j = z9;
                    }
                    if ((crwbVar.a & 512) != 0) {
                        boolean z10 = crwbVar.k;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar10 = (ddjb) bZ2.b;
                        ddjbVar10.a |= 4096;
                        ddjbVar10.k = z10;
                    }
                    if ((crwbVar.a & 1024) != 0) {
                        int i11 = crwbVar.l;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar11 = (ddjb) bZ2.b;
                        ddjbVar11.a |= 8192;
                        ddjbVar11.l = i11;
                    }
                    if ((crwbVar.a & 2048) != 0) {
                        int i12 = crwbVar.m;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar12 = (ddjb) bZ2.b;
                        ddjbVar12.a |= 16384;
                        ddjbVar12.m = i12;
                    }
                    if ((crwbVar.a & 4096) != 0) {
                        int i13 = crwbVar.n;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar13 = (ddjb) bZ2.b;
                        ddjbVar13.a |= 32768;
                        ddjbVar13.n = i13;
                    }
                    if ((crwbVar.a & 8192) != 0) {
                        boolean z11 = crwbVar.o;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar14 = (ddjb) bZ2.b;
                        ddjbVar14.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        ddjbVar14.o = z11;
                    }
                    if ((crwbVar.a & 16384) != 0) {
                        boolean z12 = crwbVar.p;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar15 = (ddjb) bZ2.b;
                        ddjbVar15.a |= 131072;
                        ddjbVar15.p = z12;
                    }
                    if ((crwbVar.a & 32768) != 0) {
                        int i14 = crwbVar.q;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar16 = (ddjb) bZ2.b;
                        ddjbVar16.a |= 262144;
                        ddjbVar16.q = i14;
                    }
                    if ((crwbVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                        int i15 = crwbVar.r;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar17 = (ddjb) bZ2.b;
                        ddjbVar17.a |= ImageMetadata.LENS_APERTURE;
                        ddjbVar17.r = i15;
                    }
                    if ((crwbVar.a & 131072) != 0) {
                        boolean z13 = crwbVar.s;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddjb ddjbVar18 = (ddjb) bZ2.b;
                        ddjbVar18.a |= 2097152;
                        ddjbVar18.s = z13;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddjb ddjbVar19 = (ddjb) bZ2.b;
                    ddjbVar19.a |= 4194304;
                    ddjbVar19.t = true;
                    ddjb ddjbVar20 = (ddjb) bZ2.b;
                    ddjbVar20.a |= 8388608;
                    ddjbVar20.u = true;
                    if ((crwbVar.a & 262144) != 0) {
                        int i16 = crwbVar.t;
                        ddjb ddjbVar21 = (ddjb) bZ2.b;
                        ddjbVar21.a |= 16777216;
                        ddjbVar21.v = i16;
                    }
                    if ((crwbVar.a & ImageMetadata.LENS_APERTURE) != 0) {
                        boolean z14 = crwbVar.u;
                        ddjb ddjbVar22 = (ddjb) bZ2.b;
                        ddjbVar22.a |= 33554432;
                        ddjbVar22.w = z14;
                    }
                    if ((crwbVar.a & ImageMetadata.SHADING_MODE) != 0) {
                        int i17 = crwbVar.v;
                        ddjb ddjbVar23 = (ddjb) bZ2.b;
                        ddjbVar23.a |= 67108864;
                        ddjbVar23.x = i17;
                    }
                    ddjb ddjbVar24 = (ddjb) bZ2.b;
                    ddjbVar24.a |= 134217728;
                    ddjbVar24.y = true;
                    ddjb bK2 = bZ2.bK();
                    if (dtbeVar.c) {
                        dtbeVar.bF();
                        dtbeVar.c = false;
                    }
                    dtbi dtbiVar11 = (dtbi) dtbeVar.b;
                    bK2.getClass();
                    dtbiVar11.w = bK2;
                    dtbiVar11.a |= 4194304;
                }
            }
        });
        crxq b = a.b();
        if (b.a() && (activeNetworkInfo = b.a.getActiveNetworkInfo()) != null) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    i3 = 3;
                } else if (type != 2 && type != 3 && type != 4 && type != 5) {
                    if (type == 7) {
                        i3 = 5;
                    } else if (type == 9) {
                        i3 = 6;
                    }
                }
            }
            i3 = 4;
        } else {
            i3 = 2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtbi dtbiVar7 = (dtbi) bZ.b;
        dtbiVar7.r = i3 - 1;
        dtbiVar7.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        Integer k = a.k();
        bZ.getClass();
        crvr.q(k, new dbsz(bZ) { // from class: crvl
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar8 = (dtbi) dtbeVar.b;
                dtbi dtbiVar9 = dtbi.y;
                dtbiVar8.a |= 16384;
                dtbiVar8.p = intValue;
            }
        });
        Integer l = a.l();
        bZ.getClass();
        crvr.q(l, new dbsz(bZ) { // from class: crvm
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar8 = (dtbi) dtbeVar.b;
                dtbi dtbiVar9 = dtbi.y;
                dtbiVar8.a |= 32768;
                dtbiVar8.q = intValue;
            }
        });
        String n = a.n();
        bZ.getClass();
        crvr.q(n, new dbsz(bZ) { // from class: crvn
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                String str = (String) obj;
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar8 = (dtbi) dtbeVar.b;
                dtbi dtbiVar9 = dtbi.y;
                str.getClass();
                dtbiVar8.a |= 2097152;
                dtbiVar8.u = str;
            }
        });
        Integer m = a.m();
        bZ.getClass();
        crvr.q(m, new dbsz(bZ) { // from class: crvo
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar8 = (dtbi) dtbeVar.b;
                dtbi dtbiVar9 = dtbi.y;
                dtbiVar8.a |= ImageMetadata.SHADING_MODE;
                dtbiVar8.t = intValue;
            }
        });
        Long p = a.p();
        bZ.getClass();
        crvr.q(p, new dbsz(bZ) { // from class: crvp
            private final dtbe a;

            {
                this.a = bZ;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dtbe dtbeVar = this.a;
                long longValue = ((Long) obj).longValue();
                if (dtbeVar.c) {
                    dtbeVar.bF();
                    dtbeVar.c = false;
                }
                dtbi dtbiVar8 = (dtbi) dtbeVar.b;
                dtbi dtbiVar9 = dtbi.y;
                dtbiVar8.a |= 8388608;
                dtbiVar8.x = longValue;
            }
        });
        cnjv d = a2.d(bZ.bK().bS());
        d.d(i - 1);
        crxb d2 = a.d();
        try {
            i2 = UUID.fromString(d2.a()).hashCode();
        } catch (IllegalArgumentException | NullPointerException unused) {
            d2.a();
        }
        d.e(i2);
        d.f(a.d().b().b);
        d.a();
    }
}
