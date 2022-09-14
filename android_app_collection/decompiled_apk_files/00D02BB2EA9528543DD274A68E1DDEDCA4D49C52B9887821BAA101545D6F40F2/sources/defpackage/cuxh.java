package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.composebox.LighterEditText;
/* renamed from: cuxh  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cuxh {
    private final LighterEditText a;

    public cuxh(LighterEditText lighterEditText) {
        this.a = lighterEditText;
    }

    public final void a() {
        Context context = this.a.getContext();
        Toast.makeText(context, context.getString(R.string.IMAGE_DISABLED_FOR_APP_TOAST_MESSAGE, context.getString(R.string.BUSINESS_MESSAGING)), 1).show();
    }
}
