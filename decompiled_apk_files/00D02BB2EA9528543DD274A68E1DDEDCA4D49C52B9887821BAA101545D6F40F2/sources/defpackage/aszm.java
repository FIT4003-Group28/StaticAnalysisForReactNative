package defpackage;
/* compiled from: PG */
/* renamed from: aszm  reason: default package */
/* loaded from: classes2.dex */
public final class aszm extends astc {
    @dzsi
    public final crqd l;

    public aszm(aszl aszlVar) {
        super(aszlVar);
        this.l = aszlVar.l;
    }

    @Override // defpackage.astc
    public final boolean b() {
        return this.l != null;
    }

    @Override // defpackage.astc
    @dzsi
    public final dqvj e() {
        crqd crqdVar = this.l;
        if (crqdVar == null) {
            return null;
        }
        return crqdVar.f;
    }

    public final String toString() {
        dbsb f = f();
        f.b("navState", this.l);
        return f.toString();
    }
}
