package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: atad  reason: default package */
/* loaded from: classes2.dex */
public class atad implements aszx, aszv {
    public final acyu a;
    private final atab c;
    private final Resources d;
    private boolean g;
    private final acyt h;
    private final List<aszw> e = new ArrayList();
    private final transient atac f = new atac();
    public boolean b = true;

    public atad(atab atabVar, Resources resources, acyu acyuVar) {
        ataa ataaVar = new ataa(this);
        this.h = ataaVar;
        this.c = atabVar;
        this.d = resources;
        this.a = acyuVar;
        acyuVar.l(ataaVar);
    }

    @Override // defpackage.aszv
    public void a(amvh amvhVar) {
        final aswz aswzVar = (aswz) ((asxp) this.c).a.b;
        aswzVar.g.b(new crhz(amvhVar, null, true, new crjl(aswzVar) { // from class: aswo
            private final aswz a;

            {
                this.a = aswzVar;
            }

            @Override // defpackage.crjl
            public final void a() {
                this.a.aA.b();
            }
        }));
    }

    @Override // defpackage.aszx
    public List<? extends aszu> b() {
        return this.e;
    }

    @Override // defpackage.aszx
    public cqkl c() {
        asxp asxpVar = (asxp) this.c;
        if (aefy.c(asxpVar.a.f.a()) == ddmo.COLLAPSED) {
            asxt asxtVar = asxpVar.a;
            asxtVar.f.a().e(asxtVar.c());
            asxtVar.h = false;
        } else {
            asxt asxtVar2 = asxpVar.a;
            asxtVar2.f.a().e(asxtVar2.f.a().u());
            asxtVar2.h = true;
        }
        return cqkl.a;
    }

    @Override // defpackage.aszx
    public Boolean d() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aszx
    public Boolean e() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.aszx
    public cqqw f() {
        return new aszz(this);
    }

    @Override // defpackage.aszx
    public View.OnLayoutChangeListener g() {
        return new View.OnLayoutChangeListener(this) { // from class: aszy
            private final atad a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.i(view);
            }
        };
    }

    public void h(List<crqg> list) {
        this.e.clear();
        int i = 0;
        while (i < list.size()) {
            List<aszw> list2 = this.e;
            crqg crqgVar = list.get(i);
            boolean z = i == list.size() + (-1);
            String s = crqgVar.a.s(this.d);
            aszw aszwVar = this.f.get(s);
            if (aszwVar == null) {
                aszw aszwVar2 = new aszw(this, this.d, crqgVar, i, z);
                this.f.put(s, aszwVar2);
                aszwVar = aszwVar2;
            } else {
                aszwVar.i(crqgVar);
                aszwVar.j(i);
                aszwVar.k(z);
            }
            list2.add(aszwVar);
            i++;
        }
        cqkx.p(this);
    }

    public final void i(View view) {
        if (!view.canScrollVertically(-1)) {
            if (!e().booleanValue()) {
                return;
            }
            this.g = false;
            cqkx.p(this);
        } else if (e().booleanValue()) {
        } else {
            this.g = true;
            cqkx.p(this);
        }
    }
}
