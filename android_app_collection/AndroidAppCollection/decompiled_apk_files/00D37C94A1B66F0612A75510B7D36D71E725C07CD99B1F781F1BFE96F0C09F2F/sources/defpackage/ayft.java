package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayft  reason: default package */
/* loaded from: classes2.dex */
public final class ayft implements Runnable {
    final /* synthetic */ ayfv a;

    public ayft(ayfv ayfvVar) {
        this.a = ayfvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqxo.z(((ayiq) this.a.f).a.A.get(), "Channel must have been shut down");
    }
}
