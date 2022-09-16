package defpackage;
/* compiled from: PG */
/* renamed from: vyh  reason: default package */
/* loaded from: classes4.dex */
public final class vyh {
    public final aafo a;
    public final aatp b;
    public final yzj c;
    private final yni d;
    private final acrr e;

    public vyh(aafo aafoVar, aatp aatpVar, yzj yzjVar, yni yniVar, acrr acrrVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        aatpVar.getClass();
        this.b = aatpVar;
        yzjVar.getClass();
        this.c = yzjVar;
        yniVar.getClass();
        this.d = yniVar;
        acrrVar.getClass();
        this.e = acrrVar;
    }

    public final void a(arms armsVar, int i, Runnable runnable, Runnable runnable2) {
        if ((armsVar.b & 8) != 0) {
            armr armrVar = armsVar.f;
            if (armrVar == null) {
                armrVar = armr.a;
            }
            arag aragVar = armrVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            this.c.d(ajgl.b(aragVar).toString());
            if (runnable2 == null) {
                return;
            }
            runnable2.run();
            return;
        }
        if (armsVar.g.size() > 0) {
            this.a.b(armsVar.g);
        }
        aopa createBuilder = awld.a.createBuilder();
        createBuilder.copyOnWrite();
        awld awldVar = (awld) createBuilder.instance;
        awldVar.c = i - 1;
        awldVar.b |= 1;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).eC((awld) createBuilder.mo39build());
        this.e.c((arrh) a.mo39build());
        runnable.run();
        this.d.d(new vxm(true));
    }
}
