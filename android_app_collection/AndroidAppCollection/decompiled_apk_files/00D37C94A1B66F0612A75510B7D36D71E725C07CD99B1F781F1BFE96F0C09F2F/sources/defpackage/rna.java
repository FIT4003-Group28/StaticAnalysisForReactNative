package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rna  reason: default package */
/* loaded from: classes4.dex */
public final class rna implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ rng b;
    private final /* synthetic */ int c;

    public rna(rng rngVar, AtomicReference atomicReference) {
        this.b = rngVar;
        this.a = atomicReference;
    }

    public rna(rng rngVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = rngVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        double doubleValue;
        int i = this.c;
        if (i == 0) {
            synchronized (this.a) {
                AtomicReference atomicReference = this.a;
                rjp J2 = this.b.J();
                String p = this.b.h().p();
                rkf rkfVar = rkg.L;
                if (p == null) {
                    str = (String) rkfVar.a();
                } else {
                    str = (String) rkfVar.b(J2.a.a(p, rkfVar.a));
                }
                atomicReference.set(str);
                this.a.notify();
            }
        } else if (i == 1) {
            synchronized (this.a) {
                this.a.set(Boolean.valueOf(this.b.J().p(this.b.h().p(), rkg.K)));
                this.a.notify();
            }
        } else if (i == 2) {
            synchronized (this.a) {
                this.a.set(Long.valueOf(this.b.J().h(this.b.h().p(), rkg.M)));
                this.a.notify();
            }
        } else if (i != 3) {
            synchronized (this.a) {
                AtomicReference atomicReference2 = this.a;
                rjp J3 = this.b.J();
                String p2 = this.b.h().p();
                rkf rkfVar2 = rkg.O;
                if (p2 == null) {
                    doubleValue = ((Double) rkfVar2.a()).doubleValue();
                } else {
                    String a = J3.a.a(p2, rkfVar2.a);
                    if (TextUtils.isEmpty(a)) {
                        doubleValue = ((Double) rkfVar2.a()).doubleValue();
                    } else {
                        try {
                            doubleValue = ((Double) rkfVar2.b(Double.valueOf(Double.parseDouble(a)))).doubleValue();
                        } catch (NumberFormatException unused) {
                            doubleValue = ((Double) rkfVar2.a()).doubleValue();
                        }
                    }
                }
                atomicReference2.set(Double.valueOf(doubleValue));
                this.a.notify();
            }
        } else {
            synchronized (this.a) {
                this.a.set(Integer.valueOf(this.b.J().e(this.b.h().p(), rkg.N)));
                this.a.notify();
            }
        }
    }
}
