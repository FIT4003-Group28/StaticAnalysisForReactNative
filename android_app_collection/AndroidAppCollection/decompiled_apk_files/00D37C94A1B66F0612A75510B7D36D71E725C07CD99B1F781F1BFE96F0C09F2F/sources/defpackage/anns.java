package defpackage;
/* compiled from: PG */
/* renamed from: anns  reason: default package */
/* loaded from: classes.dex */
final class anns extends anmq {
    public anns(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anpz anpzVar = (anpz) obj;
        byte[] I = anpzVar.d.I();
        anqb anqbVar = anpzVar.c;
        if (anqbVar == null) {
            anqbVar = anqb.a;
        }
        return new antb(I, anqbVar.b);
    }
}
