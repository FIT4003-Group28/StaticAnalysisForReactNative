package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cxvb  reason: default package */
/* loaded from: classes5.dex */
final class cxvb implements View.OnClickListener {
    final /* synthetic */ cxvi a;

    public cxvb(cxvi cxviVar) {
        this.a = cxviVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.a.a;
        Toast.makeText(context, context.getResources().getString(R.string.peoplekit_listview_already_selected), 0).show();
    }
}
