package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bqyn  reason: default package */
/* loaded from: classes4.dex */
public final class bqyn {
    private static final long d = TimeUnit.SECONDS.toMillis(15);
    public final awcb a;
    public final cqat b;
    private final bvrb e;
    private long f = 0;
    public boolean c = false;

    public bqyn(awcb awcbVar, bvrb bvrbVar, cqat cqatVar) {
        this.a = awcbVar;
        this.e = bvrbVar;
        this.b = cqatVar;
    }

    public final synchronized void a() {
        this.a.Qu(new dbty(this) { // from class: bqyk
            private final bqyn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bqyn bqynVar = this.a;
                bqynVar.a.b(TimeUnit.MILLISECONDS.toSeconds(bqynVar.b.b()));
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.c = false;
        this.f = this.b.e();
        this.a.Qu(new dbty(this) { // from class: bqyl
            private final bqyn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bqyn bqynVar = this.a;
                bqynVar.a.c(TimeUnit.MILLISECONDS.toSeconds(bqynVar.b.b()));
                return null;
            }
        });
    }

    public final synchronized void c() {
        if (this.c) {
            return;
        }
        long e = (this.f + d) - this.b.e();
        if (e < 0) {
            e = 0;
        }
        this.c = true;
        this.e.a(new bqym(this), bvrj.BACKGROUND_THREADPOOL, e);
    }
}
