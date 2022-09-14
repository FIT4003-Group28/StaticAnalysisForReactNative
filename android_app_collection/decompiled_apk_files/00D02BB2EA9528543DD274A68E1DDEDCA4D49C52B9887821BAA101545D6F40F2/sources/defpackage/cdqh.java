package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqh  reason: default package */
/* loaded from: classes4.dex */
public final class cdqh extends cdrg {
    public dbsg<String> a;
    public dbsg<String> b;
    public bvrt<dnti> c;
    private Boolean d;

    public cdqh() {
        this.a = dbpy.a;
        this.b = dbpy.a;
    }

    public cdqh(cdrh cdrhVar) {
        this.a = dbpy.a;
        this.b = dbpy.a;
        cdqi cdqiVar = (cdqi) cdrhVar;
        this.a = cdqiVar.a;
        this.b = cdqiVar.b;
        this.c = cdqiVar.c;
        this.d = Boolean.valueOf(cdqiVar.d);
    }

    @Override // defpackage.cdrg
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cdrg
    public final cdrh a() {
        String str = this.c == null ? " ownerResponseSerializable" : "";
        if (this.d == null) {
            str = str.concat(" showTranslation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cdqi(this.a, this.b, this.c, this.d.booleanValue());
    }
}
