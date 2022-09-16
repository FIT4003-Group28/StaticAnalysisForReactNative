package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: anzz  reason: default package */
/* loaded from: classes.dex */
public final class anzz {
    private static anzz c;
    public Boolean a = null;
    public Boolean b = null;

    private anzz() {
    }

    public static synchronized anzz a() {
        anzz anzzVar;
        synchronized (anzz.class) {
            if (c == null) {
                c = new anzz();
            }
            anzzVar = c;
        }
        return anzzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}
