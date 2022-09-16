package defpackage;
/* compiled from: PG */
/* renamed from: apz  reason: default package */
/* loaded from: classes2.dex */
final class apz implements Runnable {
    final /* synthetic */ aqd a;

    public apz(aqd aqdVar) {
        this.a = aqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqd aqdVar = this.a;
        if (aqdVar.c == 0) {
            aqdVar.d = true;
            aqdVar.f.d(aps.ON_PAUSE);
        }
        this.a.c();
    }
}
