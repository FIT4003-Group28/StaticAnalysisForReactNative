package defpackage;
/* compiled from: PG */
/* renamed from: agm  reason: default package */
/* loaded from: classes.dex */
final class agm extends agf {
    @Override // defpackage.agf
    public final void a(agn agnVar, agn agnVar2) {
        agnVar.next = agnVar2;
    }

    @Override // defpackage.agf
    public final void b(agn agnVar, Thread thread) {
        agnVar.thread = thread;
    }

    @Override // defpackage.agf
    public final boolean c(ago agoVar, agj agjVar, agj agjVar2) {
        synchronized (agoVar) {
            if (agoVar.listeners == agjVar) {
                agoVar.listeners = agjVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.agf
    public final boolean d(ago agoVar, Object obj, Object obj2) {
        synchronized (agoVar) {
            if (agoVar.value == obj) {
                agoVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.agf
    public final boolean e(ago agoVar, agn agnVar, agn agnVar2) {
        synchronized (agoVar) {
            if (agoVar.waiters == agnVar) {
                agoVar.waiters = agnVar2;
                return true;
            }
            return false;
        }
    }
}
