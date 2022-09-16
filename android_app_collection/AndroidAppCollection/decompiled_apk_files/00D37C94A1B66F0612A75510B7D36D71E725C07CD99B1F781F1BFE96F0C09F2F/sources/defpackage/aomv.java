package defpackage;
/* compiled from: PG */
/* renamed from: aomv  reason: default package */
/* loaded from: classes.dex */
final class aomv {
    public final String a;
    public final boolean b;

    public aomv(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("{");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
