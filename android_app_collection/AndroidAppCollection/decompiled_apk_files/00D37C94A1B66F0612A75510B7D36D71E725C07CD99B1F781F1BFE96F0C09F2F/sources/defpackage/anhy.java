package defpackage;
/* compiled from: PG */
/* renamed from: anhy  reason: default package */
/* loaded from: classes.dex */
final class anhy extends anhr {
    @Override // defpackage.anhr
    public final void a(anid anidVar, anid anidVar2) {
        anidVar.next = anidVar2;
    }

    @Override // defpackage.anhr
    public final void b(anid anidVar, Thread thread) {
        anidVar.thread = thread;
    }

    @Override // defpackage.anhr
    public final boolean c(anie anieVar, anhv anhvVar, anhv anhvVar2) {
        synchronized (anieVar) {
            if (anieVar.listeners == anhvVar) {
                anieVar.listeners = anhvVar2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.anhr
    public final boolean d(anie anieVar, Object obj, Object obj2) {
        synchronized (anieVar) {
            if (anieVar.value == obj) {
                anieVar.value = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.anhr
    public final boolean e(anie anieVar, anid anidVar, anid anidVar2) {
        synchronized (anieVar) {
            if (anieVar.waiters == anidVar) {
                anieVar.waiters = anidVar2;
                return true;
            }
            return false;
        }
    }
}
