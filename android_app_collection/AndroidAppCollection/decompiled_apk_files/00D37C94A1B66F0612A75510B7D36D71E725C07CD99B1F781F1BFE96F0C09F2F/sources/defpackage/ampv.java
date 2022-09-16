package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ampv  reason: default package */
/* loaded from: classes.dex */
public final class ampv extends ampq {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ampv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ampq
    public final ampq a(ampq ampqVar) {
        ampqVar.getClass();
        return this;
    }

    @Override // defpackage.ampq
    public final ampq b(ampg ampgVar) {
        Object apply = ampgVar.apply(this.a);
        apply.getClass();
        return new ampv(apply);
    }

    @Override // defpackage.ampq
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.ampq
    public final Object d(amqo amqoVar) {
        amqoVar.getClass();
        return this.a;
    }

    @Override // defpackage.ampq
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.ampq
    public final boolean equals(Object obj) {
        if (obj instanceof ampv) {
            return this.a.equals(((ampv) obj).a);
        }
        return false;
    }

    @Override // defpackage.ampq
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.ampq
    public final Set g() {
        return Collections.singleton(this.a);
    }

    @Override // defpackage.ampq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ampq
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
