package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nvj  reason: default package */
/* loaded from: classes3.dex */
public final class nvj implements Runnable {
    final /* synthetic */ nvp a;

    public nvj(nvp nvpVar) {
        this.a = nvpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.setSelected(true);
    }
}
