package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pen  reason: default package */
/* loaded from: classes7.dex */
public final class pen extends itb {
    public final dxio<pff> a;
    private final pfc b;
    private final Executor c;

    public pen(pfc pfcVar, dxio<pff> dxioVar, Executor executor) {
        this.b = pfcVar;
        this.a = dxioVar;
        this.c = executor;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (this.b.a()) {
            this.c.execute(new Runnable(this) { // from class: pel
                private final pen a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a().b();
                }
            });
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        if (this.b.a()) {
            this.c.execute(new Runnable(this) { // from class: pem
                private final pen a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a().c();
                }
            });
        }
    }
}
