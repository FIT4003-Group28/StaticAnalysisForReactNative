package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbi  reason: default package */
/* loaded from: classes5.dex */
final class csbi extends csbz {
    public csbi() {
        super("MIC ENTER FAST");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (!csbz.j(csciVar)) {
            o(csciVar, j2);
            return false;
        }
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().l(-6.0f);
        }
        csbz.k(csciVar);
        Iterator<csch> it2 = csciVar.iterator();
        while (it2.hasNext()) {
            if (!it2.next().t()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csbz.l(csciVar);
    }
}
