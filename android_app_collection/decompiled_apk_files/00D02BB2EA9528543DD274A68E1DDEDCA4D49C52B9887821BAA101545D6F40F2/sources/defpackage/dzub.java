package defpackage;
/* compiled from: PG */
/* renamed from: dzub  reason: default package */
/* loaded from: classes6.dex */
class dzub extends dzua {
    public static final int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
