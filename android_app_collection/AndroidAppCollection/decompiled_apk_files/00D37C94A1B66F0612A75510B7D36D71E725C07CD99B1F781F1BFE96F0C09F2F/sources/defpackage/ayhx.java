package defpackage;
/* compiled from: PG */
/* renamed from: ayhx  reason: default package */
/* loaded from: classes2.dex */
final class ayhx implements Runnable {
    final /* synthetic */ ayhy a;
    private final /* synthetic */ int b;

    public ayhx(ayhy ayhyVar) {
        this.a = ayhyVar;
    }

    public ayhx(ayhy ayhyVar, int i) {
        this.b = i;
        this.a = ayhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ayhy ayhyVar = this.a;
            ayhyVar.c.l.remove(ayhyVar.a);
            if (this.a.c.p.a != axyt.SHUTDOWN || !this.a.c.l.isEmpty()) {
                return;
            }
            this.a.c.e();
            return;
        }
        ayhy ayhyVar2 = this.a;
        ayia ayiaVar = ayhyVar2.c;
        ayiaVar.r = null;
        if (ayiaVar.q != null) {
            aqxo.z(ayiaVar.o == null, "Unexpected non-null activeTransport");
            ayhy ayhyVar3 = this.a;
            ayhyVar3.a.j(ayhyVar3.c.q);
            return;
        }
        ayez ayezVar = ayiaVar.n;
        ayez ayezVar2 = ayhyVar2.a;
        if (ayezVar != ayezVar2) {
            return;
        }
        ayiaVar.o = ayezVar2;
        this.a.c.n = null;
        this.a.c.b(axyt.READY);
    }
}
