package com.facebook.react.uimanager.h1;
/* loaded from: classes.dex */
enum g {
    CREATE,
    UPDATE,
    DELETE;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5966a = new int[g.values().length];

        static {
            try {
                f5966a[g.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5966a[g.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5966a[g.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(g gVar) {
        int i = a.f5966a[gVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "update";
            }
            if (i == 3) {
                return "delete";
            }
            throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + gVar);
        }
        return "create";
    }
}
