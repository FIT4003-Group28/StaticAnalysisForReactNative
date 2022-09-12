package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aued  reason: default package */
/* loaded from: classes2.dex */
public final class aued {
    private static final bvrj a = bvrj.NAVIGATION_INTERNAL;
    private final Application b;
    private final bvrb c;
    @dzsi
    private bvqm d;
    private int e;

    public aued(Application application, bvrb bvrbVar) {
        this.b = application;
        this.c = bvrbVar;
    }

    public final synchronized void a() {
        if (this.d == null) {
            this.d = bvqm.a(this.b, a, this.c);
        }
        this.e++;
    }

    public final synchronized void b() {
        bvqm bvqmVar;
        int i = this.e - 1;
        this.e = i;
        if (i != 0 || (bvqmVar = this.d) == null) {
            return;
        }
        bvqmVar.quit();
        this.d = null;
    }
}
