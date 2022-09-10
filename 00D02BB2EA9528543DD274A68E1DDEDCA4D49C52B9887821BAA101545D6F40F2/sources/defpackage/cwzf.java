package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwzf  reason: default package */
/* loaded from: classes5.dex */
public final class cwzf {
    static final cwzf a = new cwzf(0, null);
    public final long b;
    private final dzzn c;

    private cwzf(long j, dzzn dzznVar) {
        this.b = j;
        this.c = dzznVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cwzf a(long j, dzzn dzznVar) {
        dbsk.a(j > 0);
        dbsk.s(dzznVar);
        return new cwzf(j, dzznVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dzzl c(dzzn dzznVar, dzzn dzznVar2) {
        dzzl dzzlVar = null;
        if (dzznVar != null && dzznVar2 != null && (dzznVar.a & 1) != 0 && (dzznVar2.a & 1) != 0) {
            dzzk dzzkVar = dzznVar.b;
            if (dzzkVar == null) {
                dzzkVar = dzzk.c;
            }
            if ((dzzkVar.a & 1) != 0) {
                dzzk dzzkVar2 = dzznVar2.b;
                if (dzzkVar2 == null) {
                    dzzkVar2 = dzzk.c;
                }
                if ((dzzkVar2.a & 1) != 0) {
                    dzzlVar = (dzzl) dzzn.g.bZ();
                    dzzj bZ = dzzk.c.bZ();
                    dzzk dzzkVar3 = dzznVar.b;
                    if (dzzkVar3 == null) {
                        dzzkVar3 = dzzk.c;
                    }
                    dzzg dzzgVar = dzzkVar3.b;
                    if (dzzgVar == null) {
                        dzzgVar = dzzg.z;
                    }
                    dzzk dzzkVar4 = dzznVar2.b;
                    if (dzzkVar4 == null) {
                        dzzkVar4 = dzzk.c;
                    }
                    dzzg dzzgVar2 = dzzkVar4.b;
                    if (dzzgVar2 == null) {
                        dzzgVar2 = dzzg.z;
                    }
                    dzzf bZ2 = dzzg.z.bZ();
                    if ((dzzgVar.a & 1) != 0 && (dzzgVar2.a & 1) != 0) {
                        int i = dzzgVar2.b - dzzgVar.b;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar3 = (dzzg) bZ2.b;
                        dzzgVar3.a |= 1;
                        dzzgVar3.b = i;
                    }
                    if ((dzzgVar.a & 2) != 0 && (dzzgVar2.a & 2) != 0) {
                        int i2 = dzzgVar2.c - dzzgVar.c;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar4 = (dzzg) bZ2.b;
                        dzzgVar4.a |= 2;
                        dzzgVar4.c = i2;
                    }
                    if ((dzzgVar.a & 4) != 0 && (dzzgVar2.a & 4) != 0) {
                        int i3 = dzzgVar2.d - dzzgVar.d;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar5 = (dzzg) bZ2.b;
                        dzzgVar5.a |= 4;
                        dzzgVar5.d = i3;
                    }
                    if ((dzzgVar.a & 8) != 0 && (dzzgVar2.a & 8) != 0) {
                        int i4 = dzzgVar2.e - dzzgVar.e;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar6 = (dzzg) bZ2.b;
                        dzzgVar6.a |= 8;
                        dzzgVar6.e = i4;
                    }
                    if ((dzzgVar.a & 16) != 0 && (dzzgVar2.a & 16) != 0) {
                        int i5 = dzzgVar2.f - dzzgVar.f;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar7 = (dzzg) bZ2.b;
                        dzzgVar7.a |= 16;
                        dzzgVar7.f = i5;
                    }
                    if ((dzzgVar.a & 32) != 0 && (dzzgVar2.a & 32) != 0) {
                        int i6 = dzzgVar2.g - dzzgVar.g;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar8 = (dzzg) bZ2.b;
                        dzzgVar8.a |= 32;
                        dzzgVar8.g = i6;
                    }
                    if ((dzzgVar.a & 128) != 0 && (dzzgVar2.a & 128) != 0) {
                        int i7 = dzzgVar2.i - dzzgVar.i;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar9 = (dzzg) bZ2.b;
                        dzzgVar9.a |= 128;
                        dzzgVar9.i = i7;
                    }
                    if ((dzzgVar.a & 256) != 0 && (dzzgVar2.a & 256) != 0) {
                        int i8 = dzzgVar2.j - dzzgVar.j;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar10 = (dzzg) bZ2.b;
                        dzzgVar10.a |= 256;
                        dzzgVar10.j = i8;
                    }
                    if ((dzzgVar.a & 512) != 0 && (dzzgVar2.a & 512) != 0) {
                        int i9 = dzzgVar2.k - dzzgVar.k;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar11 = (dzzg) bZ2.b;
                        dzzgVar11.a |= 512;
                        dzzgVar11.k = i9;
                    }
                    if ((dzzgVar.a & 1024) != 0 && (dzzgVar2.a & 1024) != 0) {
                        int i10 = dzzgVar2.l - dzzgVar.l;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar12 = (dzzg) bZ2.b;
                        dzzgVar12.a |= 1024;
                        dzzgVar12.l = i10;
                    }
                    if ((dzzgVar.a & 2048) != 0 && (dzzgVar2.a & 2048) != 0) {
                        int i11 = dzzgVar2.m - dzzgVar.m;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar13 = (dzzg) bZ2.b;
                        dzzgVar13.a |= 2048;
                        dzzgVar13.m = i11;
                    }
                    if ((dzzgVar.a & 4096) != 0 && (dzzgVar2.a & 4096) != 0) {
                        int i12 = dzzgVar2.n - dzzgVar.n;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar14 = (dzzg) bZ2.b;
                        dzzgVar14.a |= 4096;
                        dzzgVar14.n = i12;
                    }
                    if ((dzzgVar.a & 8192) != 0 && (dzzgVar2.a & 8192) != 0) {
                        int i13 = dzzgVar2.o - dzzgVar.o;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar15 = (dzzg) bZ2.b;
                        dzzgVar15.a |= 8192;
                        dzzgVar15.o = i13;
                    }
                    if ((dzzgVar.a & 16384) != 0 && (dzzgVar2.a & 16384) != 0) {
                        int i14 = dzzgVar2.p - dzzgVar.p;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar16 = (dzzg) bZ2.b;
                        dzzgVar16.a |= 16384;
                        dzzgVar16.p = i14;
                    }
                    if ((dzzgVar.a & 32768) != 0 && (dzzgVar2.a & 32768) != 0) {
                        int i15 = dzzgVar2.q - dzzgVar.q;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar17 = (dzzg) bZ2.b;
                        dzzgVar17.a = 32768 | dzzgVar17.a;
                        dzzgVar17.q = i15;
                    }
                    if ((dzzgVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 && (dzzgVar2.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                        int i16 = dzzgVar2.r - dzzgVar.r;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar18 = (dzzg) bZ2.b;
                        dzzgVar18.a = 65536 | dzzgVar18.a;
                        dzzgVar18.r = i16;
                    }
                    if ((dzzgVar.a & 131072) != 0 && (dzzgVar2.a & 131072) != 0) {
                        int i17 = dzzgVar2.s - dzzgVar.s;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar19 = (dzzg) bZ2.b;
                        dzzgVar19.a = 131072 | dzzgVar19.a;
                        dzzgVar19.s = i17;
                    }
                    if ((dzzgVar.a & 262144) != 0 && (dzzgVar2.a & 262144) != 0) {
                        int i18 = dzzgVar2.t - dzzgVar.t;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar20 = (dzzg) bZ2.b;
                        dzzgVar20.a = 262144 | dzzgVar20.a;
                        dzzgVar20.t = i18;
                    }
                    if ((dzzgVar.a & ImageMetadata.LENS_APERTURE) != 0 && (dzzgVar2.a & ImageMetadata.LENS_APERTURE) != 0) {
                        long j = dzzgVar2.u - dzzgVar.u;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar21 = (dzzg) bZ2.b;
                        dzzgVar21.a |= ImageMetadata.LENS_APERTURE;
                        dzzgVar21.u = j;
                    }
                    dzzg bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dzzk dzzkVar5 = (dzzk) bZ.b;
                    bK.getClass();
                    dzzkVar5.b = bK;
                    dzzkVar5.a |= 1;
                    if (dzzlVar.c) {
                        dzzlVar.bF();
                        dzzlVar.c = false;
                    }
                    dzzn dzznVar3 = (dzzn) dzzlVar.b;
                    dzzk bK2 = bZ.bK();
                    bK2.getClass();
                    dzznVar3.b = bK2;
                    dzznVar3.a |= 1;
                }
            }
        }
        return dzzlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dzzn b() {
        if (this == a) {
            return null;
        }
        return this.c;
    }
}
