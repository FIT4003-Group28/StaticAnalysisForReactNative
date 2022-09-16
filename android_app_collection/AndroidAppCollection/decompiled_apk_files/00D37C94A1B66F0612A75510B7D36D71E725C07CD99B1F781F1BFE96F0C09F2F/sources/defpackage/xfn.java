package defpackage;
/* compiled from: PG */
/* renamed from: xfn  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xfn implements ayqb {
    public final /* synthetic */ xfp a;
    private final /* synthetic */ int b;

    public /* synthetic */ xfn(xfp xfpVar, int i) {
        this.b = i;
        this.a = xfpVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            xfp xfpVar = this.a;
            xfpVar.d = ((ahhu) obj).b();
            xfpVar.c();
            return;
        }
        boolean z = true;
        if (i == 1) {
            xfp xfpVar2 = this.a;
            if (((ahgn) obj).d() != aijs.REMOTE) {
                z = false;
            }
            xfpVar2.e = z;
            xfpVar2.c();
            return;
        }
        xfp xfpVar3 = this.a;
        ahhw ahhwVar = (ahhw) obj;
        if (ahhwVar.c() == aika.NEW) {
            xfpVar3.b();
        }
        xfpVar3.c = ahhwVar.c().h();
        xfpVar3.c();
    }
}
