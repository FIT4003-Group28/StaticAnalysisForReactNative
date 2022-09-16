package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cged  reason: default package */
/* loaded from: classes4.dex */
public final class cged implements Serializable {
    public byte[] a;
    public byte[] b;
    @dzsi
    public dspd c;
    public jjn d;
    @dzsi
    public alad e;
    @dzsi
    public cgeb f;
    @dzsi
    final alad g;
    @dzsi
    public cgsm h;
    public final cgem i;
    @dzsi
    public final dpyv j;
    public boolean k;

    public cged(@dzsi dspd dspdVar, @dzsi alad aladVar, cgem cgemVar) {
        this.k = false;
        this.a = null;
        this.c = dspdVar;
        this.d = jjn.HIDDEN;
        this.b = null;
        this.e = aladVar;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = cgemVar;
        this.j = null;
    }

    public static Set<dwpc> c(chac chacVar) {
        return dcbg.b(chacVar.b()).t(cgdz.a).t(cgea.a).B();
    }

    @dzsi
    public final dwsr a() {
        return (dwsr) bvrs.b(this.a, (dssr) dwsr.g.cu(7));
    }

    @dzsi
    public final dwsn b() {
        return (dwsn) bvrs.b(this.b, (dssr) dwsn.k.cu(7));
    }

    public cged(dwsn dwsnVar, alad aladVar, @dzsi alad aladVar2, cgem cgemVar) {
        this.k = false;
        this.a = null;
        this.c = null;
        this.d = jjn.HIDDEN;
        this.b = dwsnVar.bS();
        this.e = aladVar;
        this.f = null;
        this.g = aladVar2;
        this.h = null;
        this.i = cgemVar;
        this.j = null;
    }

    public cged(dwsn dwsnVar, @dzsi alad aladVar, @dzsi alad aladVar2, dpyv dpyvVar) {
        this.k = false;
        this.a = null;
        this.c = null;
        this.d = jjn.HIDDEN;
        this.b = dwsnVar.bS();
        this.e = aladVar;
        this.f = null;
        this.g = aladVar2;
        this.h = null;
        this.i = cgem.NOTIFICATION;
        this.j = dpyvVar;
    }

    public cged(dwsr dwsrVar, @dzsi dspd dspdVar, jjn jjnVar, @dzsi alad aladVar, cgem cgemVar) {
        this.k = false;
        this.a = dwsrVar.bS();
        this.c = dspdVar;
        this.d = jjnVar;
        this.e = aladVar;
        this.f = null;
        this.b = null;
        this.g = null;
        this.h = null;
        this.i = cgemVar;
        this.j = null;
    }
}
