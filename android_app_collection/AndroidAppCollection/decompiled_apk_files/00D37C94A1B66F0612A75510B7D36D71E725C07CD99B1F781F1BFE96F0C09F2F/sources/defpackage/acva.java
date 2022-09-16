package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acva  reason: default package */
/* loaded from: classes.dex */
public final class acva {
    public final boolean a;
    private final String b;

    public acva(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static String a(asno asnoVar) {
        return asnoVar.toString();
    }

    public final void b(String str) {
        if (this.a) {
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(str).length());
            sb.append("[DefaultLatencyActionLogger] <");
            sb.append(str2);
            sb.append("> ");
            sb.append(str);
            zep.g(sb.toString());
        }
    }
}
