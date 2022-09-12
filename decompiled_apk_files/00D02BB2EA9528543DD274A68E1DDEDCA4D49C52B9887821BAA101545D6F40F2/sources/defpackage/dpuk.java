package defpackage;
/* compiled from: PG */
/* renamed from: dpuk  reason: default package */
/* loaded from: classes.dex */
public enum dpuk implements dsrb {
    UNKNOWN_KNOWLEDGE_ENTITY(0),
    MAJOR_EVENT(1),
    ANNOTATION(2),
    ACTIVITY(3);
    
    public final int e;

    dpuk(int i) {
        this.e = i;
    }

    public static dpuk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAJOR_EVENT;
            }
            if (i == 2) {
                return ANNOTATION;
            }
            if (i == 3) {
                return ACTIVITY;
            }
            return null;
        }
        return UNKNOWN_KNOWLEDGE_ENTITY;
    }

    public static dsrd c() {
        return dpuj.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
