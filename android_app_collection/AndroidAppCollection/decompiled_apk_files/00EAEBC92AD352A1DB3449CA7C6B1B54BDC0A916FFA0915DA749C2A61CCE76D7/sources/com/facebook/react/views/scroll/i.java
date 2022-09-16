package com.facebook.react.views.scroll;
/* loaded from: classes.dex */
public enum i {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6238a = new int[i.values().length];

        static {
            try {
                f6238a[i.BEGIN_DRAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6238a[i.END_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6238a[i.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6238a[i.MOMENTUM_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6238a[i.MOMENTUM_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String a(i iVar) {
        int i = a.f6238a[iVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "topScrollEndDrag";
            }
            if (i == 3) {
                return "topScroll";
            }
            if (i == 4) {
                return "topMomentumScrollBegin";
            }
            if (i == 5) {
                return "topMomentumScrollEnd";
            }
            throw new IllegalArgumentException("Unsupported ScrollEventType: " + iVar);
        }
        return "topScrollBeginDrag";
    }
}
