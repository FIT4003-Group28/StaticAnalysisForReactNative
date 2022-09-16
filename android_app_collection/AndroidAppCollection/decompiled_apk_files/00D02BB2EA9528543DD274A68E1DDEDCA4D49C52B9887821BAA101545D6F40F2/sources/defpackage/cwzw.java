package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwzw  reason: default package */
/* loaded from: classes5.dex */
public final class cwzw implements degu<cwzf> {
    final /* synthetic */ cwzx a;

    public cwzw(cwzx cwzxVar) {
        this.a = cwzxVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        synchronized (this.a.f) {
            this.a.f.set(cwzf.a);
            this.a.j = null;
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cwzf cwzfVar) {
        cwzf cwzfVar2 = cwzfVar;
        synchronized (this.a.f) {
            this.a.f.set(cwzfVar2);
            this.a.j = null;
        }
    }
}
