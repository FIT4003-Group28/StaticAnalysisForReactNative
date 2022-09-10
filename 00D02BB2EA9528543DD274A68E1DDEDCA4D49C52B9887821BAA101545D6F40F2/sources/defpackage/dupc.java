package defpackage;
/* compiled from: PG */
/* renamed from: dupc  reason: default package */
/* loaded from: classes6.dex */
public final class dupc extends dsqp<dupe, dupc> implements dssk {
    public dupc() {
        super(dupe.e);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dupe dupeVar = (dupe) this.b;
        dupe dupeVar2 = dupe.e;
        dsrj<String> dsrjVar = dupeVar.c;
        if (!dsrjVar.a()) {
            dupeVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dupeVar.c);
    }
}
