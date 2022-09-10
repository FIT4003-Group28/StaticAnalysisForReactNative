package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adlg  reason: default package */
/* loaded from: classes.dex */
public class adlg extends aczs implements adle {
    public final dxio<abwo> a;
    @dzsi
    public String b;
    @dzsi
    public CharSequence c = null;
    public adld d = adld.NONE;
    public dcdc<jic> e = dcdc.e();
    private final Activity f;
    private final ddho g;
    private final absg h;

    public adlg(dxio<abwo> dxioVar, Activity activity, cqhn cqhnVar, absg absgVar) {
        this.a = dxioVar;
        this.f = activity;
        this.g = absgVar == absg.AREA_EXPLORE ? dtxj.da : dtxr.bq;
        this.h = absgVar;
    }

    @Override // defpackage.adle
    public String a() {
        return this.f.getString(R.string.EXPLORE_VISUAL_EXPLORE_TITLE);
    }

    @Override // defpackage.adle
    public String b() {
        CharSequence charSequence = this.c;
        return (charSequence == null || charSequence.toString().isEmpty()) ? "" : this.f.getString(R.string.VISUAL_EXPLORE_TEASER_TITLE);
    }

    @Override // defpackage.adle
    public CharSequence c() {
        CharSequence charSequence = this.c;
        return (charSequence == null || charSequence.toString().isEmpty()) ? this.f.getString(R.string.VISUAL_EXPLORE_TEASER_TITLE) : this.c;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.b);
        b.d = this.g;
        return b.a();
    }

    @Override // defpackage.adle
    public CharSequence f() {
        return this.f.getString(R.string.VISUAL_EXPLORE_TEASER_LINK_TEXT);
    }

    @Override // defpackage.adle
    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: adlf
            private final adlg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a().a();
            }
        };
    }

    @Override // defpackage.adle
    public adld h() {
        return (this.d == adld.NONE || !btpf.c(this.f).f) ? this.d : adld.TWO_CARDS;
    }

    @Override // defpackage.adle
    @dzsi
    public jic j(int i) {
        if (i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    @Override // defpackage.adle
    public cjtd k() {
        return cjtd.a(this.h == absg.AREA_EXPLORE ? dtxj.db : dtxr.br);
    }

    public boolean l() {
        return this.d != adld.NONE;
    }
}
