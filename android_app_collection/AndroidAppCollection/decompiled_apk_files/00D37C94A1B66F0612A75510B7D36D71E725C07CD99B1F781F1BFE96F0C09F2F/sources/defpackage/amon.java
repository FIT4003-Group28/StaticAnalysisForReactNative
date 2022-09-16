package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amon  reason: default package */
/* loaded from: classes.dex */
public final class amon extends ampq {
    public static final amon a = new amon();
    private static final long serialVersionUID = 0;

    private amon() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ampq
    public final ampq a(ampq ampqVar) {
        ampqVar.getClass();
        return ampqVar;
    }

    @Override // defpackage.ampq
    public final ampq b(ampg ampgVar) {
        ampgVar.getClass();
        return a;
    }

    @Override // defpackage.ampq
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.ampq
    public final Object d(amqo amqoVar) {
        Object obj = amqoVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ampq
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ampq
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.ampq
    public final Object f() {
        return null;
    }

    @Override // defpackage.ampq
    public final Set g() {
        return Collections.emptySet();
    }

    @Override // defpackage.ampq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ampq
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
