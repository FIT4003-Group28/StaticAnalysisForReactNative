package defpackage;
/* compiled from: PG */
/* renamed from: alar  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alar implements Runnable {
    public final /* synthetic */ alaz a;
    private final /* synthetic */ int b;

    public /* synthetic */ alar(alaz alazVar, int i) {
        this.b = i;
        this.a = alazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            alaz alazVar = this.a;
            if (alazVar.h) {
                return;
            }
            alazVar.h = true;
            alazVar.g();
        } else if (i == 1) {
            alaz alazVar2 = this.a;
            alazVar2.e.clear();
            alazVar2.g.clear();
            alazVar2.g();
        } else {
            alaz alazVar3 = this.a;
            if (!alazVar3.h) {
                return;
            }
            alazVar3.h = false;
            alazVar3.g();
        }
    }
}
