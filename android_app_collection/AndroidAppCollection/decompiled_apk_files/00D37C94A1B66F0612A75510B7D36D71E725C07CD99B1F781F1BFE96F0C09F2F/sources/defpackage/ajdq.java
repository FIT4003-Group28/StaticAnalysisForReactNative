package defpackage;
/* compiled from: PG */
/* renamed from: ajdq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajdq implements ayqb {
    public final /* synthetic */ ajdz a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajdq(ajdz ajdzVar) {
        this.a = ajdzVar;
    }

    public /* synthetic */ ajdq(ajdz ajdzVar, int i) {
        this.b = i;
        this.a = ajdzVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            ajdz ajdzVar = this.a;
            ajff a = ((ahic) obj).a();
            if (a.a() != 3) {
                return;
            }
            ajdzVar.B();
            ajdzVar.y();
            ajdzVar.A(a.c(), a.Z());
            return;
        }
        ahic ahicVar = (ahic) obj;
        this.a.f = false;
    }
}
