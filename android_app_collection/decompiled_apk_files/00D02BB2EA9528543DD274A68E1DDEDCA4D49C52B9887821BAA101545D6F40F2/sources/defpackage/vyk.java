package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyk  reason: default package */
/* loaded from: classes7.dex */
public abstract class vyk {
    protected final Context a;

    /* JADX INFO: Access modifiers changed from: protected */
    public vyk(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<RemoteViews> a(vyi vyiVar);

    public final RemoteViews b(vyi vyiVar) {
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), (int) R.layout.notification_text_container);
        for (RemoteViews remoteViews2 : a(vyiVar)) {
            remoteViews.addView(R.id.notification_text_container, remoteViews2);
        }
        return remoteViews;
    }
}
