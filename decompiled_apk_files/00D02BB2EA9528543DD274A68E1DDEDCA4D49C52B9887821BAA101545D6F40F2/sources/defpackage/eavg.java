package defpackage;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: eavg  reason: default package */
/* loaded from: classes.dex */
public final class eavg extends eaou {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String a;
    private final int e;
    private final int f;

    public eavg(String str, String str2, int i, int i2) {
        super(str);
        this.a = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.eaou
    public final String a(long j) {
        return this.a;
    }

    @Override // defpackage.eaou
    public final int b(long j) {
        return this.e;
    }

    @Override // defpackage.eaou
    public final int c(long j) {
        return this.f;
    }

    @Override // defpackage.eaou
    public final boolean d() {
        return true;
    }

    @Override // defpackage.eaou
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.eaou
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eavg) {
            eavg eavgVar = (eavg) obj;
            if (this.d.equals(eavgVar.d) && this.f == eavgVar.f && this.e == eavgVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eaou
    public final long f(long j) {
        return j;
    }

    @Override // defpackage.eaou
    public final int hashCode() {
        return this.d.hashCode() + (this.f * 37) + (this.e * 31);
    }

    @Override // defpackage.eaou
    public final int p(long j) {
        return this.e;
    }

    @Override // defpackage.eaou
    public final TimeZone s() {
        String str = this.d;
        if (str.length() != 6 || (!str.startsWith("+") && !str.startsWith("-"))) {
            return new SimpleTimeZone(this.e, this.d);
        }
        String str2 = this.d;
        return TimeZone.getTimeZone(str2.length() != 0 ? "GMT".concat(str2) : new String("GMT"));
    }
}
