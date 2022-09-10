package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afhg  reason: default package */
/* loaded from: classes.dex */
public final class afhg {
    private static final dcqe a = dcqe.c("afhg");

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Intent r3) {
        /*
            java.lang.String r0 = r3.getAction()
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L15
            goto L4b
        L15:
            java.lang.String r1 = "android.intent.action.SEND"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L4a
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L42
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.lang.Object r2 = r3.get(r0)
            if (r2 == 0) goto L42
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof android.net.Uri
            if (r0 == 0) goto L37
            android.net.Uri r3 = (android.net.Uri) r3
            goto L43
        L37:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            java.lang.String r3 = "Could not parse URI from EXTRA_STREAM %s"
            defpackage.bvoo.h(r3, r0)
        L42:
            r3 = r1
        L43:
            if (r3 == 0) goto L4a
            java.lang.String r3 = r3.toString()
            return r3
        L4a:
            return r1
        L4b:
            java.lang.String r3 = r3.getDataString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afhg.a(android.content.Intent):java.lang.String");
    }

    public static Uri b(Intent intent) {
        String a2 = a(intent);
        return dbsj.d(a2) ? Uri.EMPTY : Uri.parse(a2);
    }

    public static final String c(Intent intent) {
        ComponentName component = intent.getComponent();
        return component == null ? "" : component.getShortClassName();
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("noconfirm", false);
    }
}
