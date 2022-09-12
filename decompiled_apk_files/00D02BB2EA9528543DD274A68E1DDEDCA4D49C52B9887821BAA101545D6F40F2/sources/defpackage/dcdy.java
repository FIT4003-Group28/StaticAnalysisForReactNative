package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcdy  reason: default package */
/* loaded from: classes5.dex */
public final class dcdy extends dcpd {
    final Iterator<? extends dccr> a;
    Iterator b = dcgb.a;
    final /* synthetic */ dced c;

    public dcdy(dced dcedVar) {
        this.c = dcedVar;
        this.a = dcedVar.b.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = this.a.next().iterator();
        }
        return this.b.next();
    }
}
