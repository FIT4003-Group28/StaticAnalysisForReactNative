package defpackage;
/* compiled from: PG */
/* renamed from: jdv  reason: default package */
/* loaded from: classes3.dex */
final class jdv implements ahda {
    final /* synthetic */ jdy a;
    private final /* synthetic */ int b;

    public jdv(jdy jdyVar) {
        this.a = jdyVar;
    }

    public jdv(jdy jdyVar, int i) {
        this.b = i;
        this.a = jdyVar;
    }

    @Override // defpackage.ahda
    public final void a() {
    }

    @Override // defpackage.ahda
    public final void b() {
        int i = this.b;
        if (i == 0) {
            this.a.q.b();
        } else if (i == 1) {
            this.a.n.b();
        } else if (i != 2) {
            ahda ahdaVar = this.a.l;
            if (ahdaVar == null) {
                return;
            }
            ahdaVar.b();
        } else {
            ahda ahdaVar2 = this.a.m;
            if (ahdaVar2 == null) {
                return;
            }
            ahdaVar2.b();
        }
    }
}
