package defpackage;
/* compiled from: PG */
/* renamed from: cjdx  reason: default package */
/* loaded from: classes4.dex */
public enum cjdx implements dsrb {
    UNKNOWN(0),
    OPEN_REVIEW_EDITOR(1),
    OPEN_PHOTO_POST_EDITOR(2);
    
    public final int d;

    cjdx(int i) {
        this.d = i;
    }

    public static cjdx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OPEN_REVIEW_EDITOR;
            }
            if (i == 2) {
                return OPEN_PHOTO_POST_EDITOR;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return cjdw.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
