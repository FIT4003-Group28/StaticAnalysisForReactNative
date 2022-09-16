package defpackage;
/* compiled from: PG */
/* renamed from: ajdm  reason: default package */
/* loaded from: classes.dex */
final class ajdm implements ajea {
    final /* synthetic */ ajdn a;

    public ajdm(ajdn ajdnVar) {
        this.a = ajdnVar;
    }

    @Override // defpackage.ajea
    public final void a(aaww aawwVar, aopa aopaVar) {
        synchronized (this.a) {
            ajdn ajdnVar = this.a;
            int i = ajdnVar.b;
            if ((i == 3 || i == 4) && ajdnVar.a.h()) {
                aopaVar.copyOnWrite();
                arze arzeVar = (arze) aopaVar.instance;
                arze arzeVar2 = arze.a;
                arzeVar.j = (apih) this.a.a.c();
                arzeVar.b |= 256;
                this.a.b = 4;
            }
        }
    }
}
