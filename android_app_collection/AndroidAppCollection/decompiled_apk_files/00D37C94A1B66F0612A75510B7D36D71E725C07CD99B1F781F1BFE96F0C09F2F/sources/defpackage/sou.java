package defpackage;
/* compiled from: PG */
/* renamed from: sou  reason: default package */
/* loaded from: classes4.dex */
final class sou {
    Object a;
    int b;

    public sou(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("int[");
        sb.append(i);
        sb.append("][");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
