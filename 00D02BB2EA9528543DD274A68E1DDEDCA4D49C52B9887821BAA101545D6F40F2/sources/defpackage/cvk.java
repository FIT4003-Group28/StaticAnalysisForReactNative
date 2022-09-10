package defpackage;
/* compiled from: PG */
/* renamed from: cvk  reason: default package */
/* loaded from: classes5.dex */
final class cvk implements btzi<buff, bufh> {
    final /* synthetic */ cvm a;
    private final int b;

    public cvk(cvm cvmVar, int i) {
        this.a = cvmVar;
        this.b = i;
    }

    private static final ckgz c(int i) {
        if (i == 2) {
            return ckiy.d;
        }
        if (i == 7) {
            return ckke.a;
        }
        if (i == 8) {
            return ckke.b;
        }
        bvoo.h("Unsupported AdType", new Object[0]);
        return null;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<buff> btzrVar, btzy btzyVar) {
        ckgz c = c(this.b);
        if (c == null) {
            return;
        }
        ((ckco) this.a.a.a().a(c)).a(btzyVar.d().y);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<buff> btzrVar, bufh bufhVar) {
        ckgz c = c(this.b);
        if (c == null) {
            return;
        }
        ((ckco) this.a.a.a().a(c)).a(ckjk.SUCCESS.y);
    }
}
