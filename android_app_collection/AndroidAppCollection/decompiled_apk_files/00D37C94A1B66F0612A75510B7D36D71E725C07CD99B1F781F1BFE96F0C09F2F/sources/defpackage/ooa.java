package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ooa  reason: default package */
/* loaded from: classes3.dex */
public final class ooa {
    public final ony a;
    public final aijf b;
    public final axnm c;
    public final axnm d;
    public aypg e;
    public final aacz f;
    private final ayor g;

    public ooa(aacz aaczVar, ony onyVar, aijf aijfVar, axnm axnmVar, axnm axnmVar2, ayor ayorVar) {
        this.f = aaczVar;
        this.a = onyVar;
        this.b = aijfVar;
        this.c = axnmVar;
        this.d = axnmVar2;
        this.g = ayorVar;
    }

    public final void a() {
        if (!eog.bb(this.f)) {
            return;
        }
        this.e = this.a.c.X(this.g).as(new ayqb() { // from class: onz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ooa ooaVar = ooa.this;
                if (((Boolean) obj).booleanValue()) {
                    ((onj) ooaVar.c.get()).b(true);
                } else {
                    ((onj) ooaVar.c.get()).a();
                }
            }
        });
        if (!this.a.g()) {
            return;
        }
        if (this.b.k) {
            onf onfVar = (onf) this.d.get();
            if (onfVar.e) {
                onfVar.e = false;
                onfVar.a.e();
                onfVar.a.g();
                onfVar.b.m(onfVar);
                ayqi.c((AtomicReference) onfVar.g);
            }
            if (((onf) this.d.get()).f) {
                ((onj) this.c.get()).h = true;
            }
        }
        ((onj) this.c.get()).b(false);
    }
}
