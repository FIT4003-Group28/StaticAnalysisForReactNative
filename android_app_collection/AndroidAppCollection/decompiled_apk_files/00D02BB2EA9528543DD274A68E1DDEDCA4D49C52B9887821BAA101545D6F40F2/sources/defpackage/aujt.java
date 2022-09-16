package defpackage;
/* compiled from: PG */
/* renamed from: aujt  reason: default package */
/* loaded from: classes.dex */
public final class aujt {
    @dzsi
    public final aujw a;
    @dzsi
    public final aujw b;

    public aujt(@dzsi aujw aujwVar, @dzsi aujw aujwVar2) {
        boolean z = false;
        dbsk.a(aujwVar == null || !aujwVar.a);
        dbsk.a((aujwVar2 == null || aujwVar2.a) ? true : z);
        this.a = aujwVar;
        this.b = aujwVar2;
    }

    public final void a(@dzsi akqi akqiVar) {
        aujw aujwVar = this.a;
        if (aujwVar != null) {
            aujwVar.g(akqiVar);
        }
        aujw aujwVar2 = this.b;
        if (aujwVar2 != null) {
            aujwVar2.g(akqiVar);
        }
    }
}
