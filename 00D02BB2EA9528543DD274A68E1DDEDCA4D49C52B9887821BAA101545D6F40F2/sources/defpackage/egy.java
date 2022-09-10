package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: egy  reason: default package */
/* loaded from: classes.dex */
public final class egy implements efc {
    public static final dcqe a = dcqe.c("egy");
    public egx b;
    @dzsi
    public egu c;
    @dzsi
    public egu d;
    public boolean e;
    public final efg f;
    private final dzsj<dbsg<gli>> g;
    private final List<Runnable> h = new ArrayList();
    @dzsi
    private egu i;

    public egy(efg efgVar, dzsj<dbsg<gli>> dzsjVar) {
        this.f = efgVar;
        this.g = dzsjVar;
    }

    @Override // defpackage.efc
    public final boolean a() {
        return this.c == null && this.d == null;
    }

    @Override // defpackage.efc
    public final void b(egu eguVar) {
        egu eguVar2 = this.d;
        if (eguVar2 != null) {
            dbsk.j(eguVar == eguVar2, "Transition done is not the running transition. localTransition.fragment: %s, doneTransition.fragment: %s", eguVar2.e(), eguVar.e());
            this.i = eguVar2;
            this.d = null;
        }
        egu eguVar3 = this.c;
        if (eguVar3 == null) {
            while (!this.h.isEmpty()) {
                this.h.remove(0).run();
            }
            return;
        }
        e(eguVar3);
    }

    @Override // defpackage.efc
    @dzsi
    public final egu c() {
        egu eguVar = this.c;
        if (eguVar != null) {
            return eguVar;
        }
        egu eguVar2 = this.d;
        return eguVar2 != null ? eguVar2 : this.i;
    }

    @Override // defpackage.efc
    public final void d() {
        e(null);
        egu eguVar = this.d;
        if (eguVar != null) {
            this.f.h(eguVar);
            this.d = null;
        }
        this.c = null;
        j();
    }

    @Override // defpackage.efc
    public final void e(@dzsi final egu eguVar) {
        if (this.b == null) {
            this.b = new egx(new WeakReference(this));
        }
        this.c = eguVar;
        Runnable runnable = new Runnable(this, eguVar) { // from class: egv
            private final egy a;
            private final egu b;

            {
                this.a = this;
                this.b = eguVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                egy egyVar = this.a;
                egu eguVar2 = this.b;
                egx egxVar = egyVar.b;
                if (egxVar != null) {
                    egxVar.removeMessages(1);
                    if (egyVar.c == null || eguVar2 == null) {
                        return;
                    }
                    egyVar.b.obtainMessage(1, eguVar2).sendToTarget();
                }
            }
        };
        dbsg<gli> a2 = this.g.a();
        egu eguVar2 = this.c;
        boolean z = false;
        if (eguVar2 == null) {
            z = ((Boolean) a2.h(egw.a).c(false)).booleanValue();
        } else if (eguVar2.d().z != null) {
            z = true;
        }
        if (!a2.a() || !a2.b().b() || z) {
            try {
                runnable.run();
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        a2.b().d(runnable);
    }

    @Override // defpackage.efc
    public final void f() {
        e(this.c);
    }

    @Override // defpackage.efc
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.efc
    public final void h(boolean z) {
        this.e = z;
    }

    @Override // defpackage.efc
    public final void i(fd fdVar) {
        egu eguVar = this.i;
        if (eguVar == null || !eguVar.e().equals(fdVar)) {
            return;
        }
        j();
    }

    public final void j() {
        egu eguVar = this.i;
        if (eguVar != null) {
            this.f.i(eguVar);
            this.i = null;
        }
    }
}
