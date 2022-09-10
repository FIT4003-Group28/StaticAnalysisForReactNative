package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yab  reason: default package */
/* loaded from: classes7.dex */
public final class yab implements Runnable {
    final /* synthetic */ akqq a;
    final /* synthetic */ yac b;

    public yab(yac yacVar, akqq akqqVar) {
        this.b = yacVar;
        this.a = akqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            vtg vtgVar = this.b.a;
            jjn jjnVar = jjn.COLLAPSED;
            akyc i = akyt.i(this.a, 16.0f);
            if (vtgVar.b.l().L() == jjnVar) {
                vtgVar.a.p(i);
                vtgVar.c = null;
                return;
            }
            vtgVar.c = i;
            vtgVar.b.B(jjnVar);
        }
    }
}
