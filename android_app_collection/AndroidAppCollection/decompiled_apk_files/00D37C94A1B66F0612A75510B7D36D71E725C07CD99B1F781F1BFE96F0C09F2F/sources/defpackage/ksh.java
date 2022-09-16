package defpackage;
/* compiled from: PG */
/* renamed from: ksh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ksh implements ylw {
    public final /* synthetic */ ksj a;
    public final /* synthetic */ String b;
    public final /* synthetic */ aspb c;
    private final /* synthetic */ int d;

    public /* synthetic */ ksh(ksj ksjVar, String str, aspb aspbVar) {
        this.a = ksjVar;
        this.b = str;
        this.c = aspbVar;
    }

    public /* synthetic */ ksh(ksj ksjVar, String str, aspb aspbVar, int i) {
        this.d = i;
        this.a = ksjVar;
        this.b = str;
        this.c = aspbVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            this.a.c(this.b, this.c, ((arvl) obj).d);
        } else if (i == 1) {
            this.a.c(this.b, this.c, ((arvj) obj).c);
        } else {
            this.a.c(this.b, this.c, ((arvn) obj).c);
        }
    }
}
