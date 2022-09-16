package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbp  reason: default package */
/* loaded from: classes5.dex */
final class csbp extends csbz {
    public csbp() {
        super("MOLECULE HIDDEN");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.i(csciVar);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.l(csbz.a[csciVar.a(next)] + 10.0f);
            csciVar.i(0.0f);
        }
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csciVar.i(0.0f);
    }
}
