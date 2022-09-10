package defpackage;
/* compiled from: PG */
/* renamed from: alnl  reason: default package */
/* loaded from: classes2.dex */
final class alnl implements dbsl<dmpn> {
    final /* synthetic */ long a;

    public alnl(long j) {
        this.a = j;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi dmpn dmpnVar) {
        dmpn dmpnVar2 = dmpnVar;
        if (dmpnVar2 != null) {
            return ((dmpnVar2.a & 4) == 0 || akxf.c(dmpnVar2).c != this.a || akxf.w(dmpnVar2) == null) ? false : true;
        }
        return false;
    }
}
