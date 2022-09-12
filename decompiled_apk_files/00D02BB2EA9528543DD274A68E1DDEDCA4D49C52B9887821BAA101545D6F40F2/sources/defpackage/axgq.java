package defpackage;
/* compiled from: PG */
/* renamed from: axgq  reason: default package */
/* loaded from: classes3.dex */
final class axgq<T> implements dzaz<axjk> {
    final /* synthetic */ axhi a;

    public axgq(axhi axhiVar) {
        this.a = axhiVar;
    }

    @Override // defpackage.dzaz
    public final /* bridge */ /* synthetic */ void SR(axjk axjkVar) {
        dimq dimqVar = axjkVar.b;
        if ((dimqVar.a & 64) != 0) {
            axhi axhiVar = this.a;
            dqas dqasVar = dimqVar.g;
            if (dqasVar == null) {
                dqasVar = dqas.c;
            }
            dzvx.b(dqasVar, "it.responseProto.getUserSelfContext()");
            axhiVar.g(dqasVar);
        }
    }
}
