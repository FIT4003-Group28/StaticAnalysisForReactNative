package defpackage;
/* compiled from: PG */
/* renamed from: btap  reason: default package */
/* loaded from: classes4.dex */
final class btap extends btau {
    private Boolean a;
    private Boolean b;

    @Override // defpackage.btau
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.btau
    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.btau
    public final btav a() {
        String str = this.a == null ? " privatePhotosOptOutChanged" : "";
        if (this.b == null) {
            str = str.concat(" optInPromoDismissUpdated");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new btaq(this.a.booleanValue(), this.b.booleanValue());
    }
}
