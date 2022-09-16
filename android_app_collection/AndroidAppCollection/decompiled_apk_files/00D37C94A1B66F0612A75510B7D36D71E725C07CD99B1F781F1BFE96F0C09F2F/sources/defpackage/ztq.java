package defpackage;
/* compiled from: PG */
/* renamed from: ztq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ztq implements Runnable {
    public final /* synthetic */ ztr a;
    private final /* synthetic */ int b;

    public /* synthetic */ ztq(ztr ztrVar) {
        this.a = ztrVar;
    }

    public /* synthetic */ ztq(ztr ztrVar, int i) {
        this.b = i;
        this.a = ztrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hlq hlqVar;
        if (this.b == 0) {
            ztr ztrVar = this.a;
            zub zubVar = ztrVar.c;
            if (zubVar == null) {
                return;
            }
            zubVar.a(Boolean.valueOf(ztrVar.a.f));
            return;
        }
        ztr ztrVar2 = this.a;
        if (ztrVar2.a.c() == null || (hlqVar = ztrVar2.d) == null) {
            return;
        }
        boolean z = false;
        if (ztrVar2.b && ztrVar2.a.c().q()) {
            z = true;
        }
        hlqVar.a(Boolean.valueOf(z));
    }
}
