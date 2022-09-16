package defpackage;
/* compiled from: PG */
/* renamed from: grh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class grh implements amqo {
    public final /* synthetic */ gri a;
    private final /* synthetic */ int b;

    public /* synthetic */ grh(gri griVar) {
        this.a = griVar;
    }

    public /* synthetic */ grh(gri griVar, int i) {
        this.b = i;
        this.a = griVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            grk grkVar = this.a.c;
            return Long.valueOf(grkVar.c(grkVar.u));
        } else if (i == 1) {
            grk grkVar2 = this.a.c;
            return Long.valueOf(grkVar2.c(grkVar2.t));
        } else if (i == 2) {
            gri griVar = this.a;
            return Long.valueOf(Math.min(Math.max(griVar.b() - griVar.c(), griVar.c.b), griVar.c.c));
        } else if (i == 3) {
            return grk.e(this.a.a());
        } else {
            if (i == 4) {
                return grk.e(this.a.c());
            }
            if (i == 5) {
                return grk.e(this.a.b());
            }
            return grk.e(this.a.c.c);
        }
    }
}
