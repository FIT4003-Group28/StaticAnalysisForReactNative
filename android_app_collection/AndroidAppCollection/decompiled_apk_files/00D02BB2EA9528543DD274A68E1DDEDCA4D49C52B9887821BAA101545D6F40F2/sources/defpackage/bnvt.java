package defpackage;
/* compiled from: PG */
/* renamed from: bnvt  reason: default package */
/* loaded from: classes3.dex */
public final class bnvt {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    @dzsi
    public bnvv h = null;
    public int g = -1;

    public bnvt(String str, String str2, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.f = i;
        this.c = i2;
        this.e = i3;
        this.d = i4;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174 + String.valueOf(str2).length());
        sb.append("[name: ");
        sb.append(str);
        sb.append(", material: ");
        sb.append(str2);
        sb.append(", smoothShading: ");
        sb.append(false);
        sb.append(", vertex count: ");
        sb.append(i);
        sb.append(", animation frame offset: ");
        sb.append(i2);
        sb.append(", animation sequence offset: ");
        sb.append(i3);
        sb.append(", vertex offset: ");
        sb.append(i4);
        sb.append("]");
        return sb.toString();
    }
}
