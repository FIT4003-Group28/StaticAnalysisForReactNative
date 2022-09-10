package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cwal  reason: default package */
/* loaded from: classes5.dex */
final class cwal extends cwar {
    public int b;
    public dbsg<cwat> a = dbpy.a;
    private final dbsg<String> c = dbpy.a;
    private final dbsg<Drawable> d = dbpy.a;
    private final dbsg<cwao> e = dbpy.a;

    @Override // defpackage.cwar
    public final cwas a() {
        String str = 1 != this.b ? " state" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cwam(this.b, this.a, this.c, this.d, this.e);
    }
}
