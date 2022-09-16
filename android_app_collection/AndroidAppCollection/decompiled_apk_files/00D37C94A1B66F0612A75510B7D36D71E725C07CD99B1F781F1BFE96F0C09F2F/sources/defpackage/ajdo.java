package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajdo  reason: default package */
/* loaded from: classes.dex */
public final class ajdo implements ajea {
    final /* synthetic */ String a;
    final /* synthetic */ ajdp b;

    public ajdo(ajdp ajdpVar, String str) {
        this.b = ajdpVar;
        this.a = str;
    }

    @Override // defpackage.ajea
    public final void a(aaww aawwVar, aopa aopaVar) {
        aawwVar.k = this.a;
        String str = this.b.a;
        str.getClass();
        aopaVar.copyOnWrite();
        arze arzeVar = (arze) aopaVar.instance;
        arze arzeVar2 = arze.a;
        arzeVar.b |= 4;
        arzeVar.e = str;
    }
}
