package defpackage;

import android.content.ComponentName;
/* compiled from: PG */
/* renamed from: bwfr  reason: default package */
/* loaded from: classes4.dex */
public final class bwfr {
    private static final dcdn<String, bwfq> a;

    static {
        dcdg p = dcdn.p();
        p.f("com.android.mms", bwfq.SMS);
        p.f("com.google.android.apps.messaging", bwfq.SMS);
        p.f("com.jb.gosms", bwfq.SMS);
        p.f("com.google.android.gm", bwfq.EMAIL);
        p.f("com.android.email", bwfq.EMAIL);
        p.f("com.samsung.android.email.provider", bwfq.EMAIL);
        p.f("com.microsoft.office.outlook", bwfq.EMAIL);
        p.f("com.yahoo.mobile.client.android.mail", bwfq.EMAIL);
        p.f("com.lge.email", bwfq.EMAIL);
        p.f("com.samsung.android.email.composer", bwfq.EMAIL);
        p.f("com.htc.android.mail", bwfq.EMAIL);
        p.f("com.motorola.email", bwfq.EMAIL);
        p.f("com.google.android.apps.inbox", bwfq.EMAIL);
        p.f("com.sonymobile.email", bwfq.EMAIL);
        p.f("com.twitter.android", bwfq.TWITTER);
        p.f("com.google.android.apps.plus", bwfq.GOOGLE_PLUS);
        p.f("com.instagram.android", bwfq.INSTAGRAM);
        p.f("com.linkedin.android", bwfq.LINKED_IN);
        p.f("com.pinterest", bwfq.PINTEREST);
        p.f("com.facebook.katana", bwfq.FACEBOOK);
        a = p.b();
    }

    @dzsi
    public static bwfq a(ComponentName componentName) {
        String className = componentName.getClassName();
        if (className == null || !className.equals("com.google.android.apps.docs.drive.clipboard.SendTextToClipboardActivity")) {
            String packageName = componentName.getPackageName();
            if (packageName == null) {
                return null;
            }
            return a.get(packageName);
        }
        return bwfq.COPY_TO_CLIPBOARD;
    }

    public static boolean b(ComponentName componentName) {
        String dcyzVar = dczo.a.a(componentName.toString(), dbrc.c).toString();
        return dcyzVar.equals("2cb1856211f9e230506fbda835e5d9af") || dcyzVar.equals("e7457972e587c5668835229a98fb59e9");
    }
}
