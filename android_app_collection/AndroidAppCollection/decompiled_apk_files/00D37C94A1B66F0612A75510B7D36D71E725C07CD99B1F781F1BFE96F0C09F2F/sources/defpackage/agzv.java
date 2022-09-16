package defpackage;

import java.security.Key;
/* compiled from: PG */
/* renamed from: agzv  reason: default package */
/* loaded from: classes.dex */
public final class agzv {
    public final pde a;
    public afjm b;
    private final amqo c;
    private Key d;
    private Key e;
    private final snc f;
    private final Object g;
    private final aeae h;
    private final pwx i;
    private final ampq j;
    private final aegg k;

    public agzv(agzv agzvVar) {
        this.c = agzvVar.c;
        this.a = agzvVar.a;
        this.d = agzvVar.d;
        this.e = agzvVar.e;
        this.b = agzvVar.b;
        this.k = agzvVar.k;
        this.f = agzvVar.f;
        this.g = agzvVar.g;
        this.h = agzvVar.h;
        this.i = agzvVar.i;
        this.j = agzvVar.j;
    }

    public agzv(amqo amqoVar, pde pdeVar, snc sncVar, Object obj, aeae aeaeVar, pwx pwxVar, ampq ampqVar) {
        this.c = amqoVar;
        this.a = pdeVar;
        this.f = sncVar;
        this.g = obj;
        this.h = aeaeVar;
        this.i = pwxVar;
        this.k = new aegg(pdeVar);
        this.j = ampqVar;
    }

    public final aegk a() {
        return new aegk(this.c, this.a, this.d, this.e, this.b, this.k, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(Key key) {
        this.d = key;
        this.e = key;
    }
}
