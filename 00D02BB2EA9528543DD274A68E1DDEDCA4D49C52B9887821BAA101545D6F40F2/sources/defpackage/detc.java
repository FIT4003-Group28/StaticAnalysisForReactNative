package defpackage;
/* compiled from: PG */
/* renamed from: detc  reason: default package */
/* loaded from: classes6.dex */
final class detc implements deth {
    private final deti a;
    private final cpct<detf> b;

    public detc(deti detiVar, cpct<detf> cpctVar) {
        this.a = detiVar;
        this.b = cpctVar;
    }

    @Override // defpackage.deth
    public final boolean a(deto detoVar) {
        if (!detoVar.i() || this.a.a(detoVar)) {
            return false;
        }
        cpct<detf> cpctVar = this.b;
        dete builder = detf.builder();
        String b = detoVar.b();
        if (b != null) {
            desr desrVar = (desr) builder;
            desrVar.a = b;
            desrVar.b = Long.valueOf(detoVar.d());
            desrVar.c = Long.valueOf(detoVar.e());
            String str = desrVar.a == null ? " token" : "";
            if (desrVar.b == null) {
                str = str.concat(" tokenExpirationTimestamp");
            }
            if (desrVar.c == null) {
                str = String.valueOf(str).concat(" tokenCreationTimestamp");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            cpctVar.a(new dess(desrVar.a, desrVar.b.longValue(), desrVar.c.longValue()));
            return true;
        }
        throw new NullPointerException("Null token");
    }

    @Override // defpackage.deth
    public final boolean b(deto detoVar, Exception exc) {
        if (detoVar.j() || detoVar.l() || detoVar.k()) {
            this.b.d(exc);
            return true;
        }
        return false;
    }
}
