package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cxwi  reason: default package */
/* loaded from: classes5.dex */
public final class cxwi {
    public final Activity a;
    public final View b;
    public final PeopleKitVisualElementPath c;
    public final PeopleKitSelectionModel d;
    public final cxov e;
    public final PeopleKitDataLayer f;
    public final cxqo g;
    private final PeopleKitConfig h;
    private String i;
    private cxsq j = cxsq.b();

    public cxwi(Activity activity, PeopleKitConfig peopleKitConfig, PeopleKitSelectionModel peopleKitSelectionModel, cxov cxovVar, PeopleKitDataLayer peopleKitDataLayer, cxqo cxqoVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.a = activity;
        this.h = peopleKitConfig;
        this.d = peopleKitSelectionModel;
        this.e = cxovVar;
        this.f = peopleKitDataLayer;
        this.g = cxqoVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.A));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.c = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_message_bar, (ViewGroup) null);
        this.b = inflate;
        ((MaterialButton) inflate.findViewById(R.id.peoplekit_send_button)).setOnClickListener(new cxwf(this));
        ((TextView) inflate.findViewById(R.id.peoplekit_message_bar_sharing_as)).setText(activity.getString(R.string.peoplekit_message_bar_sharing_as, new Object[]{peopleKitConfig.a()}));
        EditText editText = (EditText) inflate.findViewById(R.id.peoplekit_message_bar);
        editText.setOnFocusChangeListener(new cxwg(this, editText, cxqoVar));
        editText.addTextChangedListener(new cxwh(this, cxqoVar));
        i();
    }

    private final void i() {
        this.b.setBackgroundColor(akm.c(this.a, this.j.a));
        EditText editText = (EditText) this.b.findViewById(R.id.peoplekit_message_bar);
        editText.setTextColor(akm.c(this.a, this.j.e));
        editText.setHintTextColor(akm.c(this.a, this.j.j));
        this.b.findViewById(R.id.peoplekit_message_bar_sharing_as_container).setBackgroundColor(akm.c(this.a, this.j.c));
        ((TextView) this.b.findViewById(R.id.peoplekit_message_bar_sharing_as)).setTextColor(akm.c(this.a, this.j.e));
        ((TextView) this.b.findViewById(R.id.peoplekit_message_bar_sharing_as_helper)).setTextColor(akm.c(this.a, this.j.e));
        this.b.findViewById(R.id.message_bar_divider).setBackgroundColor(akm.c(this.a, this.j.l));
        MaterialButton materialButton = (MaterialButton) this.b.findViewById(R.id.peoplekit_send_button);
        if (materialButton.getVisibility() == 0) {
            materialButton.setBackgroundTintList(ColorStateList.valueOf(akm.c(this.a, this.j.q)));
            materialButton.setTextColor(akm.c(this.a, this.j.k));
        }
    }

    private final void j() {
        TextUtils.isEmpty(null);
    }

    public final void a() {
        this.b.findViewById(R.id.peoplekit_message_bar).setVisibility(4);
        this.b.findViewById(R.id.peoplekit_message_bar_sharing_as_container).setVisibility(8);
    }

    public final void b(String str) {
        ((MaterialButton) this.b.findViewById(R.id.peoplekit_send_button)).setText(str);
    }

    public final void c(cxsq cxsqVar) {
        if (!this.j.equals(cxsqVar)) {
            this.j = cxsqVar;
            i();
        }
    }

    public final void d(String str) {
        ((EditText) this.b.findViewById(R.id.peoplekit_message_bar)).setText(str);
    }

    public final void e(String str) {
        ((EditText) this.b.findViewById(R.id.peoplekit_message_bar)).setHint((CharSequence) null);
    }

    public final void f(String str) {
        ((TextView) this.b.findViewById(R.id.peoplekit_message_bar_sharing_as)).setText(String.format(null, this.h.a()));
    }

    public final void g(String str) {
        this.i = null;
        j();
    }

    public final String h() {
        return ((EditText) this.b.findViewById(R.id.peoplekit_message_bar)).getText().toString();
    }
}
