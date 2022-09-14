package defpackage;

import com.google.android.apps.maps.R;
import java.text.MessageFormat;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: cpov  reason: default package */
/* loaded from: classes5.dex */
public final class cpov<T, D> implements cpox {
    private final cpoj<T, D> a;

    public cpov(cpoj<T, D> cpojVar) {
        this.a = cpojVar;
    }

    @Override // defpackage.cpox
    public final int a() {
        return 10;
    }

    @Override // defpackage.cpox
    public final String b() {
        HashSet a = cpwm.a();
        for (cpot cpotVar : this.a.l()) {
            CharSequence e = this.a.i(cpotVar.c).e();
            if (e != null) {
                a.add(e);
            }
        }
        if (a.size() > 1) {
            return this.a.getContext().getString(R.string.aplosA11yChartTypeCombo);
        }
        if (a.size() == 1) {
            return MessageFormat.format(this.a.getContext().getString(R.string.aplosA11yChartTypeTemplate), a.iterator().next());
        }
        return this.a.getContext().getString(R.string.aplosA11yUnknownChartType);
    }
}
