package defpackage;
/* compiled from: PG */
/* renamed from: aiv  reason: default package */
/* loaded from: classes2.dex */
final class aiv extends aio {
    @Override // defpackage.aio
    public final void a(aiw aiwVar, Thread thread) {
        aiwVar.thread = thread;
    }

    @Override // defpackage.aio
    public final void b(aiw aiwVar, aiw aiwVar2) {
        aiwVar.next = aiwVar2;
    }

    @Override // defpackage.aio
    public final boolean c(aix<?> aixVar, aiw aiwVar, aiw aiwVar2) {
        synchronized (aixVar) {
            if (aixVar.waiters == aiwVar) {
                aixVar.waiters = aiwVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.aio
    public final boolean d(aix<?> aixVar, ais aisVar, ais aisVar2) {
        synchronized (aixVar) {
            if (aixVar.listeners == aisVar) {
                aixVar.listeners = aisVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.aio
    public final boolean e(aix<?> aixVar, Object obj, Object obj2) {
        synchronized (aixVar) {
            if (aixVar.value == obj) {
                aixVar.value = obj2;
                return true;
            }
            return false;
        }
    }
}
