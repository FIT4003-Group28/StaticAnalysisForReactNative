package defpackage;
/* compiled from: PG */
/* renamed from: aaln  reason: default package */
/* loaded from: classes.dex */
public enum aaln {
    SINGLE_ANSWERS("single-answer"),
    MULTI_SELECT("multi-select"),
    UNSUPPORTED("unsupported");
    
    private final String e;

    aaln(String str) {
        this.e = str;
    }

    public static aaln a(String str) {
        aaln[] values;
        for (aaln aalnVar : values()) {
            if (aalnVar.e.equals(str)) {
                return aalnVar;
            }
        }
        return UNSUPPORTED;
    }
}
