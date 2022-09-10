package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csaz  reason: default package */
/* loaded from: classes5.dex */
final class csaz extends csbz {
    public csaz() {
        super("REPLY");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.r(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (j2 - j > 300) {
            Iterator<csch> it = csciVar.iterator();
            while (it.hasNext()) {
                it.next().v(true);
            }
        }
        Iterator<csch> it2 = csciVar.iterator();
        while (it2.hasNext()) {
            csch next = it2.next();
            next.b((next.k * 4.0f) + 4.0f);
        }
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        csbz.r(csciVar);
    }
}
