package defpackage;
/* compiled from: PG */
/* renamed from: pkw  reason: default package */
/* loaded from: classes4.dex */
public final class pkw {
    public static final pkw a = new pkw(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public pkw(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pxi.P(i3) ? pxi.h(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}
