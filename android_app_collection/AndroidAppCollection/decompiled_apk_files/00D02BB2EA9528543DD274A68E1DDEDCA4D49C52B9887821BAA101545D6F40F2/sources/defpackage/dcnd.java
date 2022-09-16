package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnd  reason: default package */
/* loaded from: classes5.dex */
public final class dcnd extends dbxi {
    final Iterator a;
    final /* synthetic */ dcne b;

    public dcnd(dcne dcneVar) {
        this.b = dcneVar;
        this.a = dcneVar.a.iterator();
    }

    @Override // defpackage.dbxi
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        return b();
    }
}
