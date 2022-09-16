package defpackage;
/* compiled from: PG */
/* renamed from: ydn  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydn implements zdt {
    public final /* synthetic */ ydo a;
    public final /* synthetic */ ycz b;
    private final /* synthetic */ int c;

    public /* synthetic */ ydn(ydo ydoVar, ycz yczVar) {
        this.a = ydoVar;
        this.b = yczVar;
    }

    public /* synthetic */ ydn(ydo ydoVar, ycz yczVar, int i) {
        this.c = i;
        this.a = ydoVar;
        this.b = yczVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            Throwable th = (Throwable) obj;
            this.a.a(aade.PRODUCTION, this.b);
            return;
        }
        this.a.a((aade) obj, this.b);
    }
}
