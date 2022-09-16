package defpackage;
/* compiled from: PG */
/* renamed from: annm  reason: default package */
/* loaded from: classes.dex */
final class annm extends anmq {
    public annm(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anpu anpuVar = (anpu) obj;
        annr annrVar = new annr();
        anpw anpwVar = anpuVar.c;
        if (anpwVar == null) {
            anpwVar = anpw.a;
        }
        anug anugVar = (anug) annrVar.c(anpwVar, anug.class);
        anpm anpmVar = new anpm();
        anqy anqyVar = anpuVar.d;
        if (anqyVar == null) {
            anqyVar = anqy.a;
        }
        anmv anmvVar = (anmv) anpmVar.c(anqyVar, anmv.class);
        anqy anqyVar2 = anpuVar.d;
        if (anqyVar2 == null) {
            anqyVar2 = anqy.a;
        }
        anra anraVar = anqyVar2.c;
        if (anraVar == null) {
            anraVar = anra.a;
        }
        int i = anraVar.c;
        return new anua(anugVar, anmvVar);
    }
}
