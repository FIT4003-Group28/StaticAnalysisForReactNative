package defpackage;
/* compiled from: PG */
/* renamed from: egb  reason: default package */
/* loaded from: classes.dex */
public final class egb {
    private static final String a = "egb";
    private int b = 1;

    public final boolean a(int i, int i2) {
        if (this.b == i) {
            this.b = i2;
            return true;
        }
        String a2 = ega.a(i2);
        String a3 = ega.a(this.b);
        String a4 = ega.a(i);
        int length = a2.length();
        StringBuilder sb = new StringBuilder(length + 71 + a3.length() + a4.length());
        sb.append("Trying to change to lifecycle state ");
        sb.append(a2);
        sb.append(", but current state is ");
        sb.append(a3);
        sb.append(" (expected ");
        sb.append(a4);
        sb.append(")");
        bvoo.j(new IllegalStateException(sb.toString()));
        return false;
    }
}
