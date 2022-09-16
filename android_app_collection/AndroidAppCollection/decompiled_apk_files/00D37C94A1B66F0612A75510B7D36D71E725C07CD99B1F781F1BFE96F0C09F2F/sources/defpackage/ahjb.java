package defpackage;
/* compiled from: PG */
/* renamed from: ahjb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahjb implements ayqb {
    public final /* synthetic */ ahjc a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahjb(ahjc ahjcVar, int i) {
        this.b = i;
        this.a = ahjcVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ahgl ahglVar = (ahgl) obj;
            this.a.d();
        } else if (i == 1) {
            ahgi ahgiVar = (ahgi) obj;
            this.a.d();
        } else if (i == 2) {
            this.a.b((ahgr) obj);
        } else if (i == 3) {
            this.a.c((ahgs) obj);
        } else {
            this.a.b((ahgv) obj);
        }
    }
}
