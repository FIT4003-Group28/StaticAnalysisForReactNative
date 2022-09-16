package defpackage;

import android.content.Intent;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udv  reason: default package */
/* loaded from: classes4.dex */
public final class udv implements udj {
    private final ufe a;
    private final ucs b;
    private final Set c;
    private final ude d;

    public udv(ufe ufeVar, ucs ucsVar, ude udeVar, Set set) {
        this.a = ufeVar;
        this.b = ucsVar;
        this.d = udeVar;
        this.c = set;
    }

    @Override // defpackage.udj
    public final int a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        if (stringExtra != null) {
            return (stringExtra.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || stringExtra.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) ? -2 : 10;
        }
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[LOOP:0: B:42:0x00b1->B:44:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.udj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r11, defpackage.ubz r12, long r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udv.b(android.content.Intent, ubz, long):void");
    }

    @Override // defpackage.udj
    public final boolean c(Intent intent) {
        return "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }
}
