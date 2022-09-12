package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbse  reason: default package */
/* loaded from: classes5.dex */
final class dbse extends dbpz {
    final /* synthetic */ dbsf a;
    private final Iterator<? extends dbsg> b;

    public dbse(dbsf dbsfVar) {
        this.a = dbsfVar;
        Iterator<? extends dbsg> it = dbsfVar.a.iterator();
        dbsk.s(it);
        this.b = it;
    }

    @Override // defpackage.dbpz
    protected final Object a() {
        while (this.b.hasNext()) {
            dbsg next = this.b.next();
            if (next.a()) {
                return next.b();
            }
        }
        return b();
    }
}
