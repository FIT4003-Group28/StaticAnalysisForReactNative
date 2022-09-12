package defpackage;

import android.widget.RadioGroup;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
/* compiled from: PG */
/* renamed from: qek  reason: default package */
/* loaded from: classes7.dex */
public final class qek implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    public qek(CreateDirectionsShortcutActivity createDirectionsShortcutActivity) {
        this.a = createDirectionsShortcutActivity;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity = this.a;
        Object tag = radioGroup.findViewById(i).getTag();
        dbsk.s(tag);
        createDirectionsShortcutActivity.n = (dqvj) tag;
        this.a.v();
        this.a.M();
    }
}
