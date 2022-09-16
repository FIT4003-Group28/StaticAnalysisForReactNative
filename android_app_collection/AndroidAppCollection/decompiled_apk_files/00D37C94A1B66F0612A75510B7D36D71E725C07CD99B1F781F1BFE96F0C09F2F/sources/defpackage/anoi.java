package defpackage;
/* compiled from: PG */
/* renamed from: anoi  reason: default package */
/* loaded from: classes.dex */
final class anoi extends anmq {
    public anoi(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anrk anrkVar = (anrk) obj;
        anrl anrlVar = anrkVar.c;
        if (anrlVar == null) {
            anrlVar = anrl.a;
        }
        anme b = anmu.a(anrlVar.b).b();
        anrl anrlVar2 = anrkVar.c;
        if (anrlVar2 == null) {
            anrlVar2 = anrl.a;
        }
        anrc anrcVar = anrlVar2.c;
        if (anrcVar == null) {
            anrcVar = anrc.a;
        }
        return new anoh(anrcVar, b);
    }
}
