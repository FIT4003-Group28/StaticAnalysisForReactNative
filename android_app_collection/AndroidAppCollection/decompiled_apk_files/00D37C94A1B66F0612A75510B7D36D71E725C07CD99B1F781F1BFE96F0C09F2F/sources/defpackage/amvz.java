package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvz  reason: default package */
/* loaded from: classes.dex */
public final class amvz extends amqx {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ampt b;

    public amvz(Iterator it, ampt amptVar) {
        this.a = it;
        this.b = amptVar;
    }

    @Override // defpackage.amqx
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
