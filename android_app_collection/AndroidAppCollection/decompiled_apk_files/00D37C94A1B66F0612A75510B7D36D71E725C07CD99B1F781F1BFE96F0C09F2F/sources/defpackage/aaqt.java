package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aaqt  reason: default package */
/* loaded from: classes.dex */
public final class aaqt {
    static {
        Pattern.compile("([a-zA-Z0-9]{2,3})_([a-zA-Z0-9]{2,3})?_[a-zA-Z0-9_]*#([a-zA-Z0-9]{4})");
    }

    public static String a(Locale locale) {
        return locale.toLanguageTag();
    }
}
