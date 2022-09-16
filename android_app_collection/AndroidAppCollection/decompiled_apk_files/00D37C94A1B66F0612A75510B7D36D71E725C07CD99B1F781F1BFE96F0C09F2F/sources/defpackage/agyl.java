package defpackage;
/* compiled from: PG */
/* renamed from: agyl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agyl implements ayqb {
    public final /* synthetic */ agym a;
    public final /* synthetic */ agyj b;
    private final /* synthetic */ int c;

    public /* synthetic */ agyl(agym agymVar, agyj agyjVar) {
        this.a = agymVar;
        this.b = agyjVar;
    }

    public /* synthetic */ agyl(agym agymVar, agyj agyjVar, int i) {
        this.c = i;
        this.a = agymVar;
        this.b = agyjVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            Integer num = (Integer) obj;
            this.a.a(this.b);
            return;
        }
        Boolean bool = (Boolean) obj;
        this.a.a(this.b);
    }
}
