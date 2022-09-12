package defpackage;

import java.lang.Thread;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: cwxt  reason: default package */
/* loaded from: classes5.dex */
final class cwxt implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    final /* synthetic */ cwxu b;

    public cwxt(cwxu cwxuVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = cwxuVar;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        try {
            cwxu cwxuVar = this.b;
            String name = thread.getName();
            String name2 = th.getClass().getName();
            for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                name2 = cause.getClass().getName();
            }
            eabd d = cwxuVar.d();
            if (d.c) {
                d.bF();
                d.c = false;
            }
            eabf eabfVar = (eabf) d.b;
            eabf eabfVar2 = eabf.k;
            name.getClass();
            eabfVar.a |= 8;
            eabfVar.e = name;
            Class<?> cls = th.getClass();
            if (cls == OutOfMemoryError.class) {
                i = 3;
            } else if (NullPointerException.class.isAssignableFrom(cls)) {
                i = 2;
            } else if (RuntimeException.class.isAssignableFrom(cls)) {
                i = 4;
            } else {
                i = Error.class.isAssignableFrom(cls) ? 5 : 1;
            }
            if (d.c) {
                d.bF();
                d.c = false;
            }
            eabf eabfVar3 = (eabf) d.b;
            eabfVar3.f = i - 1;
            int i2 = eabfVar3.a | 16;
            eabfVar3.a = i2;
            name2.getClass();
            eabfVar3.a = i2 | 128;
            eabfVar3.i = name2;
            ddzb a = deag.a(th);
            if (d.c) {
                d.bF();
                d.c = false;
            }
            eabf eabfVar4 = (eabf) d.b;
            ddzc bK = a.bK();
            bK.getClass();
            eabfVar4.j = bK;
            eabfVar4.a |= 256;
            try {
                Long a2 = deka.a(dejz.a(th));
                if (a2 != null) {
                    long longValue = a2.longValue();
                    if (d.c) {
                        d.bF();
                        d.c = false;
                    }
                    eabf eabfVar5 = (eabf) d.b;
                    eabfVar5.a |= 32;
                    eabfVar5.g = longValue;
                }
                StringBuilder sb = new StringBuilder();
                czhb.a(th, sb, new HashSet(), null);
                Long a3 = deka.a(sb.toString());
                if (a3 != null) {
                    long longValue2 = a3.longValue();
                    if (d.c) {
                        d.bF();
                        d.c = false;
                    }
                    eabf eabfVar6 = (eabf) d.b;
                    eabfVar6.a |= 64;
                    eabfVar6.h = longValue2;
                }
            } catch (RuntimeException unused) {
            }
            cwxuVar.e(d.bK());
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Exception unused2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
            if (uncaughtExceptionHandler2 == null) {
                return;
            }
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
