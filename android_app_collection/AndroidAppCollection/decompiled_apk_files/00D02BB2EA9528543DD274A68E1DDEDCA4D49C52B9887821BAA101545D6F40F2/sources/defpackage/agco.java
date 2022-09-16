package defpackage;
/* compiled from: PG */
/* renamed from: agco  reason: default package */
/* loaded from: classes2.dex */
final class agco extends agvc {
    public Integer a;
    private Integer b;

    @Override // defpackage.agvc
    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.agvc
    public final agvd a() {
        String str = this.a == null ? " paddingTopDp" : "";
        if (this.b == null) {
            str = str.concat(" paddingBottomDp");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new agcp(this.a.intValue(), this.b.intValue());
    }
}
