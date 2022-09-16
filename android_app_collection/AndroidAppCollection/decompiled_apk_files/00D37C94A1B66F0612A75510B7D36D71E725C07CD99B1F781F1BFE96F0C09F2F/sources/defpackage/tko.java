package defpackage;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tko  reason: default package */
/* loaded from: classes4.dex */
public final class tko implements tkk {
    final /* synthetic */ tju a;
    final /* synthetic */ DecimalFormat b;
    private final /* synthetic */ int c;

    public tko(tju tjuVar, DecimalFormat decimalFormat) {
        this.a = tjuVar;
        this.b = decimalFormat;
    }

    public tko(tju tjuVar, DecimalFormat decimalFormat, int i) {
        this.c = i;
        this.a = tjuVar;
        this.b = decimalFormat;
    }

    @Override // defpackage.tkk
    public final String a(Map map) {
        if (this.c == 0) {
            Iterable<Number> j = tly.j(map.get(this.a));
            if (j == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Number number : j) {
                arrayList.add(this.b.format(number));
            }
            return TextUtils.join(",", arrayList);
        } else if (map.get(this.a) instanceof Double) {
            return this.b.format(map.get(this.a));
        } else {
            return null;
        }
    }
}
