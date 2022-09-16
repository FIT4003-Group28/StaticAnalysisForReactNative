package defpackage;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clnw  reason: default package */
/* loaded from: classes5.dex */
public final class clnw implements cmer, clts {
    final /* synthetic */ cloa a;
    private final clny b;
    private cmeq c;
    private cltr d;

    public clnw(cloa cloaVar, clny clnyVar) {
        this.a = cloaVar;
        this.c = cloaVar.e;
        this.d = cloaVar.f;
        this.b = clnyVar;
    }

    private final boolean f(int i, cmeh cmehVar) {
        cmeh cmehVar2 = null;
        if (cmehVar != null) {
            clny clnyVar = this.b;
            int i2 = 0;
            while (true) {
                if (i2 >= clnyVar.c.size()) {
                    break;
                } else if (clnyVar.c.get(i2).d == cmehVar.d) {
                    cmehVar2 = cmehVar.a(Pair.create(clnyVar.b, cmehVar.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (cmehVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.b.d;
        cmeq cmeqVar = this.c;
        if (cmeqVar.a != i3 || !cmny.b(cmeqVar.b, cmehVar2)) {
            this.c = this.a.e.h(i3, cmehVar2);
        }
        cltr cltrVar = this.d;
        if (cltrVar.a != i3 || !cmny.b(cltrVar.b, cmehVar2)) {
            this.d = this.a.f.a(i3, cmehVar2);
            return true;
        }
        return true;
    }

    @Override // defpackage.cmer
    public final void a(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.c.b(cmdzVar, cmeeVar);
        }
    }

    @Override // defpackage.cmer
    public final void b(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.c.c(cmdzVar, cmeeVar);
        }
    }

    @Override // defpackage.cmer
    public final void c(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.c.d(cmdzVar, cmeeVar);
        }
    }

    @Override // defpackage.cmer
    public final void d(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar, IOException iOException, boolean z) {
        if (f(i, cmehVar)) {
            this.c.e(cmdzVar, cmeeVar, iOException, z);
        }
    }

    @Override // defpackage.cmer
    public final void e(int i, cmeh cmehVar, cmee cmeeVar) {
        if (f(i, cmehVar)) {
            this.c.f(cmeeVar);
        }
    }
}
