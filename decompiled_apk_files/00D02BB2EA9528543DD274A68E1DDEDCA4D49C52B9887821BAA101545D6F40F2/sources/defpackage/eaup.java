package defpackage;
/* compiled from: PG */
/* renamed from: eaup  reason: default package */
/* loaded from: classes6.dex */
final class eaup implements eaus {
    private final eaus a;
    private final eaus b;

    public eaup(eaus eausVar, eaus eausVar2) {
        this.a = eausVar;
        this.b = eausVar2;
    }

    @Override // defpackage.eaus
    public final int a(int i) {
        return this.a.a(i) + this.b.a(i);
    }

    @Override // defpackage.eaus
    public final void b(StringBuffer stringBuffer, int i) {
        this.a.b(stringBuffer, i);
        this.b.b(stringBuffer, i);
    }
}
