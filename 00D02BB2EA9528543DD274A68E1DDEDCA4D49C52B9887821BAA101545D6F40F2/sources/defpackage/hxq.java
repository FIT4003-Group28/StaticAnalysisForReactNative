package defpackage;
/* compiled from: PG */
/* renamed from: hxq  reason: default package */
/* loaded from: classes6.dex */
final class hxq extends hxz {
    public cqtv a;
    public cqhn b;
    private cjtd c;
    private CharSequence d;

    @Override // defpackage.hxz
    public final void b(@dzsi CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.hxz
    public final void c(cjtd cjtdVar) {
        this.c = cjtdVar;
    }

    @Override // defpackage.hxz
    public final hya a() {
        String str = this.a == null ? " badgeTextSize" : "";
        if (this.b == null) {
            str = str.concat(" curvularBinder");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new hxr(this.c, this.d, this.a, this.b);
    }
}
