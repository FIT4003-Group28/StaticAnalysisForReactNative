package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aeqm  reason: default package */
/* loaded from: classes.dex */
public final class aeqm extends yua {
    public final String a;
    public final azpm b;
    public final acrr c;
    private final akqq k;
    private final ScheduledExecutorService l;
    private final afvn m;

    public aeqm(String str, akqq akqqVar, ScheduledExecutorService scheduledExecutorService, afvn afvnVar, azpm azpmVar, acrr acrrVar) {
        super(1, str, null);
        this.a = str;
        this.k = akqqVar;
        this.l = scheduledExecutorService;
        this.m = afvnVar;
        this.b = azpmVar;
        this.c = acrrVar;
    }

    @Override // defpackage.yua
    public final cff d(cff cffVar) {
        aeqn.c(this.a, this.c);
        return cffVar;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        if (cewVar.a != 200) {
            aeqn.c(this.a, this.c);
            return cfb.a(new cev());
        }
        anlz.A(this.k.b(aeqn.b(this.a, this.m), cewVar, aeqk.a), new aeql(this, cewVar), this.l);
        return cfb.b(null, new cer());
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        Void r1 = (Void) obj;
    }
}
