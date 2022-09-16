package defpackage;
/* compiled from: PG */
/* renamed from: akvo  reason: default package */
/* loaded from: classes.dex */
public final class akvo implements vpm {
    private final acrr a;

    public akvo(acrr acrrVar) {
        this.a = acrrVar;
    }

    @Override // defpackage.vpm
    public final void a(vpl vplVar) {
        amoh d = vplVar.d();
        if (d.b.size() != 0) {
            aopu<aoel> aopuVar = d.b;
            if (aopuVar.isEmpty()) {
                return;
            }
            for (aoel aoelVar : aopuVar) {
                aopa createBuilder = avai.a.createBuilder();
                aoob byteString = aoelVar.toByteString();
                createBuilder.copyOnWrite();
                avai avaiVar = (avai) createBuilder.instance;
                avaiVar.b |= 1;
                avaiVar.c = byteString;
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).dG((avai) createBuilder.mo39build());
                this.a.e((arrh) a.mo39build());
            }
        }
    }
}
