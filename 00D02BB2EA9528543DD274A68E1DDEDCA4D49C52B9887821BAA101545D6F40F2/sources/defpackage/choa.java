package defpackage;
/* compiled from: PG */
/* renamed from: choa  reason: default package */
/* loaded from: classes4.dex */
final class choa extends chnw {
    public Long a;
    private chty b;
    private chvi c;

    @Override // defpackage.chnw
    public final void b(chty chtyVar) {
        if (chtyVar != null) {
            this.b = chtyVar;
            return;
        }
        throw new NullPointerException("Null banner");
    }

    @Override // defpackage.chnw
    public final void c(chvi chviVar) {
        if (chviVar != null) {
            this.c = chviVar;
            return;
        }
        throw new NullPointerException("Null pointsCounter");
    }

    @Override // defpackage.chnw
    public final chnx a() {
        String str = this.a == null ? " durationMs" : "";
        if (this.b == null) {
            str = str.concat(" banner");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" pointsCounter");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new chob(this.a, this.b, this.c);
    }
}
