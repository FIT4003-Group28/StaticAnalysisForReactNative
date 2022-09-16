package defpackage;

import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: awpi  reason: default package */
/* loaded from: classes3.dex */
public final class awpi {
    public static final EnumSet<dqvj> a = EnumSet.of(dqvj.DRIVE, dqvj.BICYCLE, dqvj.TWO_WHEELER);
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Object b = new Object();
    public final List<awph> c = dchl.a();
    public int h = 1;
    public int i = 1;

    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.d && this.i == 3) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.d && this.i == 2) {
                z = true;
            }
        }
        return z;
    }

    public final void c(awph awphVar) {
        synchronized (this.b) {
            if (!this.c.contains(awphVar)) {
                this.c.add(awphVar);
            }
        }
    }

    public final void d(awph awphVar) {
        synchronized (this.b) {
            this.c.remove(awphVar);
        }
    }

    public final void e() {
        synchronized (this.b) {
            this.e = true;
            if (!this.d && this.h != 1) {
                this.d = true;
            }
        }
    }

    public final void f() {
        synchronized (this.b) {
            for (awph awphVar : this.c) {
                awphVar.k(this.h);
            }
        }
    }
}
