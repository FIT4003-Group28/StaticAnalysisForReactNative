package defpackage;
/* compiled from: PG */
/* renamed from: darc  reason: default package */
/* loaded from: classes5.dex */
public final class darc {
    public static final Integer a = 1;
    public static final Integer b = 26;
    public static final Integer c = 0;
    public static final String d;

    static {
        String valueOf = String.valueOf((Object) 1);
        String valueOf2 = String.valueOf((Object) 26);
        String valueOf3 = String.valueOf((Object) 0);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        sb.append(".");
        sb.append(valueOf3);
        sb.append("-SNAPSHOT");
        d = sb.toString().toString();
    }
}
