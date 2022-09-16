package defpackage;
/* compiled from: PG */
/* renamed from: wwt  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wwt {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] c;
    public static final /* synthetic */ int d = 0;

    static {
        int[] iArr = new int[aika.values().length];
        c = iArr;
        try {
            iArr[aika.INTERSTITIAL_REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[aika.VIDEO_REQUESTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[5];
        b = iArr2;
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[3] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[4] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[wxq.values().length];
        a = iArr3;
        try {
            iArr3[wxq.AD_VIDEO_PLAY_REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[wxq.AD_VIDEO_ENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
