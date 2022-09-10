package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: npn  reason: default package */
/* loaded from: classes7.dex */
public final class npn {
    private static final dcep<String> a = dcep.B(new Locale("ar").getLanguage());

    public static final Boolean a() {
        return c(a);
    }

    public static final String b(int i) {
        return c(a).booleanValue() ? String.format(Locale.getDefault(), "%d", Integer.valueOf(i)) : String.valueOf(i);
    }

    private static final Boolean c(dcep<String> dcepVar) {
        return Boolean.valueOf(dcepVar.contains(Locale.getDefault().getLanguage()));
    }
}
