package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbu  reason: default package */
/* loaded from: classes5.dex */
final class csbu extends csbz {
    public csbu() {
        super("LISTENING");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        o(csciVar, j2);
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().l(0.0f);
        }
    }
}
