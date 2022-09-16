package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crqz  reason: default package */
/* loaded from: classes5.dex */
public class crqz extends crpu {
    public final boolean a;
    public final aryv c;
    @dzsi
    public final dqkr d;
    private final GmmLocation e;

    public crqz(GmmLocation gmmLocation, boolean z, aryv aryvVar, @dzsi dqkr dqkrVar) {
        this.e = gmmLocation;
        this.a = z;
        this.c = aryvVar;
        this.d = dqkrVar;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.REPORT_INCIDENT;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return true;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return true;
    }

    public final akra d() {
        return (akra) dbsc.a(this.e.u(), this.e.C());
    }

    public final float i() {
        return this.e.v();
    }

    @dzsi
    public final String j() {
        amvx t = this.e.t();
        if (t != null) {
            return t.a;
        }
        return null;
    }
}
