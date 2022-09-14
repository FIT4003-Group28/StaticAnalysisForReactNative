package defpackage;
/* compiled from: PG */
/* renamed from: aufp  reason: default package */
/* loaded from: classes.dex */
public final class aufp extends dsqp<aufv, aufp> implements dssk {
    public aufp() {
        super(aufv.b);
    }

    public final void a(int i, auft auftVar) {
        auftVar.getClass();
        if (this.c) {
            bF();
            this.c = false;
        }
        aufv aufvVar = (aufv) this.b;
        aufv aufvVar2 = aufv.b;
        dssd<Integer, auft> dssdVar = aufvVar.a;
        if (!dssdVar.a) {
            aufvVar.a = dssdVar.a();
        }
        aufvVar.a.put(Integer.valueOf(i), auftVar);
    }
}
