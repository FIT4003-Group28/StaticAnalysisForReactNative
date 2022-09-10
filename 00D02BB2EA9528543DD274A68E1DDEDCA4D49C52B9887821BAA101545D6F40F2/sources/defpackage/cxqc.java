package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxqc  reason: default package */
/* loaded from: classes5.dex */
final class cxqc implements View.OnClickListener {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxqh b;

    public cxqc(cxqh cxqhVar, Channel channel) {
        this.b = cxqhVar;
        this.a = channel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.b.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.i));
        peopleKitVisualElementPath.a(new czhc(dhjm.j));
        peopleKitVisualElementPath.c(this.b.f);
        cxqoVar.d(4, peopleKitVisualElementPath);
        ((ClipboardManager) this.b.c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, cxrc.j(this.a, this.b.c)));
        Activity activity = this.b.c;
        Toast.makeText(activity, activity.getResources().getQuantityString(R.plurals.peoplekit_chips_copied_recipients, 1, 1), 0).show();
        this.b.j.dismiss();
    }
}
