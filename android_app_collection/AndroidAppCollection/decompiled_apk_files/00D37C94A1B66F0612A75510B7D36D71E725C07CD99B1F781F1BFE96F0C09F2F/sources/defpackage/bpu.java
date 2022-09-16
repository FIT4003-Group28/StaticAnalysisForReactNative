package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: bpu  reason: default package */
/* loaded from: classes2.dex */
public final class bpu {
    public static final bpu a = new bpt().a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public bpw h;
    public int i;

    public bpu() {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bpw();
    }

    public final boolean a() {
        return this.h.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bpu bpuVar = (bpu) obj;
        if (this.b != bpuVar.b || this.c != bpuVar.c || this.d != bpuVar.d || this.e != bpuVar.e || this.f != bpuVar.f || this.g != bpuVar.g || this.i != bpuVar.i) {
            return false;
        }
        return this.h.equals(bpuVar.h);
    }

    public bpu(bpt bptVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bpw();
        this.b = bptVar.a;
        this.c = false;
        this.i = bptVar.c;
        this.d = false;
        this.e = false;
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = bptVar.b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            boolean z = this.b;
            boolean z2 = this.c;
            boolean z3 = this.d;
            boolean z4 = this.e;
            long j = this.f;
            long j2 = this.g;
            return (((((((((((((i * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.h.hashCode();
        }
        throw null;
    }

    public bpu(bpu bpuVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bpw();
        this.b = bpuVar.b;
        this.c = bpuVar.c;
        this.i = bpuVar.i;
        this.d = bpuVar.d;
        this.e = bpuVar.e;
        this.h = bpuVar.h;
    }
}
