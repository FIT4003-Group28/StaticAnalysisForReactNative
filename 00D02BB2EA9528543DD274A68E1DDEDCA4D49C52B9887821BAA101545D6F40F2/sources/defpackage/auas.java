package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auas  reason: default package */
/* loaded from: classes2.dex */
public final class auas {
    final /* synthetic */ auax a;

    public auas(auax auaxVar) {
        this.a = auaxVar;
    }

    public final void a(boolean z) {
        auax auaxVar = this.a;
        if (auaxVar.n == z) {
            return;
        }
        auaxVar.n = z;
        auaxVar.i.a();
        this.a.d();
        this.a.i.c();
        this.a.i.b();
    }

    public final void b(boolean z) {
        auax auaxVar = this.a;
        if (auaxVar.o == z) {
            return;
        }
        auaxVar.o = z;
        auaxVar.s = true;
        auaxVar.i.c();
    }
}
