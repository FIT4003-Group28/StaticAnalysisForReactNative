package defpackage;
/* compiled from: PG */
/* renamed from: brnt  reason: default package */
/* loaded from: classes4.dex */
public final class brnt extends brnz {
    public akqi a;
    public Float b;
    public akqq c;
    public Boolean d;
    private ilo e;

    public brnt() {
    }

    public brnt(broa broaVar) {
        brnu brnuVar = (brnu) broaVar;
        this.a = brnuVar.a;
        this.b = brnuVar.b;
        this.c = brnuVar.c;
        this.e = brnuVar.d;
        this.d = Boolean.valueOf(brnuVar.e);
    }

    @Override // defpackage.brnz
    public final void b(@dzsi ilo iloVar) {
        this.e = iloVar;
    }

    @Override // defpackage.brnz
    public final void c(Float f) {
        this.b = f;
    }

    @Override // defpackage.brnz
    public final broa a() {
        String str = this.a == null ? " featureId" : "";
        if (this.d == null) {
            str = str.concat(" isTopResult");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new brnu(this.a, this.b, this.c, this.e, this.d.booleanValue());
    }
}
