package defpackage;

import com.google.android.youtube.R;
import java.text.MessageFormat;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: sav  reason: default package */
/* loaded from: classes4.dex */
public final class sav implements saw {
    private final sai a;

    public sav(sai saiVar) {
        this.a = saiVar;
    }

    @Override // defpackage.saw
    public final int a() {
        return 10;
    }

    @Override // defpackage.saw
    public final String b() {
        HashSet c = shp.c();
        for (sat satVar : this.a.l()) {
            CharSequence a = this.a.i(satVar.b).a();
            if (a != null) {
                c.add(a);
            }
        }
        if (c.size() > 1) {
            return this.a.getContext().getString(R.string.aplosA11yChartTypeCombo);
        }
        if (c.size() == 1) {
            return MessageFormat.format(this.a.getContext().getString(R.string.aplosA11yChartTypeTemplate), c.iterator().next());
        }
        return this.a.getContext().getString(R.string.aplosA11yUnknownChartType);
    }
}
