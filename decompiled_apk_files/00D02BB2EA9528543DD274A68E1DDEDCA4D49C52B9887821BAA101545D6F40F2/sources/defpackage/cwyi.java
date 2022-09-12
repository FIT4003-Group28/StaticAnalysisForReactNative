package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwyi  reason: default package */
/* loaded from: classes5.dex */
public abstract class cwyi {
    public static cwyi c(String str) {
        return new cwxy(str, null);
    }

    public static cwyi d(Activity activity) {
        return new cwxy(null, activity);
    }

    @dzsi
    public abstract String a();

    @dzsi
    public abstract Activity b();

    public final String toString() {
        String a = a();
        if (a != null) {
            return a;
        }
        Activity b = b();
        if (b != null) {
            String valueOf = String.valueOf(b.getClass().getName());
            return valueOf.length() != 0 ? "Activity:".concat(valueOf) : new String("Activity:");
        }
        return super.toString();
    }
}
