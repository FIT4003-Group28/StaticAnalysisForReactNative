package defpackage;
/* compiled from: PG */
/* renamed from: apyn  reason: default package */
/* loaded from: classes2.dex */
final class apyn extends apzd {
    private dbsg<String> a = dbpy.a;
    private dbsg<String> b = dbpy.a;
    private String c;
    private Boolean d;
    private apzb e;

    @Override // defpackage.apzd
    public final void b(apzb apzbVar) {
        if (apzbVar != null) {
            this.e = apzbVar;
            return;
        }
        throw new NullPointerException("Null openConversationEntryPointType");
    }

    @Override // defpackage.apzd
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.apzd
    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null serverBusinessListingId");
    }

    @Override // defpackage.apzd
    public final void e(@dzsi String str) {
        this.b = dbsg.j(str);
    }

    @Override // defpackage.apzd
    public final void f(@dzsi String str) {
        this.a = dbsg.j(str);
    }

    @Override // defpackage.apzd
    public final apze a() {
        String str = this.c == null ? " serverBusinessListingId" : "";
        if (this.d == null) {
            str = str.concat(" openInboxOnTapBack");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" openConversationEntryPointType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new apyo(this.a, this.b, this.c, this.d.booleanValue(), this.e);
    }
}
