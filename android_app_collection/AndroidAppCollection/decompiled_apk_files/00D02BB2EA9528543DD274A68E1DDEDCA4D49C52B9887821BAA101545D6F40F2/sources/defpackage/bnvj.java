package defpackage;
/* compiled from: PG */
/* renamed from: bnvj  reason: default package */
/* loaded from: classes.dex */
public final class bnvj extends bnuu {
    public int a;
    public int b;
    public int c;
    private final bnvi d;
    private final String[] e;

    public bnvj() {
        bnvi bnviVar = new bnvi();
        this.d = bnviVar;
        bnvg bnvgVar = bnviVar.d;
        this.e = new String[]{bnvgVar.a, "unused", bnvgVar.b, bnvgVar.c};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        bnvh bnvhVar = this.d.c;
        this.x = bntbVar.i(i, bnvhVar.a);
        this.a = bntbVar.i(i, bnvhVar.b);
        this.b = bntbVar.i(i, bnvhVar.c);
        this.c = bntbVar.i(i, bnvhVar.d);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.e;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.d.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.d.b;
    }
}
