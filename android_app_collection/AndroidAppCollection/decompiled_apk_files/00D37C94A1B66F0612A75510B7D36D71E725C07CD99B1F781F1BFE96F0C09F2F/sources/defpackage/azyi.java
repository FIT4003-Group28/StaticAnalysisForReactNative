package defpackage;
/* compiled from: PG */
/* renamed from: azyi  reason: default package */
/* loaded from: classes2.dex */
public final class azyi {
    public static final azyg a = new azyg("NO_THREAD_ELEMENTS");
    private static final azsg b = azrc.d;
    private static final azsg c = azrc.e;
    private static final azsg d = azrc.f;

    public static final Object a(azrd azrdVar) {
        azrdVar.getClass();
        Object fold = azrdVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(azrd azrdVar, Object obj) {
        azrdVar.getClass();
        if (obj == null) {
            obj = a(azrdVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return azrdVar.fold(new azyj(azrdVar, ((Number) obj).intValue()), d);
        }
        return ((azuu) obj).a(azrdVar);
    }

    public static final void c(azrd azrdVar, Object obj) {
        azrdVar.getClass();
        if (obj == a) {
            return;
        }
        if (obj instanceof azyj) {
            azyj azyjVar = (azyj) obj;
            int length = azyjVar.d.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                azyjVar.d[length].getClass();
                azuu.b(azyjVar.b[length]);
                if (i < 0) {
                    return;
                }
                length = i;
            }
        } else {
            Object fold = azrdVar.fold(null, c);
            if (fold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            azuu azuuVar = (azuu) fold;
            azuu.b(obj);
        }
    }
}
