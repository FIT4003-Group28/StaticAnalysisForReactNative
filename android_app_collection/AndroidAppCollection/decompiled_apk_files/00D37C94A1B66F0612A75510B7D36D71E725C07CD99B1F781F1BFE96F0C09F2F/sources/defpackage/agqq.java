package defpackage;
/* compiled from: PG */
/* renamed from: agqq  reason: default package */
/* loaded from: classes.dex */
public final class agqq {
    public final String a;
    public final int b;
    public final int c;

    public agqq(int i, int i2, String str) {
        this.c = i;
        this.b = i2;
        this.a = str;
    }

    public agqq(agqq agqqVar, int i) {
        this(agqqVar.a, i, agqqVar.c);
    }

    public static String a(int i) {
        int i2 = i - 1;
        try {
            StringBuilder sb = new StringBuilder(35);
            sb.append("auto_offline_video_list_");
            sb.append(i2);
            return sb.toString();
        } catch (NullPointerException unused) {
            return "auto_offline_video_list_0";
        }
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("offline_candidate_video_list_");
        sb.append(i - 1);
        return sb.toString();
    }

    public agqq(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
