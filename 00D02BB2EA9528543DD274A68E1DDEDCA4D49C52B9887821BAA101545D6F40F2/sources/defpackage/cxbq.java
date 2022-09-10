package defpackage;
/* compiled from: PG */
/* renamed from: cxbq  reason: default package */
/* loaded from: classes5.dex */
public final class cxbq extends cxcf {
    public Boolean a;
    public dbsg<cxbw> b = dbpy.a;
    public int c;

    @Override // defpackage.cxcf
    public final void b(int i) {
        this.c = i;
    }

    @Override // defpackage.cxcf
    public final cxcg a() {
        String str = this.c == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" manualCapture");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxbr(this.c, this.a.booleanValue(), this.b);
    }
}
