package defpackage;

import java.util.Iterator;
import java.util.Random;
/* compiled from: PG */
/* renamed from: csbw  reason: default package */
/* loaded from: classes5.dex */
final class csbw extends csbz {
    public csbw() {
        super("LISTENING_RANDOM_LINES");
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
        if (j2 % 5 != 0) {
            return true;
        }
        Random random = new Random();
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            float nextFloat = random.nextFloat();
            int a = csciVar.a(next);
            next.n(nextFloat * (a != 0 ? a != 1 ? a != 2 ? a != 3 ? 0.0f : 8.0f : 10.0f : 7.0f : 9.0f));
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
