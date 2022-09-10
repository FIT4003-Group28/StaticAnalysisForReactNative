package defpackage;
/* compiled from: PG */
/* renamed from: dwum  reason: default package */
/* loaded from: classes6.dex */
public final class dwum extends dsqr<dwun, dwum> implements dsqt {
    public dwum() {
        super(dwun.w);
    }

    public final void a(Iterable<? extends dwxd> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dwun dwunVar = (dwun) this.b;
        dwun dwunVar2 = dwun.w;
        dsrj<dwxd> dsrjVar = dwunVar.f;
        if (!dsrjVar.a()) {
            dwunVar.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dwunVar.f);
    }
}
