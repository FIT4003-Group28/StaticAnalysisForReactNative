package defpackage;

import android.app.Application;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: auwh  reason: default package */
/* loaded from: classes.dex */
public final class auwh implements autg {
    private final auhj A;
    @dzsi
    private dcdn<Integer, aujb> a;
    @dzsi
    private dcdn<Integer, aujb> b;
    private final Application c;
    private final dxio<btwr> d;
    private final bvjj e;
    private final dxio<bypr> f;
    private final dxio<bypd> g;
    private final dxio<byqh> h;
    private final dxio<bypa> i;
    private final dxio<asat> j;
    private final dxio<axvy> k;
    private final dxio<axwq> l;
    private final dxio<ckcw> m;
    private final dxio<jol> n;
    private final dxio<afzs> o;
    private final dxio<afzu> p;
    private final dxio<bztp> q;
    private final dxio<bzui> r;
    private final dxio<bypq> s;
    private final dxio<byps> t;
    private final dxio<aujo> u;
    private final dxio<cezl> v;
    private final dxio<axhq> w;
    private final dxio<apyx> x;
    private final dxio<aqrq> y;
    private final auhi z;

    public auwh(Application application, dxio<btwr> dxioVar, bvjj bvjjVar, dxio<bypr> dxioVar2, dxio<bypd> dxioVar3, dxio<byqh> dxioVar4, dxio<bypa> dxioVar5, dxio<asat> dxioVar6, dxio<axvy> dxioVar7, dxio<axwq> dxioVar8, dxio<ckcw> dxioVar9, dxio<jol> dxioVar10, dxio<afzs> dxioVar11, dxio<afzu> dxioVar12, dxio<bztp> dxioVar13, dxio<bzui> dxioVar14, dxio<bypq> dxioVar15, dxio<byps> dxioVar16, dxio<aujo> dxioVar17, dxio<cezl> dxioVar18, dxio<axhq> dxioVar19, dxio<apyx> dxioVar20, dxio<aqrq> dxioVar21, auhi auhiVar, auhj auhjVar) {
        this.c = application;
        this.d = dxioVar;
        this.e = bvjjVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = dxioVar4;
        this.i = dxioVar5;
        this.j = dxioVar6;
        this.k = dxioVar7;
        this.l = dxioVar8;
        this.m = dxioVar9;
        this.n = dxioVar10;
        this.o = dxioVar11;
        this.p = dxioVar12;
        this.q = dxioVar13;
        this.r = dxioVar14;
        this.s = dxioVar15;
        this.t = dxioVar16;
        this.u = dxioVar17;
        this.v = dxioVar18;
        this.x = dxioVar20;
        this.y = dxioVar21;
        this.w = dxioVar19;
        this.z = auhiVar;
        this.A = auhjVar;
    }

    private final void d() {
        dcdg p = dcdn.p();
        dcdg p2 = dcdn.p();
        dcpd<Integer> it = aujb.b.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            aujb a = a(intValue);
            if (a != null) {
                Integer valueOf = Integer.valueOf(intValue);
                p2.f(valueOf, a);
                if (a.b() != null) {
                    p.f(valueOf, a);
                }
            }
        }
        this.a = p.b();
        this.b = p2.b();
    }

    @Override // defpackage.autg
    @dzsi
    public final aujb a(int i) {
        dpyv b = dpyv.b(i);
        if (b == null) {
            return null;
        }
        switch (b.ordinal()) {
            case 2:
                return new auwm();
            case 3:
                return new auwl();
            case 4:
                return new auwn();
            case 5:
                return new auwi();
            case 6:
            case 15:
            case 16:
            case 17:
            case 18:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case 104:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case 129:
            case 130:
            case 134:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 144:
            case 152:
            case 153:
            case 156:
            case 157:
            case 158:
            case 159:
            case 161:
            case 174:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 193:
            case 194:
            case 195:
            case 196:
            case 204:
            default:
                return null;
            case 7:
                return new auwj();
            case 8:
                return new auwq();
            case 9:
                return new auws();
            case 10:
                return new auwt();
            case 11:
                return new auwo();
            case 12:
                return new auwp();
            case 13:
                return new auwr();
            case 14:
                return new auwx();
            case 19:
                return new auwv();
            case 20:
                return new auxb();
            case 21:
                return new auwk();
            case 22:
                return new auxc();
            case 23:
                return new auwu();
            case 24:
                return new auxa();
            case 25:
                return new auww();
            case 26:
                return new auwz();
            case 27:
                return new auwy();
            case 35:
                return new auyc();
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return new auyd();
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return new auuz();
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return new auyf(new auxz());
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return new auyg(new auxz());
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return new auvz();
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return new auwb();
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return new auwa();
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return new auvx();
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return new auvb();
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return new auyn();
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return new auyq();
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return new auyp();
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return new auyr(new auyp());
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return new auuq();
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return new auup(new auuq(), this.d);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return new auxi(this.m, this.c, this.r, this.q);
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return new auuj();
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return new auxj();
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return new auyl(this.i, this.k, this.l);
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return new auuk(this.f, this.s, this.t, this.u, this.m, this.e);
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                new auuj();
                return new auul(this.f.a());
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return new auuw(new auuj());
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return new auys(this.g, this.h, this.i, this.k, this.l);
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return new auza(new auys(this.g, this.h, this.i, this.k, this.l));
            case 102:
                return new auyz(new auys(this.g, this.h, this.i, this.k, this.l));
            case 105:
                return new auuv();
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return new auvc(new auyc());
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return new auwc(this.n.a());
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return new auut();
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return new auur();
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return new auuu(new auuq(), this.x, this.y);
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return new auyy();
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return new auxe();
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return new auxd(new auxe());
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return new auxp();
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return new auyb();
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return new auxz();
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return new auxn();
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return new auya();
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return new auwg(new auuq());
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return new auyx(new auyy());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return new auxy();
            case 127:
                return new auyt(ddcu.am);
            case 128:
                return new auyu();
            case 131:
                return new auyh();
            case 132:
                return new auym();
            case 133:
                return new auyo(new auyn());
            case 135:
                return new auxm();
            case 136:
                return new auxl();
            case 142:
                return new auzj();
            case 143:
                return new auvy();
            case 145:
                return new auwd();
            case 146:
                return new auxo();
            case 147:
                return new auxq();
            case 148:
                return new auxr();
            case 149:
                return new auxs();
            case 150:
                return new auux();
            case 151:
                return new auzf();
            case 154:
                return new auzg(this.v.a());
            case 155:
                return new auze();
            case 160:
                return new auzk();
            case 162:
                return new auyj(this.c, this.z, this.A);
            case 163:
                return new auyk(this.c, this.z, this.A);
            case 164:
                return new auyi(this.c, this.z, this.A);
            case 165:
                return new auyv();
            case 166:
                return new auvv(this.m, this.o, this.p.a());
            case 167:
                return new auvf();
            case 168:
                return new auvg(this.m, this.o, this.p.a());
            case 169:
                return new auvh(new auvg(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 170:
                return new auvk(this.m, this.o, this.p.a());
            case 171:
                return new auvl(new auvk(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 172:
                return new auvm(this.m, this.o, this.p.a());
            case 173:
                return new auvn(new auvm(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 175:
                return new auvo(this.m, this.o, this.p.a());
            case 176:
                return new auvp(new auvo(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 177:
                return new auvq(this.o);
            case 178:
                return new auvt(this.m, this.o, this.p.a());
            case 179:
                return new auvu(new auvt(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 180:
                return new auvi(this.m, this.o, this.p.a());
            case 181:
                return new auvj(new auvi(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 182:
                return new auvr(this.m, this.o, this.p.a());
            case 183:
                return new auvs(new auvr(this.m, this.o, this.p.a()), this.m, this.o, this.p.a());
            case 184:
                return new auvw();
            case 190:
                return new auwe();
            case 191:
                return new auxt();
            case 192:
                return new auva(this.e, this.j);
            case 197:
                return new auxg(this.w);
            case 198:
                return new auxh(this.w);
            case 199:
                return new auxk(this.c, this.z, this.A);
            case 200:
                return new auve(this.d);
            case 201:
                return new auzb();
            case 202:
                return new auzc();
            case 203:
                return new auzd();
            case 205:
                return new auxf();
            case 206:
                return new auvd();
            case 207:
                return new auxx();
            case 208:
                return new auxw();
            case 209:
                return new auxu();
            case 210:
                return new auxv();
        }
    }

    @Override // defpackage.autg
    public final synchronized dcdn<Integer, aujb> b() {
        dcdn<Integer, aujb> dcdnVar;
        if (this.a == null) {
            d();
        }
        dcdnVar = this.a;
        dbsk.s(dcdnVar);
        return dcdnVar;
    }

    @Override // defpackage.autg
    public final synchronized dcdn<Integer, aujb> c() {
        dcdn<Integer, aujb> dcdnVar;
        if (this.b == null) {
            d();
        }
        dcdnVar = this.b;
        dbsk.s(dcdnVar);
        return dcdnVar;
    }
}
