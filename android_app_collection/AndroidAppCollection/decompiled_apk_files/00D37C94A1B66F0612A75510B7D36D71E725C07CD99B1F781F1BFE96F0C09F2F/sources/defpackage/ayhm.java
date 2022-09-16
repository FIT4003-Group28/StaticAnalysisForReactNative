package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayhm  reason: default package */
/* loaded from: classes2.dex */
public final class ayhm implements Runnable {
    final /* synthetic */ ayia a;
    private final /* synthetic */ int b;

    public ayhm(ayia ayiaVar) {
        this.a = ayiaVar;
    }

    public ayhm(ayia ayiaVar, int i) {
        this.b = i;
        this.a = ayiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            if (this.a.p.a != axyt.IDLE) {
                return;
            }
            this.a.d.a(2, "CONNECTING as requested");
            this.a.b(axyt.CONNECTING);
            this.a.h();
        } else if (i == 1) {
            ayia ayiaVar = this.a;
            ayiaVar.i = null;
            ayiaVar.d.a(2, "CONNECTING after backoff");
            this.a.b(axyt.CONNECTING);
            this.a.h();
        } else {
            this.a.d.a(2, "Terminated");
            ayia ayiaVar2 = this.a;
            ayhu ayhuVar = ayiaVar2.a;
            ayhuVar.b.j.v.remove(ayiaVar2);
            axzn.b(ayhuVar.b.j.H.c, ayiaVar2);
            ayhuVar.b.j.h();
        }
    }
}
