package defpackage;
/* compiled from: PG */
/* renamed from: dzxr  reason: default package */
/* loaded from: classes6.dex */
class dzxr extends dzxq {
    public static final boolean a(CharSequence charSequence) {
        dzvx.c(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            dzvx.c(charSequence, "$this$indices");
            dzty it = new dzwi(0, charSequence.length() - 1).iterator();
            while (((dzwh) it).a) {
                if (!dzxa.a(charSequence.charAt(it.a()))) {
                    return false;
                }
            }
        }
        return true;
    }
}
