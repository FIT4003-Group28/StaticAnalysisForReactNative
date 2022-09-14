package defpackage;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bzaj  reason: default package */
/* loaded from: classes4.dex */
public final class bzaj {
    private static final String a;

    static {
        String canonicalName = bzaj.class.getCanonicalName();
        dbsk.s(canonicalName);
        a = canonicalName;
    }

    private bzaj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Service service) {
        return i(service, new Uri.Builder().path("stop").build());
    }

    public static byzg b(Intent intent) {
        return byzg.a(intent.getData().getQueryParameter("guidanceTypeName"));
    }

    public static int c(Intent intent) {
        return Integer.parseInt(intent.getData().getQueryParameter("transitStageNumber"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Intent intent) {
        return intent.getAction().equals(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Intent intent) {
        return intent.getData().getPath().equals("stop");
    }

    public static boolean f(Intent intent) {
        try {
            h(intent);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent g(Service service, int i, byzg byzgVar, int i2) {
        return i(service, new Uri.Builder().path(i2 != 1 ? "PREVIOUS" : "NEXT").appendQueryParameter("transitStageNumber", Integer.toString(i)).appendQueryParameter("guidanceTypeName", byzgVar.name()).build());
    }

    public static int h(Intent intent) {
        char c;
        String path = intent.getData().getPath();
        int hashCode = path.hashCode();
        if (hashCode != -491148553) {
            if (hashCode == 2392819 && path.equals("NEXT")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (path.equals("PREVIOUS")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                throw new IllegalArgumentException();
            }
            return 2;
        }
        return 1;
    }

    private static Intent i(Service service, Uri uri) {
        return new Intent(a, uri, service, service.getClass());
    }
}
