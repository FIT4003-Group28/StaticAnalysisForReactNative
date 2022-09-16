package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amhy  reason: default package */
/* loaded from: classes2.dex */
final class amhy {
    public final dzmg<amkk> a = new dzmp();
    public final List<amkk> b = new ArrayList();
    public final dzmg<amkk> c = new dzmp();
    public int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(amkk amkkVar) {
        dbsk.s(amkkVar);
        if (!amkkVar.i().f()) {
            return;
        }
        alvi a = amkkVar.i().a();
        dbsk.s(a);
        akra akraVar = a.a;
        float f = 1073741824 >> this.d;
        long j = (((int) ((akraVar.b / f) * 30.0f)) & 4294967295L) | (((int) ((akraVar.a / f) * 30.0f)) << 32);
        amkk i = this.c.i(j);
        if (i != null) {
            int c = decl.c(i.j(), i.j());
            if (c == 0) {
                c = decl.c(i.hashCode(), i.hashCode());
            }
            if (c <= 0) {
                return;
            }
        }
        this.c.a(j, amkkVar);
    }
}
