package defpackage;
/* compiled from: PG */
/* renamed from: dlzh  reason: default package */
/* loaded from: classes6.dex */
public final class dlzh extends dsqp<dlzi, dlzh> implements dssk {
    public dlzh() {
        super(dlzi.e);
    }

    public final void a(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dlzi dlziVar = (dlzi) this.b;
        dlzi dlziVar2 = dlzi.e;
        dsrf dsrfVar = dlziVar.d;
        if (!dsrfVar.a()) {
            dlziVar.d = dsqw.cg(dsrfVar);
        }
        dlziVar.d.h(i);
    }

    public final void b(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dlzi dlziVar = (dlzi) this.b;
        dlzi dlziVar2 = dlzi.e;
        dsrf dsrfVar = dlziVar.c;
        if (!dsrfVar.a()) {
            dlziVar.c = dsqw.cg(dsrfVar);
        }
        dlziVar.c.h(i);
    }
}
