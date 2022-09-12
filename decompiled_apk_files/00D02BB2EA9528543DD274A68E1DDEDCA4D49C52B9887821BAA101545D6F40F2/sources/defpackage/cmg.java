package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cmg  reason: default package */
/* loaded from: classes5.dex */
public final class cmg {
    public final clm a;
    private final cnfs b;
    private final clw c;

    public cmg(clw clwVar, cnfs cnfsVar, clm clmVar) {
        this.c = clwVar;
        this.b = cnfsVar;
        this.a = clmVar;
        try {
            clwVar.e(new cme(this));
        } catch (RemoteException unused) {
        }
    }

    public final boolean a() {
        return this.b.c();
    }

    public final void b(cnfn cnfnVar) {
        this.b.a(cnfnVar);
    }

    public final void c() {
        this.b.b();
    }
}
