package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crbq  reason: default package */
/* loaded from: classes5.dex */
public final class crbq {
    final /* synthetic */ crbr a;

    public crbq(crbr crbrVar) {
        this.a = crbrVar;
    }

    public final void a() {
        synchronized (this.a.i) {
            crbr crbrVar = this.a;
            if (crbrVar.k != 0) {
                int streamVolume = crbrVar.d.getStreamVolume(3);
                crbr crbrVar2 = this.a;
                this.a.d.setStreamVolume(3, Math.min(Math.max(streamVolume + crbrVar2.k, 0), crbrVar2.d.getStreamMaxVolume(3)), 1);
                this.a.k = 0;
            }
            crbr crbrVar3 = this.a;
            crbrVar3.m = 1;
            crbrVar3.i.e();
        }
    }
}
