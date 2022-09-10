package defpackage;
/* compiled from: PG */
/* renamed from: xms  reason: default package */
/* loaded from: classes7.dex */
public final class xms extends xmv {
    public akrk a;
    public dcdc<drij> b;
    public akrk c;
    public dcdc<drij> d;
    private Integer e;

    @Override // defpackage.xmv
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.xmv
    public final xmw a() {
        String str = this.e == null ? " lineColor" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new xmt(this.e.intValue(), this.a, this.b, this.c, this.d);
    }
}
