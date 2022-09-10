package defpackage;
/* compiled from: PG */
/* renamed from: abwv  reason: default package */
/* loaded from: classes2.dex */
final class abwv extends abyq {
    public dhjx a;
    public String b;
    public dqmi c;
    public Boolean d;
    private dqlu e;

    @Override // defpackage.abyq
    public final void b(dqlu dqluVar) {
        if (dqluVar != null) {
            this.e = dqluVar;
            return;
        }
        throw new NullPointerException("Null filteringOptions");
    }

    @Override // defpackage.abyq
    public final abyr a() {
        String str = this.d == null ? " canFetchMorePhotos" : "";
        if (this.e == null) {
            str = str.concat(" filteringOptions");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new abww(this.a, this.b, this.c, this.d, this.e);
    }
}
