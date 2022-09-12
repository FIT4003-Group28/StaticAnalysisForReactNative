package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: btoy  reason: default package */
/* loaded from: classes4.dex */
public final class btoy {
    public final Intent a;

    public btoy(Intent intent) {
        c(intent, "present");
        c(intent, "plugged");
        c(intent, "level");
        c(intent, "scale");
        c(intent, "status");
        this.a = intent;
    }

    private static void c(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        dbsk.j(extras.containsKey(str), "Required extra %s missing from %s", str, extras);
    }

    public final boolean a() {
        return this.a.getBooleanExtra("present", false);
    }

    public final boolean b() {
        return this.a.getIntExtra("plugged", 0) != 0;
    }

    public final String toString() {
        return this.a.getExtras().toString();
    }
}
