package defpackage;
/* compiled from: PG */
/* renamed from: bksz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bksz {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[drdo.values().length];
        a = iArr;
        try {
            iArr[drdo.TRENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[drdo.SENTIMENT_POSITIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[drdo.SENTIMENT_NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[drdo.SENTIMENT_NEUTRAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[drdo.UNKNOWN_TOPIC_TRAIT_TYPE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
