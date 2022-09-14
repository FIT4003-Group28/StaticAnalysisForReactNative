package defpackage;
/* compiled from: PG */
/* renamed from: deem  reason: default package */
/* loaded from: classes6.dex */
final class deem extends deef {
    @Override // defpackage.deef
    public final void a(deer deerVar, Thread thread) {
        deerVar.thread = thread;
    }

    @Override // defpackage.deef
    public final void b(deer deerVar, deer deerVar2) {
        deerVar.next = deerVar2;
    }

    @Override // defpackage.deef
    public final boolean c(dees<?> deesVar, deer deerVar, deer deerVar2) {
        synchronized (deesVar) {
            if (deesVar.waiters == deerVar) {
                deesVar.waiters = deerVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.deef
    public final boolean d(dees<?> deesVar, deej deejVar, deej deejVar2) {
        synchronized (deesVar) {
            if (deesVar.listeners == deejVar) {
                deesVar.listeners = deejVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.deef
    public final boolean e(dees<?> deesVar, Object obj, Object obj2) {
        synchronized (deesVar) {
            if (deesVar.value == obj) {
                deesVar.value = obj2;
                return true;
            }
            return false;
        }
    }
}
