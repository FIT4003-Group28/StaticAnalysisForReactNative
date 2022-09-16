package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ajrr  reason: default package */
/* loaded from: classes.dex */
public final class ajrr implements ajrt {
    private final Object a;
    private final String b = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";

    public ajrr(Object obj) {
        this.a = obj;
    }

    public static Object b(ajrs ajrsVar, Class cls) {
        if (ajrsVar != null && !TextUtils.isEmpty("SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY")) {
            Object c = ajrsVar.c("SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY");
            if (cls.isInstance(c)) {
                return cls.cast(c);
            }
        }
        return null;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f(this.b, this.a);
    }
}
