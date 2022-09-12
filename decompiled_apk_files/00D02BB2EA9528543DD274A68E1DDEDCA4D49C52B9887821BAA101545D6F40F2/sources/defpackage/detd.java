package defpackage;
/* compiled from: PG */
/* renamed from: detd  reason: default package */
/* loaded from: classes6.dex */
final class detd implements deth {
    final cpct<String> a;

    public detd(cpct<String> cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.deth
    public final boolean a(deto detoVar) {
        if (detoVar.k() || detoVar.i() || detoVar.j()) {
            this.a.b(detoVar.a());
            return true;
        }
        return false;
    }

    @Override // defpackage.deth
    public final boolean b(deto detoVar, Exception exc) {
        return false;
    }
}
