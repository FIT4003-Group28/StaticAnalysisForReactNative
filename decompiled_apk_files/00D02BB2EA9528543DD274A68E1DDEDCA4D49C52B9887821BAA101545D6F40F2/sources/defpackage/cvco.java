package defpackage;
/* compiled from: PG */
/* renamed from: cvco  reason: default package */
/* loaded from: classes5.dex */
public final class cvco extends cvcx {
    public dbsg<cugu> a;
    public cufj b;
    public Integer c;
    public Boolean d;
    private Boolean e;

    public cvco() {
        this.a = dbpy.a;
    }

    public cvco(cvcy cvcyVar) {
        this.a = dbpy.a;
        cvcp cvcpVar = (cvcp) cvcyVar;
        this.a = cvcpVar.a;
        this.b = cvcpVar.b;
        this.c = Integer.valueOf(cvcpVar.c);
        this.d = Boolean.valueOf(cvcpVar.d);
        this.e = Boolean.valueOf(cvcpVar.e);
    }

    @Override // defpackage.cvcx
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.cvcx
    public final cvcy a() {
        String str = this.b == null ? " senderProfile" : "";
        if (this.c == null) {
            str = str.concat(" threadPosition");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" hasTombstone");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" bottomLabelVisible");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvcp(this.a, this.b, this.c.intValue(), this.d.booleanValue(), this.e.booleanValue());
    }
}
