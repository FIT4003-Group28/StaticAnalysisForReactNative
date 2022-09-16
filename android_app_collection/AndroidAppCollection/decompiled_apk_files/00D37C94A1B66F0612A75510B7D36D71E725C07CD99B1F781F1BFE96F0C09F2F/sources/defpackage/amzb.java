package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amzb  reason: default package */
/* loaded from: classes.dex */
final class amzb extends amzc {
    private static final long serialVersionUID = 0;

    public amzb(Collection collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.amzc, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amza(this, super.iterator());
    }
}
