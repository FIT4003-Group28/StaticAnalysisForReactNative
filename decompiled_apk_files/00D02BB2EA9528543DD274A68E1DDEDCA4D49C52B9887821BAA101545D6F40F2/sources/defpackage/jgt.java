package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: jgt  reason: default package */
/* loaded from: classes.dex */
public final class jgt implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 56) {
                if (!(view instanceof MapViewContainer)) {
                    return false;
                }
                if (obj != null && !(obj instanceof Float)) {
                    return false;
                }
                ((MapViewContainer) view).l = (Float) obj;
                return true;
            } else if (ordinal == 92) {
                if (!(view instanceof MapViewContainer) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((MapViewContainer) view).n((Boolean) obj);
                return true;
            } else {
                switch (ordinal) {
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        if (!(view instanceof MapViewContainer) || !(obj instanceof dmlo)) {
                            return false;
                        }
                        ((MapViewContainer) view).k = (dmlo) obj;
                        return true;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        if (!(view instanceof MapViewContainer)) {
                            return false;
                        }
                        if (obj != null && !(obj instanceof akqq)) {
                            return false;
                        }
                        ((MapViewContainer) view).o((akqq) obj);
                        return true;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        if (!(view instanceof MapViewContainer) || !(obj instanceof Integer)) {
                            return false;
                        }
                        ((MapViewContainer) view).j = ((Integer) obj).intValue();
                        return true;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        if (!(view instanceof MapViewContainer) || !(obj instanceof dmqc)) {
                            return false;
                        }
                        ((MapViewContainer) view).h = (dmqc) obj;
                        return true;
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                        if (!(view instanceof MapViewContainer) || !(obj instanceof dmqc)) {
                            return false;
                        }
                        ((MapViewContainer) view).i = (dmqc) obj;
                        return true;
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        if (!(view instanceof MapViewContainer) || !(obj instanceof akps)) {
                            return false;
                        }
                        ((MapViewContainer) view).g = (akps) obj;
                        return true;
                    default:
                        return false;
                }
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
