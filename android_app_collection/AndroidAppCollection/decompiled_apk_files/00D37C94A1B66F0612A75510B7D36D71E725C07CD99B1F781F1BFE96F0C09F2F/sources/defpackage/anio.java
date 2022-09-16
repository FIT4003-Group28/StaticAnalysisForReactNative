package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: anio  reason: default package */
/* loaded from: classes.dex */
final class anio extends anim {
    @Override // defpackage.anim
    public final int a(anip anipVar) {
        int i;
        synchronized (anipVar) {
            i = anipVar.remaining - 1;
            anipVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.anim
    public final void b(anip anipVar, Set set) {
        synchronized (anipVar) {
            if (anipVar.seenExceptions == null) {
                anipVar.seenExceptions = set;
            }
        }
    }
}
