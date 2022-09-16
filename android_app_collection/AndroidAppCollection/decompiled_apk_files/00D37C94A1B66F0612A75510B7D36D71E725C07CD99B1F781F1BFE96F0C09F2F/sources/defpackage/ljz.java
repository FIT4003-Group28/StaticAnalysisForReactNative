package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.protos.youtube.api.innertube.SettingRenderer;
/* compiled from: PG */
/* renamed from: ljz  reason: default package */
/* loaded from: classes3.dex */
public final class ljz {
    public final Context a;
    public TimeRangeView b;
    public TextView c;
    public CheckBox d;

    public ljz(Context context) {
        this.a = context;
    }

    public final void a(aurm aurmVar) {
        for (aunb aunbVar : aurmVar.d) {
            if (aunbVar.qn(SettingRenderer.a)) {
                aurg aurgVar = (aurg) aunbVar.qm(SettingRenderer.a);
                this.d.setChecked(aurgVar.f);
                CheckBox checkBox = this.d;
                arag aragVar = aurgVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                checkBox.setText(ajgl.b(aragVar));
                return;
            }
        }
    }
}
