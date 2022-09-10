package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: auue  reason: default package */
/* loaded from: classes2.dex */
public final class auue extends auug {
    private final auuh a;
    private final cjtd b;
    private final cjsh c;
    private final int d;
    private final long e;

    public auue(auuh auuhVar, @dzsi cjtd cjtdVar, @dzsi cjsh cjshVar, int i, long j) {
        this.a = auuhVar;
        this.b = cjtdVar;
        this.c = cjshVar;
        this.d = i;
        this.e = j;
    }

    @Override // defpackage.auug
    public final auuh a() {
        return this.a;
    }

    @Override // defpackage.auug
    @dzsi
    public final cjtd b() {
        return this.b;
    }

    @Override // defpackage.auug
    @dzsi
    public final cjsh c() {
        return this.c;
    }

    @Override // defpackage.auug
    public final int d() {
        return this.d;
    }

    @Override // defpackage.auug
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cjsh cjshVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof auug) {
            auug auugVar = (auug) obj;
            if (this.a.equals(auugVar.a()) && this.b.equals(auugVar.b()) && ((cjshVar = this.c) != null ? cjshVar.equals(auugVar.c()) : auugVar.c() == null) && this.d == auugVar.d() && this.e == auugVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cjsh cjshVar = this.c;
        int hashCode2 = cjshVar == null ? 0 : cjshVar.hashCode();
        int i = this.d;
        long j = this.e;
        return ((((hashCode ^ hashCode2) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        long j = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMajor + length2 + String.valueOf(valueOf3).length());
        sb.append("Status{key=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", impressionReference=");
        sb.append(valueOf3);
        sb.append(", notificationFlags=");
        sb.append(i);
        sb.append(", expirationMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
