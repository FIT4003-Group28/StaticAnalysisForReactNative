package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.protos.youtube.api.innertube.SettingRenderer;
/* compiled from: PG */
/* renamed from: lkd  reason: default package */
/* loaded from: classes3.dex */
public final class lkd {
    public TimeRangeView a;
    public final Context b;
    public final aken c;
    public TextView d;
    public RadioButton e;
    public RadioButton f;
    public View g;
    public CheckBox h;

    public lkd(Context context, aken akenVar) {
        this.b = context;
        this.c = akenVar;
    }

    public final void a(aurm aurmVar) {
        for (aunb aunbVar : aurmVar.d) {
            if (aunbVar.qn(SettingRenderer.a)) {
                aurg aurgVar = (aurg) aunbVar.qm(SettingRenderer.a);
                this.h.setChecked(aurgVar.f);
                CheckBox checkBox = this.h;
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
