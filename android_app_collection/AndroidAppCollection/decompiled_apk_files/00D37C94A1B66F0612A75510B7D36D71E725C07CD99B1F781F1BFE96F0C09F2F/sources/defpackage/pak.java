package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: pak  reason: default package */
/* loaded from: classes4.dex */
final class pak extends pab {
    private final pct a;
    private final pcp c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public pak(oyf oyfVar) {
        super(oyfVar);
        this.d = 0;
        pct pctVar = new pct(4);
        this.a = pctVar;
        pctVar.a[0] = -1;
        this.c = new pcp();
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.j = j;
    }

    @Override // defpackage.pab
    public final void d() {
        this.d = 0;
        this.e = 0;
        this.g = false;
    }

    @Override // defpackage.pab
    public final void a(pct pctVar) {
        while (pctVar.a() > 0) {
            int i = this.d;
            if (i == 0) {
                byte[] bArr = pctVar.a;
                int i2 = pctVar.b;
                int i3 = pctVar.c;
                while (true) {
                    if (i2 < i3) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.g && (b & 224) == 224;
                        this.g = z;
                        if (z2) {
                            pctVar.z(i2 + 1);
                            this.g = false;
                            this.a.a[1] = bArr[i2];
                            this.e = 2;
                            this.d = 1;
                            break;
                        }
                        i2++;
                    } else {
                        pctVar.z(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(pctVar.a(), 4 - this.e);
                pctVar.u(this.a.a, this.e, min);
                int i4 = this.e + min;
                this.e = i4;
                if (i4 >= 4) {
                    this.a.z(0);
                    if (!pcp.b(this.a.c(), this.c)) {
                        this.e = 0;
                        this.d = 1;
                    } else {
                        pcp pcpVar = this.c;
                        this.i = pcpVar.c;
                        if (!this.f) {
                            int i5 = pcpVar.g;
                            int i6 = pcpVar.d;
                            this.h = (i5 * 1000000) / i6;
                            this.b.d(MediaFormat.b(null, pcpVar.b, -1, 4096, -1L, pcpVar.e, i6, null, null));
                            this.f = true;
                        }
                        this.a.z(0);
                        this.b.f(this.a, 4);
                        this.d = 2;
                    }
                }
            } else {
                int min2 = Math.min(pctVar.a(), this.i - this.e);
                this.b.f(pctVar, min2);
                int i7 = this.e + min2;
                this.e = i7;
                int i8 = this.i;
                if (i7 >= i8) {
                    this.b.g(this.j, 1, i8, 0, null);
                    this.j += this.h;
                    this.e = 0;
                    this.d = 0;
                }
            }
        }
    }
}
