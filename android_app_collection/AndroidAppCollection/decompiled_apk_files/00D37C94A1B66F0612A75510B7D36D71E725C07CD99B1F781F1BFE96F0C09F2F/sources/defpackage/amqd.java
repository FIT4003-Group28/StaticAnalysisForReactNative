package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amqd  reason: default package */
/* loaded from: classes.dex */
public final class amqd implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ amqf b;

    public amqd(amqf amqfVar, CharSequence charSequence) {
        this.b = amqfVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.g(this.a);
    }

    public final String toString() {
        ampm b = ampm.b(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        b.f(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
