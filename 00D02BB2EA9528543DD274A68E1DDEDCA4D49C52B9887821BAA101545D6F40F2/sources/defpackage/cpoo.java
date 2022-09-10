package defpackage;
/* compiled from: PG */
/* renamed from: cpoo  reason: default package */
/* loaded from: classes5.dex */
final class cpoo extends cppy {
    final /* synthetic */ cpor a;

    public cpoo(cpor cporVar) {
        this.a = cporVar;
    }

    @Override // defpackage.cppy
    public final boolean b() {
        if (this.a.i != cpoq.DESCRIBE || !this.a.j.contains(cpoq.EXPLORE)) {
            return false;
        }
        this.a.d(cpoq.EXPLORE);
        return true;
    }
}
