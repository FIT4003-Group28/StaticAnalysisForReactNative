package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jna  reason: default package */
/* loaded from: classes7.dex */
public final class jna implements bbb {
    final /* synthetic */ jnk a;

    public jna(jnk jnkVar) {
        this.a = jnkVar;
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        if (f > 0.0f) {
            jnk jnkVar = this.a;
            jnkVar.l = false;
            jnkVar.m = false;
        }
    }

    @Override // defpackage.bbb
    public final void b(int i) {
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        jnk jnkVar = this.a;
        if (jnkVar.k == null) {
            return;
        }
        if (jnkVar.n == 0 && i == 1) {
            if (jnkVar.i() == 0) {
                this.a.l = true;
            } else if (this.a.i() == this.a.d.OV() - 1) {
                this.a.m = true;
            }
            i = 1;
        }
        if (i == 0) {
            jnk jnkVar2 = this.a;
            if (jnkVar2.n != 0) {
                if (jnkVar2.i() == this.a.d.OV() - 1) {
                    jnk jnkVar3 = this.a;
                    if (jnkVar3.m) {
                        jnkVar3.k.b();
                        jnk jnkVar4 = this.a;
                        jnkVar4.m = false;
                        jnkVar4.l = false;
                    }
                }
                if (this.a.i() == 0) {
                    jnk jnkVar5 = this.a;
                    if (jnkVar5.l) {
                        jnkVar5.k.a();
                    }
                }
                jnk jnkVar42 = this.a;
                jnkVar42.m = false;
                jnkVar42.l = false;
            }
        }
        this.a.n = i;
    }
}
