package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxqd  reason: default package */
/* loaded from: classes5.dex */
final class cxqd implements View.OnClickListener {
    final /* synthetic */ cxqh a;

    public cxqd(cxqh cxqhVar) {
        this.a = cxqhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxqo cxqoVar = this.a.g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.h));
        peopleKitVisualElementPath.a(new czhc(dhjm.j));
        peopleKitVisualElementPath.c(this.a.f);
        cxqoVar.d(4, peopleKitVisualElementPath);
        cxoy cxoyVar = this.a.o;
        if (cxoyVar != null) {
            String str = "";
            for (Channel channel : cxoyVar.a.i.b()) {
                if (!TextUtils.isEmpty(str)) {
                    String valueOf = String.valueOf(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(',');
                    sb.append(' ');
                    String valueOf2 = String.valueOf(sb.toString());
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(cxrc.j(channel, cxoyVar.a.b));
                str = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            }
            ((ClipboardManager) cxoyVar.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
            int size = cxoyVar.a.i.b().size();
            Activity activity = this.a.c;
            Toast.makeText(activity, activity.getResources().getQuantityString(R.plurals.peoplekit_chips_copied_recipients, size, Integer.valueOf(size)), 0).show();
        }
        this.a.j.dismiss();
    }
}
