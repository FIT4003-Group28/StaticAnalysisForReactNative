package defpackage;
/* compiled from: PG */
/* renamed from: bpul  reason: default package */
/* loaded from: classes4.dex */
final class bpul extends bpuy {
    public int a;
    private akqi b;
    private dbsg<akqq> c = dbpy.a;
    private dbsg<akqs> d = dbpy.a;

    @Override // defpackage.bpuy
    public final void b(akqi akqiVar) {
        if (akqiVar != null) {
            this.b = akqiVar;
            return;
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.bpuy
    public final void c(@dzsi akqq akqqVar) {
        this.c = dbsg.j(akqqVar);
    }

    @Override // defpackage.bpuy
    public final void d(@dzsi akqs akqsVar) {
        this.d = dbsg.j(akqsVar);
    }

    @Override // defpackage.bpuy
    public final bpuz a() {
        String str = this.b == null ? " featureId" : "";
        if (this.a == 0) {
            str = str.concat(" featureType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bpum(this.b, this.c, this.d, this.a);
    }
}
