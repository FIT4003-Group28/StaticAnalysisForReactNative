package defpackage;
/* compiled from: PG */
/* renamed from: anam  reason: default package */
/* loaded from: classes.dex */
public final class anam extends RuntimeException {
    public final drtc a;
    public final int b;
    private final int c;

    public anam(String str, int i, int i2, int i3) {
        super(str);
        this.a = (drtc) dbsg.j(drtc.b(i)).c(drtc.UNKNOWN);
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = getClass().getName();
        String e = dbsj.e(getMessage());
        String name2 = this.a.name();
        int i = this.b;
        int i2 = this.c;
        int length = String.valueOf(name).length();
        StringBuilder sb = new StringBuilder(length + 67 + e.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append(": ");
        sb.append(e);
        sb.append(" {canonicalCode=");
        sb.append(name2);
        sb.append(", loggedCode=");
        sb.append(i);
        sb.append(", posixErrno=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
