package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amyp  reason: default package */
/* loaded from: classes.dex */
final class amyp extends amqx {
    final Iterator a;
    final /* synthetic */ amyq b;

    public amyp(amyq amyqVar) {
        this.b = amyqVar;
        this.a = amyqVar.a.iterator();
    }

    @Override // defpackage.amqx
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
