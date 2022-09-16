package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: bds  reason: default package */
/* loaded from: classes2.dex */
public final class bds implements beg {
    private final bdd a;
    private final pwt b = new pwt(new byte[10]);
    private int c = 0;
    private int d;
    private pxg e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public bds(bdd bddVar) {
        this.a = bddVar;
    }

    private final void d(int i) {
        this.c = i;
        this.d = 0;
    }

    private final boolean e(pwu pwuVar, byte[] bArr, int i) {
        int min = Math.min(pwuVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pwuVar.H(min);
        } else {
            pwuVar.B(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.beg
    public final void a(pwu pwuVar, int i) {
        long j;
        ptx.b(this.e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.c;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i6 = i;
        while (pwuVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int a = pwuVar.a();
                        int i9 = this.j;
                        if (i9 != i2) {
                            i8 = a - i9;
                        }
                        if (i8 > 0) {
                            a -= i8;
                            pwuVar.F(pwuVar.b + a);
                        }
                        this.a.a(pwuVar);
                        int i10 = this.j;
                        if (i10 != i2) {
                            int i11 = i10 - a;
                            this.j = i11;
                            if (i11 == 0) {
                                this.a.c();
                                d(1);
                            }
                        }
                    } else {
                        if (e(pwuVar, this.b.a, Math.min(10, this.i)) && e(pwuVar, null, this.i)) {
                            this.b.j(0);
                            if (this.f) {
                                this.b.l(4);
                                int d = this.b.d(3);
                                this.b.l(1);
                                int d2 = this.b.d(15);
                                this.b.l(1);
                                long d3 = (d2 << 15) | (d << 30) | this.b.d(15);
                                this.b.l(1);
                                if (!this.h && this.g) {
                                    this.b.l(4);
                                    int d4 = this.b.d(3);
                                    this.b.l(1);
                                    int d5 = this.b.d(15);
                                    this.b.l(1);
                                    int d6 = this.b.d(15);
                                    this.b.l(1);
                                    this.e.b((d4 << 30) | (d5 << 15) | d6);
                                    this.h = true;
                                }
                                j = this.e.b(d3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.k ? 0 : 4;
                            this.a.d(j, i6);
                            d(3);
                            i2 = -1;
                        }
                    }
                } else if (e(pwuVar, this.b.a, 9)) {
                    int i12 = 0;
                    this.b.j(0);
                    int d7 = this.b.d(24);
                    if (d7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(d7);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.j = -1;
                    } else {
                        this.b.l(8);
                        int d8 = this.b.d(16);
                        this.b.l(5);
                        this.k = this.b.n();
                        this.b.l(2);
                        this.f = this.b.n();
                        this.g = this.b.n();
                        this.b.l(6);
                        int d9 = this.b.d(8);
                        this.i = d9;
                        if (d8 == 0) {
                            this.j = -1;
                        } else {
                            int i13 = (d8 - 3) - d9;
                            this.j = i13;
                            if (i13 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i13);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.j = -1;
                                i12 = 2;
                            }
                        }
                        i2 = -1;
                        i12 = 2;
                    }
                    d(i12);
                } else {
                    i2 = -1;
                }
            } else {
                pwuVar.H(pwuVar.a());
            }
            i3 = 2;
        }
    }

    @Override // defpackage.beg
    public final void b(pxg pxgVar, azh azhVar, bef befVar) {
        this.e = pxgVar;
        this.a.b(azhVar, befVar);
    }

    @Override // defpackage.beg
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.e();
    }
}
