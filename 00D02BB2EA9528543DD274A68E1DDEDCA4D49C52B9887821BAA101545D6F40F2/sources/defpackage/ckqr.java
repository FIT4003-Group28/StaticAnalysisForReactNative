package defpackage;
/* compiled from: PG */
/* renamed from: ckqr  reason: default package */
/* loaded from: classes4.dex */
public final class ckqr {
    private static final dcqe b = dcqe.c("ckqr");
    public ckqz a;

    public final void a(ckqz ckqzVar) {
        if (c()) {
            bvoo.h("A listener is already registered.", new Object[0]);
        }
        this.a = ckqzVar;
    }

    public final void b() {
        this.a = null;
    }

    public final boolean c() {
        return this.a != null;
    }
}
