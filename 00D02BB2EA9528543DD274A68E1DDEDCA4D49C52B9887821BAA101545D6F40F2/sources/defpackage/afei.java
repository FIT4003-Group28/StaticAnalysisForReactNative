package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: afei  reason: default package */
/* loaded from: classes.dex */
public final class afei {
    public final cqat a;
    public final File b;
    public final String c;

    public afei(Context context, cqat cqatVar) {
        this.a = cqatVar;
        this.b = new File(context.getFilesDir(), "launch_restrictor");
        this.c = bvow.c(context);
    }

    public final boolean a() {
        return this.c.endsWith(":incognito_restart_process");
    }

    public final void b() {
        c(this.a.b() + 30000);
    }

    public final void c(long j) {
        try {
            this.b.createNewFile();
            this.b.setLastModified(j);
        } catch (IOException e) {
            bvoo.j(e);
        }
    }
}
