package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgpi  reason: default package */
/* loaded from: classes3.dex */
public class bgpi implements bgnx {
    public final dxio<afha> a;
    public final dgcc b;
    private final Activity c;
    private final cjtd d;
    private final String e;
    private final boolean f;
    private int g;

    public bgpi(Activity activity, dxio<afha> dxioVar, ilo iloVar, dipk dipkVar, int i) {
        this.c = activity;
        this.a = dxioVar;
        this.d = iloVar.bZ();
        this.e = dipkVar.q;
        dgcc dgccVar = dipkVar.w;
        this.b = dgccVar == null ? dgcc.e : dgccVar;
        this.f = dipkVar.m.size() > 0;
        this.g = i;
    }

    @Override // defpackage.bgnx
    public Boolean a() {
        return Boolean.valueOf(this.b.c.size() > 0);
    }

    @Override // defpackage.bgnx
    public Boolean b() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bgnx
    public String c() {
        return this.b.c.size() > 0 ? this.b.c.get(0).a : "";
    }

    @Override // defpackage.bgnx
    public String d() {
        return this.b.c.size() > 0 ? this.c.getString(R.string.POST_REMOVAL_REASON_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.g + 1), c()}) : "";
    }

    @Override // defpackage.bgnx
    public String e() {
        return this.c.getString(R.string.POST_REMOVAL_LEARN_MORE_BUTTON_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.g + 1)});
    }

    @Override // defpackage.bgnx
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: bgph
            private final bgpi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgpi bgpiVar = this.a;
                if ((bgpiVar.b.a & 2) != 0) {
                    afha a = bgpiVar.a.a();
                    dgbo dgboVar = bgpiVar.b.d;
                    if (dgboVar == null) {
                        dgboVar = dgbo.e;
                    }
                    a.m(dgboVar.c, 1);
                }
            }
        };
    }

    @Override // defpackage.bgnx
    public cjtd g(ddho ddhoVar) {
        cjta c = cjtd.c(this.d);
        c.d = ddhoVar;
        c.g(this.e);
        return c.a();
    }

    @Override // defpackage.bgnx
    public void h(int i) {
        this.g = i;
    }
}
