package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crzr  reason: default package */
/* loaded from: classes.dex */
public final class crzr<T> {
    public final crzp<T> a;
    public volatile boolean b = false;
    private final Executor c;

    public crzr(crzp<T> crzpVar, Executor executor) {
        this.a = crzpVar;
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final crzg<T> crzgVar) {
        this.c.execute(new Runnable(this, crzgVar) { // from class: crzq
            private final crzr a;
            private final crzg b;

            {
                this.a = this;
                this.b = crzgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crzr crzrVar = this.a;
                crzg crzgVar2 = this.b;
                if (!crzrVar.b) {
                    crzgVar2.h(true);
                    try {
                        crzrVar.a.On(crzgVar2);
                    } finally {
                        crzgVar2.h(false);
                    }
                }
            }
        });
    }
}
