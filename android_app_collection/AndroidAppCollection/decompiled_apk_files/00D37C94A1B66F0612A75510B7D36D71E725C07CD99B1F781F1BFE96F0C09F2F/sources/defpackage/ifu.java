package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ifu  reason: default package */
/* loaded from: classes3.dex */
public final class ifu {
    public final igh a;
    public final hyl b;
    public final snc c;
    public final Executor d;
    public final acvf e;
    public final aego f;
    public final amqo g;
    public final airw h;
    public final aapv i;
    public final afvn j;
    public final aypf k = new aypf();
    public ifr l;
    public final aafd m;
    public final hqp n;

    public ifu(igh ighVar, aafd aafdVar, hyl hylVar, snc sncVar, Executor executor, acvf acvfVar, aego aegoVar, amqo amqoVar, airw airwVar, aapv aapvVar, afvn afvnVar, hqp hqpVar, byte[] bArr, byte[] bArr2) {
        aafdVar.getClass();
        this.m = aafdVar;
        this.b = hylVar;
        sncVar.getClass();
        this.c = sncVar;
        executor.getClass();
        this.d = executor;
        acvfVar.getClass();
        this.e = acvfVar;
        this.a = ighVar;
        aegoVar.getClass();
        this.f = aegoVar;
        this.g = amqoVar;
        this.h = airwVar;
        this.i = aapvVar;
        this.j = afvnVar;
        this.n = hqpVar;
    }

    public static aijp a(acvg acvgVar, boolean z, boolean z2, afmv afmvVar) {
        aijo a = aijp.a();
        a.a = acvgVar;
        a.d(z);
        a.c(z2);
        if (afmvVar != null) {
            a.b = afmvVar;
        }
        return a.a();
    }

    public static Optional b(gtc gtcVar, long j, int i) {
        if (i != 2) {
            return Optional.ofNullable(gtcVar.c(j));
        }
        return Optional.ofNullable(gtcVar.b(j));
    }

    public static void d(gtc gtcVar, long j, int i, ankb ankbVar) {
        if (i != 2) {
            gtcVar.e(j, ankbVar);
        } else {
            gtcVar.d(j, ankbVar);
        }
    }

    public static boolean e(aull aullVar) {
        return aullVar != null && aullVar.H;
    }

    public static boolean f(aull aullVar) {
        return aullVar != null && aullVar.i;
    }

    public final void c() {
        ifr ifrVar = this.l;
        if (ifrVar != null) {
            ifrVar.d = true;
            for (ift iftVar : ifrVar.c.values()) {
                iftVar.d();
            }
            ifrVar.c.clear();
            this.l = null;
        }
    }
}
