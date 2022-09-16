package defpackage;
/* compiled from: PG */
/* renamed from: jwe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jwe implements ayqb {
    public final /* synthetic */ jwi a;
    private final /* synthetic */ int b;

    public /* synthetic */ jwe(jwi jwiVar) {
        this.a = jwiVar;
    }

    public /* synthetic */ jwe(jwi jwiVar, int i) {
        this.b = i;
        this.a = jwiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.aE((ahhr) obj);
        } else if (i == 1) {
            this.a.s((ahhm) obj);
        } else if (i == 2) {
            ahht ahhtVar = (ahht) obj;
            this.a.aJ();
        } else {
            Boolean bool = (Boolean) obj;
            this.a.h();
        }
    }
}
