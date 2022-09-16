package defpackage;
/* compiled from: PG */
/* renamed from: ammw  reason: default package */
/* loaded from: classes.dex */
final class ammw extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        ammz ammzVar = new ammz(uwp.j());
        Thread currentThread = Thread.currentThread();
        synchronized (amna.a) {
            amna.a.put(currentThread, ammzVar);
        }
        return ammzVar;
    }
}
