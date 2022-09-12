package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxj  reason: default package */
/* loaded from: classes4.dex */
public final class bxj implements bvt, bvs {
    public final bvu<?> a;
    public final bvs b;
    public Object c;
    public bvq d;
    private int e;
    private bvp f;
    private volatile cao<?> g;

    public bxj(bvu<?> bvuVar, bvs bvsVar) {
        this.a = bvuVar;
        this.b = bvsVar;
    }

    @Override // defpackage.bvt
    public final boolean a() {
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            SystemClock.elapsedRealtimeNanos();
            try {
                btl a = this.a.c.c.b.a(obj.getClass());
                if (a != null) {
                    bvr bvrVar = new bvr(a, obj, this.a.h);
                    this.d = new bvq(this.g.a, this.a.m);
                    this.a.a().b(this.d, bvrVar);
                    this.g.c.b();
                    this.f = new bvp(Collections.singletonList(this.g.a), this.a, this);
                } else {
                    throw new brt(obj.getClass());
                }
            } catch (Throwable th) {
                this.g.c.b();
                throw th;
            }
        }
        bvp bvpVar = this.f;
        if (bvpVar == null || !bvpVar.a()) {
            this.f = null;
            this.g = null;
            boolean z = false;
            while (!z && this.e < this.a.g().size()) {
                List<cao<?>> g = this.a.g();
                int i = this.e;
                this.e = i + 1;
                this.g = g.get(i);
                if (this.g != null && (this.a.o.c(this.g.c.e()) || this.a.c(this.g.c.d()))) {
                    this.g.c.a(this.a.n, new bxi(this, this.g));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // defpackage.bvt
    public final void b() {
        cao<?> caoVar = this.g;
        if (caoVar != null) {
            caoVar.c.c();
        }
    }

    @Override // defpackage.bvs
    public final void c() {
        throw null;
    }

    @Override // defpackage.bvs
    public final void d(btw btwVar, Object obj, buj<?> bujVar, int i, btw btwVar2) {
        this.b.d(btwVar, obj, bujVar, this.g.c.e(), btwVar);
    }

    @Override // defpackage.bvs
    public final void e(btw btwVar, Exception exc, buj<?> bujVar, int i) {
        this.b.e(btwVar, exc, bujVar, this.g.c.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(cao<?> caoVar) {
        cao<?> caoVar2 = this.g;
        return caoVar2 != null && caoVar2 == caoVar;
    }
}
