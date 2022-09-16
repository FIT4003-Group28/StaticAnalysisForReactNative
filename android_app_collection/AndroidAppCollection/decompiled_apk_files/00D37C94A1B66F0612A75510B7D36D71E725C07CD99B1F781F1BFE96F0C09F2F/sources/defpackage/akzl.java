package defpackage;
/* compiled from: PG */
/* renamed from: akzl  reason: default package */
/* loaded from: classes.dex */
public final class akzl extends akzu {
    private final alht a;

    public akzl(alht alhtVar, albf albfVar) {
        super(albfVar);
        this.a = alhtVar;
    }

    private final alct c(alct alctVar) {
        int z = araa.z(alctVar.c);
        if (z == 0) {
            z = 1;
        }
        return z + (-1) != 1 ? this.a.e() : alct.a;
    }

    @Override // defpackage.akzu
    public final alcw b(alcw alcwVar) {
        if (alcwVar == null) {
            return null;
        }
        if (!alcwVar.S) {
            throw new IllegalStateException("use_explicit_upload_flow must be true");
        }
        aopa mo52toBuilder = alcwVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        alcw alcwVar2 = (alcw) mo52toBuilder.instance;
        alcwVar2.c |= 4194304;
        alcwVar2.ad = false;
        mo52toBuilder.copyOnWrite();
        alcw alcwVar3 = (alcw) mo52toBuilder.instance;
        alcwVar3.c |= 2097152;
        alcwVar3.ac = true;
        alct alctVar = alcwVar.ak;
        if (alctVar == null) {
            alctVar = alct.a;
        }
        int z = araa.z(alctVar.c);
        if (z == 0 || z != 2) {
            alctVar = alct.a;
        }
        mo52toBuilder.copyOnWrite();
        alcw alcwVar4 = (alcw) mo52toBuilder.instance;
        alctVar.getClass();
        alcwVar4.ak = alctVar;
        alcwVar4.c |= 536870912;
        alct alctVar2 = alcwVar.M;
        if (alctVar2 == null) {
            alctVar2 = alct.a;
        }
        alct c = c(alctVar2);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar5 = (alcw) mo52toBuilder.instance;
        c.getClass();
        alcwVar5.M = c;
        alcwVar5.c |= 256;
        alct alctVar3 = alcwVar.Y;
        if (alctVar3 == null) {
            alctVar3 = alct.a;
        }
        alct c2 = c(alctVar3);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar6 = (alcw) mo52toBuilder.instance;
        c2.getClass();
        alcwVar6.Y = c2;
        alcwVar6.c |= 131072;
        alct alctVar4 = alcwVar.w;
        if (alctVar4 == null) {
            alctVar4 = alct.a;
        }
        alct c3 = c(alctVar4);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar7 = (alcw) mo52toBuilder.instance;
        c3.getClass();
        alcwVar7.w = c3;
        alcwVar7.b |= 16777216;
        alct alctVar5 = alcwVar.w;
        if (alctVar5 == null) {
            alctVar5 = alct.a;
        }
        alct c4 = c(alctVar5);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar8 = (alcw) mo52toBuilder.instance;
        c4.getClass();
        alcwVar8.aa = c4;
        alcwVar8.c |= 524288;
        alct alctVar6 = alcwVar.ai;
        if (alctVar6 == null) {
            alctVar6 = alct.a;
        }
        alct c5 = c(alctVar6);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar9 = (alcw) mo52toBuilder.instance;
        c5.getClass();
        alcwVar9.ai = c5;
        alcwVar9.c |= 134217728;
        alct alctVar7 = alcwVar.L;
        if (alctVar7 == null) {
            alctVar7 = alct.a;
        }
        alct c6 = c(alctVar7);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar10 = (alcw) mo52toBuilder.instance;
        c6.getClass();
        alcwVar10.L = c6;
        alcwVar10.c |= 128;
        alct alctVar8 = alcwVar.I;
        if (alctVar8 == null) {
            alctVar8 = alct.a;
        }
        alct c7 = c(alctVar8);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar11 = (alcw) mo52toBuilder.instance;
        c7.getClass();
        alcwVar11.I = c7;
        alcwVar11.c |= 16;
        alct alctVar9 = alcwVar.H;
        if (alctVar9 == null) {
            alctVar9 = alct.a;
        }
        alct c8 = c(alctVar9);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar12 = (alcw) mo52toBuilder.instance;
        c8.getClass();
        alcwVar12.H = c8;
        alcwVar12.c |= 8;
        alct alctVar10 = alcwVar.K;
        if (alctVar10 == null) {
            alctVar10 = alct.a;
        }
        alct c9 = c(alctVar10);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar13 = (alcw) mo52toBuilder.instance;
        c9.getClass();
        alcwVar13.K = c9;
        alcwVar13.c |= 64;
        alct alctVar11 = alcwVar.ab;
        if (alctVar11 == null) {
            alctVar11 = alct.a;
        }
        alct c10 = c(alctVar11);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar14 = (alcw) mo52toBuilder.instance;
        c10.getClass();
        alcwVar14.ab = c10;
        alcwVar14.c |= 1048576;
        alct alctVar12 = alcwVar.ag;
        if (alctVar12 == null) {
            alctVar12 = alct.a;
        }
        alct c11 = c(alctVar12);
        mo52toBuilder.copyOnWrite();
        alcw alcwVar15 = (alcw) mo52toBuilder.instance;
        c11.getClass();
        alcwVar15.ag = c11;
        alcwVar15.c |= 33554432;
        if (alcwVar15.s) {
            alct alctVar13 = alcwVar.ah;
            if (alctVar13 == null) {
                alctVar13 = alct.a;
            }
            alct c12 = c(alctVar13);
            mo52toBuilder.copyOnWrite();
            alcw alcwVar16 = (alcw) mo52toBuilder.instance;
            c12.getClass();
            alcwVar16.ah = c12;
            alcwVar16.c |= 67108864;
        }
        return (alcw) mo52toBuilder.mo39build();
    }
}
