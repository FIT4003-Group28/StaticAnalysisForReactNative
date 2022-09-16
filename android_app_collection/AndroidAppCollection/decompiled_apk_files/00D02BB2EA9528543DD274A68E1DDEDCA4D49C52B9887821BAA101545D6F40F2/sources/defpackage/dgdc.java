package defpackage;
/* compiled from: PG */
/* renamed from: dgdc  reason: default package */
/* loaded from: classes6.dex */
public enum dgdc implements dsrb {
    UNKNOWN_FEATURE_TYPE(0),
    ACTION_GROUP(1),
    MESSAGING(2),
    CALLS(3),
    LOCAL_POST(4),
    BIZ_INFO(5),
    SETUP(6),
    PERFORMANCE(7);
    
    public final int i;

    dgdc(int i) {
        this.i = i;
    }

    public static dgdc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FEATURE_TYPE;
            case 1:
                return ACTION_GROUP;
            case 2:
                return MESSAGING;
            case 3:
                return CALLS;
            case 4:
                return LOCAL_POST;
            case 5:
                return BIZ_INFO;
            case 6:
                return SETUP;
            case 7:
                return PERFORMANCE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgdb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
