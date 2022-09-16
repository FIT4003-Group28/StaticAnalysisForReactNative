package defpackage;
/* compiled from: PG */
/* renamed from: annp  reason: default package */
/* loaded from: classes.dex */
final class annp extends anmq {
    public annp(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anpw anpwVar = (anpw) obj;
        byte[] I = anpwVar.d.I();
        anpy anpyVar = anpwVar.c;
        if (anpyVar == null) {
            anpyVar = anpy.a;
        }
        return new ansy(I, anpyVar.b);
    }
}
