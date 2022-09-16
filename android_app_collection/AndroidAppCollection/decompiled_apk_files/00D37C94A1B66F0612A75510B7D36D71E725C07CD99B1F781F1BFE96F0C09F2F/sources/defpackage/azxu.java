package defpackage;
/* compiled from: PG */
/* renamed from: azxu  reason: default package */
/* loaded from: classes2.dex */
public final class azxu {
    public static final Object a = new azyg("CONDITION_FALSE");

    static {
        new azyg("LIST_EMPTY");
    }

    public static final azxw a(Object obj) {
        obj.getClass();
        azxw azxwVar = null;
        azyd azydVar = obj instanceof azyd ? (azyd) obj : null;
        if (azydVar != null) {
            azxwVar = azydVar.a;
        }
        return azxwVar == null ? (azxw) obj : azxwVar;
    }
}
