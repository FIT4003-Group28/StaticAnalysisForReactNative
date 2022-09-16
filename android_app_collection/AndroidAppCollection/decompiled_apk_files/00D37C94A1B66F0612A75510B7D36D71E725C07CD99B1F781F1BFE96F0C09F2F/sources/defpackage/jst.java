package defpackage;
/* compiled from: PG */
/* renamed from: jst  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jst implements ayqb {
    public final /* synthetic */ jsv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jst(jsv jsvVar, int i) {
        this.b = i;
        this.a = jsvVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.lx(((erh) obj).a(), null);
        } else if (i == 1) {
            Boolean bool = (Boolean) obj;
            this.a.lx(llm.n(aqow.REQUEST_TYPE_UNSPECIFIED), null);
        } else {
            amvn amvnVar = (amvn) obj;
            this.a.ad();
        }
    }
}
