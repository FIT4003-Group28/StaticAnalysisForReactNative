package defpackage;
/* compiled from: PG */
/* renamed from: bajt  reason: default package */
/* loaded from: classes3.dex */
public final class bajt implements degu<Boolean> {
    final /* synthetic */ bvqg a;
    final /* synthetic */ baju b;

    public bajt(baju bajuVar, bvqg bvqgVar) {
        this.b = bajuVar;
        this.a = bvqgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.NU(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (!bool.booleanValue()) {
            this.a.NU(false);
            return;
        }
        axwq axwqVar = this.b.b;
        final bvqg bvqgVar = this.a;
        bvqgVar.getClass();
        axwqVar.s(new axxd(bvqgVar) { // from class: bajs
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.axxd
            public final void a(boolean z) {
                this.a.NU(Boolean.valueOf(z));
            }
        });
    }
}
