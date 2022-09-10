package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amnl  reason: default package */
/* loaded from: classes2.dex */
public final class amnl extends bnuu {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    private final amnk i;
    private final String[] j;

    public amnl() {
        amnk amnkVar = new amnk();
        this.i = amnkVar;
        amni amniVar = amnkVar.d;
        this.j = new String[]{amniVar.a, "unused", "unused", amniVar.b, "unused", "unused"};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        amnj amnjVar = this.i.c;
        this.x = bntbVar.i(i, amnjVar.a);
        this.a = bntbVar.i(i, amnjVar.b);
        this.b = bntbVar.i(i, amnjVar.c);
        this.c = bntbVar.i(i, amnjVar.d);
        this.d = bntbVar.i(i, amnjVar.e);
        this.e = bntbVar.i(i, amnjVar.f);
        this.f = bntbVar.i(i, amnjVar.g);
        this.g = bntbVar.i(i, amnjVar.h);
        this.h = bntbVar.i(i, amnjVar.i);
        GLES20.glUniform1i(this.f, 3);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.j;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.i.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.i.b;
    }
}
