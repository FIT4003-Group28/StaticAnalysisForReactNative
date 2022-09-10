package defpackage;
/* compiled from: PG */
/* renamed from: ljn  reason: default package */
/* loaded from: classes7.dex */
final class ljn extends atcy {
    final /* synthetic */ lju a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljn(lju ljuVar, atcu atcuVar, atcw atcwVar) {
        super(atcuVar, atcwVar);
        this.a = ljuVar;
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        dbsk.s(this.a.n);
        crqf crqfVar = atlqVar.m;
        amuo amuoVar = atlqVar.o;
        lju ljuVar = this.a;
        boolean z = true;
        if (crqfVar == null || (!atlk.a(crqfVar) && amuoVar != crqfVar.g().b)) {
            z = false;
        }
        ljuVar.v = z;
        this.a.l();
    }
}
