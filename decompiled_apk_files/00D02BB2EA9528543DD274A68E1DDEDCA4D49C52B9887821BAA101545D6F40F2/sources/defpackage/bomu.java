package defpackage;
/* compiled from: PG */
/* renamed from: bomu  reason: default package */
/* loaded from: classes3.dex */
public enum bomu {
    ADDRESS(dqgh.ADDRESS.af),
    BUSINESS_HOURS(dqgh.BUSINESS_HOURS.af),
    CATEGORY(dqgh.CATEGORY.af),
    NAME(dqgh.NAME.af),
    OTHER_NOTES(dqgh.OTHER.af),
    PHONE(dqgh.PHONE_NUMBER.af),
    UNDEFINED(dqgh.UNDEFINED.af),
    WEBSITE(dqgh.WEBSITE.af);
    
    public final int i;

    bomu(int i) {
        this.i = i;
    }

    public static bomu a(int i) {
        bomu[] values;
        for (bomu bomuVar : values()) {
            if (i == bomuVar.i) {
                return bomuVar;
            }
        }
        return UNDEFINED;
    }
}
