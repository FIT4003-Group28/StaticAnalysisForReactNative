package defpackage;

import android.content.Intent;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvlh  reason: default package */
/* loaded from: classes5.dex */
public final class cvlh implements cvkt {
    private final cvpc a;
    private final cvkf b;
    private final cvkk c;
    private final Set<cvpv> d;

    public cvlh(cvpc cvpcVar, cvkf cvkfVar, cvkk cvkkVar, Set<cvpv> set) {
        this.a = cvpcVar;
        this.b = cvkfVar;
        this.c = cvkkVar;
        this.d = set;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd A[LOOP:0: B:44:0x00d7->B:46:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.cvkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r11, defpackage.cvix r12, long r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvlh.b(android.content.Intent, cvix, long):void");
    }
}
