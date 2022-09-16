package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbrw  reason: default package */
/* loaded from: classes5.dex */
public final class dbrw extends dbrz {
    final /* synthetic */ dbrz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbrw(dbrz dbrzVar, dbrz dbrzVar2) {
        super(dbrzVar2);
        this.a = dbrzVar;
    }

    @Override // defpackage.dbrz
    public final dbrz b() {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    @Override // defpackage.dbrz
    public final dbry c(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }

    @Override // defpackage.dbrz
    public final <A extends Appendable> void d(A a, Iterator it) {
        dbsk.t(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                a.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                a.append(this.a.c);
                a.append(this.a.a(next2));
            }
        }
    }
}
