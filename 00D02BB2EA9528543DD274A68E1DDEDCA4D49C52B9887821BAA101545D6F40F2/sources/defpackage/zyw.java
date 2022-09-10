package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zyw  reason: default package */
/* loaded from: classes7.dex */
public final class zyw implements Runnable {
    final /* synthetic */ zyy a;

    public zyw(zyy zyyVar) {
        this.a = zyyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akqq a = this.a.af.a();
        if (a != null) {
            this.a.aj.g(a);
        }
        this.a.ae.b(this);
    }
}
