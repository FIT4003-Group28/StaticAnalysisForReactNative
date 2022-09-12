package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzfw  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzfw<T> implements dyzw, dzak {
    final AtomicReference<dzak> b = new AtomicReference<>();

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this.b);
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        AtomicReference<dzak> atomicReference = this.b;
        Class<?> cls = getClass();
        dzbm.a(dzakVar, "next is null");
        if (!atomicReference.compareAndSet(null, dzakVar)) {
            dzakVar.SQ();
            if (atomicReference.get() == dzbd.a) {
                return;
            }
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 141 + String.valueOf(name).length());
            sb.append("It is not allowed to subscribe with a(n) ");
            sb.append(name);
            sb.append(" multiple times. Please create a fresh instance of ");
            sb.append(name);
            sb.append(" and subscribe that to the target source instead.");
            dzfy.a(new dzav(sb.toString()));
        }
    }
}
