package com.facebook.hermes.unicode;

import c.d.l.a.a;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
@a
/* loaded from: classes.dex */
public class AndroidUnicodeUtils {
    @a
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i != 0) {
            if (i != 1) {
                throw new RuntimeException("Invalid target case");
            }
            return str.toLowerCase(locale);
        }
        return str.toUpperCase(locale);
    }

    @a
    public static String dateFormat(double d2, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z && z2) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            timeInstance = DateFormat.getDateInstance(2);
        } else if (!z2) {
            throw new RuntimeException("Bad dateFormat configuration");
        } else {
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d2)).toString();
    }

    @a
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static String normalize(String str, int i) {
        Normalizer.Form form;
        if (i == 0) {
            form = Normalizer.Form.NFC;
        } else if (i == 1) {
            form = Normalizer.Form.NFD;
        } else if (i == 2) {
            form = Normalizer.Form.NFKC;
        } else if (i != 3) {
            throw new RuntimeException("Invalid form");
        } else {
            form = Normalizer.Form.NFKD;
        }
        return Normalizer.normalize(str, form);
    }
}
