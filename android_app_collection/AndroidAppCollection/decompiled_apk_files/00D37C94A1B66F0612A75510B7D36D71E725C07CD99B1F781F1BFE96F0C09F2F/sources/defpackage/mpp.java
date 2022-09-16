package defpackage;
/* compiled from: PG */
/* renamed from: mpp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mpp implements ayqb {
    public final /* synthetic */ mpq a;
    private final /* synthetic */ int b;

    public /* synthetic */ mpp(mpq mpqVar, int i) {
        this.b = i;
        this.a = mpqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            mpq mpqVar = this.a;
            aajj aajjVar = ((aajp) obj).c;
            if (aajjVar instanceof aowf) {
                mpqVar.d(((aowf) aajjVar).getLinked().booleanValue());
                return;
            } else {
                zep.b("Entity update does not have account link status.");
                return;
            }
        }
        this.a.d(((aowf) ((aajj) obj)).getLinked().booleanValue());
    }
}
