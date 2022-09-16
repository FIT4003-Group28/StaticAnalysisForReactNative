package defpackage;

import android.graphics.Bitmap;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: ggp  reason: default package */
/* loaded from: classes3.dex */
public final class ggp {
    public final long a;
    public final boolean b;
    public CharSequence c;
    public atep d;
    public avhn e;
    public Bitmap f;
    public String g;
    public double h;
    public double i;
    public double j;
    public double k;
    public boolean l;
    public boolean m;
    public double n;
    public Spanned o;
    public Spanned p;
    public Spanned q;
    public Spanned r;
    public apzg s;
    public apzg t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    private int z;

    public ggp(CharSequence charSequence, int i, boolean z, String str, atep atepVar, long j, avvd avvdVar) {
        this.y = 1;
        atepVar.getClass();
        this.c = charSequence;
        this.y = i;
        this.b = z;
        this.g = str;
        this.d = atepVar;
        this.k = Double.POSITIVE_INFINITY;
        this.a = j;
        this.n = -1.0d;
        this.h = -1.0d;
        this.i = -1.0d;
        this.j = -1.0d;
        if (avvdVar != null) {
            d(avvdVar);
        }
    }

    public final void a(boolean z, boolean z2) {
        this.v = z;
        this.w = z2;
    }

    public final void b() {
        this.x = true;
    }

    public final void c(alct alctVar) {
        if (alht.j(alctVar, avun.UPLOAD_PROCESSOR_FAILURE_REASON_MAX_STORAGE_USAGE_TIME_EXCEEDED)) {
            this.u = true;
        }
        this.z = 0;
        int z = araa.z(alctVar.c);
        if (z == 0) {
            z = 1;
        }
        int i = z - 1;
        if (i != 0) {
            if (i == 1) {
                this.j = 1.0d;
                this.k = 0.0d;
                return;
            } else if (i != 3) {
                return;
            } else {
                avun b = avun.b(alctVar.d);
                if (b == null) {
                    b = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                }
                if (b == avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) {
                    return;
                }
                this.l = true;
                return;
            }
        }
        avun b2 = avun.b(alctVar.d);
        if (b2 == null) {
            b2 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b2 == avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI) {
            this.z = 1;
            return;
        }
        avun b3 = avun.b(alctVar.d);
        if (b3 == null) {
            b3 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        if (b3 != avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK) {
            return;
        }
        this.z = 2;
    }

    public final void d(avvd avvdVar) {
        arag aragVar;
        arag aragVar2;
        apzg apzgVar = null;
        if ((avvdVar.b & 4) != 0) {
            aragVar = avvdVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        this.q = ajgl.b(aragVar);
        if ((avvdVar.b & 8) != 0) {
            aragVar2 = avvdVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        this.r = ajgl.b(aragVar2);
        if ((avvdVar.b & 16) != 0 && (apzgVar = avvdVar.f) == null) {
            apzgVar = apzg.a;
        }
        this.s = apzgVar;
    }

    public final boolean e() {
        return this.z == 2;
    }

    public final boolean f() {
        return this.z == 1;
    }

    public final void g(int i) {
        if (i == 4) {
            this.m = true;
        }
    }
}
