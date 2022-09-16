package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: vkj  reason: default package */
/* loaded from: classes4.dex */
public final class vkj implements vja {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    private vkj() {
    }

    public static vkj b() {
        return new vkj();
    }

    @Override // defpackage.vja
    /* renamed from: c */
    public final File a(viz vizVar) {
        if (this.a) {
            if (!vizVar.a()) {
                return vizVar.b.c(vizVar.f);
            }
            throw new vjw("Short circuit would skip transforms.");
        }
        vju a = vju.a(vkk.b().a(vizVar));
        try {
            Closeable closeable = a.a;
            if (closeable instanceof vjm) {
                File c = ((vjm) closeable).c();
                a.close();
                return c;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d() {
        this.a = true;
    }
}
