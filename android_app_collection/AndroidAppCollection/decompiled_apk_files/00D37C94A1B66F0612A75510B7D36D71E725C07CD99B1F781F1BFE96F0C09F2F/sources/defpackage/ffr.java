package defpackage;
/* compiled from: PG */
/* renamed from: ffr  reason: default package */
/* loaded from: classes3.dex */
public final class ffr {
    public final CharSequence a;
    private final int b;

    public ffr(CharSequence charSequence, int i) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
    }

    public static ffr a(CharSequence charSequence) {
        return new ffr(charSequence, 0);
    }

    public final ampq b() {
        int i = this.b;
        return i > 0 ? ampq.j(Integer.valueOf(i)) : amon.a;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        int i = this.b;
        objArr[1] = i > 0 ? Integer.toString(i) : "None";
        return String.format("PlayerToast[Text=%s, durationMs=%s]", objArr);
    }
}
