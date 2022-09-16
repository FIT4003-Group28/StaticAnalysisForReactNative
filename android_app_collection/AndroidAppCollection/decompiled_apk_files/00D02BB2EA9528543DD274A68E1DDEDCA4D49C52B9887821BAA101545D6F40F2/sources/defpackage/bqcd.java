package defpackage;
/* compiled from: PG */
/* renamed from: bqcd  reason: default package */
/* loaded from: classes4.dex */
final class bqcd implements alht {
    final /* synthetic */ bqcn a;

    public bqcd(bqcn bqcnVar) {
        this.a = bqcnVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        bqcn bqcnVar = this.a;
        int i = bqcnVar.k;
        if (i == 0) {
            throw null;
        }
        boolean z = i == 2 && !bqcnVar.c.f().isEmpty();
        bqcn bqcnVar2 = this.a;
        if (bqcnVar2.d == -1 && !z) {
            return false;
        }
        bqcnVar2.k = 3;
        bqcnVar2.d = -1;
        bqcnVar2.n();
        this.a.j();
        return true;
    }
}
