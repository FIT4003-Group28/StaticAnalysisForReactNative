package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
@Deprecated
/* renamed from: pki  reason: default package */
/* loaded from: classes4.dex */
public final class pki {
    public final Context a;
    public final pkg b;
    public final pvn d;
    public piv e;
    public final awx f;
    public final auy g;
    public pwx i;
    public boolean m;
    public Looper h = pxi.v();
    public final aso j = aso.a;
    public final pkh k = pkh.c;
    public final phl n = new phl(phk.c(20), phk.c(500));
    public final pvq c = pvq.a;
    public long l = 500;

    @Deprecated
    public pki(Context context, pkg pkgVar, pvn pvnVar, piv pivVar, awx awxVar, auy auyVar) {
        this.a = context;
        this.b = pkgVar;
        this.d = pvnVar;
        this.e = pivVar;
        this.f = awxVar;
        this.g = auyVar;
    }

    @Deprecated
    public final pkl a() {
        ptx.e(!this.m);
        this.m = true;
        return new pkl(this);
    }
}
