package defpackage;
/* compiled from: PG */
/* renamed from: amqa  reason: default package */
/* loaded from: classes.dex */
public final class amqa extends bnuu {
    protected int a;
    protected int b;
    private final ampz c;
    private final String[] d;

    public amqa() {
        ampz ampzVar = new ampz();
        this.c = ampzVar;
        ampx ampxVar = ampzVar.d;
        this.d = new String[]{ampxVar.a, "unused", "unused", "unused", ampxVar.b};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        ampy ampyVar = this.c.c;
        this.x = bntbVar.i(i, ampyVar.a);
        this.a = bntbVar.i(i, ampyVar.b);
        this.b = bntbVar.i(i, ampyVar.c);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.d;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.c.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.c.b;
    }
}
