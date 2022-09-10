package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: puv  reason: default package */
/* loaded from: classes7.dex */
public final class puv implements Runnable {
    public final dvum a;
    final /* synthetic */ puy b;
    @dzsi
    private final dnqh c;

    public puv(puy puyVar, @dzsi dvum dvumVar, dnqh dnqhVar) {
        this.b = puyVar;
        this.a = dvumVar;
        this.c = dnqhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dvum by = this.b.by();
        puy puyVar = this.b;
        if (!puyVar.aD || by != this.a) {
            return;
        }
        acwo a = puyVar.bv.a();
        dnqh dnqhVar = this.c;
        String str = null;
        if (dnqhVar != null && (dnqhVar.a & 4) != 0) {
            str = dnqhVar.d;
        }
        a.j(by, str, new acwn(this) { // from class: puu
            private final puv a;

            {
                this.a = this;
            }

            @Override // defpackage.acwn
            public final boolean a() {
                puv puvVar = this.a;
                return puvVar.b.by() == puvVar.a;
            }
        });
    }
}
