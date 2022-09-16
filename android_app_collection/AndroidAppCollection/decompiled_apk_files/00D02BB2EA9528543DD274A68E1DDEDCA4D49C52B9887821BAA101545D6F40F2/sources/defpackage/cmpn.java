package defpackage;
/* compiled from: PG */
/* renamed from: cmpn  reason: default package */
/* loaded from: classes.dex */
public final class cmpn {
    public final String a;
    public final boolean b;

    public cmpn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
