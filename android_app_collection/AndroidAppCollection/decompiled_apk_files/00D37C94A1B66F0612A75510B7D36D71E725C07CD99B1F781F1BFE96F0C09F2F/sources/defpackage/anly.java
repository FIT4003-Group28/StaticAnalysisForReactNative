package defpackage;

import com.google.compression.brotli.dec.Dictionary;
/* compiled from: PG */
/* renamed from: anly  reason: default package */
/* loaded from: classes.dex */
final class anly {
    static final boolean a;

    static {
        boolean z;
        try {
            Class.forName(String.valueOf(Dictionary.class.getPackage().getName()).concat(".DictionaryData"));
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
