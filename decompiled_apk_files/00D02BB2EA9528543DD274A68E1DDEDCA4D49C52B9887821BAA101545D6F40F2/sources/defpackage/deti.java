package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: deti  reason: default package */
/* loaded from: classes6.dex */
public final class deti {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static deti c;
    private final detz d;

    private deti(detz detzVar) {
        this.d = detzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        return str.contains(":");
    }

    public static deti getInstance() {
        return getInstance(deua.getInstance());
    }

    public final boolean a(deto detoVar) {
        return TextUtils.isEmpty(detoVar.b()) || detoVar.e() + detoVar.d() < b() + a;
    }

    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(c());
    }

    public final long c() {
        return this.d.a();
    }

    public static deti getInstance(detz detzVar) {
        if (c == null) {
            c = new deti(detzVar);
        }
        return c;
    }
}
