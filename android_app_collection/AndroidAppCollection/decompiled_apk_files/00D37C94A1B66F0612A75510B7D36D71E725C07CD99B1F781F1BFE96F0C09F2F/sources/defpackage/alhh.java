package defpackage;
/* compiled from: PG */
/* renamed from: alhh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alhh implements aypx {
    private final /* synthetic */ int c;
    public static final /* synthetic */ alhh b = new alhh(1);
    public static final /* synthetic */ alhh a = new alhh();

    private /* synthetic */ alhh() {
    }

    private /* synthetic */ alhh(int i) {
        this.c = i;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        if (this.c == 0) {
            aopa aopaVar = (aopa) obj;
            alct alctVar = (alct) obj2;
            aopaVar.copyOnWrite();
            alcw alcwVar = (alcw) aopaVar.instance;
            alcw alcwVar2 = alcw.a;
            alctVar.getClass();
            alcwVar.f62J = alctVar;
            alcwVar.c |= 32;
            return aopaVar;
        }
        aopa aopaVar2 = (aopa) obj;
        alct alctVar2 = (alct) obj2;
        aopaVar2.copyOnWrite();
        alcw alcwVar3 = (alcw) aopaVar2.instance;
        alcw alcwVar4 = alcw.a;
        alctVar2.getClass();
        alcwVar3.Y = alctVar2;
        alcwVar3.c |= 131072;
        return aopaVar2;
    }
}
