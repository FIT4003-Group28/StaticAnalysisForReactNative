package defpackage;
/* compiled from: PG */
/* renamed from: aifo  reason: default package */
/* loaded from: classes2.dex */
final class aifo {
    public final dcdc<aifn> a;
    private final cqat b;
    private final aifq c;
    private final aifq d;
    @dzsi
    private aifo e;

    public aifo(cqat cqatVar, aifq aifqVar, aifq aifqVar2, dcdc<aifn> dcdcVar) {
        this.b = cqatVar;
        this.c = aifqVar;
        this.d = aifqVar2;
        this.a = dcdcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aifq a() {
        aifo aifoVar = this.e;
        if (aifoVar == null || !aifoVar.c()) {
            return !c() ? this.c : this.d;
        }
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        long e = this.b.e();
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).c(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        aifo aifoVar = this.e;
        return (aifoVar != null && aifoVar.c()) || dcft.j(this.a, aifl.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        final long e = this.b.e();
        if (!c() || !dcft.k(this.a, new dbsl(e) { // from class: aifm
            private final long a;

            {
                this.a = e;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((aifn) obj).d(this.a);
            }
        })) {
            return false;
        }
        aifo aifoVar = this.e;
        if (aifoVar != null) {
            return aifoVar.d();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(aifo aifoVar) {
        aifo aifoVar2 = this.e;
        if (aifoVar2 == null || !aifoVar2.c()) {
            this.e = aifoVar;
        } else {
            this.e.e(aifoVar);
        }
    }

    public final void f(aifp aifpVar, int i) {
        aifn aifnVar = this.a.get(i);
        long e = this.b.e();
        float f = 1.0f;
        if (aifnVar.d(e)) {
            aifo aifoVar = this.e;
            if (aifoVar != null) {
                aifoVar.a.get(i).c(aifnVar.c + aifnVar.a);
                aifoVar.f(aifpVar, i);
                return;
            }
            aifnVar.a(aifpVar, this.c, this.d, 1.0f);
            return;
        }
        aifq aifqVar = this.c;
        aifq aifqVar2 = this.d;
        long j = aifnVar.a;
        if (j != 0) {
            long j2 = aifnVar.c;
            f = j2 == 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((float) (e - j2)) / ((float) j)));
        }
        aifnVar.a(aifpVar, aifqVar, aifqVar2, aifnVar.b.getInterpolation(f));
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.a(String.valueOf(hashCode()));
        return b.toString();
    }
}
