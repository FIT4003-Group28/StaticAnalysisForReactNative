package defpackage;
/* compiled from: PG */
/* renamed from: cvqf  reason: default package */
/* loaded from: classes5.dex */
public final class cvqf {
    private String a;
    private Long b;
    private dsfr c;

    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void c(Long l) {
        if (l != null) {
            this.b = l;
            return;
        }
        throw new NullPointerException("Null lastUpdatedVersion");
    }

    public final void d(dsfr dsfrVar) {
        if (dsfrVar != null) {
            this.c = dsfrVar;
            return;
        }
        throw new NullPointerException("Null schedule");
    }

    public final cvqh a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" lastUpdatedVersion");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" schedule");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvqg(this.a, this.b, this.c);
    }
}
