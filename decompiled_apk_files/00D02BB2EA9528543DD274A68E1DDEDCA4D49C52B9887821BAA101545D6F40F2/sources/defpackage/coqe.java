package defpackage;
/* compiled from: PG */
/* renamed from: coqe  reason: default package */
/* loaded from: classes5.dex */
public final class coqe {
    public static boolean a(int i) {
        return i > 0;
    }

    public static int b(int i) {
        return (i == -2 || i == -1 || i == 0 || i == 1) ? i : a(i) ? 99 : -3;
    }
}
