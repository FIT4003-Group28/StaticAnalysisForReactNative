package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aoat  reason: default package */
/* loaded from: classes.dex */
public final class aoat {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static aoat c;

    private aoat() {
    }

    public static aoat b() {
        if (aodm.a == null) {
            aodm.a = new aodm();
        }
        if (c == null) {
            c = new aoat();
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        return str.contains(":");
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(aoay aoayVar) {
        return TextUtils.isEmpty(aoayVar.b) || aoayVar.e + aoayVar.d < a() + a;
    }
}
