package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbv  reason: default package */
/* loaded from: classes5.dex */
final class csbv extends csbz {
    public csbv() {
        super("USER_SPEAKS");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().l(0.0f);
        }
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            float f = next.k;
            int a = csciVar.a(next);
            next.n(f * (a != 0 ? a != 1 ? a != 2 ? a != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().n(0.0f);
        }
    }
}
