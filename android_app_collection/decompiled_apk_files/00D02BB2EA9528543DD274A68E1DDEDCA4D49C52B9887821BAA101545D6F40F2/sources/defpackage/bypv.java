package defpackage;
/* compiled from: PG */
/* renamed from: bypv  reason: default package */
/* loaded from: classes4.dex */
public final class bypv extends byqd {
    public eaow a;
    public String b;
    public String c;
    public int d;
    private String e;
    private String f;
    private Long g;

    @Override // defpackage.byqd
    public final void b(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null destinationName");
    }

    @Override // defpackage.byqd
    public final void c(long j) {
        this.g = Long.valueOf(j);
    }

    @Override // defpackage.byqd
    public final void d(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null tapTargetUrl");
    }

    @Override // defpackage.byqd
    public final byqe a() {
        String str = this.e == null ? " destinationName" : "";
        if (this.a == null) {
            str = str.concat(" estimatedTripDuration");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" tapTargetUrl");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" expirationTimeMillis");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" notificationChannel");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bypw(this.e, this.a, this.b, this.c, this.f, this.g.longValue(), this.d);
    }
}
