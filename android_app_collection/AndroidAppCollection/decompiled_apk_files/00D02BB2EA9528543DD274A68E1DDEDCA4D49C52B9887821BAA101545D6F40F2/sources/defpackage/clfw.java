package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: clfw  reason: default package */
/* loaded from: classes5.dex */
final class clfw extends clgb {
    private Long a;
    private Long b;
    private Set<clgd> c;

    @Override // defpackage.clgb
    public final void b(long j) {
        this.a = Long.valueOf(j);
    }

    @Override // defpackage.clgb
    public final void c(Set<clgd> set) {
        if (set != null) {
            this.c = set;
            return;
        }
        throw new NullPointerException("Null flags");
    }

    @Override // defpackage.clgb
    public final void d() {
        this.b = 86400000L;
    }

    @Override // defpackage.clgb
    public final clgc a() {
        String str = this.a == null ? " delta" : "";
        if (this.b == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new clfx(this.a.longValue(), this.b.longValue(), this.c);
    }
}
