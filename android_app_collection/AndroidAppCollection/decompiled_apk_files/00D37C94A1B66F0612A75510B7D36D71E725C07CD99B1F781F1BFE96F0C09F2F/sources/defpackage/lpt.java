package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lpt  reason: default package */
/* loaded from: classes3.dex */
public final class lpt implements eze {
    public final yzm a;
    public final Rect b = new Rect();
    public View c;
    public nfk d;
    public yzg e;
    private final axnm f;
    private final axnm g;
    private ViewGroup h;

    public lpt(yzm yzmVar, axnm axnmVar, axnm axnmVar2) {
        this.a = yzmVar;
        this.f = axnmVar;
        this.g = axnmVar2;
        yzmVar.d().Z(new ayqb() { // from class: lps
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                lpt lptVar = lpt.this;
                yzr yzrVar = ((zaw) obj).a;
                lptVar.b.setEmpty();
                lptVar.e = yzrVar.b;
                if (lptVar.a.n() == 1 || lptVar.a.n() == 4 || lptVar.a.n() == 3 || lptVar.a.n() == 5) {
                    lptVar.c(new Rect());
                } else {
                    lptVar.c(yzrVar.a);
                }
                Rect rect = yzrVar.c;
                nfk nfkVar = lptVar.d;
                if (nfkVar != null) {
                    nfkVar.h(rect);
                }
            }
        });
    }

    @Override // defpackage.eze
    public final Rect a() {
        return this.b;
    }

    @Override // defpackage.eze
    public final yzg b() {
        return this.e;
    }

    public final void c(Rect rect) {
        ViewGroup viewGroup;
        View view;
        nfk nfkVar = this.d;
        if (nfkVar != null) {
            nfkVar.i(rect.left, rect.top, rect.right, rect.bottom);
        }
        View view2 = (View) this.g.get();
        if (true != ((ofs) this.f.get()).a()) {
            if (this.h == null && (view = this.c) != null) {
                this.h = (ViewGroup) view.findViewById(R.id.watch_while_layout_coordinator_layout);
            }
            viewGroup = this.h;
        } else {
            viewGroup = null;
        }
        zgd.t((View) akzj.d(viewGroup, view2), zgd.p(rect.top), ViewGroup.MarginLayoutParams.class);
        zgd.t(view2, zgd.b(zgd.i(rect.left), zgd.o(rect.right), zgd.e(rect.bottom)), ViewGroup.MarginLayoutParams.class);
    }
}
