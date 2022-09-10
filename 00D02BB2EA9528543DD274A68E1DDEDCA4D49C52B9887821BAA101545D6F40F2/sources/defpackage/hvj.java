package defpackage;
/* compiled from: PG */
/* renamed from: hvj  reason: default package */
/* loaded from: classes6.dex */
final class hvj implements Comparable<hvj> {
    final dmpn a;
    final int b;
    final alnf c;

    public hvj(alnf alnfVar, dmpn dmpnVar, int i) {
        this.c = alnfVar;
        this.a = dmpnVar;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(hvj hvjVar) {
        return decl.c(hvjVar.b, this.b);
    }
}
