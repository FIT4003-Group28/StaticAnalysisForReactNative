package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: tts  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tts implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqm b;
    public final /* synthetic */ tqv c;
    private final /* synthetic */ int d;

    public /* synthetic */ tts(tuk tukVar, tqm tqmVar, tqv tqvVar) {
        this.a = tukVar;
        this.b = tqmVar;
        this.c = tqvVar;
    }

    public /* synthetic */ tts(tuk tukVar, tqm tqmVar, tqv tqvVar, int i) {
        this.d = i;
        this.a = tukVar;
        this.b = tqmVar;
        this.c = tqvVar;
    }

    public /* synthetic */ tts(tuk tukVar, tqv tqvVar, tqm tqmVar, int i) {
        this.d = i;
        this.a = tukVar;
        this.c = tqvVar;
        this.b = tqmVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int a;
        ankt anktVar;
        boolean z = false;
        switch (this.d) {
            case 0:
                tuk tukVar = this.a;
                tqm tqmVar = this.b;
                tqv tqvVar = this.c;
                Void r9 = (Void) obj;
                if (!tukVar.j.h() || (a = uaw.a(tqmVar.q)) == 0 || a == 1) {
                    return anlz.q(true);
                }
                int i = tqmVar.q;
                String str = tqvVar.c;
                return ((tzx) ((amqo) tukVar.j.c()).get()).a();
            case 1:
                tuk tukVar2 = this.a;
                tqm tqmVar2 = this.b;
                tqv tqvVar2 = this.c;
                tqm tqmVar3 = (tqm) obj;
                if (tqmVar3 != null) {
                    return anlz.q(Boolean.valueOf(tuk.p(tqmVar2, tqmVar3)));
                }
                aopa mo52toBuilder = tqvVar2.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                tqv tqvVar3 = (tqv) mo52toBuilder.instance;
                tqvVar3.b |= 8;
                tqvVar3.f = true;
                return anii.i(tukVar2.d.g((tqv) mo52toBuilder.mo39build()), new ttf(tqmVar2), tukVar2.h);
            case 2:
                tuk tukVar3 = this.a;
                tqm tqmVar4 = this.b;
                tqv tqvVar4 = this.c;
                tui tuiVar = (tui) obj;
                if (tuiVar == tui.FAILED) {
                    tuk.u(1008, tukVar3.b, tqmVar4);
                    return anlz.q(tui.FAILED);
                } else if (tuiVar == tui.PENDING) {
                    tuk.u(1007, tukVar3.b, tqmVar4);
                    return anlz.q(tui.PENDING);
                } else {
                    if (tuiVar == tui.DOWNLOADED) {
                        z = true;
                    }
                    aqxo.p(z);
                    if (!tzc.k(tqmVar4)) {
                        anktVar = ankq.a;
                    } else {
                        anktVar = tukVar3.c(tqmVar4);
                    }
                    return anii.i(anktVar, new tts(tukVar3, tqmVar4, tqvVar4, 3), tukVar3.h);
                }
            case 3:
                final tuk tukVar4 = this.a;
                tqm tqmVar5 = this.b;
                final tqv tqvVar5 = this.c;
                Void r92 = (Void) obj;
                long c = tukVar4.f.c();
                tql tqlVar = tqmVar5.c;
                if (tqlVar == null) {
                    tqlVar = tql.a;
                }
                aopa mo52toBuilder2 = tqlVar.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                tql tqlVar2 = (tql) mo52toBuilder2.instance;
                tqlVar2.b |= 4;
                tqlVar2.e = c;
                tql tqlVar3 = (tql) mo52toBuilder2.mo39build();
                aopa mo52toBuilder3 = tqmVar5.mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                tqm tqmVar6 = (tqm) mo52toBuilder3.instance;
                tqlVar3.getClass();
                tqmVar6.c = tqlVar3;
                tqmVar6.b |= 1;
                final tqm tqmVar7 = (tqm) mo52toBuilder3.mo39build();
                aopa mo52toBuilder4 = tqvVar5.mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                tqv tqvVar6 = (tqv) mo52toBuilder4.instance;
                tqvVar6.b |= 8;
                tqvVar6.f = true;
                final tqv tqvVar7 = (tqv) mo52toBuilder4.mo39build();
                return anii.i(tukVar4.d.g(tqvVar7), new anir() { // from class: tty
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        final tuk tukVar5 = tuk.this;
                        tqv tqvVar8 = tqvVar7;
                        final tqm tqmVar8 = tqmVar7;
                        final tqv tqvVar9 = tqvVar5;
                        final tqm tqmVar9 = (tqm) obj2;
                        return anii.i(tukVar5.d.l(tqvVar8, tqmVar8), new anir() { // from class: ttc
                            @Override // defpackage.anir
                            public final ankt a(Object obj3) {
                                final tuk tukVar6 = tuk.this;
                                tqv tqvVar10 = tqvVar9;
                                final tqm tqmVar10 = tqmVar9;
                                final tqm tqmVar11 = tqmVar8;
                                if (!((Boolean) obj3).booleanValue()) {
                                    tukVar6.b.g(1036);
                                    return anlz.q(tui.FAILED);
                                }
                                anlz.q(true);
                                aopa mo52toBuilder5 = tqvVar10.mo52toBuilder();
                                mo52toBuilder5.copyOnWrite();
                                tqv tqvVar11 = (tqv) mo52toBuilder5.instance;
                                tqvVar11.b |= 8;
                                tqvVar11.f = false;
                                return anii.i(tukVar6.d.i((tqv) mo52toBuilder5.mo39build()), new anir() { // from class: ttq
                                    @Override // defpackage.anir
                                    public final ankt a(Object obj4) {
                                        tuk tukVar7 = tuk.this;
                                        tqm tqmVar12 = tqmVar10;
                                        tqm tqmVar13 = tqmVar11;
                                        if (!((Boolean) obj4).booleanValue()) {
                                            tukVar7.b.g(1036);
                                        }
                                        ankt anktVar2 = ankq.a;
                                        if (tqmVar12 != null) {
                                            anktVar2 = anii.h(tukVar7.d.a(tqmVar12), new ttr(tukVar7), tukVar7.h);
                                        }
                                        return anii.i(anktVar2, new ttm(tukVar7, tqmVar13, 3), tukVar7.h);
                                    }
                                }, tukVar6.h);
                            }
                        }, tukVar5.h);
                    }
                }, tukVar4.h);
            case 4:
                tuk tukVar5 = this.a;
                tqv tqvVar8 = this.c;
                tqm tqmVar8 = this.b;
                tqw tqwVar = (tqw) obj;
                if (tqwVar == null) {
                    tqwVar = tqw.a;
                }
                if (!tqwVar.b) {
                    String str2 = tqvVar8.c;
                    String str3 = tqvVar8.d;
                    int i2 = typ.a;
                    tuk.u(1055, tukVar5.b, tqmVar8);
                    throw new tsp();
                }
                return anlz.q(null);
            case 5:
                tuk tukVar6 = this.a;
                tqv tqvVar9 = this.c;
                tqm tqmVar9 = this.b;
                Boolean bool = (Boolean) obj;
                aopa mo52toBuilder5 = tqvVar9.mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                tqv tqvVar10 = (tqv) mo52toBuilder5.instance;
                tqvVar10.b |= 8;
                tqvVar10.f = false;
                return anii.i(tukVar6.d.g((tqv) mo52toBuilder5.mo39build()), new tts(tukVar6, tqmVar9, tqvVar9, 1), tukVar6.h);
            case 6:
                tuk tukVar7 = this.a;
                tqv tqvVar11 = this.c;
                tqm tqmVar10 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    aopa mo52toBuilder6 = tqvVar11.mo52toBuilder();
                    mo52toBuilder6.copyOnWrite();
                    tqv tqvVar12 = (tqv) mo52toBuilder6.instance;
                    tqvVar12.b |= 8;
                    tqvVar12.f = false;
                    return amnt.f(anii.i(tukVar7.d.l((tqv) mo52toBuilder6.mo39build(), tqmVar10), new tth(tukVar7, 3), tukVar7.h), new tts(tukVar7, tqmVar10, tqvVar11), tukVar7.h);
                }
                throw new IOException("Subscribing to group failed");
            default:
                tuk tukVar8 = this.a;
                tqv tqvVar13 = this.c;
                tqm tqmVar11 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    aopa mo52toBuilder7 = tqvVar13.mo52toBuilder();
                    mo52toBuilder7.copyOnWrite();
                    tqv tqvVar14 = (tqv) mo52toBuilder7.instance;
                    tqvVar14.b |= 8;
                    tqvVar14.f = false;
                    return amnt.f(anii.i(tukVar8.d.g((tqv) mo52toBuilder7.mo39build()), new ttm(tukVar8, tqmVar11, 1), tukVar8.h), new ttv(tukVar8, tqvVar13, 1), tukVar8.h);
                }
                String str4 = tqvVar13.c;
                int i3 = typ.a;
                return anlz.q(false);
        }
    }
}
