package defpackage;
/* compiled from: PG */
/* renamed from: avmp  reason: default package */
/* loaded from: classes3.dex */
final class avmp {
    final avnn a;
    final awmv b = new awmv();
    long c = 0;

    public avmp(dmzj dmzjVar) {
        avnn bZ = avno.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        avno avnoVar = (avno) bZ.b;
        dmzjVar.getClass();
        avnoVar.c = dmzjVar;
        avnoVar.a |= 1;
        this.a = bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        avnn avnnVar = this.a;
        avnp bZ = avnq.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        avnq avnqVar = (avnq) bZ.b;
        avnqVar.a |= 1;
        avnqVar.b = i;
        if (avnnVar.c) {
            avnnVar.bF();
            avnnVar.c = false;
        }
        avno avnoVar = (avno) avnnVar.b;
        avnq bK = bZ.bK();
        avno avnoVar2 = avno.d;
        bK.getClass();
        avnoVar.b();
        avnoVar.b.add(bK);
    }
}
