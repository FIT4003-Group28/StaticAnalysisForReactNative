package defpackage;

import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* renamed from: aeue  reason: default package */
/* loaded from: classes.dex */
public final class aeue implements afip {
    private final long a;
    private final String b;

    public aeue(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        long j2 = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        double d = j2 - j;
        Double.isNaN(d);
        sb.append(d / 1000.0d);
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeue) {
            aeue aeueVar = (aeue) obj;
            if (this.b.equals(aeueVar.b) && this.a == aeueVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.a)});
    }
}
