package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwpb  reason: default package */
/* loaded from: classes5.dex */
public final class cwpb {
    public final cwkn a;
    public final cwlt b;
    public final String c;
    public final cqat d;
    private final cwlw e;

    public cwpb(cwlw cwlwVar, cwlt cwltVar, cwkn cwknVar, String str, cqat cqatVar) {
        this.e = cwlwVar;
        this.a = cwknVar;
        this.b = cwltVar;
        this.c = str;
        this.d = cqatVar;
    }

    public final dehn<dcdc<cwls>> a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        dehn<dcdc<cwls>> b = z ? this.e.b() : this.e.a();
        dbae.c(b, new cwpa(this, z, currentTimeMillis), dege.a);
        return b;
    }
}
