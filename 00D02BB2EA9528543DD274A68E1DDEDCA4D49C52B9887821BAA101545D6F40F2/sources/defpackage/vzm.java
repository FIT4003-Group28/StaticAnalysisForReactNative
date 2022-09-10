package defpackage;
/* compiled from: PG */
/* renamed from: vzm  reason: default package */
/* loaded from: classes7.dex */
final class vzm implements dbsz<Integer> {
    final /* synthetic */ vzp a;

    public vzm(vzp vzpVar) {
        this.a = vzpVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi Integer num) {
        zfg zfgVar;
        Integer num2 = num;
        vzp vzpVar = this.a;
        if (!vzpVar.aD || num2 == null || (zfgVar = vzpVar.ak) == null) {
            return;
        }
        zfgVar.m(num2.intValue());
    }
}
