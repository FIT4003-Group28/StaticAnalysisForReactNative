package defpackage;
/* compiled from: PG */
/* renamed from: cwdg  reason: default package */
/* loaded from: classes.dex */
final class cwdg extends cwdk {
    public cwdr a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    private dcdc<cwdc> f;

    @Override // defpackage.cwdk
    public final cwdl a() {
        if (this.f == null) {
            this.f = dcdc.e();
        }
        String str = this.a == null ? " restrictedConfiguration" : "";
        if (this.b == null) {
            str = str.concat(" showUseWithoutAnAccount");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" allowRings");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" showMyGoogleChipInEmbeddedMenuHeader");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showSwitchProfileAction");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwdh(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f);
    }
}
