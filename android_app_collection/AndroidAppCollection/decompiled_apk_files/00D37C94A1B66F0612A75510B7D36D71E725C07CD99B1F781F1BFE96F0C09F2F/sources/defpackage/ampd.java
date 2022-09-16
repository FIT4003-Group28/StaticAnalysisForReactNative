package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ampd  reason: default package */
/* loaded from: classes.dex */
public final class ampd implements Iterable {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ampf b;

    public ampd(ampf ampfVar, Iterable iterable) {
        this.b = ampfVar;
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ampc(this);
    }
}
