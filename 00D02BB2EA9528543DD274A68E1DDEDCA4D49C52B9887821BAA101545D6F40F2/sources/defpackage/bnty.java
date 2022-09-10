package defpackage;
/* compiled from: PG */
/* renamed from: bnty  reason: default package */
/* loaded from: classes3.dex */
public final class bnty extends bnuu {
    public final String[] a;
    public int b;
    public int c;
    public int d;
    private final bnuc e;

    public bnty() {
        bnuc bnucVar = new bnuc();
        this.e = bnucVar;
        bnua bnuaVar = bnucVar.d;
        this.a = new String[]{bnuaVar.a, bnuaVar.b};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        this.b = bntbVar.i(i, this.e.c.c);
        this.c = bntbVar.i(i, this.e.c.b);
        this.d = bntbVar.i(i, this.e.c.a);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.a;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.e.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.e.b;
    }
}
