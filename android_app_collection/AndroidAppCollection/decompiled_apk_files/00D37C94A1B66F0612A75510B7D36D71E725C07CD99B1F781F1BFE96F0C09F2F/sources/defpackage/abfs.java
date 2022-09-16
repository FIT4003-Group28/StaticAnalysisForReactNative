package defpackage;
/* compiled from: PG */
/* renamed from: abfs  reason: default package */
/* loaded from: classes.dex */
public final class abfs implements abfp {
    private final afvn a;
    private final afvd b;

    public abfs(afvn afvnVar, afvd afvdVar) {
        this.a = afvnVar;
        this.b = afvdVar;
    }

    @Override // defpackage.afuz
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.abfp
    public final abfo b(avfw avfwVar) {
        avfw avfwVar2 = avfw.PREFETCH_CONFIG;
        if (avfwVar.ordinal() == 0) {
            ampq a = this.b.a(this.a.c());
            if (a.h()) {
                return (abfo) a.c();
            }
        }
        return abfo.b;
    }
}
