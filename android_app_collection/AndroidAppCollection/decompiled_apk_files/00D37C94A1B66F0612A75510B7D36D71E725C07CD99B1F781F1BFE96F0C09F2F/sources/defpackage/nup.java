package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nup  reason: default package */
/* loaded from: classes3.dex */
public final class nup {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;

    public nup(Context context, aacz aaczVar, axxu axxuVar) {
        asxj asxjVar;
        Double valueOf;
        Double valueOf2;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.flexy_default_min_metadata_view_height);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.flexy_default_max_screen_ratio, typedValue, true);
        float f = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_min_height_aspect_ratio, typedValue, true);
        float f2 = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_engagement_panel_max_height_aspect_ratio, typedValue, true);
        if ((aaczVar.b().b & 16) != 0) {
            asxjVar = aaczVar.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
        } else {
            asxjVar = null;
        }
        if (asxjVar == null) {
            this.a = f2;
            this.b = f;
            this.c = dimensionPixelSize;
            this.d = 0.0f;
            this.e = 0.0f;
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f3 = asxjVar.o;
        this.a = f3 > 0.0f ? f3 : f2;
        float f4 = asxjVar.p;
        this.b = f4 > 0.0f ? f4 : f;
        float f5 = asxjVar.q;
        this.c = f5 > 0.0f ? zew.i(displayMetrics, (int) f5) : dimensionPixelSize;
        aqxe aqxeVar = axxuVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        double d = 0.0d;
        if (aqxeVar.a(45353195L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353195L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353195L);
            valueOf = Double.valueOf(aqxfVar.b == 4 ? ((Double) aqxfVar.c).doubleValue() : 0.0d);
        } else {
            valueOf = Double.valueOf(0.0d);
        }
        this.d = zgd.N(valueOf.floatValue(), 0.0f, 1.0f);
        aqxe aqxeVar2 = axxuVar.b.b().C;
        aqxeVar2 = aqxeVar2 == null ? aqxe.a : aqxeVar2;
        if (aqxeVar2.a(45353196L)) {
            aoqp aoqpVar2 = aqxeVar2.b;
            if (!aoqpVar2.containsKey(45353196L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45353196L);
            valueOf2 = Double.valueOf(aqxfVar2.b == 4 ? ((Double) aqxfVar2.c).doubleValue() : d);
        } else {
            valueOf2 = Double.valueOf(0.0d);
        }
        this.e = zgd.N(valueOf2.floatValue(), 0.0f, 1.0f);
    }
}
