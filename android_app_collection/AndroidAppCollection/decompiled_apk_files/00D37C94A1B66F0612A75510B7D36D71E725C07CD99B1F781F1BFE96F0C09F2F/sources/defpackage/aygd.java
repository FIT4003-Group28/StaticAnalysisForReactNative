package defpackage;
/* compiled from: PG */
/* renamed from: aygd  reason: default package */
/* loaded from: classes2.dex */
final class aygd implements Runnable {
    final /* synthetic */ aymm a;
    final /* synthetic */ aygh b;

    public aygd(aygh ayghVar, aymm aymmVar) {
        this.b = ayghVar;
        this.a = aymmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
