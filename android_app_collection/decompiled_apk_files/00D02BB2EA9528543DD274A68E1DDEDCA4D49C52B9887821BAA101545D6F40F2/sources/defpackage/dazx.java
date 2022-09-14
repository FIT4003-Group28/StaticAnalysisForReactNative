package defpackage;
/* compiled from: PG */
/* renamed from: dazx  reason: default package */
/* loaded from: classes.dex */
final class dazx extends ThreadLocal<dazz> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ dazz initialValue() {
        czhz.a();
        dazz dazzVar = new dazz();
        Thread currentThread = Thread.currentThread();
        synchronized (dbaa.b) {
            dbaa.b.put(currentThread, dazzVar);
        }
        return dazzVar;
    }
}
