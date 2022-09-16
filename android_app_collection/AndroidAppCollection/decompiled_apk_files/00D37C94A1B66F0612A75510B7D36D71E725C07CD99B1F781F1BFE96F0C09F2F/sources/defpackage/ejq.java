package defpackage;
/* compiled from: PG */
/* renamed from: ejq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ejq implements zdt {
    public final /* synthetic */ eki a;
    private final /* synthetic */ int b;

    public /* synthetic */ ejq(eki ekiVar, int i) {
        this.b = i;
        this.a = ekiVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            eki ekiVar = this.a;
            ekiVar.al.b(ekiVar.d.b((Throwable) obj), true);
        } else if (i == 1) {
            eki ekiVar2 = this.a;
            ekiVar2.a = (ampq) obj;
            ekiVar2.s();
            ekiVar2.al.a();
        } else {
            this.a.d.e((Throwable) obj);
        }
    }
}
