package defpackage;
/* compiled from: PG */
/* renamed from: ctpg  reason: default package */
/* loaded from: classes5.dex */
final class ctpg extends ctqh {
    private Boolean a;
    private Integer b;

    @Override // defpackage.ctqh
    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.ctqh
    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.ctqh
    public final ctqi a() {
        String str = this.a == null ? " isSuccessful" : "";
        if (this.b == null) {
            str = str.concat(" conversationsDownloaded");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctph(this.a.booleanValue(), this.b.intValue());
    }
}
