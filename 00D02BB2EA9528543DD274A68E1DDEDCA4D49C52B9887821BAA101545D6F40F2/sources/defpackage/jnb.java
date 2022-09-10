package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jnb  reason: default package */
/* loaded from: classes7.dex */
public final class jnb extends bbf {
    final /* synthetic */ jnk a;

    public jnb(jnk jnkVar) {
        this.a = jnkVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void a(int i, float f, int i2) {
        if (f > 0.0f) {
            this.a.o = true;
        }
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        this.a.l(i);
        jnk jnkVar = this.a;
        if (jnkVar.j != null) {
            cjql n = jnk.n(jnkVar.c);
            jnk jnkVar2 = this.a;
            jnkVar2.j.c(i, jnkVar2.p, n);
        }
        this.a.p = jni.PROGRAMMATIC;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void c(int i) {
        this.a.o = i != 0;
    }
}
