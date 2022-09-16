package defpackage;
/* compiled from: PG */
/* renamed from: fku  reason: default package */
/* loaded from: classes3.dex */
public final class fku extends ajgv {
    private final atep a;

    public fku(atep atepVar, aafo aafoVar, ajgz ajgzVar, Object obj) {
        super(aafoVar, ajgzVar, obj, null);
        atepVar.getClass();
        this.a = atepVar;
    }

    @Override // defpackage.ajgv
    protected final void a(int i) {
        aten atenVar = (aten) this.a.c.get(i);
        if (this.a.c.size() > i) {
            if (abgc.e(atenVar) != null) {
                this.g.c(abgc.e(atenVar), d());
            } else if (abgc.d(atenVar) != null) {
                this.g.c(abgc.d(atenVar), d());
            }
            i(4);
        }
    }
}
