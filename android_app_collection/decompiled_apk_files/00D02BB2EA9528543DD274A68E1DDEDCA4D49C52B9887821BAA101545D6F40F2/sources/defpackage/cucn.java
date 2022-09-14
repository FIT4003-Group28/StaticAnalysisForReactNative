package defpackage;
/* compiled from: PG */
/* renamed from: cucn  reason: default package */
/* loaded from: classes5.dex */
public final class cucn extends ctzm {
    public Long a;
    public Long b;
    public ctzo c;
    private dcdc<Byte> d;

    @Override // defpackage.ctzm
    public final void b(ctzo ctzoVar) {
        this.c = ctzoVar;
    }

    @Override // defpackage.ctzm
    public final void c(dcdc<Byte> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null tachyonToken");
    }

    @Override // defpackage.ctzm
    public final ctzp a() {
        String str = this.d == null ? " tachyonToken" : "";
        if (this.a == null) {
            str = str.concat(" expireAt");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" refreshedAt");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" oneOfId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuco(this.d, this.a, this.b, this.c);
    }
}
