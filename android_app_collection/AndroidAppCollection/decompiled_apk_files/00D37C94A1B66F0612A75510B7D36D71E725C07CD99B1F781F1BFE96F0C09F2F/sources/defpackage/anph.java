package defpackage;
/* compiled from: PG */
/* renamed from: anph  reason: default package */
/* loaded from: classes.dex */
final class anph extends anmq {
    public anph(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anpr anprVar = (anpr) obj;
        anuh anuhVar = new anuh(anprVar.c.I());
        anpt anptVar = anprVar.d;
        if (anptVar == null) {
            anptVar = anpt.a;
        }
        return new anuk(anuhVar, anptVar.b);
    }
}
