package defpackage;
/* compiled from: PG */
/* renamed from: uts  reason: default package */
/* loaded from: classes4.dex */
final class uts extends ThreadLocal {
    final /* synthetic */ utv a;

    public uts(utv utvVar) {
        this.a = utvVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        utw utwVar = new utw();
        Thread currentThread = Thread.currentThread();
        synchronized (this.a.a) {
            this.a.a.put(currentThread, utwVar);
        }
        return utwVar;
    }
}
