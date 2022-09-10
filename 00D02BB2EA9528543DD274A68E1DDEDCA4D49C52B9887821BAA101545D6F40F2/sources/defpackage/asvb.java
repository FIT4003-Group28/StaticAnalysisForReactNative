package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: asvb  reason: default package */
/* loaded from: classes2.dex */
public final class asvb implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal != 29) {
                switch (ordinal) {
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if ((view instanceof csaw) && (obj == null || (obj instanceof Integer))) {
                            Integer num = (Integer) obj;
                            csaw csawVar = (csaw) view;
                            if (num != null) {
                                csawVar.a(num.intValue(), false);
                            }
                            return true;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if ((view instanceof csaw) && (obj == null || (obj instanceof Integer))) {
                            Integer num2 = (Integer) obj;
                            csaw csawVar2 = (csaw) view;
                            if (num2 != null) {
                                csawVar2.a(num2.intValue(), true);
                            }
                            return true;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if ((view instanceof csaw) && (obj instanceof csao)) {
                            csao csaoVar = (csao) obj;
                            csaw csawVar3 = (csaw) view;
                            if (csaoVar != null) {
                                csawVar3.setLogoInputValueProvider(csaoVar, 5);
                            }
                            return true;
                        }
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if ((view instanceof csaw) && (obj instanceof csao)) {
                            csao csaoVar2 = (csao) obj;
                            csaw csawVar4 = (csaw) view;
                            if (csaoVar2 != null) {
                                csawVar4.setLogoInputValueProvider(csaoVar2, 2);
                            }
                            return true;
                        }
                        break;
                    default:
                        switch (ordinal) {
                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                if ((view instanceof asvq) && (obj instanceof Boolean)) {
                                    ((asvq) view).setShowPowerSaveColors(((Boolean) obj).booleanValue());
                                    return true;
                                }
                                break;
                            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                if ((view instanceof asvq) && (obj instanceof cjxf)) {
                                    ((asvq) view).setButtonSize((cjxf) obj);
                                    return true;
                                }
                                break;
                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                if ((view instanceof asvq) && (obj instanceof asvr)) {
                                    ((asvq) view).setProperties((asvr) obj);
                                    return true;
                                }
                                break;
                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                if ((view instanceof asvf) && (obj instanceof asvg)) {
                                    ((asvf) view).setProperties((asvg) obj);
                                    return true;
                                }
                                break;
                        }
                }
            } else if ((view instanceof View) && (obj instanceof cqtv)) {
                cqtv cqtvVar = (cqtv) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                asuy asuyVar = layoutParams == null ? new asuy() : new asuy(layoutParams);
                asuyVar.a = cqtvVar.e(view.getContext());
                view.setLayoutParams(asuyVar);
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
