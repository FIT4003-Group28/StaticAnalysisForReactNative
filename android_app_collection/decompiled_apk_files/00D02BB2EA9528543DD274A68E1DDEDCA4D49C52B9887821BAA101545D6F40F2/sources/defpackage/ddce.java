package defpackage;
/* compiled from: PG */
/* renamed from: ddce  reason: default package */
/* loaded from: classes5.dex */
public enum ddce implements dsrb {
    SETTING_ENTRY_TYPE_UNSPECIFIED(0),
    CONVERSATION_LIST_PAGE(1),
    BUSINESS_SETTINGS_PAGE(2),
    OPT_OUT(3);
    
    public final int e;

    ddce(int i) {
        this.e = i;
    }

    public static ddce b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CONVERSATION_LIST_PAGE;
            }
            if (i == 2) {
                return BUSINESS_SETTINGS_PAGE;
            }
            if (i == 3) {
                return OPT_OUT;
            }
            return null;
        }
        return SETTING_ENTRY_TYPE_UNSPECIFIED;
    }

    public static dsrd c() {
        return ddcd.a;
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
