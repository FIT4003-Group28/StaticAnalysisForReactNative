package defpackage;
/* compiled from: PG */
/* renamed from: braj  reason: default package */
/* loaded from: classes4.dex */
public final class braj extends bray {
    public begh a;
    private cjqm b;
    private Boolean c;

    @Override // defpackage.bray
    public final void b(cjqm cjqmVar) {
        if (cjqmVar != null) {
            this.b = cjqmVar;
            return;
        }
        throw new NullPointerException("Null loggedInteraction");
    }

    @Override // defpackage.bray
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bray
    public final braz a() {
        String str = this.b == null ? " loggedInteraction" : "";
        if (this.c == null) {
            str = str.concat(" shouldUseStaticHeader");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new brak(this.b, this.a, this.c.booleanValue());
    }
}
