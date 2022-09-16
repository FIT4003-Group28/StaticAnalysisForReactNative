package defpackage;
/* compiled from: PG */
/* renamed from: nou  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nou implements ayqb {
    public final /* synthetic */ noy a;
    private final /* synthetic */ int b;

    public /* synthetic */ nou(noy noyVar, int i) {
        this.b = i;
        this.a = noyVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.l = ((Boolean) obj).booleanValue();
            return;
        }
        noy noyVar = this.a;
        awbn awbnVar = (awbn) obj;
        if ((awbnVar.b.b & 8) == 0) {
            return;
        }
        noyVar.i = ajgl.b(awbnVar.getExtraShortViewCount());
        noyVar.i();
    }
}
