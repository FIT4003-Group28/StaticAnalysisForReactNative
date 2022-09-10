package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amnq  reason: default package */
/* loaded from: classes.dex */
public final class amnq extends bnuu {
    protected final boolean a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    private final amnp i;
    private final String[] j;
    private final String[] k;

    public amnq() {
        amnp amnpVar = new amnp();
        this.i = amnpVar;
        this.a = bnta.a().b();
        amnn amnnVar = amnpVar.d;
        String str = amnnVar.a;
        String str2 = amnnVar.b;
        String str3 = amnnVar.c;
        this.j = new String[]{str, "unused", "unused", "unused", str2, str3};
        this.k = new String[]{str, "unused", "unused", "unused", str2, str3, amnnVar.d, amnnVar.e};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        amno amnoVar = this.i.c;
        this.x = bntbVar.i(i, amnoVar.g);
        GLES20.glUniform1i(bntbVar.i(i, amnoVar.k), 1);
        if (this.a) {
            GLES20.glUniform1i(bntbVar.i(i, amnoVar.h), 0);
        }
        GLES20.glUniform1i(bntbVar.i(i, amnoVar.j), 0);
        this.b = bntbVar.i(i, amnoVar.f);
        this.d = bntbVar.i(i, amnoVar.e);
        this.e = bntbVar.i(i, amnoVar.d);
        this.f = bntbVar.i(i, amnoVar.i);
        this.c = bntbVar.i(i, amnoVar.c);
        this.g = bntbVar.i(i, amnoVar.b);
        this.h = bntbVar.i(i, amnoVar.a);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.a ? this.j : this.k;
    }

    @Override // defpackage.bnuu
    public final String c() {
        String str = true != this.a ? "" : "#define VERTEX_TEXTURES\n";
        String valueOf = String.valueOf(this.i.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    @Override // defpackage.bnuu
    public final String d() {
        String str = true != this.a ? "" : "#define VERTEX_TEXTURES\n";
        String valueOf = String.valueOf(this.i.b);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
