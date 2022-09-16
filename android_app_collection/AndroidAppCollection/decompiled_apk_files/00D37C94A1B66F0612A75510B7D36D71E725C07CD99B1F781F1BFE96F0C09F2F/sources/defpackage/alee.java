package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: alee  reason: default package */
/* loaded from: classes.dex */
public final class alee extends aleo {
    private final afvn a;
    private final abbr b;
    private final akze c;
    private final albs e;
    private final asfs f;

    public alee(aadd aaddVar, afvn afvnVar, abbr abbrVar, albs albsVar, akze akzeVar, asfs asfsVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_CREATE_REEL_ITEMS, albfVar, akzeVar, alhtVar);
        this.a = afvnVar;
        this.b = abbrVar;
        this.c = akzeVar;
        this.e = albsVar;
        this.f = asfsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.e;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.M;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        char c;
        alct c2;
        int bJ;
        afvm d = this.a.d(alcwVar.e);
        if (d == null) {
            throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aopa createBuilder = arqg.a.createBuilder();
        String str2 = alcwVar.W;
        createBuilder.copyOnWrite();
        arqg arqgVar = (arqg) createBuilder.instance;
        str2.getClass();
        arqgVar.b |= 2;
        arqgVar.d = str2;
        aopu aopuVar = alcwVar.N;
        createBuilder.copyOnWrite();
        arqg arqgVar2 = (arqg) createBuilder.instance;
        aopu aopuVar2 = arqgVar2.e;
        if (!aopuVar2.c()) {
            arqgVar2.e = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) aopuVar, (List) arqgVar2.e);
        if (!alcwVar.Q.isEmpty()) {
            aopa createBuilder2 = arqf.a.createBuilder();
            String str3 = alcwVar.Q;
            createBuilder2.copyOnWrite();
            arqf arqfVar = (arqf) createBuilder2.instance;
            str3.getClass();
            arqfVar.b |= 1;
            arqfVar.c = str3;
            createBuilder.copyOnWrite();
            arqg arqgVar3 = (arqg) createBuilder.instance;
            arqf arqfVar2 = (arqf) createBuilder2.mo39build();
            arqfVar2.getClass();
            arqgVar3.g = arqfVar2;
            arqgVar3.b |= 8;
        }
        if ((alcwVar.c & 512) != 0) {
            alcr alcrVar = alcwVar.P;
            if (alcrVar == null) {
                alcrVar = alcr.a;
            }
            if (!alcrVar.b.isEmpty()) {
                aopa createBuilder3 = arqj.a.createBuilder();
                alcr alcrVar2 = alcwVar.P;
                if (alcrVar2 == null) {
                    alcrVar2 = alcr.a;
                }
                String str4 = alcrVar2.b;
                createBuilder3.copyOnWrite();
                arqj arqjVar = (arqj) createBuilder3.instance;
                str4.getClass();
                arqjVar.b |= 1;
                arqjVar.c = str4;
                createBuilder.copyOnWrite();
                arqg arqgVar4 = (arqg) createBuilder.instance;
                arqj arqjVar2 = (arqj) createBuilder3.mo39build();
                arqjVar2.getClass();
                arqgVar4.f = arqjVar2;
                arqgVar4.b |= 4;
            }
        }
        avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        abbr abbrVar = this.b;
        aarl aarlVar = abbrVar.a;
        abbo abboVar = new abbo(abbrVar.e, d, createBuilder);
        abboVar.i = aadf.b(abbrVar.g);
        abboVar.i();
        arqh arqhVar = (arqh) aarlVar.d(abboVar);
        int bM = awwc.bM(arqhVar.c);
        if (bM == 0) {
            bM = 1;
        }
        switch (bM - 1) {
            case 1:
                c = 2;
                break;
            case 2:
                avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 3;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 4;
                break;
            default:
                this.c.a("CreateReelItemsTask Unknown createReelItems response status.");
                avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 4;
                break;
        }
        ArrayList arrayList = new ArrayList();
        for (arqi arqiVar : arqhVar.d) {
            int bJ2 = awwc.bJ(arqiVar.c);
            if ((bJ2 != 0 && bJ2 == 2) || ((bJ = awwc.bJ(arqiVar.c)) != 0 && bJ == 4)) {
                arrayList.add(arqiVar.b);
            }
        }
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (c == 2) {
            c2 = this.d.e();
        } else if (c != 3) {
            c2 = this.d.c(avunVar);
        } else {
            alht alhtVar = this.d;
            alct alctVar = alcwVar.M;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            c2 = alhtVar.d(avunVar, alctVar, this.f.l, this.c);
        }
        return anlz.q(u(c2, true, new ayqb() { // from class: aled
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String[] strArr2 = strArr;
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                alcw alcwVar2 = alcw.a;
                ((alcw) aopaVar.instance).O = aopi.emptyProtobufList();
                List asList = Arrays.asList(strArr2);
                aopaVar.copyOnWrite();
                alcw alcwVar3 = (alcw) aopaVar.instance;
                aopu aopuVar3 = alcwVar3.O;
                if (!aopuVar3.c()) {
                    alcwVar3.O = aopi.mutableCopy(aopuVar3);
                }
                aonk.addAll((Iterable) asList, (List) alcwVar3.O);
            }
        }));
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.l;
    }

    @Override // defpackage.algt
    public final String f() {
        return "CreateReelItemsTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        return (alcwVar.c & 32768) != 0;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            akze akzeVar = this.c;
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar.c("CreateReelItemsTask InnerTube service failed for", th, a);
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.M;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.f.l, this.c), z);
        }
        return super.k(th, alcwVar, z);
    }
}
