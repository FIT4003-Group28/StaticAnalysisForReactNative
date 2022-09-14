package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: defd  reason: default package */
/* loaded from: classes6.dex */
final class defd extends defb {
    @Override // defpackage.defb
    public final int a(defe defeVar) {
        int i;
        synchronized (defeVar) {
            i = defeVar.remaining - 1;
            defeVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.defb
    public final void b(defe defeVar, Set<Throwable> set) {
        synchronized (defeVar) {
            if (defeVar.seenExceptions == null) {
                defeVar.seenExceptions = set;
            }
        }
    }
}
