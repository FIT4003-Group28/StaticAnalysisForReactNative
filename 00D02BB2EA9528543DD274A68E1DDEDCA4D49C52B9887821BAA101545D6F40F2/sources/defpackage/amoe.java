package defpackage;
/* compiled from: PG */
/* renamed from: amoe  reason: default package */
/* loaded from: classes2.dex */
final class amoe implements Comparable<amoe> {
    final amog a;
    final alyh b;
    final amod c;

    public amoe(amog amogVar, alyh alyhVar, amod amodVar) {
        this.a = amogVar;
        this.b = alyhVar;
        this.c = amodVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(amoe amoeVar) {
        return (this.c.d > amoeVar.c.d ? 1 : (this.c.d == amoeVar.c.d ? 0 : -1));
    }
}
