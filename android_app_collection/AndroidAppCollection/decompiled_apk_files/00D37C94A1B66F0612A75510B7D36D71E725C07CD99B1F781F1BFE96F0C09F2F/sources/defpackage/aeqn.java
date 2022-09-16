package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aeqn  reason: default package */
/* loaded from: classes.dex */
public final class aeqn implements aeqf {
    public final akqq a;
    public final yqw b;
    public final ScheduledExecutorService c;
    public final afvn d;
    public final acrr e;

    public aeqn(akqq akqqVar, yqw yqwVar, ScheduledExecutorService scheduledExecutorService, afvn afvnVar, acrr acrrVar) {
        this.a = akqqVar;
        this.b = yqwVar;
        this.c = scheduledExecutorService;
        this.d = afvnVar;
        this.e = acrrVar;
    }

    public static akqe b(String str, afvn afvnVar) {
        if (afvnVar.t()) {
            return akqe.a(afvnVar.c().d(), "medialib_", str);
        }
        return akqe.b("medialib_", str);
    }

    public static void c(String str, acrr acrrVar) {
        aopa createBuilder = avgf.a.createBuilder();
        createBuilder.copyOnWrite();
        avgf avgfVar = (avgf) createBuilder.instance;
        avgfVar.d = 1;
        avgfVar.b |= 2;
        createBuilder.copyOnWrite();
        avgf avgfVar2 = (avgf) createBuilder.instance;
        avgfVar2.c = 1;
        avgfVar2.b = 1 | avgfVar2.b;
        createBuilder.copyOnWrite();
        avgf avgfVar3 = (avgf) createBuilder.instance;
        str.getClass();
        avgfVar3.b |= 4;
        avgfVar3.e = str;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dI((avgf) createBuilder.mo39build());
        acrrVar.c((arrh) a.mo39build());
    }

    @Override // defpackage.aeqf
    public final void a(String str, azpm azpmVar) {
        anlz.A(this.a.a(b(str, this.d), aeqi.a), new aeqj(this, azpmVar, str), this.c);
    }
}
