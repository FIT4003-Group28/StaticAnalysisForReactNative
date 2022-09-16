package defpackage;
/* compiled from: PG */
/* renamed from: aazu  reason: default package */
/* loaded from: classes.dex */
public final class aazu extends aars {
    public final aarl a;
    private final afvn b;
    private final aarl c;

    public aazu(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.b = afvnVar;
        this.a = c(arxm.a, aaqjVar, aayx.p, aazt.c);
        this.c = c(arwq.a, aaqjVar, aayx.o, aazt.a);
    }

    public final void a(aopa aopaVar, afzf afzfVar, byte[] bArr) {
        aarl aarlVar = this.c;
        aazs aazsVar = new aazs(this.e, this.b.c(), aopaVar);
        if (bArr == null) {
            bArr = aadi.b;
        }
        aazsVar.k(bArr);
        aarlVar.e(aazsVar, afzfVar);
    }

    public final void b(aopa aopaVar, afzf afzfVar, byte[] bArr) {
        aazv aazvVar = new aazv(this.e, this.b.c(), aopaVar);
        if (bArr == null) {
            bArr = aadi.b;
        }
        aazvVar.k(bArr);
        this.a.e(aazvVar, afzfVar);
    }
}
