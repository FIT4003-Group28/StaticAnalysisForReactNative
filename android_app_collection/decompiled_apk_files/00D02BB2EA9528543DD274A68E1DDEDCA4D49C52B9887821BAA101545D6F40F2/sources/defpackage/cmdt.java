package defpackage;

import android.os.Handler;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cmdt  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmdt<T> extends cmdj {
    private final HashMap<T, cmds> d = new HashMap<>();
    private Handler e;
    private cmlo f;

    @Override // defpackage.cmdj
    protected final void B() {
        for (cmds cmdsVar : this.d.values()) {
            cmdsVar.a.l(cmdsVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdj
    public void a(cmlo cmloVar) {
        this.f = cmloVar;
        this.e = cmny.g();
    }

    @Override // defpackage.cmdj
    protected final void c() {
        for (cmds cmdsVar : this.d.values()) {
            cmdsVar.a.m(cmdsVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdj
    public void d() {
        for (cmds cmdsVar : this.d.values()) {
            cmdsVar.a.n(cmdsVar.b);
            cmdsVar.a.i(cmdsVar.c);
        }
        this.d.clear();
    }

    @Override // defpackage.cmej
    public void r() {
        for (cmds cmdsVar : this.d.values()) {
            cmdsVar.a.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long u(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void v(clpb clpbVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public cmeh w(cmeh cmehVar) {
        return cmehVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(cmej cmejVar) {
        cmmn.a(!this.d.containsKey(null));
        cmei cmeiVar = new cmei(this) { // from class: cmdq
            private final cmdt a;

            {
                this.a = this;
            }

            @Override // defpackage.cmei
            public final void a(clpb clpbVar) {
                this.a.v(clpbVar);
            }
        };
        cmdr cmdrVar = new cmdr(this);
        this.d.put(null, new cmds(cmejVar, cmeiVar, cmdrVar));
        Handler handler = this.e;
        cmmn.f(handler);
        cmejVar.h(handler, cmdrVar);
        Handler handler2 = this.e;
        cmmn.f(handler2);
        cmejVar.j(handler2, cmdrVar);
        cmejVar.k(cmeiVar, this.f);
        if (!this.a.isEmpty()) {
            return;
        }
        cmejVar.m(cmeiVar);
    }
}
