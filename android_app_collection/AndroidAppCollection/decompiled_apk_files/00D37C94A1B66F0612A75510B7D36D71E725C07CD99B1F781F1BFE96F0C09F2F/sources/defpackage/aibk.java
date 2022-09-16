package defpackage;
/* compiled from: PG */
/* renamed from: aibk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aibk implements ayqb {
    public final /* synthetic */ aibm a;
    private final /* synthetic */ int b;

    public /* synthetic */ aibk(aibm aibmVar, int i) {
        this.b = i;
        this.a = aibmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.b((ahhu) obj);
        } else if (i == 1) {
            this.a.a((ahgn) obj);
        } else {
            this.a.c((ahhw) obj);
        }
    }
}
