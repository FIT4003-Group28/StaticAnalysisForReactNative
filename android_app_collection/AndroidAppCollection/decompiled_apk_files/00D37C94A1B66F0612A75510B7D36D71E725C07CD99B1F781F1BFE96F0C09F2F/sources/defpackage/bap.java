package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
/* compiled from: PG */
/* renamed from: bap  reason: default package */
/* loaded from: classes2.dex */
public final class bap implements aze {
    private azh b;
    private int c;
    private int d;
    private int e;
    private MotionPhotoMetadata g;
    private azf h;
    private bas i;
    private bbz j;
    private final pwu a = new pwu(6);
    private long f = -1;

    private final int a(azf azfVar) {
        this.a.C(2);
        azfVar.j(this.a.a, 0, 2);
        return this.a.m();
    }

    private final void b() {
        c(new Metadata.Entry[0]);
        azh azhVar = this.b;
        ptx.a(azhVar);
        azhVar.b();
        this.b.ry(new azx(-9223372036854775807L));
        this.c = 6;
    }

    private final void c(Metadata.Entry... entryArr) {
        azh azhVar = this.b;
        ptx.a(azhVar);
        bab pT = azhVar.pT(1024, 4);
        pis pisVar = new pis();
        pisVar.j = "image/jpeg";
        pisVar.i = new Metadata(entryArr);
        pT.rx(pisVar.a());
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.b = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c != 5) {
        } else {
            bbz bbzVar = this.j;
            ptx.a(bbzVar);
            bbzVar.g(j, j2);
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        if (a(azfVar) != 65496) {
            return false;
        }
        int a = a(azfVar);
        this.d = a;
        if (a == 65504) {
            this.a.C(2);
            azfVar.j(this.a.a, 0, 2);
            azfVar.f(this.a.m() - 2);
            a = a(azfVar);
            this.d = a;
        }
        if (a != 65505) {
            return false;
        }
        azfVar.f(2);
        this.a.C(6);
        azfVar.j(this.a.a, 0, 6);
        return this.a.p() == 1165519206 && this.a.m() == 0;
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        String t;
        bar a;
        int i;
        long j;
        int i2 = this.c;
        if (i2 == 0) {
            this.a.C(2);
            azfVar.k(this.a.a, 0, 2);
            int m = this.a.m();
            this.d = m;
            if (m == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    b();
                }
            } else if ((m < 65488 || m > 65497) && m != 65281) {
                this.c = 1;
            }
            return 0;
        } else if (i2 == 1) {
            this.a.C(2);
            azfVar.k(this.a.a, 0, 2);
            this.e = this.a.m() - 2;
            this.c = 2;
            return 0;
        } else {
            MotionPhotoMetadata motionPhotoMetadata = null;
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            throw new IllegalStateException();
                        }
                        return -1;
                    }
                    if (this.i == null || azfVar != this.h) {
                        this.h = azfVar;
                        this.i = new bas(azfVar, this.f);
                    }
                    bbz bbzVar = this.j;
                    ptx.a(bbzVar);
                    int d = bbzVar.d(this.i, azvVar);
                    if (d == 1) {
                        azvVar.a += this.f;
                    }
                    return d;
                }
                long j2 = ((aza) azfVar).c;
                long j3 = this.f;
                if (j2 != j3) {
                    azvVar.a = j3;
                    return 1;
                }
                if (!azfVar.o(this.a.a, 0, 1, true)) {
                    b();
                } else {
                    azfVar.l();
                    if (this.j == null) {
                        this.j = new bbz(null);
                    }
                    bas basVar = new bas(azfVar, this.f);
                    this.i = basVar;
                    if (this.j.h(basVar)) {
                        bbz bbzVar2 = this.j;
                        long j4 = this.f;
                        azh azhVar = this.b;
                        ptx.a(azhVar);
                        bbzVar2.a = new bau(j4, azhVar);
                        MotionPhotoMetadata motionPhotoMetadata2 = this.g;
                        ptx.a(motionPhotoMetadata2);
                        c(motionPhotoMetadata2);
                        this.c = 5;
                    } else {
                        b();
                    }
                }
                return 0;
            }
            if (this.d == 65505) {
                pwu pwuVar = new pwu(this.e);
                azfVar.k(pwuVar.a, 0, this.e);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(pwuVar.t()) && (t = pwuVar.t()) != null) {
                    long j5 = ((aza) azfVar).b;
                    if (j5 != -1 && (a = bav.a(t)) != null && (i = ((amxx) a.b).c) >= 2) {
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        boolean z = false;
                        for (int i3 = i - 1; i3 >= 0; i3--) {
                            baq baqVar = (baq) a.b.get(i3);
                            z |= "video/mp4".equals(baqVar.a);
                            if (i3 == 0) {
                                j5 -= baqVar.c;
                                j = 0;
                            } else {
                                j = j5 - baqVar.b;
                            }
                            long j10 = j5;
                            j5 = j;
                            if (z && j5 != j10) {
                                j9 = j10 - j5;
                                j8 = j5;
                                z = false;
                            }
                            if (i3 == 0) {
                                j7 = j10;
                            }
                            if (i3 == 0) {
                                j6 = j5;
                            }
                        }
                        motionPhotoMetadata = (j8 == -1 || j9 == -1 || j6 == -1 || j7 == -1) ? null : new MotionPhotoMetadata(j6, j7, a.a, j8, j9);
                    }
                    this.g = motionPhotoMetadata;
                    if (motionPhotoMetadata != null) {
                        this.f = motionPhotoMetadata.d;
                    }
                }
            } else {
                azfVar.m(this.e);
            }
            this.c = 0;
            return 0;
        }
    }
}
