package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: clek  reason: default package */
/* loaded from: classes5.dex */
public final class clek extends cler {
    public Integer a;
    public Map<String, String> b;
    private String c;
    private cleq d;
    private Long e;
    private Long f;

    @Override // defpackage.cler
    public final void b(cleq cleqVar) {
        if (cleqVar != null) {
            this.d = cleqVar;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    @Override // defpackage.cler
    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.cler
    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null transportName");
    }

    @Override // defpackage.cler
    public final void e(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.cler
    public final cles a() {
        String str = this.c == null ? " transportName" : "";
        if (this.d == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" eventMillis");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" uptimeMillis");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" autoMetadata");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new clel(this.c, this.a, this.d, this.e.longValue(), this.f.longValue(), this.b);
    }
}
