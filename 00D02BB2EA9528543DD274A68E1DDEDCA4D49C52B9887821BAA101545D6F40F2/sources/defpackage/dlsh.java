package defpackage;
/* compiled from: PG */
/* renamed from: dlsh  reason: default package */
/* loaded from: classes.dex */
public final class dlsh extends dsqp<dlsi, dlsh> implements dssk {
    public dlsh() {
        super(dlsi.g);
    }

    public final void a(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dlsi dlsiVar = (dlsi) this.b;
        dlsi dlsiVar2 = dlsi.g;
        str.getClass();
        dsrj<String> dsrjVar = dlsiVar.e;
        if (!dsrjVar.a()) {
            dlsiVar.e = dsqw.cl(dsrjVar);
        }
        dlsiVar.e.add(str);
    }
}
