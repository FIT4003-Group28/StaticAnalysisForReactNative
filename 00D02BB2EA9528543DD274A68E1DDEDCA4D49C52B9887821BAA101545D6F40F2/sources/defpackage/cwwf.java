package defpackage;
/* compiled from: PG */
/* renamed from: cwwf  reason: default package */
/* loaded from: classes5.dex */
public final class cwwf extends cwwi {
    public String a;
    public dzze b;
    public String c;
    private Boolean d;
    private eacd e;

    @Override // defpackage.cwwi
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cwwi
    public final void c(eacd eacdVar) {
        if (eacdVar != null) {
            this.e = eacdVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }

    @Override // defpackage.cwwi
    public final cwwj a() {
        String str = this.d == null ? " isEventNameConstant" : "";
        if (this.e == null) {
            str = str.concat(" metric");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwwg(this.a, this.d.booleanValue(), this.e, this.b, this.c);
    }
}
