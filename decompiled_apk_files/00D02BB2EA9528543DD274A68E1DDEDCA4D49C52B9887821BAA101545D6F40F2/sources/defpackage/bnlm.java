package defpackage;
/* compiled from: PG */
/* renamed from: bnlm  reason: default package */
/* loaded from: classes3.dex */
public final class bnlm {
    @dzsi
    public djim a;
    public final btvo b;

    public bnlm(btvo btvoVar) {
        this.b = btvoVar;
    }

    public final boolean a() {
        return this.b.getPromotedPlacesParameters().a;
    }

    public final int b() {
        djim djimVar = this.a;
        if (djimVar == null || (djimVar.a & 2) == 0) {
            return Integer.MAX_VALUE;
        }
        return djimVar.c;
    }
}
