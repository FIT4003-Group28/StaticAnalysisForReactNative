package defpackage;
/* compiled from: PG */
/* renamed from: cxxs  reason: default package */
/* loaded from: classes5.dex */
public final class cxxs extends cxzt {
    public Integer a;
    public int b;
    private Boolean c;
    private dcep<cygg> d;
    private dcdc<cydx> e;

    @Override // defpackage.cxzt
    public final void b(dcdc<cydx> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null errors");
    }

    @Override // defpackage.cxzt
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cxzt
    public final void d(dcep<cygg> dcepVar) {
        if (dcepVar != null) {
            this.d = dcepVar;
            return;
        }
        throw new NullPointerException("Null notFoundIds");
    }

    @Override // defpackage.cxzt
    public final cxzu a() {
        String str = this.c == null ? " isLastCallback" : "";
        if (this.d == null) {
            str = str.concat(" notFoundIds");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" errors");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" callbackDelayStatus");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" numberSentToNetwork");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxxt(this.c.booleanValue(), this.d, this.e, this.b, this.a);
    }
}
