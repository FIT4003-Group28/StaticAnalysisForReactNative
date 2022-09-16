package defpackage;
/* compiled from: PG */
/* renamed from: ajid  reason: default package */
/* loaded from: classes.dex */
public final class ajid implements tec {
    private final acrr a;
    private final ajik b;
    private final boolean c;

    public ajid(acrr acrrVar, ajik ajikVar, ampq ampqVar) {
        this.a = acrrVar;
        this.b = ajikVar;
        this.c = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    @Override // defpackage.tec
    public final void a(int i, String str, String str2) {
        if (i == 29) {
            ajik ajikVar = this.b;
            synchronized (ajikVar.a) {
                for (ajij ajijVar : ajikVar.a) {
                    ajijVar.a();
                }
            }
            if (this.c) {
                return;
            }
            i = 29;
        }
        if (true == amqn.a(str2)) {
            str2 = "Unknown Template";
        }
        aopa createBuilder = aqth.a.createBuilder();
        createBuilder.copyOnWrite();
        aqth aqthVar = (aqth) createBuilder.instance;
        aqthVar.c = i - 1;
        aqthVar.b |= 2;
        createBuilder.copyOnWrite();
        aqth aqthVar2 = (aqth) createBuilder.instance;
        str.getClass();
        aqthVar2.b |= 4;
        aqthVar2.d = str;
        createBuilder.copyOnWrite();
        aqth aqthVar3 = (aqth) createBuilder.instance;
        str2.getClass();
        aqthVar3.b |= 8;
        aqthVar3.e = str2;
        createBuilder.copyOnWrite();
        aqth aqthVar4 = (aqth) createBuilder.instance;
        aqthVar4.b |= 16;
        aqthVar4.f = 0;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cq((aqth) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
    }
}
