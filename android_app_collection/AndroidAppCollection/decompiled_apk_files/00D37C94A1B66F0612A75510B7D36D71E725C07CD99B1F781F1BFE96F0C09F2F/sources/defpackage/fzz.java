package defpackage;
/* compiled from: PG */
/* renamed from: fzz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzz implements ylw {
    public final /* synthetic */ gac a;
    public final /* synthetic */ asov b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gab d;
    private final /* synthetic */ int e;

    public /* synthetic */ fzz(gac gacVar, asov asovVar, boolean z, gab gabVar) {
        this.a = gacVar;
        this.b = asovVar;
        this.c = z;
        this.d = gabVar;
    }

    public /* synthetic */ fzz(gac gacVar, asov asovVar, boolean z, gab gabVar, int i) {
        this.e = i;
        this.a = gacVar;
        this.b = asovVar;
        this.c = z;
        this.d = gabVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            this.a.c(this.b, aspb.LIKE, this.c, ((arvl) obj).d, this.d);
        } else if (i == 1) {
            this.a.c(this.b, aspb.DISLIKE, this.c, ((arvj) obj).c, this.d);
        } else {
            this.a.c(this.b, aspb.INDIFFERENT, this.c, ((arvn) obj).c, this.d);
        }
    }
}
