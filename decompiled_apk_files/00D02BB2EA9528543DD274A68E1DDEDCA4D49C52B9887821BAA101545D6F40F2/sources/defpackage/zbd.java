package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: zbd  reason: default package */
/* loaded from: classes7.dex */
public final class zbd extends bvsi {
    private static final Pattern a = Pattern.compile("[A-Za-z]");

    public zbd(Context context) {
        super(context);
    }

    public static boolean a(@dzsi CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && charSequence.length() == 1 && a.matcher(charSequence).matches();
    }

    public final void b(@dzsi CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (a(charSequence)) {
            super.d(charSequence);
        } else {
            super.c(charSequence);
        }
    }
}
