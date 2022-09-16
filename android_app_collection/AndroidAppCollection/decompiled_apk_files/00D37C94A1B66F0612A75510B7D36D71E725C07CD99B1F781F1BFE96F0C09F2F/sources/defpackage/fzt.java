package defpackage;
/* compiled from: PG */
/* renamed from: fzt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzt implements gab {
    public final /* synthetic */ fzx a;
    private final /* synthetic */ int b;

    public /* synthetic */ fzt(fzx fzxVar) {
        this.a = fzxVar;
    }

    public /* synthetic */ fzt(fzx fzxVar, int i) {
        this.b = i;
        this.a = fzxVar;
    }

    @Override // defpackage.gab
    public final void a(aspb aspbVar, asov asovVar) {
        if (this.b == 0) {
            fzx fzxVar = this.a;
            if (!fzxVar.a || fzx.g(asovVar)) {
                return;
            }
            fzxVar.j(aspbVar, (aopc) asovVar.mo52toBuilder());
            return;
        }
        this.a.j(aspbVar, (aopc) asovVar.mo52toBuilder());
    }
}
