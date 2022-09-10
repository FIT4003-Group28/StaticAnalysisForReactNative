package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmdr  reason: default package */
/* loaded from: classes5.dex */
public final class cmdr implements cmer, clts {
    final /* synthetic */ cmdt a;
    private cmeq b;
    private cltr c;

    public cmdr(cmdt cmdtVar) {
        this.a = cmdtVar;
        this.b = cmdtVar.f(null);
        this.c = cmdtVar.g(null);
    }

    private final boolean f(int i, cmeh cmehVar) {
        cmeh cmehVar2;
        if (cmehVar != null) {
            cmehVar2 = this.a.w(cmehVar);
            if (cmehVar2 == null) {
                return false;
            }
        } else {
            cmehVar2 = null;
        }
        cmeq cmeqVar = this.b;
        if (cmeqVar.a != i || !cmny.b(cmeqVar.b, cmehVar2)) {
            this.b = this.a.b.h(i, cmehVar2);
        }
        cltr cltrVar = this.c;
        if (cltrVar.a != i || !cmny.b(cltrVar.b, cmehVar2)) {
            this.c = this.a.c.a(i, cmehVar2);
            return true;
        }
        return true;
    }

    private final cmee g(cmee cmeeVar) {
        long u = this.a.u(cmeeVar.f);
        long u2 = this.a.u(cmeeVar.g);
        if (u == cmeeVar.f && u2 == cmeeVar.g) {
            return cmeeVar;
        }
        int i = cmeeVar.a;
        int i2 = cmeeVar.b;
        Format format = cmeeVar.c;
        int i3 = cmeeVar.d;
        Object obj = cmeeVar.e;
        return new cmee(i2, format, u, u2);
    }

    @Override // defpackage.cmer
    public final void a(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.b.b(cmdzVar, g(cmeeVar));
        }
    }

    @Override // defpackage.cmer
    public final void b(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.b.c(cmdzVar, g(cmeeVar));
        }
    }

    @Override // defpackage.cmer
    public final void c(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.b.d(cmdzVar, g(cmeeVar));
        }
    }

    @Override // defpackage.cmer
    public final void d(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar, IOException iOException, boolean z) {
        if (f(i, cmehVar)) {
            this.b.e(cmdzVar, g(cmeeVar), iOException, z);
        }
    }

    @Override // defpackage.cmer
    public final void e(int i, cmeh cmehVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.b.f(g(cmeeVar));
        }
    }
}
