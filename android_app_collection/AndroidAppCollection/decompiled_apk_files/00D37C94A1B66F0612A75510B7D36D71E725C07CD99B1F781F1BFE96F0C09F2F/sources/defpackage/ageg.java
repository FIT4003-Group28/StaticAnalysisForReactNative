package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ageg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ageg implements ayqe {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ ageg(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            Integer num = (Integer) obj;
            return new RemoteViews(this.a.getPackageName(), (int) R.layout.notification_survey_five_options);
        }
        return Integer.valueOf(lpw.aG(this.a, ((Boolean) obj).booleanValue()));
    }
}
