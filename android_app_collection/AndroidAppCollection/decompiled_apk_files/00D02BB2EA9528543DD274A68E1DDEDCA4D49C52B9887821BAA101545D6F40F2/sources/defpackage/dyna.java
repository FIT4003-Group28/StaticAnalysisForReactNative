package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyna  reason: default package */
/* loaded from: classes6.dex */
public final class dyna implements Runnable {
    final /* synthetic */ dynb a;
    final /* synthetic */ dylv b;

    public dyna(dynb dynbVar, dylv dylvVar) {
        this.a = dynbVar;
        this.b = dylvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dynb dynbVar = this.a;
        dylv dylvVar = this.b;
        dyfo b = dynbVar.b.b();
        try {
            dygz dygzVar = dynbVar.a;
            dyls d = dylvVar.d(((dytf) dygzVar).c, ((dytf) dygzVar).b, ((dytf) dygzVar).a);
            dynbVar.b.c(b);
            dynbVar.o(d);
        } catch (Throwable th) {
            dynbVar.b.c(b);
            throw th;
        }
    }
}
