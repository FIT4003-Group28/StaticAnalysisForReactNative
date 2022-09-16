package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amwt  reason: default package */
/* loaded from: classes.dex */
final class amwt extends amzs {
    final /* synthetic */ Iterator a;

    public amwt(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        return amxp.m((Map.Entry) this.a.next());
    }
}
