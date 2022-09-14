package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfx  reason: default package */
/* loaded from: classes.dex */
public final class dcfx extends dbxi {
    final /* synthetic */ Iterator a;
    final /* synthetic */ dbsl b;

    public dcfx(Iterator it, dbsl dbslVar) {
        this.a = it;
        this.b = dbslVar;
    }

    @Override // defpackage.dbxi
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        return b();
    }
}
