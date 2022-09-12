package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: bbl  reason: default package */
/* loaded from: classes.dex */
public final class bbl {
    public static final bbl a = new bbk().a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public bbn h;
    public int i;

    public bbl() {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bbn();
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
        bbl bblVar = (bbl) obj;
        if (this.b != bblVar.b || this.c != bblVar.c || this.d != bblVar.d || this.e != bblVar.e || this.f != bblVar.f || this.g != bblVar.g || this.i != bblVar.i) {
            return false;
        }
        return this.h.equals(bblVar.h);
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

    public bbl(bbk bbkVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bbn();
        this.b = bbkVar.a;
        this.c = false;
        this.i = bbkVar.c;
        this.d = false;
        this.e = false;
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = bbkVar.b;
            this.f = -1L;
            this.g = -1L;
        }
    }

    public bbl(bbl bblVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new bbn();
        this.b = bblVar.b;
        this.c = bblVar.c;
        this.i = bblVar.i;
        this.d = bblVar.d;
        this.e = bblVar.e;
        this.h = bblVar.h;
    }
}
