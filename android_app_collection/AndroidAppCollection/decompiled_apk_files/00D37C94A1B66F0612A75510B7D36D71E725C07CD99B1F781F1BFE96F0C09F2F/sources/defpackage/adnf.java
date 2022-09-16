package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adnf  reason: default package */
/* loaded from: classes.dex */
public final class adnf implements Runnable {
    final /* synthetic */ adnh a;

    public adnf(adnh adnhVar) {
        this.a = adnhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adnh adnhVar = this.a;
        adng adngVar = adnhVar.g;
        if (adngVar == null) {
            return;
        }
        int i = adnhVar.i;
        adnhVar.i = i + 1;
        adpl adplVar = (adpl) adngVar;
        if (!adplVar.aH()) {
            return;
        }
        adip adipVar = new adip();
        adipVar.a("senderSentTimeStamp", String.valueOf(adplVar.i.d()));
        adipVar.a("interval", String.valueOf(i));
        adplVar.ay(adil.HEARTBEAT, adipVar);
    }
}
