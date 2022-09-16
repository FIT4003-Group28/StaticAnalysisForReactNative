package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amyn  reason: default package */
/* loaded from: classes.dex */
final class amyn extends amqx {
    final Iterator a;
    final /* synthetic */ amyo b;

    public amyn(amyo amyoVar) {
        this.b = amyoVar;
        this.a = amyoVar.a.iterator();
    }

    @Override // defpackage.amqx
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
