package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cava  reason: default package */
/* loaded from: classes4.dex */
public abstract class cava<T> implements cafd {
    public final cavf<T> a;
    @dzsi
    public isc b;
    protected List<cavg<T>> c = new ArrayList();
    protected cavg<T> d;
    private final Activity e;
    private final isd f;

    public cava(Activity activity, isd isdVar, cavf<T> cavfVar) {
        this.e = activity;
        this.f = isdVar;
        this.a = cavfVar;
    }

    @Override // defpackage.cafd
    public String a() {
        return this.a.a();
    }

    @Override // defpackage.cafd
    public String b() {
        cavg<T> cavgVar = this.d;
        if (cavgVar == null) {
            return this.e.getString(R.string.CONTRIBUTIONS_SORT_BUTTON);
        }
        return this.e.getString(R.string.CONTRIBUTIONS_SORT_BUTTON_ACCESSIBILITY_DESCRIPTION, new Object[]{cavgVar.a});
    }

    @Override // defpackage.cafd
    public String c() {
        cavg<T> cavgVar = this.d;
        return cavgVar == null ? "" : cavgVar.a;
    }

    @Override // defpackage.cafd
    public cqkl d(View view) {
        isc iscVar = this.b;
        if (iscVar != null) {
            iscVar.dismiss();
        }
        isc a = this.f.a(view);
        ArrayList arrayList = new ArrayList();
        for (final cavg<T> cavgVar : this.c) {
            jhm jhmVar = new jhm();
            jhmVar.a = cavgVar.a;
            jhmVar.f = cavgVar.c;
            jhmVar.d(new View.OnClickListener(this, cavgVar) { // from class: cauy
                private final cava a;
                private final cavg b;

                {
                    this.a = this;
                    this.b = cavgVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cava cavaVar = this.a;
                    cavg<T> cavgVar2 = this.b;
                    if (cavgVar2.equals(cavaVar.d)) {
                        return;
                    }
                    cavaVar.d = cavgVar2;
                    cavaVar.a.c(cavgVar2.b);
                }
            });
            if (cavgVar.equals(this.d)) {
                jhmVar.c = cqrt.f(2131232559);
            }
            arrayList.add(jhmVar.c());
        }
        a.a(arrayList);
        a.setOnDismissListener(new PopupMenu.OnDismissListener(this) { // from class: cauz
            private final cava a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu) {
                cava cavaVar = this.a;
                cavaVar.b = null;
                cqkx.p(cavaVar);
            }
        });
        a.show();
        this.b = a;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cafd
    public Boolean e() {
        return Boolean.valueOf(this.b != null);
    }

    public void g(T t) {
        for (cavg<T> cavgVar : this.c) {
            if (t != null && t.equals(cavgVar.b)) {
                this.d = cavgVar;
                return;
            }
        }
    }
}
