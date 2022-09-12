package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnf  reason: default package */
/* loaded from: classes5.dex */
public final class dcnf extends dbxi {
    final Iterator a;
    final /* synthetic */ dcng b;

    public dcnf(dcng dcngVar) {
        this.b = dcngVar;
        this.a = dcngVar.a.iterator();
    }

    @Override // defpackage.dbxi
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        return b();
    }
}
