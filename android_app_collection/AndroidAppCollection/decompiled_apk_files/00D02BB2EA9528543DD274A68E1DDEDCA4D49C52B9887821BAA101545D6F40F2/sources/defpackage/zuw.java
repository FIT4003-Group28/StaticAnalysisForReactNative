package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zuw  reason: default package */
/* loaded from: classes7.dex */
public final class zuw implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof zuu) {
            zuu zuuVar = zuu.HEADER_VIEW_INDEX;
            int ordinal = ((zuu) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof GmmRecyclerView) || !(obj instanceof Integer)) {
                    return false;
                }
                ((GmmRecyclerView) view).setTag(R.id.header_view_index, Integer.valueOf(((Integer) obj).intValue()));
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof zut) || !(obj instanceof Integer)) {
                    return false;
                }
                ((zut) view).h(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof zut) || !(obj instanceof Integer)) {
                    return false;
                }
                ((zut) view).setNestedScrollViewId(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 3) {
                if (!(view instanceof zut) || !(obj instanceof Integer)) {
                    return false;
                }
                ((zut) view).setMinExposurePixels(((Integer) obj).intValue());
                return true;
            } else if (ordinal != 4) {
                if (ordinal != 5 || !(view instanceof zut)) {
                    return false;
                }
                if (obj != null && !(obj instanceof List)) {
                    return false;
                }
                ((zut) view).setSnapPoints((List) obj);
                return true;
            } else if (!(view instanceof zut) || !(obj instanceof cqrp)) {
                return false;
            } else {
                cqrp cqrpVar = (cqrp) obj;
                zut zutVar = (zut) view;
                Context context = zutVar.getContext();
                if (context == null) {
                    return false;
                }
                zutVar.setMinExposurePixels(cqrpVar.NR(context));
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
