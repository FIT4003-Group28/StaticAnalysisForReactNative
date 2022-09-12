package defpackage;
/* compiled from: PG */
/* renamed from: czda  reason: default package */
/* loaded from: classes5.dex */
public abstract class czda {
    protected abstract int a(String str, String str2);

    public final boolean b(String str, String str2) {
        if (a(str2, str) >= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
            sb.append(str);
            sb.append((char) 64967);
            return a(str2, sb.toString()) <= 0;
        }
        return false;
    }
}
