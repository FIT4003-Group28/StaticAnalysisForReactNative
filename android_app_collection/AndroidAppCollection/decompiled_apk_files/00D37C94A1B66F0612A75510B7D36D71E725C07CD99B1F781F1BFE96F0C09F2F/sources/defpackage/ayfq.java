package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfq  reason: default package */
/* loaded from: classes2.dex */
public final class ayfq extends axzl {
    public volatile boolean a;
    public List b = new ArrayList();
    public final axzl c;

    public ayfq(axzl axzlVar, byte[] bArr) {
        this.c = axzlVar;
    }

    private final void q(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.axzl
    public final void a(Status status, ayat ayatVar) {
        q(new ayfo(this, status, ayatVar));
    }

    @Override // defpackage.axzl
    public final void b(ayat ayatVar) {
        if (this.a) {
            this.c.b(ayatVar);
        } else {
            q(new ayfm(this, ayatVar));
        }
    }

    @Override // defpackage.axzl
    public final void c(Object obj) {
        if (this.a) {
            this.c.c(obj);
        } else {
            q(new ayfn(this, obj));
        }
    }

    @Override // defpackage.axzl
    public final void d() {
        if (this.a) {
            this.c.d();
        } else {
            q(new ayfp(this));
        }
    }
}
