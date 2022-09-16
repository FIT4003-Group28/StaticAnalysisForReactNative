package defpackage;
/* compiled from: PG */
/* renamed from: dsqe  reason: default package */
/* loaded from: classes6.dex */
final class dsqe implements Comparable<dsqe> {
    public final int a;

    public dsqe(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("fieldNumber must be positive: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean b(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dsqe dsqeVar) {
        return this.a - dsqeVar.a;
    }
}
