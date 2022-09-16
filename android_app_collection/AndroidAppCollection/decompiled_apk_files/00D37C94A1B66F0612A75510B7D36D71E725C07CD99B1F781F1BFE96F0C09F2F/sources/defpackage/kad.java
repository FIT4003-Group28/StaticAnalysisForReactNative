package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: kad  reason: default package */
/* loaded from: classes3.dex */
public final class kad extends ahvu implements ahin {
    public boolean a;
    public boolean b;
    public boolean c;
    private final ahvq t;
    private boolean u;
    private final kaa v;

    public kad(Context context, kaa kaaVar, ajmy ajmyVar, aafo aafoVar, yzm yzmVar, afwu afwuVar, afzo afzoVar, acti actiVar, ahvv ahvvVar, nor norVar, ahzk ahzkVar) {
        super(context, kaaVar, ajmyVar, aafoVar, yzmVar, afwuVar, afzoVar, actiVar, ahvvVar);
        this.v = kaaVar;
        this.t = new kac(this);
        norVar.s().Z(new kab(this, 1));
        ahzkVar.r.Z(new kab(this));
    }

    @Override // defpackage.ahin
    public final void a(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        c();
    }

    @Override // defpackage.ahvu
    public final ahvq b() {
        return this.t;
    }

    public final void c() {
        kaa kaaVar = this.v;
        boolean z = false;
        if (!this.u && !this.a && !this.b && !this.c) {
            z = true;
        }
        kaaVar.g(z);
    }
}
