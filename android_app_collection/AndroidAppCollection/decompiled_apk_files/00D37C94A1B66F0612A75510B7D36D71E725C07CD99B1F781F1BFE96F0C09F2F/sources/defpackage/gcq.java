package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
/* compiled from: PG */
/* renamed from: gcq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gcq implements ayqb {
    public final /* synthetic */ DefaultPipController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcq(DefaultPipController defaultPipController) {
        this.a = defaultPipController;
    }

    public /* synthetic */ gcq(DefaultPipController defaultPipController, int i) {
        this.b = i;
        this.a = defaultPipController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z;
        int i = this.b;
        if (i == 0) {
            DefaultPipController defaultPipController = this.a;
            ahhm ahhmVar = (ahhm) obj;
            if (defaultPipController.b.isInPictureInPictureMode() && !gdo.c(ahhmVar.b())) {
                ((airr) defaultPipController.e.get()).K();
                ((gdk) defaultPipController.c.get()).a(((airr) defaultPipController.e.get()).n(), ((airr) defaultPipController.e.get()).p(), ((airr) defaultPipController.e.get()).g());
            }
            if (ahhmVar.b() != null) {
                z = gdo.a(ahhmVar.b());
            } else {
                z = defaultPipController.x;
            }
            defaultPipController.x = z;
            defaultPipController.s = ahhmVar.b();
            defaultPipController.k(new gcr(defaultPipController, 1));
        } else if (i == 1) {
            final DefaultPipController defaultPipController2 = this.a;
            defaultPipController2.v = (ezx) obj;
            defaultPipController2.k(new gcr(defaultPipController2, 1));
            boolean z2 = defaultPipController2.w;
            boolean z3 = defaultPipController2.v.l() || defaultPipController2.v == ezx.NONE;
            defaultPipController2.w = z3;
            if (z2 && !z3) {
                defaultPipController2.k(new gcr(defaultPipController2));
            }
            if (defaultPipController2.n != null) {
                return;
            }
            defaultPipController2.n = ((jwi) ((jvo) defaultPipController2.j.get()).get()).aT;
            if (defaultPipController2.n == null) {
                return;
            }
            defaultPipController2.p = new View.OnLayoutChangeListener() { // from class: gcn
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    DefaultPipController defaultPipController3 = DefaultPipController.this;
                    if (defaultPipController3.w) {
                        return;
                    }
                    if (i2 == i6 && i4 == i8 && i3 == i7 && i5 == i9) {
                        return;
                    }
                    defaultPipController3.k(new gcr(defaultPipController3));
                }
            };
            defaultPipController2.n.addOnLayoutChangeListener(defaultPipController2.p);
        } else {
            DefaultPipController defaultPipController3 = this.a;
            ahia ahiaVar = (ahia) obj;
            boolean z4 = defaultPipController3.u;
            boolean z5 = ahiaVar.f() || ahiaVar.c();
            defaultPipController3.u = z5;
            if (z4 == z5) {
                return;
            }
            defaultPipController3.k(new gcr(defaultPipController3, 1));
        }
    }
}
