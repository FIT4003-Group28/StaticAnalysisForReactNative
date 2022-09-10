package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbt  reason: default package */
/* loaded from: classes5.dex */
final class csbt extends csbz {
    public csbt() {
        super("APPEAR");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().o(1.0f);
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
