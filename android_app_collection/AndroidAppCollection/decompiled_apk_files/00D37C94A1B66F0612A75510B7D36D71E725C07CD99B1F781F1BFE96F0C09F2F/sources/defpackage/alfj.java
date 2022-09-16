package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alfj  reason: default package */
/* loaded from: classes.dex */
public final class alfj extends aleo {
    private final afvn a;
    private final asfs b;
    private final aazu c;
    private final akze e;
    private final albs f;

    public alfj(aadd aaddVar, afvn afvnVar, asfs asfsVar, aazu aazuVar, albs albsVar, akze akzeVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_SAVE_METADATA, albfVar, akzeVar, alhtVar);
        this.a = afvnVar;
        this.b = asfsVar;
        this.c = aazuVar;
        this.e = akzeVar;
        this.f = albsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.f;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.aa;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        aopa createBuilder;
        afvm d = this.a.d(alcwVar.e);
        if (d != null) {
            if ((alcwVar.b & 32) != 0) {
                arxl arxlVar = alcwVar.j;
                if (arxlVar == null) {
                    arxlVar = arxl.a;
                }
                createBuilder = arxlVar.mo52toBuilder();
            } else {
                createBuilder = arxl.a.createBuilder();
                aopa createBuilder2 = arxg.a.createBuilder();
                alda aldaVar = alcwVar.i;
                if (aldaVar == null) {
                    aldaVar = alda.a;
                }
                if (!aldaVar.c.isEmpty()) {
                    alda aldaVar2 = alcwVar.i;
                    if (aldaVar2 == null) {
                        aldaVar2 = alda.a;
                    }
                    String str2 = aldaVar2.c;
                    createBuilder2.copyOnWrite();
                    arxg arxgVar = (arxg) createBuilder2.instance;
                    str2.getClass();
                    arxgVar.b |= 1;
                    arxgVar.c = str2;
                    createBuilder.copyOnWrite();
                    arxl arxlVar2 = (arxl) createBuilder.instance;
                    arxg arxgVar2 = (arxg) createBuilder2.mo39build();
                    arxgVar2.getClass();
                    arxlVar2.f = arxgVar2;
                    arxlVar2.b |= 8;
                    aopa createBuilder3 = arwt.a.createBuilder();
                    alda aldaVar3 = alcwVar.i;
                    if (aldaVar3 == null) {
                        aldaVar3 = alda.a;
                    }
                    String str3 = aldaVar3.d;
                    createBuilder3.copyOnWrite();
                    arwt arwtVar = (arwt) createBuilder3.instance;
                    str3.getClass();
                    arwtVar.b |= 1;
                    arwtVar.c = str3;
                    createBuilder.copyOnWrite();
                    arxl arxlVar3 = (arxl) createBuilder.instance;
                    arwt arwtVar2 = (arwt) createBuilder3.mo39build();
                    arwtVar2.getClass();
                    arxlVar3.g = arwtVar2;
                    arxlVar3.b |= 16;
                    aopa createBuilder4 = arxb.a.createBuilder();
                    alcz alczVar = alcz.PRIVATE;
                    alda aldaVar4 = alcwVar.i;
                    if (aldaVar4 == null) {
                        aldaVar4 = alda.a;
                    }
                    alcz a = alcz.a(aldaVar4.e);
                    if (a == null) {
                        a = alcz.PRIVATE;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal == 0) {
                        createBuilder4.copyOnWrite();
                        arxb arxbVar = (arxb) createBuilder4.instance;
                        arxbVar.c = 0;
                        arxbVar.b |= 1;
                    } else if (ordinal == 1) {
                        createBuilder4.copyOnWrite();
                        arxb arxbVar2 = (arxb) createBuilder4.instance;
                        arxbVar2.c = 1;
                        arxbVar2.b |= 1;
                    } else if (ordinal == 2) {
                        createBuilder4.copyOnWrite();
                        arxb arxbVar3 = (arxb) createBuilder4.instance;
                        arxbVar3.c = 2;
                        arxbVar3.b |= 1;
                    }
                    createBuilder.copyOnWrite();
                    arxl arxlVar4 = (arxl) createBuilder.instance;
                    arxb arxbVar4 = (arxb) createBuilder4.mo39build();
                    arxbVar4.getClass();
                    arxlVar4.h = arxbVar4;
                    arxlVar4.b |= 32;
                    aopa createBuilder5 = arxe.a.createBuilder();
                    alda aldaVar5 = alcwVar.i;
                    if (aldaVar5 == null) {
                        aldaVar5 = alda.a;
                    }
                    aopu aopuVar = aldaVar5.f;
                    createBuilder5.copyOnWrite();
                    arxe arxeVar = (arxe) createBuilder5.instance;
                    aopu aopuVar2 = arxeVar.b;
                    if (!aopuVar2.c()) {
                        arxeVar.b = aopi.mutableCopy(aopuVar2);
                    }
                    aonk.addAll((Iterable) aopuVar, (List) arxeVar.b);
                    createBuilder.copyOnWrite();
                    arxl arxlVar5 = (arxl) createBuilder.instance;
                    arxe arxeVar2 = (arxe) createBuilder5.mo39build();
                    arxeVar2.getClass();
                    arxlVar5.j = arxeVar2;
                    arxlVar5.b |= 256;
                    alda aldaVar6 = alcwVar.i;
                    if (aldaVar6 == null) {
                        aldaVar6 = alda.a;
                    }
                    if ((aldaVar6.b & 8) != 0) {
                        aopa createBuilder6 = arwx.a.createBuilder();
                        alda aldaVar7 = alcwVar.i;
                        if (aldaVar7 == null) {
                            aldaVar7 = alda.a;
                        }
                        alcy alcyVar = aldaVar7.g;
                        if (alcyVar == null) {
                            alcyVar = alcy.a;
                        }
                        double d2 = alcyVar.b;
                        createBuilder6.copyOnWrite();
                        arwx arwxVar = (arwx) createBuilder6.instance;
                        arwxVar.b |= 1;
                        arwxVar.c = d2;
                        alda aldaVar8 = alcwVar.i;
                        if (aldaVar8 == null) {
                            aldaVar8 = alda.a;
                        }
                        alcy alcyVar2 = aldaVar8.g;
                        if (alcyVar2 == null) {
                            alcyVar2 = alcy.a;
                        }
                        double d3 = alcyVar2.c;
                        createBuilder6.copyOnWrite();
                        arwx arwxVar2 = (arwx) createBuilder6.instance;
                        arwxVar2.b |= 2;
                        arwxVar2.d = d3;
                        alda aldaVar9 = alcwVar.i;
                        if (aldaVar9 == null) {
                            aldaVar9 = alda.a;
                        }
                        alcy alcyVar3 = aldaVar9.g;
                        if (alcyVar3 == null) {
                            alcyVar3 = alcy.a;
                        }
                        String str4 = alcyVar3.d;
                        createBuilder6.copyOnWrite();
                        arwx arwxVar3 = (arwx) createBuilder6.instance;
                        str4.getClass();
                        arwxVar3.b |= 8;
                        arwxVar3.f = str4;
                        alda aldaVar10 = alcwVar.i;
                        if (aldaVar10 == null) {
                            aldaVar10 = alda.a;
                        }
                        alcy alcyVar4 = aldaVar10.g;
                        if (alcyVar4 == null) {
                            alcyVar4 = alcy.a;
                        }
                        String str5 = alcyVar4.e;
                        createBuilder6.copyOnWrite();
                        arwx arwxVar4 = (arwx) createBuilder6.instance;
                        str5.getClass();
                        arwxVar4.b |= 4;
                        arwxVar4.e = str5;
                        createBuilder.copyOnWrite();
                        arxl arxlVar6 = (arxl) createBuilder.instance;
                        arwx arwxVar5 = (arwx) createBuilder6.mo39build();
                        arwxVar5.getClass();
                        arxlVar6.m = arwxVar5;
                        arxlVar6.b |= 32768;
                    }
                } else {
                    throw new AssertionError("Metadata update with empty title");
                }
            }
            String str6 = alcwVar.W;
            createBuilder.copyOnWrite();
            arxl arxlVar7 = (arxl) createBuilder.instance;
            str6.getClass();
            arxlVar7.b = 2 | arxlVar7.b;
            arxlVar7.e = str6;
            aazu aazuVar = this.c;
            byte[] bArr = aadi.b;
            aarl aarlVar = aazuVar.a;
            aazv aazvVar = new aazv(aazuVar.e, d, createBuilder);
            aazvVar.k(bArr);
            arxm arxmVar = (arxm) aarlVar.d(aazvVar);
            if ((arxmVar.b & 4) != 0) {
                arxp arxpVar = arxmVar.d;
                if (arxpVar == null) {
                    arxpVar = arxp.a;
                }
                int B = akpq.B(arxpVar.c);
                if (B == 0 || B == 1) {
                    return anlz.q(t(this.d.e(), true));
                }
            }
            return anlz.q(t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED), true));
        }
        throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.s;
    }

    @Override // defpackage.algt
    public final String f() {
        return "SaveMetadataTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 1) == 0 || (alcwVar.c & 32768) == 0 || (i & 16) == 0) ? false : true;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.aa;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.b.i, this.e), z);
        }
        return super.k(th, alcwVar, z);
    }
}
