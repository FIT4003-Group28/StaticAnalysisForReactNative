package defpackage;
/* compiled from: PG */
/* renamed from: aigs  reason: default package */
/* loaded from: classes.dex */
public final class aigs extends ajbg {
    final /* synthetic */ aigt a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigs(aigt aigtVar, String str, long j, long j2) {
        super(j, j2, 1, 2, str);
        this.a = aigtVar;
        this.b = str;
    }

    @Override // defpackage.ajbg
    protected final void a() {
        if (this.b.equals(this.a.a)) {
            this.a.f.i(this);
        }
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        long q;
        String str;
        aigt aigtVar = this.a;
        aijy aijyVar = aigtVar.j;
        if (aijyVar == null || (aijyVar.a.equals(aigtVar.a) && !z2)) {
            q = q();
            str = this.a.a;
        } else {
            aijy aijyVar2 = this.a.j;
            q = aijyVar2.c;
            str = aijyVar2.a;
        }
        String str2 = str;
        this.a.c(str2, this.b, q, false, z2);
        this.a.c(this.b, str, q(), true, z2);
        this.a.j = new aijy(this.b, q(), p());
    }
}
