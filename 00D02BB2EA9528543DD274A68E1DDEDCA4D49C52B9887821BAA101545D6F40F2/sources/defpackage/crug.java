package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: crug  reason: default package */
/* loaded from: classes5.dex */
public final class crug implements crxk {
    public static final Object a = new Object();
    public final ExecutorService b;
    public crwb c;
    public int d;
    private final cruq e;

    public crug(cruq cruqVar, ExecutorService executorService) {
        this.e = cruqVar;
        this.b = executorService;
    }

    @Override // defpackage.crxk
    public final void a(crxl crxlVar, crtx crtxVar) {
        synchronized (a) {
            int i = this.d - 1;
            this.d = i;
            if (i > 0) {
                return;
            }
            ((crun) this.e).a.b();
        }
    }

    @Override // defpackage.crxk
    public final crwb b() {
        return this.c;
    }

    @Override // defpackage.crxk
    public final void c(crua cruaVar) {
    }

    @Override // defpackage.crxk
    public final void d() {
    }
}
