package defpackage;
/* compiled from: PG */
/* renamed from: cvu  reason: default package */
/* loaded from: classes3.dex */
public abstract class cvu extends axix {
    public cvu(String str) {
        super(str);
    }

    public abstract long[] k();

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int length = k().length;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 24);
        sb.append(simpleName);
        sb.append("[entryCount=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
