package defpackage;
/* compiled from: PG */
/* renamed from: qaa  reason: default package */
/* loaded from: classes4.dex */
public final class qaa {
    public final String a;
    public final boolean b;

    public qaa(String str, boolean z) {
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
