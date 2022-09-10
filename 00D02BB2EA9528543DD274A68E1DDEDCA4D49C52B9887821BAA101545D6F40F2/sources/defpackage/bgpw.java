package defpackage;

import android.view.View;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bgpw  reason: default package */
/* loaded from: classes3.dex */
public final class bgpw extends cjxe {
    public static final /* synthetic */ int a = 0;
    @dzsi
    private final View b;
    private final View f;
    private final cqjg g;
    private boolean h;

    public bgpw(fd fdVar, @dzsi View view, View view2, cqjg cqjgVar) {
        super(fdVar, dcnm.c());
        this.b = view;
        this.f = view2;
        this.g = cqjgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjxe
    public final void a(float f) {
        f();
        final HashSet c = dcnm.c();
        View view = this.b;
        if (view != null) {
            c.add(view);
        }
        cqhu.d(this.f, this.g, new dbrn(c) { // from class: bgpv
            private final Set a;

            {
                this.a = c;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Set set = this.a;
                View view2 = (View) obj;
                int i = bgpw.a;
                set.add(view2);
                return view2;
            }
        });
        i(c);
        super.a(f);
    }

    @Override // defpackage.cjxe
    public final void b(boolean z) {
        boolean z2 = true;
        if (!z && !this.h) {
            z2 = false;
        }
        super.b(z2);
    }

    public final void c(boolean z) {
        if (this.h && !z) {
            super.b(false);
        }
        this.h = z;
        if (!z || !this.e) {
            return;
        }
        super.b(true);
    }

    public final void d() {
        if (this.e) {
            h();
        } else {
            b(true);
        }
    }
}
