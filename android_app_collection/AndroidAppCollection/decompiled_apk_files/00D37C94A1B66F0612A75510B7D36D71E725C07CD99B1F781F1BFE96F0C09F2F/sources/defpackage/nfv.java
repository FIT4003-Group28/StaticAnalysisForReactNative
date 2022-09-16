package defpackage;
/* compiled from: PG */
/* renamed from: nfv  reason: default package */
/* loaded from: classes3.dex */
public final class nfv {
    private final aadd a;
    private final amqo b;

    public nfv(aadd aaddVar, amqo amqoVar) {
        this.a = aaddVar;
        this.b = amqoVar;
    }

    public final boolean a() {
        asxp asxpVar = this.a.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        boolean z = asxpVar.ap;
        asxp asxpVar2 = this.a.a().e;
        if (asxpVar2 == null) {
            asxpVar2 = asxp.a;
        }
        return z && (asxpVar2.at || !((Boolean) this.b.get()).booleanValue());
    }
}
