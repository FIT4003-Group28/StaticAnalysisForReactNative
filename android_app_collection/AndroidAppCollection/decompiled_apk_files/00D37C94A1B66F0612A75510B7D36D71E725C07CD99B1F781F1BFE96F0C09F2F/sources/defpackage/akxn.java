package defpackage;
/* compiled from: PG */
/* renamed from: akxn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akxn implements ylv {
    public final /* synthetic */ akxz a;
    private final /* synthetic */ int b;

    public /* synthetic */ akxn(akxz akxzVar, int i) {
        this.b = i;
        this.a = akxzVar;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i == 1) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        int i = this.b;
        if (i == 0) {
            this.a.G("Failed to clean up unused ClientApi uploads.", th);
        } else if (i == 1) {
            this.a.G("Failed to resume and clean up expired ClientApi uploads.", th);
        } else {
            this.a.G("Failed to retrieve the Upload.", th);
        }
    }
}
