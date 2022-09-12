package defpackage;
/* compiled from: PG */
/* renamed from: ca  reason: default package */
/* loaded from: classes4.dex */
public final class ca {
    public static StringBuilder a() {
        return new StringBuilder();
    }

    public static void b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
