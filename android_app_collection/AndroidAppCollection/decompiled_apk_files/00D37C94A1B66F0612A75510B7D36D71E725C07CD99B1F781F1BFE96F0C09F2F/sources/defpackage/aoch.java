package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: aoch  reason: default package */
/* loaded from: classes.dex */
public final class aoch extends Exception {
    public aoch(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US);
    }
}
