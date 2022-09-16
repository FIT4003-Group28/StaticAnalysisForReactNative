package defpackage;
/* compiled from: PG */
/* renamed from: rid  reason: default package */
/* loaded from: classes7.dex */
public final class rid {
    public dnkr a;

    public rid(dnkr dnkrVar) {
        this.a = dnkrVar;
    }

    public final void a(int i) {
        dnkq ca = dnkr.c.ca(this.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnkr dnkrVar = (dnkr) ca.b;
        dnkrVar.a |= 1;
        dnkrVar.b = i;
        this.a = ca.bK();
    }
}
