package defpackage;
/* compiled from: PG */
/* renamed from: alni  reason: default package */
/* loaded from: classes2.dex */
final class alni implements dbsl<dmpn> {
    final /* synthetic */ long a;

    public alni(long j) {
        this.a = j;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi dmpn dmpnVar) {
        dmpn dmpnVar2 = dmpnVar;
        if (dmpnVar2 == null || akxf.n(dmpnVar2)) {
            return false;
        }
        akqi c = akxf.c(dmpnVar2);
        return (dmpnVar2.a & 4) != 0 && !c.equals(akqi.a) && this.a == c.c;
    }
}
