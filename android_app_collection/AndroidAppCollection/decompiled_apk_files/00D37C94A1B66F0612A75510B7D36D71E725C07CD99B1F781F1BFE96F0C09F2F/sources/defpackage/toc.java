package defpackage;
/* compiled from: PG */
/* renamed from: toc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class toc implements tnp {
    private final /* synthetic */ int h;
    public static final /* synthetic */ toc g = new toc(5);
    public static final /* synthetic */ toc f = new toc(4);
    public static final /* synthetic */ toc e = new toc(3);
    public static final /* synthetic */ toc d = new toc(2);
    public static final /* synthetic */ toc c = new toc(1);
    public static final /* synthetic */ toc b = new toc();

    private /* synthetic */ toc() {
    }

    private /* synthetic */ toc(int i) {
        this.h = i;
    }

    @Override // defpackage.tnp
    public final ankt a(aoqu aoquVar) {
        int i = this.h;
        if (i == 0) {
            final tnr tnrVar = (tnr) aoquVar;
            return anlz.q(new tno() { // from class: tnz
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    tnr tnrVar2 = tnr.this;
                    if ((tnrVar2.b & 1) != 0) {
                        ((aopc) aoqtVar).e(anfb.a, Long.valueOf(tnrVar2.c));
                    }
                }
            });
        } else if (i == 1) {
            final tnf tnfVar = (tnf) aoquVar;
            return anlz.q(new tno() { // from class: tny
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    int i2 = tnf.this.b;
                    ((aopa) aoqtVar).copyOnWrite();
                    anfi anfiVar = (anfi) ((aopc) aoqtVar).instance;
                    anfi anfiVar2 = anfi.a;
                    anfiVar.b |= 2;
                    anfiVar.d = i2;
                }
            });
        } else if (i == 2) {
            final anfi anfiVar = (anfi) aoquVar;
            return anlz.q(new tno() { // from class: toa
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    aopc aopcVar = (aopc) anfi.this.mo52toBuilder();
                    aopcVar.copyOnWrite();
                    anfi anfiVar2 = (anfi) aopcVar.instance;
                    anfiVar2.b &= -2;
                    anfiVar2.c = 0;
                    aopcVar.copyOnWrite();
                    anfi anfiVar3 = (anfi) aopcVar.instance;
                    anfiVar3.b &= -3;
                    anfiVar3.d = -1;
                    aopcVar.copyOnWrite();
                    ((anfi) aopcVar.instance).e = anfi.emptyIntList();
                    aopcVar.copyOnWrite();
                    anfi anfiVar4 = (anfi) aopcVar.instance;
                    anfiVar4.b &= -5;
                    anfiVar4.f = anfi.a.f;
                    aopcVar.copyOnWrite();
                    anfi anfiVar5 = (anfi) aopcVar.instance;
                    anfiVar5.b &= -9;
                    anfiVar5.g = 0;
                    aopcVar.copyOnWrite();
                    anfi anfiVar6 = (anfi) aopcVar.instance;
                    anfiVar6.h = null;
                    anfiVar6.b &= -17;
                    aopcVar.copyOnWrite();
                    anfi anfiVar7 = (anfi) aopcVar.instance;
                    anfiVar7.b &= -33;
                    anfiVar7.i = 0;
                    aopcVar.copyOnWrite();
                    anfi anfiVar8 = (anfi) aopcVar.instance;
                    anfiVar8.b &= -129;
                    anfiVar8.j = -1;
                    aopcVar.copyOnWrite();
                    anfi anfiVar9 = (anfi) aopcVar.instance;
                    anfiVar9.k = null;
                    anfiVar9.b &= -257;
                    ((aopa) aoqtVar).mergeFrom((aopi) ((anfi) aopcVar.mo39build()));
                }
            });
        } else if (i == 3) {
            final aouf aoufVar = (aouf) aoquVar;
            return anlz.q(new tno() { // from class: tob
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    aouf aoufVar2 = aouf.this;
                    ((aopa) aoqtVar).copyOnWrite();
                    anfi anfiVar2 = (anfi) ((aopc) aoqtVar).instance;
                    anfi anfiVar3 = anfi.a;
                    aoufVar2.getClass();
                    anfiVar2.h = aoufVar2;
                    anfiVar2.b |= 16;
                }
            });
        } else if (i == 4) {
            final upo upoVar = (upo) aoquVar;
            return anlz.q(new tno() { // from class: upl
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    upo upoVar2 = upo.this;
                    aopg aopgVar = anff.b;
                    anff anffVar = upoVar2.b;
                    if (anffVar == null) {
                        anffVar = anff.a;
                    }
                    ((aopc) aoqtVar).e(aopgVar, anffVar);
                }
            });
        } else {
            final upp uppVar = (upp) aoquVar;
            return anlz.q(new tno() { // from class: upm
                @Override // defpackage.tno
                public final void a(aoqt aoqtVar) {
                    upp uppVar2 = upp.this;
                    aopg aopgVar = anfg.b;
                    anfg anfgVar = uppVar2.b;
                    if (anfgVar == null) {
                        anfgVar = anfg.a;
                    }
                    ((aopc) aoqtVar).e(aopgVar, anfgVar);
                }
            });
        }
    }
}
