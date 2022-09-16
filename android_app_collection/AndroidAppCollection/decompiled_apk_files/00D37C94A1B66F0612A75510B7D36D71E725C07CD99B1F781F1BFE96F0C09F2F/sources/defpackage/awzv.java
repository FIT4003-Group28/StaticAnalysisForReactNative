package defpackage;
/* compiled from: PG */
/* renamed from: awzv  reason: default package */
/* loaded from: classes2.dex */
public enum awzv implements aopm {
    CHANNEL_MENTION_STYLE_UNSPECIFIED(0),
    CHANNEL_MENTION_NORMAL(1),
    CHANNEL_MENTION_LIGHT(2);
    
    public final int d;

    awzv(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.l;
    }

    public static awzv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CHANNEL_MENTION_NORMAL;
            }
            if (i == 2) {
                return CHANNEL_MENTION_LIGHT;
            }
            return null;
        }
        return CHANNEL_MENTION_STYLE_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
