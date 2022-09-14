package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apo  reason: default package */
/* loaded from: classes2.dex */
public final class apo implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ app b;

    public apo(app appVar, Object obj) {
        this.b = appVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        app appVar = this.b;
        Object obj = this.a;
        if (appVar.f()) {
            appVar.c();
        } else {
            appVar.b(obj);
        }
        appVar.f = 3;
    }
}
