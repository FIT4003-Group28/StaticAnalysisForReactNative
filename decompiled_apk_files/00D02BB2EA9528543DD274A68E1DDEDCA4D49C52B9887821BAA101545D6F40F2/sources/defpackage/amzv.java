package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.gmm.map.ui.CompassButtonView;
/* compiled from: PG */
/* renamed from: amzv  reason: default package */
/* loaded from: classes.dex */
public final class amzv implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof amzt) {
            amzt amztVar = amzt.COMPASS_BUTTON_NEEDLE;
            int ordinal = ((amzt) cqkuVar).ordinal();
            Drawable drawable = null;
            if (ordinal == 0) {
                if (!(view instanceof CompassButtonView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof cqtd)) {
                    return false;
                }
                CompassButtonView compassButtonView = (CompassButtonView) view;
                cqtd cqtdVar = (cqtd) obj;
                if (cqtdVar != null) {
                    drawable = cqtdVar.a(compassButtonView.getContext());
                }
                compassButtonView.setNeedleDrawable(drawable);
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof CompassButtonView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof cqtd)) {
                    return false;
                }
                CompassButtonView compassButtonView2 = (CompassButtonView) view;
                cqtd cqtdVar2 = (cqtd) obj;
                if (cqtdVar2 != null) {
                    drawable = cqtdVar2.a(compassButtonView2.getContext());
                }
                compassButtonView2.setNorthDrawable(drawable);
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof CompassButtonView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof amzo)) {
                    return false;
                }
                CompassButtonView compassButtonView3 = (CompassButtonView) view;
                if (((amzo) obj) != null) {
                    compassButtonView3.setCompassSize(null);
                }
                return true;
            } else if (ordinal == 3) {
                if (!(view instanceof CompassButtonView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof Boolean)) {
                    return false;
                }
                CompassButtonView compassButtonView4 = (CompassButtonView) view;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    compassButtonView4.g = bool.booleanValue();
                }
                return true;
            } else if (ordinal != 4) {
                if (ordinal != 5 || !(view instanceof CompassButtonView)) {
                    return false;
                }
                if (obj != null && !(obj instanceof amzu)) {
                    return false;
                }
                CompassButtonView compassButtonView5 = (CompassButtonView) view;
                if (((amzu) obj) != null) {
                    throw null;
                }
                return true;
            } else if (!(view instanceof CompassButtonView)) {
                return false;
            } else {
                if (obj != null && !(obj instanceof Float)) {
                    return false;
                }
                CompassButtonView compassButtonView6 = (CompassButtonView) view;
                Float f = (Float) obj;
                if (f != null) {
                    compassButtonView6.e = f.floatValue();
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
