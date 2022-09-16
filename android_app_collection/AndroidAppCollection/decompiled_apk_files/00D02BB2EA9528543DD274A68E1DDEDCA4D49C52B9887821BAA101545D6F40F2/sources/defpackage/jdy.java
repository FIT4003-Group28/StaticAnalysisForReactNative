package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jdy  reason: default package */
/* loaded from: classes7.dex */
public final class jdy implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal != 98) {
                if (ordinal != 105 || !(view instanceof jdx) || !(obj instanceof Boolean)) {
                    return false;
                }
                jdx jdxVar = (jdx) view;
                Boolean bool = (Boolean) obj;
                jdxVar.c.setBackgroundResource(true != bool.booleanValue() ? R.drawable.generic_below_shadow : R.drawable.generic_below_shadow_nightmode);
                jdxVar.d.setBackgroundResource(true != bool.booleanValue() ? R.color.divider_grey : R.color.divider_grey_nightmode);
                return true;
            } else if (!(view instanceof jdx) || !(obj instanceof Integer)) {
                return false;
            } else {
                ((jdx) view).b = ((Integer) obj).intValue();
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
