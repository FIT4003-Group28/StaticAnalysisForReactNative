package defpackage;
/* compiled from: PG */
/* renamed from: aoao  reason: default package */
/* loaded from: classes.dex */
final class aoao implements aoas {
    final rvh a;

    public aoao(rvh rvhVar) {
        this.a = rvhVar;
    }

    @Override // defpackage.aoas
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.aoas
    public final boolean b(aoay aoayVar) {
        if (aoayVar.e() || aoayVar.d() || aoayVar.b()) {
            this.a.d(aoayVar.a);
            return true;
        }
        return false;
    }
}
