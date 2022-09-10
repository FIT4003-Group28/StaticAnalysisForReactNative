package defpackage;

import android.graphics.PorterDuff;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxwz  reason: default package */
/* loaded from: classes5.dex */
public final class cxwz extends abg<cxxa> {
    final /* synthetic */ List a;
    final /* synthetic */ cxxb e;

    public cxwz(cxxb cxxbVar, List list) {
        this.e = cxxbVar;
        this.a = list;
    }

    @Override // defpackage.abg
    public final int c() {
        if (this.e.e instanceof cxwo) {
            return this.a.size() + 1;
        }
        return this.a.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cxxa d(ViewGroup viewGroup, int i) {
        return new cxxa(LayoutInflater.from(this.e.a).inflate(R.layout.peoplekit_single_app_item, (ViewGroup) this.e.f, false));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cxxa cxxaVar, int i) {
        cxxa cxxaVar2 = cxxaVar;
        View view = cxxaVar2.s;
        view.setPadding(i == 0 ? this.e.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_thirdparty_app_tray_side_padding) : 0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.peoplekit_third_party_new_app_icon_id);
        TextView textView = (TextView) view.findViewById(R.id.peoplekit_third_party_new_app_name_id);
        if (!(this.e.e instanceof cxwo) || i != this.a.size()) {
            cxwm cxwmVar = (cxwm) this.a.get(i);
            cxwmVar.b(appCompatImageView);
            cxxb cxxbVar = this.e;
            textView.setTextColor(akm.c(cxxbVar.a, cxxbVar.h.e));
            cxwmVar.c(textView);
            view.setOnClickListener(new cxwy(this, cxxaVar2, cxwmVar));
            return;
        }
        appCompatImageView.setImageResource(R.drawable.quantum_ic_more_horiz_vd_theme_24);
        cxxb cxxbVar2 = this.e;
        textView.setTextColor(akm.c(cxxbVar2.a, cxxbVar2.h.e));
        textView.setText(R.string.peoplekit_show_more);
        appCompatImageView.setColorFilter(akm.c(this.e.a, R.color.google_grey600), PorterDuff.Mode.SRC_IN);
        appCompatImageView.setBackgroundResource(R.drawable.peoplekit_circle_outline);
        view.setOnClickListener(new cxwx(this, cxxaVar2));
    }
}
