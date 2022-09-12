package defpackage;
/* renamed from: cdmn  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdmn implements dzvi {
    static final dzvi a = new cdmn();

    private cdmn() {
    }

    @Override // defpackage.dzvi
    public final Object a(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        dzvx.c(charSequence, "$this$contentEquals");
        dzvx.c(charSequence2, "other");
        String obj3 = charSequence.toString();
        if (obj3 != null) {
            return Boolean.valueOf(obj3.contentEquals(charSequence2));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
