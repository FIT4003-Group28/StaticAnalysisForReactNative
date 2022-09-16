package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aidx  reason: default package */
/* loaded from: classes.dex */
public final class aidx extends yma {
    public final aids c;
    public final apzg d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final aidw h;
    public final ampq i;
    public final airw j;
    public aypg k;
    final aidm l;
    public volatile boolean m;
    private final yni n;

    public aidx(Executor executor, amvn amvnVar, ymb ymbVar, aids aidsVar, apzg apzgVar, atzb atzbVar, aidm aidmVar, yni yniVar, ampq ampqVar, airw airwVar) {
        super(executor, amvnVar, ymbVar);
        aidsVar.getClass();
        this.c = aidsVar;
        apzgVar.getClass();
        this.d = apzgVar;
        this.n = yniVar;
        boolean d = aied.d(atzbVar);
        boolean z = true;
        if (!atzbVar.f && !d) {
            z = false;
        }
        this.f = z;
        this.g = d;
        this.e = aied.d(atzbVar) ? Math.max(Math.abs(atzbVar.d), Math.abs(atzbVar.e)) : -1;
        this.l = aidmVar;
        this.i = ampqVar;
        this.j = airwVar;
        this.h = new aidw(this);
    }

    @Override // defpackage.yma
    protected final Runnable b() {
        return new aidv(this);
    }

    @Override // defpackage.yma, defpackage.ymc
    public final void c() {
        aegm aegmVar;
        this.b = true;
        amzs it = this.a.iterator();
        while (it.hasNext()) {
            ylz ylzVar = (ylz) it.next();
            ylzVar.b = true;
            ylzVar.b();
        }
        aidm aidmVar = this.l;
        if (aidmVar != null && (aegmVar = aidmVar.e) != null) {
            aegmVar.a();
            aidmVar.e = null;
            aidmVar.c.d(new aieg());
        }
        if (!this.m) {
            this.n.d(new aieh());
        }
        aypg aypgVar = this.k;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
    }
}
