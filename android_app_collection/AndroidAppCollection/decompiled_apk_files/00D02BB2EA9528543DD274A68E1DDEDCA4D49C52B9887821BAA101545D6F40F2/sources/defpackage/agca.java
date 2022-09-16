package defpackage;
/* compiled from: PG */
/* renamed from: agca  reason: default package */
/* loaded from: classes2.dex */
final class agca extends aggm {
    private Integer a;

    @Override // defpackage.aggm
    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.aggm
    public final aggn a() {
        String str = this.a == null ? " bottomPaddingDpOfProgressIndicator" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new agcb(this.a.intValue());
    }
}
