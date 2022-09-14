package defpackage;
/* compiled from: PG */
/* renamed from: jok  reason: default package */
/* loaded from: classes.dex */
public final class jok {
    @dzsi
    public btzc a = null;
    private final busj b;
    private final dehq c;

    public jok(busj busjVar, dehq dehqVar) {
        this.b = busjVar;
        this.c = dehqVar;
    }

    public final dehn<joj> a(@dzsi djwd djwdVar, int i) {
        djwb bZ = djwe.d.bZ();
        if (djwdVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djwe djweVar = (djwe) bZ.b;
            djwdVar.getClass();
            djweVar.b = djwdVar;
            djweVar.a |= 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djwe djweVar2 = (djwe) bZ.b;
        djweVar2.a |= 8;
        djweVar2.c = i;
        deig d = deig.d();
        btzc btzcVar = this.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.a = this.b.c().b(bZ.bK(), new joi(this, d), this.c);
        return d;
    }
}
