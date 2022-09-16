package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: sff  reason: default package */
/* loaded from: classes4.dex */
public final class sff implements sbw {
    public final sfe a;
    public sai c;
    private final String d;
    private final sbs e = new sfd(this);
    public boolean b = true;

    public sff(Context context, String str, int i) {
        this.d = str;
        this.a = new sfe(context, i);
    }

    public final void a(scd scdVar) {
        if (scdVar instanceof sgd) {
            sgd sgdVar = (sgd) this.c.h();
            throw null;
        }
        sfe sfeVar = this.a;
        sfeVar.b = -1.0f;
        sfeVar.c = -1.0f;
        sfeVar.d = -1.0f;
        sfeVar.a = new sgm(this.d);
        sfeVar.d = -1.0f;
        this.a.invalidate();
    }

    @Override // defpackage.sbw
    public final void b(sai saiVar) {
        sho.c(this.c == null, "Behavior already attached to a different chart");
        this.c = saiVar;
        saiVar.y(this.e);
        saiVar.m(this.a);
    }

    @Override // defpackage.sbw
    public final void c(sai saiVar) {
        boolean z = true;
        sho.c(this.c != null, "Can't detach and unattached behavior.");
        if (this.c != saiVar) {
            z = false;
        }
        sho.a(z, "Can't detach from a chart that this behavior is not attached to.");
        saiVar.z(this.e);
        saiVar.removeView(this.a);
        this.c = null;
    }
}
