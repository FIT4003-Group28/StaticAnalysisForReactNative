package defpackage;
/* compiled from: PG */
/* renamed from: cyuh  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyuh {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[cyes.values().length];
        a = iArr;
        try {
            iArr[cyes.FAILED_DATA_FRESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[cyes.FAILED_NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[cyes.FAILED_PEOPLE_API_RESPONSE_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[cyes.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
