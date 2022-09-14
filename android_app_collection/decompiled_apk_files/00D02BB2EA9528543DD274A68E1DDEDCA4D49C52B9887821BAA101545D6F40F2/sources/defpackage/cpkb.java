package defpackage;

import android.provider.BaseColumns;
/* compiled from: PG */
/* renamed from: cpkb  reason: default package */
/* loaded from: classes5.dex */
public class cpkb implements BaseColumns {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.ContentResolver r9, android.net.Uri r10, java.lang.String r11) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L30
            java.lang.String r2 = "value"
            r8 = 0
            r4[r8] = r2     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L30
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L30
            r6[r8] = r11     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L30
            java.lang.String r5 = "name=?"
            r7 = 0
            r2 = r9
            r3 = r10
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L30
            if (r9 == 0) goto L27
            boolean r0 = r9.moveToFirst()     // Catch: android.database.SQLException -> L31 java.lang.Throwable -> L4f
            if (r0 != 0) goto L1f
            goto L27
        L1f:
            java.lang.String r10 = r9.getString(r8)     // Catch: android.database.SQLException -> L31 java.lang.Throwable -> L4f
            r9.close()
            return r10
        L27:
            if (r9 == 0) goto L2c
            r9.close()
        L2c:
            return r1
        L2d:
            r9 = move-exception
            r10 = r9
            goto L51
        L30:
            r9 = r1
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Can't get key "
            r0.append(r2)     // Catch: java.lang.Throwable -> L4f
            r0.append(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r11 = " from "
            r0.append(r11)     // Catch: java.lang.Throwable -> L4f
            r0.append(r10)     // Catch: java.lang.Throwable -> L4f
            r0.toString()     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L4e
            r9.close()
        L4e:
            return r1
        L4f:
            r10 = move-exception
            r1 = r9
        L51:
            if (r1 == 0) goto L56
            r1.close()
        L56:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpkb.a(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
