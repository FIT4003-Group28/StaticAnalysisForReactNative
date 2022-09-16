package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amyl  reason: default package */
/* loaded from: classes.dex */
public final class amyl extends amqx {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ amym c;

    public amyl(amym amymVar) {
        this.c = amymVar;
        this.a = amymVar.a.iterator();
        this.b = ((amyt) amymVar.b).iterator();
    }

    @Override // defpackage.amqx
    protected final Object a() {
        if (!this.a.hasNext()) {
            while (this.b.hasNext()) {
                Object next = this.b.next();
                if (!this.c.a.contains(next)) {
                    return next;
                }
            }
            b();
            return null;
        }
        return this.a.next();
    }
}
