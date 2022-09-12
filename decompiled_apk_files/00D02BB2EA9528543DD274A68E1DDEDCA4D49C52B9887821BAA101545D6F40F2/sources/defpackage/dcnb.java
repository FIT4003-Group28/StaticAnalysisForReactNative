package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnb  reason: default package */
/* loaded from: classes5.dex */
public final class dcnb extends dbxi {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ dcnc c;

    public dcnb(dcnc dcncVar) {
        this.c = dcncVar;
        this.a = dcncVar.a.iterator();
        this.b = dcncVar.b.iterator();
    }

    @Override // defpackage.dbxi
    protected final Object a() {
        if (!this.a.hasNext()) {
            while (this.b.hasNext()) {
                Object next = this.b.next();
                if (!this.c.a.contains(next)) {
                    return next;
                }
            }
            return b();
        }
        return this.a.next();
    }
}
