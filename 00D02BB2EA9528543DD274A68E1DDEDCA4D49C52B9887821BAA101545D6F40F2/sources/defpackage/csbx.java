package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbx  reason: default package */
/* loaded from: classes5.dex */
final class csbx extends csbz {
    public csbx() {
        super("GOT IT");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        float e = csbz.e(j, j2, 1000L);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            float a = e - (csciVar.a(next) * 0.05f);
            if (a < 0.0f) {
                p(csciVar, next, j2);
            } else if (a < 0.15f) {
                next.l(-8.0f);
            } else if (a < 0.3f) {
                next.l(8.0f);
            } else {
                p(csciVar, next, j2);
            }
        }
        return e < 1.0f;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().l(0.0f);
        }
    }
}
