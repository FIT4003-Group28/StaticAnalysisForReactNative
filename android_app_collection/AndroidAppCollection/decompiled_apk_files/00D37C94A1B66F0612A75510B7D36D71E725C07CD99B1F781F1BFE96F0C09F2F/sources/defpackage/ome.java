package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: ome  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ome implements ayqb {
    public final /* synthetic */ omh a;
    private final /* synthetic */ int b;

    public /* synthetic */ ome(omh omhVar, int i) {
        this.b = i;
        this.a = omhVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            List list = (List) obj;
            this.a.a.removeAllViews();
            return;
        }
        omh omhVar = this.a;
        Integer num = (Integer) obj;
        omhVar.a.setVisibility(num.intValue());
        Activity activity = (Activity) omhVar.a.getContext();
        if (num.intValue() == 0 && activity != null) {
            activity.setRequestedOrientation(6);
        } else if (activity == null) {
        } else {
            activity.setRequestedOrientation(4);
        }
    }
}
