package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbr  reason: default package */
/* loaded from: classes5.dex */
final class csbr extends csbz {
    public csbr() {
        super("DISAPPEAR");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.g(csciVar);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            it.next().o(0.0f);
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
