package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbd  reason: default package */
/* loaded from: classes5.dex */
final class csbd extends csbz {
    public csbd() {
        super("GOOGLE LOGO");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csciVar.b(true);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.q(1);
            next.o(1.0f);
            next.k(csciVar.c(next));
            next.l(0.0f);
        }
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
    }
}
