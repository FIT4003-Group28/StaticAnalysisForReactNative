package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbtj  reason: default package */
/* loaded from: classes.dex */
public final class dbtj implements Iterable<String> {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ dbtm b;

    public dbtj(dbtm dbtmVar, CharSequence charSequence) {
        this.b = dbtmVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.h(this.a);
    }

    public final String toString() {
        dbrz e = dbrz.e(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        e.m(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
