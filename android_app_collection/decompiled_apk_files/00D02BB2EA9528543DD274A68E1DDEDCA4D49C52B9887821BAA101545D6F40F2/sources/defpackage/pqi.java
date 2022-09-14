package defpackage;
/* compiled from: PG */
/* renamed from: pqi  reason: default package */
/* loaded from: classes7.dex */
final class pqi implements pqz {
    final /* synthetic */ amvh a;

    public pqi(amvh amvhVar) {
        this.a = amvhVar;
    }

    @Override // defpackage.pqz
    public final String a() {
        dosw F = this.a.F();
        if (F == null || F.b.size() <= 0) {
            return this.a.p();
        }
        return F.b.get(0);
    }

    @Override // defpackage.pqz
    @dzsi
    public final String b() {
        dosw F = this.a.F();
        if (F == null || F.b.size() <= 1) {
            return null;
        }
        return F.b.get(1);
    }

    @Override // defpackage.pqz
    @dzsi
    public final cjtd c() {
        return cjtd.a(dtyi.dc);
    }
}
