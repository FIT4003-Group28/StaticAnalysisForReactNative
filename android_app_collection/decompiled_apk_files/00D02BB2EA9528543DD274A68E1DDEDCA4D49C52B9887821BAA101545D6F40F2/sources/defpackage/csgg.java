package defpackage;

import com.google.android.filament.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: csgg  reason: default package */
/* loaded from: classes5.dex */
final class csgg extends csgi {
    private final String a;
    private final dssj b;
    private final ddby c;
    private final Integer d;
    private final Long e;
    private final Long f;
    private final int[] g;
    private final int h;

    public csgg(String str, dssj dssjVar, @dzsi ddby ddbyVar, @dzsi Integer num, @dzsi Long l, @dzsi Long l2, int i, @dzsi int[] iArr) {
        this.a = str;
        this.b = dssjVar;
        this.c = ddbyVar;
        this.d = num;
        this.e = l;
        this.f = l2;
        this.h = i;
        this.g = iArr;
    }

    @Override // defpackage.csgi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.csgi
    public final dssj b() {
        return this.b;
    }

    @Override // defpackage.csgi
    @dzsi
    public final ddby c() {
        return this.c;
    }

    @Override // defpackage.csgi
    @dzsi
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.csgi
    @dzsi
    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddby ddbyVar;
        Integer num;
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof csgi) {
            csgi csgiVar = (csgi) obj;
            if (this.a.equals(csgiVar.a()) && this.b.equals(csgiVar.b()) && ((ddbyVar = this.c) != null ? ddbyVar.equals(csgiVar.c()) : csgiVar.c() == null) && ((num = this.d) != null ? num.equals(csgiVar.d()) : csgiVar.d() == null) && ((l = this.e) != null ? l.equals(csgiVar.e()) : csgiVar.e() == null) && ((l2 = this.f) != null ? l2.equals(csgiVar.f()) : csgiVar.f() == null)) {
                int i = this.h;
                int h = csgiVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h) {
                    if (Arrays.equals(this.g, csgiVar instanceof csgg ? ((csgg) csgiVar).g : csgiVar.g())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.csgi
    @dzsi
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.csgi
    @dzsi
    public final int[] g() {
        return this.g;
    }

    @Override // defpackage.csgi
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ddby ddbyVar = this.c;
        int i2 = 0;
        if (ddbyVar == null) {
            i = 0;
        } else {
            i = ddbyVar.bC;
            if (i == 0) {
                i = dsst.a.b(ddbyVar).c(ddbyVar);
                ddbyVar.bC = i;
            }
        }
        int i3 = (hashCode ^ i) * 1000003;
        Integer num = this.d;
        int hashCode2 = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Long l = this.e;
        int hashCode3 = (hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.f;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        int i4 = (hashCode3 ^ i2) * 1000003;
        int i5 = this.h;
        if (i5 != 0) {
            return ((i4 ^ i5) * 1000003) ^ Arrays.hashCode(this.g);
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int i = this.h;
        String valueOf6 = String.valueOf(i != 0 ? dujj.a(i) : "null");
        String arrays = Arrays.toString(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf6).length() + String.valueOf(arrays).length());
        sb.append("ClearcutData{logSource=");
        sb.append(str);
        sb.append(", message=");
        sb.append(valueOf);
        sb.append(", visualElements=");
        sb.append(valueOf2);
        sb.append(", eventCode=");
        sb.append(valueOf3);
        sb.append(", wallTime=");
        sb.append(valueOf4);
        sb.append(", elapsedTime=");
        sb.append(valueOf5);
        sb.append(", qosTier=");
        sb.append(valueOf6);
        sb.append(", experimentIds=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
