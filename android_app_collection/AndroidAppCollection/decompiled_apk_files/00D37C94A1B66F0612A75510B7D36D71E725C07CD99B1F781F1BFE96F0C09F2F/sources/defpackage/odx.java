package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: odx  reason: default package */
/* loaded from: classes3.dex */
public final class odx implements ajql {
    aika a;
    final /* synthetic */ ody b;

    public odx(ody odyVar) {
        this.b = odyVar;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        f();
    }

    public final void f() {
        aika aikaVar = this.a;
        if (aikaVar == null || !aikaVar.c(aika.VIDEO_REQUESTED)) {
            return;
        }
        ody odyVar = this.b;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.b.a.size()) {
                break;
            } else if (this.b.a.get(i) instanceof fkh) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        odyVar.d(!z);
    }

    @Override // defpackage.ajql
    public final void pi() {
        f();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        f();
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        f();
    }
}
