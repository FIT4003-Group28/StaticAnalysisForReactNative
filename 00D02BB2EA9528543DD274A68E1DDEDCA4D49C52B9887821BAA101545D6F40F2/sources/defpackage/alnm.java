package defpackage;
/* compiled from: PG */
/* renamed from: alnm  reason: default package */
/* loaded from: classes2.dex */
final class alnm implements dbsl<dmpn> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public alnm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi dmpn dmpnVar) {
        dmpn dmpnVar2 = dmpnVar;
        if (dmpnVar2 == null || !akxf.B(dmpnVar2)) {
            return false;
        }
        dmol g = akxf.g(dmpnVar2);
        return !g.equals(dmnl.L.b) && (dmpnVar2.a & 4) != 0 && this.a.equals(g.d) && this.b.equals(g.c);
    }
}
