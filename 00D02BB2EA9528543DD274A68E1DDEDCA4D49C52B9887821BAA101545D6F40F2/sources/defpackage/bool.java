package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bool  reason: default package */
/* loaded from: classes3.dex */
public final class bool implements Runnable {
    final /* synthetic */ boou a;
    final /* synthetic */ boon b;

    public bool(boon boonVar, boou boouVar) {
        this.b = boonVar;
        this.a = boouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a();
        if (!this.b.c.contains(this.a) || this.a.h().booleanValue()) {
            if (this.b.c.contains(this.a) || !this.a.h().booleanValue()) {
                boom boomVar = this.b.e;
                if (boomVar == null) {
                    return;
                }
                boomVar.r(this.a);
                return;
            }
            this.b.c.add(this.a);
            boom boomVar2 = this.b.e;
            if (boomVar2 == null) {
                return;
            }
            boomVar2.q(this.a);
            return;
        }
        this.b.b(this.a);
    }
}
