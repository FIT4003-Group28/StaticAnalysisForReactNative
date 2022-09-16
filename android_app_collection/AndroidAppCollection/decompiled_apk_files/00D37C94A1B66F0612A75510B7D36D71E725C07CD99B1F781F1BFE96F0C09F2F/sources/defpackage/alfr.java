package defpackage;
/* compiled from: PG */
/* renamed from: alfr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alfr implements akzs {
    private final /* synthetic */ int c;
    public static final /* synthetic */ alfr b = new alfr(1);
    public static final /* synthetic */ alfr a = new alfr();

    private /* synthetic */ alfr() {
    }

    private /* synthetic */ alfr(int i) {
        this.c = i;
    }

    @Override // defpackage.akzs
    public final alcw a(alcw alcwVar) {
        if (this.c == 0) {
            alcwVar.getClass();
            if (alcwVar.t) {
                return alcwVar;
            }
            aopa mo52toBuilder = alcwVar.mo52toBuilder();
            alht.o(mo52toBuilder);
            mo52toBuilder.copyOnWrite();
            alcw alcwVar2 = (alcw) mo52toBuilder.instance;
            alcwVar2.c = (-4194305) & alcwVar2.c;
            alcwVar2.ad = false;
            return (alcw) mo52toBuilder.mo39build();
        }
        alcwVar.getClass();
        if (alcwVar.t) {
            return alcwVar;
        }
        aopa mo52toBuilder2 = alcwVar.mo52toBuilder();
        alht.o(mo52toBuilder2);
        mo52toBuilder2.copyOnWrite();
        alcw alcwVar3 = (alcw) mo52toBuilder2.instance;
        alcwVar3.c = (-4194305) & alcwVar3.c;
        alcwVar3.ad = false;
        return (alcw) mo52toBuilder2.mo39build();
    }
}
