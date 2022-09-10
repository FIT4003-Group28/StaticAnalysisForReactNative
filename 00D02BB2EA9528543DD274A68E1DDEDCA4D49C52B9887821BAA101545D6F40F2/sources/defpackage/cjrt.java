package defpackage;
/* compiled from: PG */
/* renamed from: cjrt  reason: default package */
/* loaded from: classes.dex */
public final class cjrt extends cjsx {
    public ddow a;
    public ddjf b;
    public ddgm c;
    public ddcy d;
    private ddhn e;

    @Override // defpackage.cjsx
    public final void b(ddhn ddhnVar) {
        if (ddhnVar != null) {
            this.e = ddhnVar;
            return;
        }
        throw new NullPointerException("Null requestType");
    }

    @Override // defpackage.cjsx
    public final cjsy a() {
        String str = this.e == null ? " requestType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cjru(this.e, this.a, this.b, this.c, this.d);
    }
}
