package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amuy  reason: default package */
/* loaded from: classes.dex */
public final class amuy extends amzs {
    final Iterator a;
    Iterator b = amwc.a;
    final /* synthetic */ amvb c;

    public amuy(amvb amvbVar) {
        this.c = amvbVar;
        this.a = amvbVar.b.values().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (!this.b.hasNext()) {
            this.b = ((amub) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
