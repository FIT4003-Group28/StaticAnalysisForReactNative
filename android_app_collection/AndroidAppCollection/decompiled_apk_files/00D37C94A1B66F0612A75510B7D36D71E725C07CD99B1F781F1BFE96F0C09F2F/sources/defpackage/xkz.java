package defpackage;
/* compiled from: PG */
/* renamed from: xkz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xkz implements ayqb {
    public final /* synthetic */ xli a;
    private final /* synthetic */ int b;

    public /* synthetic */ xkz(xli xliVar) {
        this.a = xliVar;
    }

    public /* synthetic */ xkz(xli xliVar, int i) {
        this.b = i;
        this.a = xliVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aajj aajjVar;
        xwd xwdVar;
        int i = this.b;
        if (i == 0) {
            xli xliVar = this.a;
            xliVar.g.g(((aqai) obj).getCustomEmojis());
            xliVar.m.g();
            xliVar.m.j();
        } else if (i == 1) {
            xli xliVar2 = this.a;
            aajp aajpVar = (aajp) obj;
            if (aajpVar == null || (aajjVar = aajpVar.c) == null) {
                return;
            }
            xliVar2.g.g(((aqai) aajjVar).getCustomEmojis());
            if (!xliVar2.g.h() || (xwdVar = xliVar2.m) == null) {
                return;
            }
            xwdVar.g();
            xliVar2.m.i();
        } else {
            this.a.g.g(null);
            zep.d("Cound not fetch emojis for comments in the entity store.", (Throwable) obj);
        }
    }
}
