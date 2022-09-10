package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: czji  reason: default package */
/* loaded from: classes5.dex */
public final class czji implements czie<File> {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    private czji() {
    }

    public static czji b() {
        return new czji();
    }

    @Override // defpackage.czie
    public final /* bridge */ /* synthetic */ File a(czid czidVar) {
        if (this.a) {
            if (!czidVar.b.isEmpty()) {
                throw new cziz("Short circuit would skip transforms.");
            }
            return czidVar.a.h(czidVar.e);
        }
        czix a = czix.a(czjj.c(czidVar));
        try {
            T t = a.a;
            if (!(t instanceof cziq)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File c = ((cziq) t).c();
            a.close();
            return c;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.a = true;
    }
}
