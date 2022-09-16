package defpackage;
/* compiled from: PG */
/* renamed from: aveo  reason: default package */
/* loaded from: classes2.dex */
public enum aveo implements aopm {
    UNKNOWN_EVENT_TAG(0),
    POST_INIT(1);
    
    public final int c;

    aveo(int i) {
        this.c = i;
    }

    public static aopo a() {
        return avcd.q;
    }

    public static aveo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return POST_INIT;
            }
            return null;
        }
        return UNKNOWN_EVENT_TAG;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
