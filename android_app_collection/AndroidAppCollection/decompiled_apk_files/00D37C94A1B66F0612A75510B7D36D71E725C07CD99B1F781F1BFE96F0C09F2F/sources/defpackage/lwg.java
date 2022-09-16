package defpackage;
/* compiled from: PG */
/* renamed from: lwg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwg implements ayqb {
    public final /* synthetic */ lwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ lwg(lwk lwkVar, int i) {
        this.b = i;
        this.a = lwkVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            this.a.q(1);
            return;
        }
        this.a.q(true != ((Boolean) obj).booleanValue() ? 4 : 5);
    }
}
