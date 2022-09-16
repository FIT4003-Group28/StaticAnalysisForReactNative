package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xya */
/* loaded from: classes4.dex */
public final class xya {
    public String a;
    public String b;
    public final Executor c;
    public final akys d;
    public final afvn e;
    public final xxz f;
    public ankt g;
    public boolean h = false;
    public xux i;

    public xya(String str, afvn afvnVar, Executor executor, akys akysVar) {
        this.a = str;
        this.c = executor;
        this.d = akysVar;
        afvnVar.getClass();
        this.e = afvnVar;
        this.f = new xxz(this);
    }

    public static /* synthetic */ void a(Throwable th) {
        zep.d("Error occurred getting resumable uploads", th);
    }

    public static /* bridge */ /* synthetic */ void c(xya xyaVar) {
        xyaVar.a = null;
    }

    public final void b() {
        try {
            this.h = false;
            ankt anktVar = this.g;
            if (anktVar != null && !anktVar.isDone()) {
                this.g.cancel(true);
            }
            this.d.e(this.f);
        } catch (IllegalStateException e) {
            zep.d("Error releasing VideoIdHelper", e);
        }
    }
}
