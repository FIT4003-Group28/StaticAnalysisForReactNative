package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
/* compiled from: PG */
/* renamed from: aod  reason: default package */
/* loaded from: classes2.dex */
public final class aod extends aob<aod> {
    public aoe n;
    public float o;

    public <K> aod(K k, aoc<K> aocVar) {
        super(k, aocVar);
        this.n = null;
        this.o = Float.MAX_VALUE;
    }

    @Override // defpackage.aob
    public final boolean b(long j) {
        float f;
        if (this.o != Float.MAX_VALUE) {
            long j2 = j / 2;
            anx b = this.n.b(this.h, this.g, j2);
            this.n.c(this.o);
            this.o = Float.MAX_VALUE;
            anx b2 = this.n.b(b.a, b.b, j2);
            f = b2.a;
            this.h = f;
            this.g = b2.b;
        } else {
            anx b3 = this.n.b(this.h, this.g, j);
            f = b3.a;
            this.h = f;
            this.g = b3.b;
        }
        float max = Math.max(f, -3.4028235E38f);
        this.h = max;
        float min = Math.min(max, Float.MAX_VALUE);
        this.h = min;
        float f2 = this.g;
        aoe aoeVar = this.n;
        if (Math.abs(f2) >= aoeVar.e || Math.abs(min - aoeVar.a()) >= aoeVar.d) {
            return false;
        }
        this.h = this.n.a();
        this.g = 0.0f;
        return true;
    }

    public final void e() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.l) {
                super.d();
            }
            float f = this.o;
            if (f == Float.MAX_VALUE) {
                return;
            }
            aoe aoeVar = this.n;
            if (aoeVar == null) {
                this.n = new aoe(f);
            } else {
                aoeVar.c(f);
            }
            this.o = Float.MAX_VALUE;
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }
}
