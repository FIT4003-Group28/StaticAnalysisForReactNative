package defpackage;

import android.os.RemoteException;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mwc  reason: default package */
/* loaded from: classes7.dex */
public final class mwc implements non {
    private final mwa a;
    private final boolean b;
    private final kcv c;
    private final mvv d;

    public mwc(mvv mvvVar, mwa mwaVar, kcv kcvVar, boolean z) {
        this.d = mvvVar;
        this.a = mwaVar;
        this.b = z;
        this.c = kcvVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        if (!this.b) {
            this.c.i(this);
        }
        mvv mvvVar = this.d;
        mvvVar.b = this.a;
        cms cmsVar = mvvVar.a;
        if (cmsVar.a == null) {
            throw new IllegalStateException("No SearchCallback is set");
        }
        try {
            cmsVar.b.j();
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // defpackage.non
    public final void e() {
        if (!this.b) {
            this.c.h(this);
        }
    }

    @Override // defpackage.non
    public final void f() {
    }

    @Override // defpackage.non
    public final String g() {
        return "ProjectedKeyboardSearchOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }
}
