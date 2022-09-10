package defpackage;
/* compiled from: PG */
/* renamed from: bhz  reason: default package */
/* loaded from: classes3.dex */
final class bhz extends bhs {
    @Override // defpackage.bhs
    public final void a(bia biaVar, Thread thread) {
        biaVar.b = thread;
    }

    @Override // defpackage.bhs
    public final void b(bia biaVar, bia biaVar2) {
        biaVar.c = biaVar2;
    }

    @Override // defpackage.bhs
    public final boolean c(bib<?> bibVar, bia biaVar, bia biaVar2) {
        synchronized (bibVar) {
            if (bibVar.f == biaVar) {
                bibVar.f = biaVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.bhs
    public final boolean d(bib<?> bibVar, bhw bhwVar, bhw bhwVar2) {
        synchronized (bibVar) {
            if (bibVar.e == bhwVar) {
                bibVar.e = bhwVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.bhs
    public final boolean e(bib<?> bibVar, Object obj, Object obj2) {
        synchronized (bibVar) {
            if (bibVar.d == obj) {
                bibVar.d = obj2;
                return true;
            }
            return false;
        }
    }
}
