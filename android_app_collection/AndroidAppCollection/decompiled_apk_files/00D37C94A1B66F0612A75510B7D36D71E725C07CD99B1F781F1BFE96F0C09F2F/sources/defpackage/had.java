package defpackage;
/* compiled from: PG */
/* renamed from: had  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class had implements zdt {
    public final /* synthetic */ hai a;
    public final /* synthetic */ atnp b;
    private final /* synthetic */ int c;

    public /* synthetic */ had(hai haiVar, atnp atnpVar) {
        this.a = haiVar;
        this.b = atnpVar;
    }

    public /* synthetic */ had(hai haiVar, atnp atnpVar, int i) {
        this.c = i;
        this.a = haiVar;
        this.b = atnpVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            hai haiVar = this.a;
            atnp atnpVar = this.b;
            Throwable th = (Throwable) obj;
            if (th != null) {
                zep.d("Error generating a thumbnail with effects", th);
                afus.c(2, 6, "[ShortsCreation][Android][Edit]Error generating a thumbnail with effects", th);
            }
            haiVar.y(atnpVar, null);
            return;
        }
        this.a.y(this.b, (String) obj);
    }
}
