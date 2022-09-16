package defpackage;
/* compiled from: PG */
/* renamed from: agpm  reason: default package */
/* loaded from: classes.dex */
public final class agpm implements agpt {
    private final acrr a;
    private final agvw b;
    private final yrj c;
    private final snc d;
    private final agvq e;
    private final ywa f;
    private final acsf g;

    public agpm(acrr acrrVar, agvw agvwVar, yrj yrjVar, snc sncVar, agvq agvqVar, ywa ywaVar, acsf acsfVar) {
        acrrVar.getClass();
        this.a = acrrVar;
        this.b = agvwVar;
        this.c = yrjVar;
        this.d = sncVar;
        this.e = agvqVar;
        this.f = ywaVar;
        this.g = acsfVar;
    }

    @Override // defpackage.agpt
    public final void a(atqg atqgVar) {
        long c = this.d.c();
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dn(atqgVar);
        this.a.f((arrh) a.mo39build(), c);
    }

    @Override // defpackage.agpt
    public final void b(atrm atrmVar) {
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dl(atrmVar);
        this.a.c((arrh) a.mo39build());
    }

    @Override // defpackage.agpt
    public final void c(atsj atsjVar) {
        int ai;
        long c = this.d.c();
        zgh.m(atsjVar.d);
        int aj = akel.aj(atsjVar.h);
        boolean z = false;
        aqxo.p(((aj == 0 || aj == 1) && ((ai = akel.ai(atsjVar.g)) == 0 || ai == 1)) ? false : true);
        aopa mo52toBuilder = atsjVar.mo52toBuilder();
        long b = this.b.b();
        mo52toBuilder.copyOnWrite();
        atsj atsjVar2 = (atsj) mo52toBuilder.instance;
        atsjVar2.b |= 512;
        atsjVar2.l = b / 1024;
        aqlv f = this.c.f();
        mo52toBuilder.copyOnWrite();
        atsj atsjVar3 = (atsj) mo52toBuilder.instance;
        atsjVar3.p = f.B;
        atsjVar3.b |= 16384;
        if (this.e.P()) {
            z = this.f.k(this.e.y(this.f));
        }
        mo52toBuilder.copyOnWrite();
        atsj atsjVar4 = (atsj) mo52toBuilder.instance;
        atsjVar4.c |= 16;
        atsjVar4.y = z;
        atsj atsjVar5 = (atsj) mo52toBuilder.mo39build();
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).m92do(atsjVar5);
        this.a.f((arrh) a.mo39build(), c);
        if ((atsjVar5.b & 2) != 0) {
            acsf acsfVar = this.g;
            int aj2 = akel.aj(atsjVar5.h);
            if (aj2 == 0) {
                aj2 = 1;
            }
            acsd acsdVar = new acsd(aj2 - 1, 3);
            aopa createBuilder = aqyu.a.createBuilder();
            aopa createBuilder2 = atsi.a.createBuilder();
            createBuilder2.copyOnWrite();
            atsi atsiVar = (atsi) createBuilder2.instance;
            atsjVar5.getClass();
            atsiVar.c = atsjVar5;
            atsiVar.b = 1 | atsiVar.b;
            createBuilder.copyOnWrite();
            aqyu aqyuVar = (aqyu) createBuilder.instance;
            atsi atsiVar2 = (atsi) createBuilder2.mo39build();
            atsiVar2.getClass();
            aqyuVar.d = atsiVar2;
            aqyuVar.b |= 2;
            acsdVar.a = (aqyu) createBuilder.mo39build();
            acsfVar.d(acsdVar, aqzj.FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED, atsjVar5.e, c);
        }
    }

    @Override // defpackage.agpt
    public final void d(String str, int i, awbs awbsVar, int i2, int i3, boolean z) {
        aopa createBuilder = atrn.a.createBuilder();
        createBuilder.copyOnWrite();
        atrn atrnVar = (atrn) createBuilder.instance;
        str.getClass();
        atrnVar.b |= 1;
        atrnVar.c = str;
        createBuilder.copyOnWrite();
        atrn atrnVar2 = (atrn) createBuilder.instance;
        atrnVar2.d = i - 1;
        atrnVar2.b |= 2;
        createBuilder.copyOnWrite();
        atrn atrnVar3 = (atrn) createBuilder.instance;
        awbsVar.getClass();
        atrnVar3.e = awbsVar;
        atrnVar3.b |= 8;
        createBuilder.copyOnWrite();
        atrn atrnVar4 = (atrn) createBuilder.instance;
        atrnVar4.b |= 32;
        atrnVar4.f = i2;
        createBuilder.copyOnWrite();
        atrn atrnVar5 = (atrn) createBuilder.instance;
        atrnVar5.b |= 64;
        atrnVar5.g = i3;
        createBuilder.copyOnWrite();
        atrn atrnVar6 = (atrn) createBuilder.instance;
        atrnVar6.b |= 256;
        atrnVar6.h = z;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dm((atrn) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
    }

    @Override // defpackage.agpt
    public final void e(ampq ampqVar, int i, int i2) {
        aopa createBuilder = atyz.a.createBuilder();
        if (ampqVar.h()) {
            createBuilder.copyOnWrite();
            atyz atyzVar = (atyz) createBuilder.instance;
            atyzVar.b |= 1;
            atyzVar.c = (String) ampqVar.c();
        }
        createBuilder.copyOnWrite();
        atyz atyzVar2 = (atyz) createBuilder.instance;
        atyzVar2.d = i - 1;
        atyzVar2.b |= 2;
        createBuilder.copyOnWrite();
        atyz atyzVar3 = (atyz) createBuilder.instance;
        atyzVar3.e = i2 - 1;
        atyzVar3.b |= 4;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).du((atyz) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
    }
}
