package defpackage;
/* compiled from: PG */
/* renamed from: ahnm  reason: default package */
/* loaded from: classes2.dex */
public final class ahnm {
    public final btrm a;
    public final ahpz b;
    public final ahnt c;
    public final ahnx d;
    public final ahod e;

    public ahnm(cqat cqatVar, btrm btrmVar, @dzsi ckcw ckcwVar, @dzsi ahpt ahptVar) {
        this.a = btrmVar;
        this.b = new ahpz(cqatVar, btrmVar);
        this.c = new ahnt(cqatVar);
        this.d = new ahnx(cqatVar);
        this.e = new ahod(cqatVar, btrmVar, ckcwVar, ahptVar);
    }

    public final void a(@dzsi ahqd ahqdVar) {
        ahpz ahpzVar = this.b;
        bvrj.LOCATION_DISPATCHER.c();
        ahpzVar.h = ahqdVar;
        ahnt ahntVar = this.c;
        bvrj.LOCATION_DISPATCHER.c();
        ahntVar.b = ahqdVar;
        ahnx ahnxVar = this.d;
        bvrj.LOCATION_DISPATCHER.c();
        ahnxVar.b = ahqdVar;
        ahod ahodVar = this.e;
        bvrj.LOCATION_DISPATCHER.c();
        ahodVar.e.c = ahqdVar;
    }
}
