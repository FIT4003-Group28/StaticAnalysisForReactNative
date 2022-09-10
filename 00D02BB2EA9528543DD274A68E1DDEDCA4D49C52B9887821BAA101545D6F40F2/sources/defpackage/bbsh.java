package defpackage;
/* compiled from: PG */
/* renamed from: bbsh  reason: default package */
/* loaded from: classes3.dex */
final class bbsh extends bbtp {
    public ddho a;
    public ddho b;
    public ddho c;
    public ddho d;
    public ddho e;

    @Override // defpackage.bbtp
    public final bbtq a() {
        String str = this.a == null ? " placeTileVeType" : "";
        if (this.b == null) {
            str = str.concat(" staticMapVeType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" directionsButtonVeType");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" allPhotosButtonVeType");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" saveButtonVeType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsi(this.a, this.b, this.c, this.d, this.e);
    }
}
