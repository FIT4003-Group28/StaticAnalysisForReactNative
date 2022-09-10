package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwnd  reason: default package */
/* loaded from: classes4.dex */
public final class bwnd {
    private static final dcqe a = dcqe.c("bwnd");

    public static dtja a(int i) {
        dtja b = dtja.b(i);
        return b == null ? dtja.INVALID_UI_TYPE : b;
    }

    public static dtmr b(Resources resources, dtjt dtjtVar, bwnj bwnjVar) {
        int i;
        dtkx k;
        dccx F = dcdc.F();
        dsrj<dtrk> dsrjVar = dtjtVar.c;
        if (!dsrjVar.isEmpty()) {
            int i2 = dtjtVar.d;
            for (int i3 = i2 - 1; i3 <= i2 + 1; i3++) {
                if (i3 >= 0 && i3 < dsrjVar.size() && dsrjVar.get(i3).e) {
                    i = 0;
                    break;
                }
            }
        }
        String string = resources.getString(R.string.DIRECTIONS_YOUR_LOCATION);
        dtke dtkeVar = (dtke) dtkf.n.bZ();
        dtkeVar.b(string);
        dtkm bZ = dtkq.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtkq dtkqVar = (dtkq) bZ.b;
        dtkqVar.a |= 1;
        dtkqVar.b = 241;
        if (dtkeVar.c) {
            dtkeVar.bF();
            dtkeVar.c = false;
        }
        dtkf dtkfVar = (dtkf) dtkeVar.b;
        dtkq bK = bZ.bK();
        bK.getClass();
        dtkfVar.f = bK;
        dtkfVar.a |= 1;
        dpjq bZ2 = dpjx.n.bZ();
        if (string != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpjx dpjxVar = (dpjx) bZ2.b;
            string.getClass();
            dpjxVar.a |= 128;
            dpjxVar.e = string;
        }
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpjx dpjxVar2 = (dpjx) bZ2.b;
        dpjxVar2.f = dpjsVar.h;
        dpjxVar2.a |= 256;
        dpjx dpjxVar3 = (dpjx) bZ2.b;
        dpjxVar3.g = 4;
        dpjxVar3.a |= 512;
        dtha bZ3 = dthb.F.bZ();
        dtqv bZ4 = dtqw.h.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtqw dtqwVar = (dtqw) bZ4.b;
        dpjx bK2 = bZ2.bK();
        bK2.getClass();
        dtqwVar.b = bK2;
        dtqwVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dthb dthbVar = (dthb) bZ3.b;
        dtqw bK3 = bZ4.bK();
        bK3.getClass();
        dthbVar.r = bK3;
        dthbVar.a |= ImageMetadata.SHADING_MODE;
        dthb bK4 = bZ3.bK();
        if (dtkeVar.c) {
            dtkeVar.bF();
            dtkeVar.c = false;
        }
        dtkf dtkfVar2 = (dtkf) dtkeVar.b;
        bK4.getClass();
        dtkfVar2.h = bK4;
        dtkfVar2.a |= 2;
        String d = owy.d(0, 0, dtyi.ca);
        if (dtkeVar.c) {
            dtkeVar.bF();
            dtkeVar.c = false;
        }
        dtkf dtkfVar3 = (dtkf) dtkeVar.b;
        d.getClass();
        dtkfVar3.a |= 16;
        dtkfVar3.k = d;
        dtkf dtkfVar4 = (dtkf) dtkeVar.bK();
        dtkw dtkwVar = (dtkw) dtkx.e.bZ();
        dtkt dtktVar = (dtkt) dtku.p.bZ();
        if (dtktVar.c) {
            dtktVar.bF();
            dtktVar.c = false;
        }
        dtku dtkuVar = (dtku) dtktVar.b;
        dtkfVar4.getClass();
        dtkuVar.b = dtkfVar4;
        dtkuVar.a |= 1;
        if (dtkwVar.c) {
            dtkwVar.bF();
            dtkwVar.c = false;
        }
        dtkx dtkxVar = (dtkx) dtkwVar.b;
        dtku dtkuVar2 = (dtku) dtktVar.bK();
        dtkuVar2.getClass();
        dtkxVar.b = dtkuVar2;
        dtkxVar.a |= 1;
        dtlc bZ5 = dtlf.f.bZ();
        dtle dtleVar = dtle.LIST_ITEM;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dtlf dtlfVar = (dtlf) bZ5.b;
        dtlfVar.b = dtleVar.bk;
        dtlfVar.a |= 1;
        dtkwVar.a(bZ5);
        F.g((dtkx) dtkwVar.bK());
        i = 1;
        String string2 = resources.getString(R.string.DIRECTIONS_CARD_CHOOSE_FROM_MAP);
        dtqv bZ6 = dtqw.h.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dtqw dtqwVar2 = (dtqw) bZ6.b;
        dtqwVar2.a |= 2;
        dtqwVar2.c = true;
        dtqw bK5 = bZ6.bK();
        dtha bZ7 = dthb.F.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dthb dthbVar2 = (dthb) bZ7.b;
        bK5.getClass();
        dthbVar2.r = bK5;
        dthbVar2.a |= ImageMetadata.SHADING_MODE;
        dthb bK6 = bZ7.bK();
        dtke dtkeVar2 = (dtke) dtkf.n.bZ();
        dtkeVar2.b(string2);
        dtkm bZ8 = dtkq.f.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dtkq dtkqVar2 = (dtkq) bZ8.b;
        dtkqVar2.a |= 1;
        dtkqVar2.b = 196;
        if (dtkeVar2.c) {
            dtkeVar2.bF();
            dtkeVar2.c = false;
        }
        dtkf dtkfVar5 = (dtkf) dtkeVar2.b;
        dtkq bK7 = bZ8.bK();
        bK7.getClass();
        dtkfVar5.f = bK7;
        dtkfVar5.a |= 1;
        if (dtkeVar2.c) {
            dtkeVar2.bF();
            dtkeVar2.c = false;
        }
        dtkf dtkfVar6 = (dtkf) dtkeVar2.b;
        bK6.getClass();
        dtkfVar6.h = bK6;
        dtkfVar6.a |= 2;
        String d2 = owy.d(i, 0, dtyi.bY);
        if (dtkeVar2.c) {
            dtkeVar2.bF();
            dtkeVar2.c = false;
        }
        dtkf dtkfVar7 = (dtkf) dtkeVar2.b;
        d2.getClass();
        dtkfVar7.a |= 16;
        dtkfVar7.k = d2;
        dtkf dtkfVar8 = (dtkf) dtkeVar2.bK();
        dtkw dtkwVar2 = (dtkw) dtkx.e.bZ();
        dtkt dtktVar2 = (dtkt) dtku.p.bZ();
        if (dtktVar2.c) {
            dtktVar2.bF();
            dtktVar2.c = false;
        }
        dtku dtkuVar3 = (dtku) dtktVar2.b;
        dtkfVar8.getClass();
        dtkuVar3.b = dtkfVar8;
        dtkuVar3.a |= 1;
        if (dtkwVar2.c) {
            dtkwVar2.bF();
            dtkwVar2.c = false;
        }
        dtkx dtkxVar2 = (dtkx) dtkwVar2.b;
        dtku dtkuVar4 = (dtku) dtktVar2.bK();
        dtkuVar4.getClass();
        dtkxVar2.b = dtkuVar4;
        dtkxVar2.a |= 1;
        dtlc bZ9 = dtlf.f.bZ();
        dtle dtleVar2 = dtle.LIST_ITEM;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dtlf dtlfVar2 = (dtlf) bZ9.b;
        dtlfVar2.b = dtleVar2.bk;
        dtlfVar2.a |= 1;
        dtkwVar2.a(bZ9);
        F.g((dtkx) dtkwVar2.bK());
        bwne R = bwnjVar.R();
        if (R != null && (k = R.k()) != null) {
            F.g(k);
        }
        bwnh bwnhVar = new bwnh(10, 0L);
        dthy bZ10 = dtid.d.bZ();
        dtic dticVar = dtic.VERTICAL_LIST;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dtid dtidVar = (dtid) bZ10.b;
        dtidVar.c = dticVar.g;
        dtidVar.a |= 1;
        dcdc f = F.f();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dtid dtidVar2 = (dtid) bZ10.b;
        dtidVar2.c();
        dsod.bv(f, dtidVar2.b);
        return bwng.a(bwnhVar, dcdc.f(bZ10.bK()));
    }

    public static dtja c(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dtja.DIRECTIONS_BICYCLE;
            }
            if (ordinal == 2) {
                return dtja.DIRECTIONS_WALKING;
            }
            if (ordinal == 3) {
                return dtja.DIRECTIONS_TRANSIT;
            }
            if (ordinal == 4) {
                return dtja.DIRECTIONS_FLYING;
            }
            if (ordinal == 5) {
                return dtja.DIRECTIONS_TWO_WHEELER;
            }
            if (ordinal == 7) {
                return dtja.DIRECTIONS_DRIVING;
            }
            bvoo.h("Unknown travel mode: %s", dqvjVar);
            return dtja.DIRECTIONS_DRIVING;
        }
        return dtja.DIRECTIONS_DRIVING;
    }

    public static amvh d(dtrk dtrkVar) {
        amvg amvgVar = new amvg();
        int i = dtrkVar.a;
        if ((i & 1) != 0) {
            amvgVar.b = dtrkVar.b;
        }
        if ((i & 2) != 0) {
            dgrh dgrhVar = dtrkVar.c;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            amvgVar.c = akqi.k(dgrhVar);
        }
        if ((dtrkVar.a & 4) != 0) {
            dgrn dgrnVar = dtrkVar.d;
            if (dgrnVar == null) {
                dgrnVar = dgrn.d;
            }
            amvgVar.d = akqq.m(dgrnVar);
        }
        if (dtrkVar.e) {
            amvgVar.a = dpjs.ENTITY_TYPE_MY_LOCATION;
        }
        return amvgVar.a();
    }

    public static dtrk e(amvh amvhVar) {
        dtrj bZ = dtrk.f.bZ();
        String str = amvhVar.c;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtrk dtrkVar = (dtrk) bZ.b;
            str.getClass();
            dtrkVar.a |= 1;
            dtrkVar.b = str;
        }
        akqi akqiVar = amvhVar.d;
        if (akqiVar != null) {
            dgrh h = akqiVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtrk dtrkVar2 = (dtrk) bZ.b;
            h.getClass();
            dtrkVar2.c = h;
            dtrkVar2.a |= 2;
        }
        akqq akqqVar = amvhVar.e;
        if (akqqVar != null) {
            dgrn n = akqqVar.n();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtrk dtrkVar3 = (dtrk) bZ.b;
            n.getClass();
            dtrkVar3.d = n;
            dtrkVar3.a |= 4;
        }
        boolean k = amvhVar.k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtrk dtrkVar4 = (dtrk) bZ.b;
        dtrkVar4.a |= 8;
        dtrkVar4.e = k;
        return bZ.bK();
    }

    public static nxo f(bwnf bwnfVar) {
        nxn nxnVar;
        int i;
        dccx F = dcdc.F();
        for (dtid dtidVar : bwnfVar.a().f) {
            dtmr a2 = bwnfVar.a();
            dcdc<dtic> dcdcVar = oxb.b;
            dtic b = dtic.b(dtidVar.c);
            if (b == null) {
                b = dtic.INVALID_STYLE;
            }
            if (dcdcVar.contains(b)) {
                dqvj dqvjVar = dqvj.DRIVE;
                int i2 = bwni.a(a2).b;
                if (i2 != 1000) {
                    switch (i2) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 11;
                            break;
                        case 11:
                            i = 12;
                            break;
                        case 12:
                            i = 13;
                            break;
                        case 13:
                            i = 14;
                            break;
                        case 14:
                            i = 15;
                            break;
                        case 15:
                            i = 16;
                            break;
                        case 16:
                            i = 17;
                            break;
                        case 17:
                            i = 18;
                            break;
                        case 18:
                            i = 19;
                            break;
                        case 19:
                            i = 20;
                            break;
                        case 20:
                            i = 21;
                            break;
                        case 21:
                            i = 22;
                            break;
                        case 22:
                            i = 23;
                            break;
                        case 23:
                            i = 24;
                            break;
                        case 24:
                            i = 25;
                            break;
                        case 25:
                            i = 26;
                            break;
                        case 26:
                            i = 27;
                            break;
                        case 27:
                            i = 28;
                            break;
                        case 28:
                            i = 29;
                            break;
                        case 29:
                            i = 30;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            i = 31;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            i = 32;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                            i = 33;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            i = 34;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            i = 35;
                            break;
                        case 35:
                            i = 36;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                            i = 37;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            i = 38;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            i = 39;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            i = 40;
                            break;
                        case com.google.android.filament.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            i = 41;
                            break;
                        default:
                            switch (i2) {
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                    i = 43;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    i = 44;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                    i = 45;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                    i = 46;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                    i = 47;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                    i = 48;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    i = 49;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                    i = 50;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                    i = 51;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    i = 52;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    i = 53;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    i = 54;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                    i = 55;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                    i = 56;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorError /* 56 */:
                                    i = 57;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                    i = 58;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                    i = 59;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                    i = 60;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                    i = 61;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                    i = 62;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                    i = 63;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                    i = 64;
                                    break;
                                case com.google.android.filament.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                    i = 65;
                                    break;
                                default:
                                    switch (i2) {
                                        case com.google.android.filament.R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                            i = 67;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                            i = 68;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                            i = 69;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                            i = 70;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                            i = 71;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                            i = 72;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                            i = 73;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                                            i = 74;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                            i = 75;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                            i = 76;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                            i = 77;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                            i = 78;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                            i = 79;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                                            i = 80;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                            i = 81;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                            i = 82;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                            i = 83;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                            i = 84;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                            i = 85;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                                            i = 86;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                            i = 87;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                                            i = 88;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                            i = 89;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                            i = 90;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                            i = 91;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                            i = 92;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                            i = 93;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                            i = 94;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                                            i = 95;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                                            i = 96;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                            i = 97;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                                            i = 98;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                            i = 99;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                            i = 100;
                                            break;
                                        case 100:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_switchStyle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                            i = 102;
                                            break;
                                        case 102:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceListItem;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                            i = 104;
                                            break;
                                        case 104:
                                            i = 105;
                                            break;
                                        case 105:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textColorAlertDialogListItem;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_textColorSearchUrl;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_toolbarStyle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_tooltipForegroundColor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_tooltipFrameBackground;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_viewInflaterClass;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowActionBar;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowActionBarOverlay;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowActionModeOverlay;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMajor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMinor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMajor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMajor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMinor;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                            i = com.google.android.filament.R.styleable.AppCompatTheme_windowNoTitle;
                                            break;
                                        case com.google.android.filament.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                            i = 127;
                                            break;
                                        case 127:
                                            i = 128;
                                            break;
                                        case 128:
                                            i = 129;
                                            break;
                                        case 129:
                                            i = 130;
                                            break;
                                        case 130:
                                            i = 131;
                                            break;
                                        case 131:
                                            i = 132;
                                            break;
                                        case 132:
                                            i = 133;
                                            break;
                                        case 133:
                                            i = 134;
                                            break;
                                        case 134:
                                            i = 135;
                                            break;
                                        case 135:
                                            i = 136;
                                            break;
                                        case 136:
                                            i = 137;
                                            break;
                                        case 137:
                                            i = 138;
                                            break;
                                        case 138:
                                            i = 139;
                                            break;
                                        case 139:
                                            i = 140;
                                            break;
                                        case 140:
                                            i = 141;
                                            break;
                                        case 141:
                                            i = 142;
                                            break;
                                        case 142:
                                            i = 143;
                                            break;
                                        case 143:
                                            i = 144;
                                            break;
                                        case 144:
                                            i = 145;
                                            break;
                                        case 145:
                                            i = 146;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                            }
                    }
                } else {
                    i = 1001;
                }
                if (i == 0) {
                    i = 1;
                }
                int i3 = i - 1;
                if (i3 == 1 || i3 == 3) {
                    nxnVar = new nxp(bwnfVar, dtidVar);
                } else {
                    nxnVar = new nxn(bwnfVar, dtidVar);
                }
            } else {
                nxnVar = null;
            }
            if (nxnVar != null) {
                F.g(nxnVar);
            }
        }
        return new nxo(bwnfVar, F.f());
    }

    public static List<dtmr> g(dtnh dtnhVar, dtqu dtquVar) {
        ArrayList arrayList = new ArrayList();
        for (dtmr dtmrVar : dtnhVar.c) {
            if (!dtmrVar.d.isEmpty()) {
                for (dtqu dtquVar2 : dtmrVar.d) {
                    if ((dtquVar2.a & 1) != 0) {
                        dtja b = dtja.b(dtquVar2.b);
                        if (b == null) {
                            b = dtja.INVALID_UI_TYPE;
                        }
                        dtja b2 = dtja.b(dtquVar.b);
                        if (b2 == null) {
                            b2 = dtja.INVALID_UI_TYPE;
                        }
                        if (b != b2) {
                            continue;
                        }
                    }
                    if ((dtquVar2.a & 2) != 0) {
                        dtjs b3 = dtjs.b(dtquVar2.c);
                        if (b3 == null) {
                            b3 = dtjs.SOURCE;
                        }
                        dtjs b4 = dtjs.b(dtquVar.c);
                        if (b4 == null) {
                            b4 = dtjs.SOURCE;
                        }
                        if (b3 != b4) {
                            continue;
                        }
                    }
                    if (!dtquVar2.d || dtquVar.d) {
                        if (dtquVar2.e && !dtquVar.e) {
                        }
                    }
                }
            }
            arrayList.add(dtmrVar);
        }
        return arrayList;
    }

    public static dtqu h(dtja dtjaVar, bwno bwnoVar) {
        dtqt bZ = dtqu.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtqu dtquVar = (dtqu) bZ.b;
        dtquVar.b = dtjaVar.A;
        int i = dtquVar.a | 1;
        dtquVar.a = i;
        boolean z = bwnoVar.b;
        int i2 = i | 4;
        dtquVar.a = i2;
        dtquVar.d = z;
        boolean z2 = bwnoVar.c;
        int i3 = i2 | 8;
        dtquVar.a = i3;
        dtquVar.e = z2;
        dtjs dtjsVar = bwnoVar.d;
        if (dtjsVar != null) {
            dtquVar.c = dtjsVar.d;
            dtquVar.a = i3 | 2;
        }
        return bZ.bK();
    }
}
