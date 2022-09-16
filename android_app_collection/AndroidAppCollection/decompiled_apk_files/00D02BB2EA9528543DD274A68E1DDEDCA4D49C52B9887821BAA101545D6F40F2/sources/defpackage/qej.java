package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
import java.util.List;
/* compiled from: PG */
/* renamed from: qej  reason: default package */
/* loaded from: classes7.dex */
public final class qej extends cqqh {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qej(CreateDirectionsShortcutActivity createDirectionsShortcutActivity, Context context, cqhw cqhwVar, dehp dehpVar) {
        super(context, cqhwVar, dehpVar, true);
        this.a = createDirectionsShortcutActivity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqqh, defpackage.cqie
    public final void a(List<cqkv> list) {
        list.add(new iuj());
        dbsg.i(this.a);
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity = this.a;
        list.add(new iub(createDirectionsShortcutActivity.y, createDirectionsShortcutActivity.D));
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity2 = this.a;
        list.add(new ackf(createDirectionsShortcutActivity2.y, createDirectionsShortcutActivity2.z, createDirectionsShortcutActivity2.D));
        super.a(list);
    }
}
