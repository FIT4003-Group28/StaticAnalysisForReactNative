package defpackage;
/* compiled from: PG */
/* renamed from: axai  reason: default package */
/* loaded from: classes2.dex */
public enum axai implements aopm {
    ADD_STICKER(1),
    ADD_TEXT(2);
    
    private final int d;

    axai(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.p;
    }

    public static axai b(int i) {
        if (i != 1) {
            if (i == 2) {
                return ADD_TEXT;
            }
            return null;
        }
        return ADD_STICKER;
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
