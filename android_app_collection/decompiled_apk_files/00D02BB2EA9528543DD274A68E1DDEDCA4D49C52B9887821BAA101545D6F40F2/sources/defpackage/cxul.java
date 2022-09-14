package defpackage;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxul  reason: default package */
/* loaded from: classes5.dex */
public final class cxul implements View.OnClickListener {
    final /* synthetic */ cxuo a;

    public cxul(cxuo cxuoVar) {
        this.a = cxuoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxuo cxuoVar = this.a;
        cxqo cxqoVar = cxuoVar.f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.a));
        peopleKitVisualElementPath.c(cxuoVar.g);
        cxqoVar.d(4, peopleKitVisualElementPath);
        AlertDialog.Builder builder = new AlertDialog.Builder(cxuoVar.a, R.style.Dialog);
        View inflate = LayoutInflater.from(cxuoVar.a).inflate(R.layout.peoplekit_top_suggestions_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.peoplekit_top_suggestions_title)).setTextColor(akm.c(cxuoVar.a, cxuoVar.n.e));
        ((TextView) inflate.findViewById(R.id.peoplekit_top_suggestions_content)).setTextColor(akm.c(cxuoVar.a, cxuoVar.n.f));
        builder.setView(inflate).setPositiveButton(R.string.peoplekit_got_it, new cxum());
        AlertDialog create = builder.create();
        Drawable b = sl.b(cxuoVar.a, R.drawable.peoplekit_dialog_background);
        b.setTint(akm.c(cxuoVar.a, cxuoVar.n.a));
        create.getWindow().setBackgroundDrawable(b);
        create.show();
        Button button = create.getButton(-1);
        button.setAllCaps(false);
        try {
            button.setTypeface(ka.a(cxuoVar.a, R.font.google_sans_medium));
        } catch (Exception unused) {
        }
        button.setTextColor(akm.c(cxuoVar.a, cxuoVar.n.q));
        button.setTextSize(0, cxuoVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_row_text_size));
    }
}
