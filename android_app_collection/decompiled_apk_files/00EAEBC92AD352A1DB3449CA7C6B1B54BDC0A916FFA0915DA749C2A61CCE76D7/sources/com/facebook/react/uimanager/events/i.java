package com.facebook.react.uimanager.events;
/* loaded from: classes.dex */
public enum i {
    START,
    END,
    MOVE,
    CANCEL;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5923a = new int[i.values().length];

        static {
            try {
                f5923a[i.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5923a[i.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5923a[i.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5923a[i.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String a(i iVar) {
        int i = a.f5923a[iVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "topTouchEnd";
            }
            if (i == 3) {
                return "topTouchMove";
            }
            if (i == 4) {
                return "topTouchCancel";
            }
            throw new IllegalArgumentException("Unexpected type " + iVar);
        }
        return "topTouchStart";
    }
}
