package defpackage;

import android.content.Context;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: danl  reason: default package */
/* loaded from: classes5.dex */
public final class danl {
    public final Context a;

    public danl(Context context) {
        this.a = context;
    }

    public static String a(Locale locale) {
        String concat;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            concat = "";
        } else {
            String valueOf2 = String.valueOf(locale.getCountry());
            concat = valueOf2.length() != 0 ? "_".concat(valueOf2) : new String("_");
        }
        String valueOf3 = String.valueOf(concat);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }
}