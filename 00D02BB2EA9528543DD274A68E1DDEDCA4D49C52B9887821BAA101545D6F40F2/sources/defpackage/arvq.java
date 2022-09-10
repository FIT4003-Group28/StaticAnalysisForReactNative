package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: arvq  reason: default package */
/* loaded from: classes2.dex */
public final class arvq implements arxk {
    public final arvw a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final arvo c;
    private final boolean d;

    public arvq(arvo arvoVar, arvw arvwVar, boolean z) {
        this.c = arvoVar;
        this.a = arvwVar;
        this.d = z;
    }

    @Override // defpackage.arxk
    public final void a(arxm arxmVar) {
        if (this.d || this.c.a() || !this.c.b()) {
            if (!this.c.a()) {
                arxmVar.b();
                return;
            }
            this.b.set(false);
            this.a.b(new arvp(this, arxmVar));
            return;
        }
        arxmVar.a();
    }
}
