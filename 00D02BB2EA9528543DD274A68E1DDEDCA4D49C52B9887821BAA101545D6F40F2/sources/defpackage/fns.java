package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fns  reason: default package */
/* loaded from: classes.dex */
public final class fns<T> implements dzsj<T> {
    final /* synthetic */ ftt a;
    private final int b;

    public fns(ftt fttVar, int i) {
        this.a = fttVar;
        this.b = i;
    }

    private final T b() {
        int i = this.b;
        switch (i) {
            case 0:
                return (T) new emi(this.a);
            case 1:
                return (T) new emg(this.a);
            case 2:
                return (T) new emn(this.a);
            case 3:
                return (T) new fcq(this.a);
            case 4:
                return (T) new fop(this.a);
            case 5:
                return (T) new fat(this.a);
            case 6:
                return (T) new evy(this.a);
            case 7:
                return (T) new eyc(this.a);
            case 8:
                return (T) new evw(this.a);
            case 9:
                return (T) new foi(this.a);
            case 10:
                return (T) new eso(this.a);
            case 11:
                return (T) new elj(this.a);
            case 12:
                return (T) new eyz(this.a);
            case 13:
                return (T) new ezc(this.a);
            case 14:
                return (T) new ezf(this.a);
            case 15:
                return (T) new ezj(this.a);
            case 16:
                return (T) new ezh(this.a);
            case 17:
                return (T) new eot(this.a);
            case 18:
                return (T) new elx(this.a);
            case 19:
                return (T) new ftg(this.a);
            case 20:
                return (T) new eny(this.a);
            case 21:
                return (T) new eob(this.a);
            case 22:
                return (T) new eod(this.a);
            case 23:
                return (T) new fru(this.a);
            case 24:
                return (T) new eog(this.a);
            case 25:
                return (T) new eoj(this.a);
            case 26:
                return (T) new fqj(this.a);
            case 27:
                return (T) new fey(this.a);
            case 28:
                return (T) new erm(this.a);
            case 29:
                return (T) new fkf(this.a);
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) new fki(this.a);
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) new fsd(this.a);
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) new fpo(this.a);
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) new fmt(this.a);
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return (T) new fmr(this.a);
            case 35:
                return (T) new fcv(this.a);
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return (T) new fpr(this.a);
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return (T) new fqe(this.a);
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return (T) new fiu(this.a);
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return (T) new fdj(this.a);
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return (T) new fpt(this.a);
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return (T) new fsy(this.a);
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return (T) new fcy(this.a);
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return (T) new fda(this.a);
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return (T) new fcs(this.a);
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return (T) new fqr(this.a);
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return (T) new fqp(this.a);
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return (T) new ero(this.a);
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return (T) new euh(this.a);
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return (T) new eue(this.a);
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return (T) new eun(this.a);
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return (T) new euq(this.a);
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return (T) new fmf(this.a);
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return (T) new euk(this.a);
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return (T) new fgv(this.a);
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return (T) new fgs(this.a);
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return (T) new ffv(this.a);
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return (T) new euv(this.a);
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return (T) new evi(this.a);
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return (T) new ffy(this.a);
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return (T) new fgc(this.a);
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return (T) new fde(this.a);
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return (T) new foz(this.a);
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return (T) new fte(this.a);
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return (T) new evk(this.a);
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return (T) new etw(this.a);
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return (T) new evr(this.a);
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return (T) new esh(this.a);
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return (T) new evu(this.a);
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return (T) new fil(this.a);
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return (T) new epm(this.a);
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return (T) new epi(this.a);
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return (T) new enm(this.a);
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                return (T) new epb(this.a);
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return (T) new fge(this.a);
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return (T) new frw(this.a);
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return (T) new fdt(this.a);
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return (T) new epk(this.a);
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return (T) new etm(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return (T) new fdv(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return (T) new fdy(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return (T) new exw(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return (T) new etd(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return (T) new ext(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return (T) new esf(this.a);
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return (T) new eoz(this.a);
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                return (T) new ena(this.a);
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return (T) new eyh(this.a);
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return (T) new eyl(this.a);
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return (T) new eyn(this.a);
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return (T) new eqh(this.a);
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                return (T) new ets(this.a);
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return (T) new flq(this.a);
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                return (T) new fkm(this.a);
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return (T) new fok(this.a);
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return (T) new ffq(this.a);
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return (T) new eow(this.a);
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return (T) new fmm(this.a);
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return (T) new enc(this.a);
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return (T) new ema(this.a);
            default:
                throw new AssertionError(i);
        }
    }

    private final T c() {
        int i = this.b;
        switch (i) {
            case 100:
                return (T) new eom(this.a);
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return (T) new fqg(this.a);
            case 102:
                return (T) new fhf(this.a);
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return (T) new eqy(this.a);
            case 104:
                return (T) new esq(this.a);
            case 105:
                return (T) new eto(this.a);
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return (T) new fdc(this.a);
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return (T) new ffi(this.a);
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return (T) new fhk(this.a);
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return (T) new ftj(this.a);
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return (T) new fln(this.a);
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                return (T) new flt(this.a);
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                return (T) new fon(this.a);
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return (T) new eqk(this.a);
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return (T) new eqq(this.a);
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return (T) new eqn(this.a);
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return (T) new eyt(this.a);
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return (T) new fmo(this.a);
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return (T) new eyw(this.a);
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return (T) new ftl(this.a);
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return (T) new epg(this.a);
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                return (T) new fqx(this.a);
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return (T) new ezm(this.a);
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return (T) new eww(this.a);
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return (T) new eni(this.a);
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return (T) new eps(this.a);
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return (T) new ezo(this.a);
            case 127:
                return (T) new enw(this.a);
            case 128:
                return (T) new faa(this.a);
            case 129:
                return (T) new faf(this.a);
            case 130:
                return (T) new fai(this.a);
            case 131:
                return (T) new fal(this.a);
            case 132:
                return (T) new evd(this.a);
            case 133:
                return (T) new erc(this.a);
            case 134:
                return (T) new fac(this.a);
            case 135:
                return (T) new fhm(this.a);
            case 136:
                return (T) new fcf(this.a);
            case 137:
                return (T) new fcc(this.a);
            case 138:
                return (T) new fck(this.a);
            case 139:
                return (T) new fbz(this.a);
            case 140:
                return (T) new fch(this.a);
            case 141:
                return (T) new fcn(this.a);
            case 142:
                return (T) new feb(this.a);
            case 143:
                return (T) new fto(this.a);
            case 144:
                return (T) new fqu(this.a);
            case 145:
                return (T) new ffa(this.a);
            case 146:
                return (T) new epd(this.a);
            case 147:
                return (T) new exe(this.a);
            case 148:
                return (T) new fku(this.a);
            case 149:
                return (T) new enf(this.a);
            case 150:
                return (T) new ewm(this.a);
            case 151:
                return (T) new ezx(this.a);
            case 152:
                return (T) new fii(this.a);
            case 153:
                return (T) new etu(this.a);
            case 154:
                return (T) new exy(this.a);
            case 155:
                return (T) new flz(this.a);
            case 156:
                return (T) new elm(this.a);
            case 157:
                return (T) new ess(this.a);
            case 158:
                return (T) new esu(this.a);
            case 159:
                return (T) new faq(this.a);
            case 160:
                return (T) new fkr(this.a);
            case 161:
                return (T) new exb(this.a);
            case 162:
                return (T) new ewy(this.a);
            case 163:
                return (T) new fnt(this.a);
            case 164:
                return (T) new eyp(this.a);
            case 165:
                return (T) new fem(this.a);
            case 166:
                return (T) new frr(this.a);
            case 167:
                return (T) new feo(this.a);
            case 168:
                return (T) new eyr(this.a);
            case 169:
                return (T) new fed(this.a);
            case 170:
                return (T) new feg(this.a);
            case 171:
                return (T) new enk(this.a);
            case 172:
                return (T) new era(this.a);
            case 173:
                return (T) new eqv(this.a);
            case 174:
                return (T) new fet(this.a);
            case 175:
                return (T) new eqt(this.a);
            case 176:
                return (T) new etf(this.a);
            case 177:
                return (T) new exh(this.a);
            case 178:
                return (T) new fer(this.a);
            case 179:
                return (T) new fdh(this.a);
            case 180:
                return (T) new fbw(this.a);
            case 181:
                return (T) new fbj(this.a);
            case 182:
                return (T) new fbp(this.a);
            case 183:
                return (T) new fbs(this.a);
            case 184:
                return (T) new fbu(this.a);
            case 185:
                return (T) new fbm(this.a);
            case 186:
                return (T) new emx(this.a);
            case 187:
                return (T) new fmj(this.a);
            case 188:
                return (T) new fny(this.a);
            case 189:
                return (T) new etj(this.a);
            case 190:
                return (T) new fog(this.a);
            case 191:
                return (T) new fgg(this.a);
            case 192:
                return (T) new fin(this.a);
            case 193:
                return (T) new fip(this.a);
            case 194:
                return (T) new fdl(this.a);
            case 195:
                return (T) new fsm(this.a);
            case 196:
                return (T) new fsb(this.a);
            case 197:
                return (T) new ffn(this.a);
            case 198:
                return (T) new epo(this.a);
            case 199:
                return (T) new ffd(this.a);
            default:
                throw new AssertionError(i);
        }
    }

    private final T d() {
        int i = this.b;
        switch (i) {
            case 200:
                return (T) new ffl(this.a);
            case 201:
                return (T) new fho(this.a);
            case 202:
                return (T) new fhr(this.a);
            case 203:
                return (T) new fic(this.a);
            case 204:
                return (T) new fif(this.a);
            case 205:
                return (T) new fjf(this.a);
            case 206:
                return (T) new fji(this.a);
            case 207:
                return (T) new fjk(this.a);
            case 208:
                return (T) new fjn(this.a);
            case 209:
                return (T) new fjy(this.a);
            case 210:
                return (T) new fjq(this.a);
            case 211:
                return (T) new fjt(this.a);
            case 212:
                return (T) new fjw(this.a);
            case 213:
                return (T) new fnq(this.a);
            case 214:
                return (T) new eoo(this.a);
            case 215:
                return (T) new elp(this.a);
            case 216:
                return (T) new fkd(this.a);
            case 217:
                return (T) new etb(this.a);
            case 218:
                return (T) new fhu(this.a);
            case 219:
                return (T) new fhw(this.a);
            case 220:
                return (T) new fhz(this.a);
            case 221:
                return (T) new fiz(this.a);
            case 222:
                return (T) new fjc(this.a);
            case 223:
                return (T) new fir(this.a);
            case 224:
                return (T) new fnf(this.a);
            case 225:
                return (T) new eux(this.a);
            case 226:
                return (T) new fsg(this.a);
            case 227:
                return (T) new fsi(this.a);
            case 228:
                return (T) new few(this.a);
            case 229:
                return (T) new eua(this.a);
            case 230:
                return (T) new esx(this.a);
            case 231:
                return (T) new ety(this.a);
            case 232:
                return (T) new flc(this.a);
            case 233:
                return (T) new flf(this.a);
            case 234:
                return (T) new fli(this.a);
            case 235:
                return (T) new fdo(this.a);
            case 236:
                return (T) new fan(this.a);
            case 237:
                return (T) new elc(this.a);
            case 238:
                return (T) new emq(this.a);
            case 239:
                return (T) new elg(this.a);
            case 240:
                return (T) new enu(this.a);
            case 241:
                return (T) new epq(this.a);
            case 242:
                return (T) new ewp(this.a);
            case 243:
                return (T) new ewu(this.a);
            case 244:
                return (T) new ezs(this.a);
            case 245:
                return (T) new ele(this.a);
            case 246:
                return (T) new fav(this.a);
            case 247:
                return (T) new fax(this.a);
            case 248:
                return (T) new faz(this.a);
            case 249:
                return (T) new fkk(this.a);
            case 250:
                return (T) new fra(this.a);
            case 251:
                return (T) new fbb(this.a);
            case 252:
                return (T) new erf(this.a);
            case 253:
                return (T) new eml(this.a);
            case 254:
                return (T) new fkb(this.a);
            case 255:
                return (T) new eyj(this.a);
            case 256:
                return (T) new fkp(this.a);
            case 257:
                return (T) new erh(this.a);
            case 258:
                return (T) new ezq(this.a);
            case 259:
                return (T) new eme(this.a);
            case 260:
                return (T) new fbd(this.a);
            case 261:
                return (T) new fni(this.a);
            case 262:
                return (T) new fbg(this.a);
            case 263:
                return (T) new flk(this.a);
            case 264:
                return (T) new ewk(this.a);
            case 265:
                return (T) new fnv(this.a);
            case 266:
                return (T) new fph(this.a);
            case 267:
                return (T) new fpb(this.a);
            case 268:
                return (T) new fpe(this.a);
            case 269:
                return (T) new ems(this.a);
            case 270:
                return (T) new fpk(this.a);
            case 271:
                return (T) new ewa(this.a);
            case 272:
                return (T) new evn(this.a);
            case 273:
                return (T) new fpm(this.a);
            case 274:
                return (T) new fpw(this.a);
            case 275:
                return (T) new exo(this.a);
            case 276:
                return (T) new exk(this.a);
            case 277:
                return (T) new exm(this.a);
            case 278:
                return (T) new fod(this.a);
            case 279:
                return (T) new fob(this.a);
            case 280:
                return (T) new C0001for(this.a);
            case 281:
                return (T) new eus(this.a);
            case 282:
                return (T) new fgj(this.a);
            case 283:
                return (T) new ffg(this.a);
            case 284:
                return (T) new fsk(this.a);
            case 285:
                return (T) new esm(this.a);
            case 286:
                return (T) new fgq(this.a);
            case 287:
                return (T) new enq(this.a);
            case 288:
                return (T) new etq(this.a);
            case 289:
                return (T) new fgl(this.a);
            case 290:
                return (T) new flw(this.a);
            case 291:
                return (T) new frc(this.a);
            case 292:
                return (T) new fgy(this.a);
            case 293:
                return (T) new fga(this.a);
            case 294:
                return (T) new frk(this.a);
            case 295:
                return (T) new frn(this.a);
            case 296:
                return (T) new frp(this.a);
            case 297:
                return (T) new fou(this.a);
            case 298:
                return (T) new fox(this.a);
            case 299:
                return (T) new fft(this.a);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v71, types: [T, bvby, bvca] */
    private final T m() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        dxio dxioVar;
        int i = this.b;
        switch (i) {
            case 1400:
                return (T) this.a.qD();
            case 1401:
                return (T) chiy.b();
            case 1402:
                ftt fttVar = this.a;
                Object obj7 = fttVar.dX;
                if (obj7 instanceof dxjf) {
                    synchronized (obj7) {
                        obj = fttVar.dX;
                        if (obj instanceof dxjf) {
                            buyc buycVar = fttVar.fj;
                            if (buycVar == null) {
                                dxio c = dxjc.c(fttVar.eW.h());
                                bvrb tn = fttVar.eW.a.tn();
                                dxjg.e(tn);
                                buycVar = new buyc(new buyb(c, tn));
                                fttVar.fj = buycVar;
                            }
                            cbsg cbsgVar = new cbsg(buycVar, fttVar.jY());
                            dxjc.d(fttVar.dX, cbsgVar);
                            fttVar.dX = cbsgVar;
                            obj = cbsgVar;
                        }
                    }
                    obj7 = obj;
                }
                return (T) ((cbsg) obj7);
            case 1403:
                return (T) bqmm.b();
            case 1404:
                ftt fttVar2 = this.a;
                Object obj8 = fttVar2.ea;
                if (obj8 instanceof dxjf) {
                    synchronized (obj8) {
                        obj2 = fttVar2.ea;
                        if (obj2 instanceof dxjf) {
                            fttVar2.wl();
                            obj2 = new cgtl();
                            dxjc.d(fttVar2.ea, obj2);
                            fttVar2.ea = obj2;
                        }
                    }
                    obj8 = obj2;
                }
                return (T) ((cgtl) obj8);
            case 1405:
                ftt fttVar3 = this.a;
                Object obj9 = fttVar3.ec;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj3 = fttVar3.ec;
                        if (obj3 instanceof dxjf) {
                            obj3 = new cges();
                            dxjc.d(fttVar3.ec, obj3);
                            fttVar3.ec = obj3;
                        }
                    }
                    obj9 = obj3;
                }
                return (T) ((cges) obj9);
            case 1406:
                return (T) this.a.EB();
            case 1407:
                return (T) this.a.ED();
            case 1408:
                return (T) this.a.gF();
            case 1409:
                ftt fttVar4 = this.a;
                dzsj dzsjVar = fttVar4.ek;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar4, 1410);
                    fttVar4.ek = dzsjVar;
                }
                dzsj c2 = dxjh.c(dzsjVar);
                dzsj dzsjVar2 = fttVar4.el;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar4, 1416);
                    fttVar4.el = dzsjVar2;
                }
                dzsj c3 = dxjh.c(dzsjVar2);
                dzsj dzsjVar3 = fttVar4.em;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar4, 1417);
                    fttVar4.em = dzsjVar3;
                }
                dzsj c4 = dxjh.c(dzsjVar3);
                dzsj dzsjVar4 = fttVar4.en;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fns(fttVar4, 1418);
                    fttVar4.en = dzsjVar4;
                }
                dzsj c5 = dxjh.c(dzsjVar4);
                dzsj dzsjVar5 = fttVar4.eu;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar4, 1419);
                    fttVar4.eu = dzsjVar5;
                }
                return (T) new ccdy(c2, c3, c4, c5, dxjh.c(dzsjVar5), dxjh.c(fttVar4.eW.ie()), fttVar4.eW.fr());
            case 1410:
                ftt fttVar5 = this.a;
                dzsj dzsjVar6 = fttVar5.ef;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fns(fttVar5, 1411);
                    fttVar5.ef = dzsjVar6;
                }
                dxio c6 = dxjc.c(dzsjVar6);
                dzsj dzsjVar7 = fttVar5.eg;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar5, 1412);
                    fttVar5.eg = dzsjVar7;
                }
                dxio c7 = dxjc.c(dzsjVar7);
                dzsj dzsjVar8 = fttVar5.eh;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fns(fttVar5, 1413);
                    fttVar5.eh = dzsjVar8;
                }
                dxio c8 = dxjc.c(dzsjVar8);
                dzsj dzsjVar9 = fttVar5.ei;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fns(fttVar5, 1414);
                    fttVar5.ei = dzsjVar9;
                }
                dxio c9 = dxjc.c(dzsjVar9);
                dzsj dzsjVar10 = fttVar5.ej;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fns(fttVar5, 1415);
                    fttVar5.ej = dzsjVar10;
                }
                return (T) new ccbk(c6, c7, c8, c9, dxjc.c(dzsjVar10));
            case 1411:
                return (T) new ccbi(dxjc.c(this.a.cx()));
            case 1412:
                return (T) new ccbj(dxjc.c(this.a.m()));
            case 1413:
                return (T) new ccbh(dxjc.c(this.a.tk()));
            case 1414:
                return (T) new ccbg(dxjc.c(this.a.fe()));
            case 1415:
                ftt fttVar6 = this.a;
                return (T) new ccbf(dxjc.c(fttVar6.ai()), dxjc.c(fttVar6.eW.V()));
            case 1416:
                this.a.eW.ie();
                return (T) new cccw();
            case 1417:
                return (T) new ccdp(dxjh.c(this.a.eW.ie()));
            case 1418:
                return (T) new ccdh(dxjh.c(this.a.eW.ie()));
            case 1419:
                ftt fttVar7 = this.a;
                dzsj dzsjVar11 = fttVar7.et;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fns(fttVar7, 1420);
                    fttVar7.et = dzsjVar11;
                }
                return (T) new ccec(dxjc.c(dzsjVar11));
            case 1420:
                ftt fttVar8 = this.a;
                dzsj dzsjVar12 = fttVar8.eo;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar8, 1421);
                    fttVar8.eo = dzsjVar12;
                }
                dzsj c10 = dxjh.c(dzsjVar12);
                dzsj dzsjVar13 = fttVar8.eq;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fns(fttVar8, 1422);
                    fttVar8.eq = dzsjVar13;
                }
                dzsj c11 = dxjh.c(dzsjVar13);
                dzsj dzsjVar14 = fttVar8.es;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fns(fttVar8, 1423);
                    fttVar8.es = dzsjVar14;
                }
                return (T) new cceg(c10, c11, dxjh.c(dzsjVar14), dxjh.c(fttVar8.eW.aw()), dxjh.c(fttVar8.eW.di()));
            case 1421:
                return (T) this.a.vo();
            case 1422:
                ftt fttVar9 = this.a;
                T t = (T) fttVar9.ep;
                if (t != null) {
                    return t;
                }
                dxio c12 = dxjc.c(fttVar9.eW.h());
                bvrb tn2 = fttVar9.eW.a.tn();
                dxjg.e(tn2);
                ?? r2 = (T) new bvca(new bvbz(c12, tn2));
                fttVar9.ep = r2;
                return r2;
            case 1423:
                ftt fttVar10 = this.a;
                Object obj10 = fttVar10.er;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj4 = fttVar10.er;
                        if (obj4 instanceof dxjf) {
                            Application a = fttVar10.eW.a.a();
                            dxjg.e(a);
                            obj4 = new cceb(a);
                            dxjc.d(fttVar10.er, obj4);
                            fttVar10.er = obj4;
                        }
                    }
                    obj10 = obj4;
                }
                return (T) ((cceb) obj10);
            case 1424:
                return (T) new ccds(this.a.je());
            case 1425:
                ftt fttVar11 = this.a;
                Object obj11 = fttVar11.ev;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj5 = fttVar11.ev;
                        if (obj5 instanceof dxjf) {
                            dxio c13 = dxjc.c(fttVar11.ai());
                            ckcw rU = fttVar11.eW.a.rU();
                            dxjg.e(rU);
                            obj5 = new cfpj(c13, rU, fttVar11.wk(), fttVar11.eW.wf(), fttVar11.au());
                            dxjc.d(fttVar11.ev, obj5);
                            fttVar11.ev = obj5;
                        }
                    }
                    obj11 = obj5;
                }
                return (T) ((cfpj) obj11);
            case 1426:
                return (T) this.a.gy();
            case 1427:
                return (T) this.a.EI();
            case 1428:
                return (T) new chnr();
            case 1429:
                return (T) this.a.aZ();
            case 1430:
                return (T) this.a.gG();
            case 1431:
                return (T) this.a.vj();
            case 1432:
                return (T) this.a.ud();
            case 1433:
                return (T) this.a.vn();
            case 1434:
                return (T) this.a.vk();
            case 1435:
                return (T) this.a.vp();
            case 1436:
                ftt fttVar12 = this.a;
                Object obj12 = fttVar12.eC;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj6 = fttVar12.eC;
                        if (obj6 instanceof dxjf) {
                            obj6 = fttVar12.vw();
                            dxjc.d(fttVar12.eC, obj6);
                            fttVar12.eC = obj6;
                        }
                    }
                    obj12 = obj6;
                }
                return (T) ((saf) obj12);
            case 1437:
                return (T) this.a.kS();
            case 1438:
                return (T) this.a.vy();
            case 1439:
                return (T) this.a.vz();
            case 1440:
                return (T) this.a.vB();
            case 1441:
                return (T) this.a.hZ();
            case 1442:
                return (T) this.a.EP();
            case 1443:
                return (T) this.a.lu();
            case 1444:
                return (T) this.a.vF();
            case 1445:
                return (T) this.a.ty();
            case 1446:
                return (T) new joc(this.a.wk());
            case 1447:
                return (T) this.a.km();
            case 1448:
                cjqy tr = this.a.eW.a.tr();
                dxjg.e(tr);
                return (T) new afhe(tr);
            case 1449:
                ftt fttVar13 = this.a;
                dxjg.e(fttVar13.eW.a.sx());
                dxjc.c(fttVar13.eW.o());
                return (T) new btao();
            case 1450:
                T t2 = (T) ((afkv) this.a.m21if().b(16));
                dxjg.f(t2);
                return t2;
            case 1451:
                return (T) this.a.hV();
            case 1452:
                return (T) new apkk();
            case 1453:
                return (T) new avae();
            case 1454:
                T t3 = (T) ((apur) this.a.m21if().b(Integer.valueOf((int) R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                dxjg.f(t3);
                return t3;
            case 1455:
                ftt fttVar14 = this.a;
                return (T) new aqqn(dxjc.c(fttVar14.x()), dxjc.c(fttVar14.eW.is()), dxjc.c(fttVar14.eW.at()), fttVar14.h());
            case 1456:
                T t4 = (T) new avss(this.a.aS());
                dbsk.l(true);
                return t4;
            case 1457:
                return (T) this.a.vc();
            case 1458:
                ftt fttVar15 = this.a;
                return (T) new afhj(dxjc.c(fttVar15.eW.k()), fttVar15.ap(), dxjc.c(fttVar15.cD()), fttVar15.wk());
            case 1459:
                ftt fttVar16 = this.a;
                Application a2 = fttVar16.eW.a.a();
                dxjg.e(a2);
                cezv tc = fttVar16.tc();
                bzcb dU = fttVar16.eW.dU();
                Application a3 = fttVar16.eW.a.a();
                dxjg.e(a3);
                return (T) new bzbh(a2, tc, dU, new bzbi(a3));
            case 1460:
                ftt fttVar17 = this.a;
                return (T) new bolb(fttVar17.eW.mR(), fttVar17.eW.R());
            case 1461:
                ftt fttVar18 = this.a;
                btvo rp = fttVar18.eW.a.rp();
                dxjg.e(rp);
                ckcw rU2 = fttVar18.eW.a.rU();
                dxjg.e(rU2);
                cjqq tp = fttVar18.eW.a.tp();
                dxjg.e(tp);
                cjqy tr2 = fttVar18.eW.a.tr();
                dxjg.e(tr2);
                return (T) new ccgo(rp, rU2, tp, tr2);
            case 1462:
                ftt fttVar19 = this.a;
                dzsj<gga> ad = fttVar19.ad();
                dzsj dzsjVar15 = fttVar19.eR;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fns(fttVar19, 1463);
                    fttVar19.eR = dzsjVar15;
                }
                return (T) new ccgp(ad, dzsjVar15);
            case 1463:
                ftt fttVar20 = this.a;
                return (T) new ccgn(fttVar20.ad(), dxjh.c(fttVar20.m()));
            case 1464:
                return (T) this.a.vV();
            case 1465:
                return (T) this.a.vX();
            case 1466:
                ftt fttVar21 = this.a;
                ckra ri = fttVar21.eW.ri();
                dxio c14 = dxjc.c(fttVar21.eW.f());
                crct dX = fttVar21.eW.dX();
                ckrh fh = fttVar21.eW.fh();
                btvo rp2 = fttVar21.eW.a.rp();
                dxjg.e(rp2);
                rb rbVar = fttVar21.a;
                ahjq wf = fttVar21.eW.wf();
                crgt e = fttVar21.eW.e();
                efh h = fttVar21.h();
                dxio c15 = dxjc.c(fttVar21.H());
                dxjc.c(fttVar21.bh());
                dxio c16 = dxjc.c(fttVar21.cu());
                dxio c17 = dxjc.c(fttVar21.cl());
                dxio c18 = dxjc.c(fttVar21.bT());
                fyu fyuVar = fttVar21.eW;
                dzsj dzsjVar16 = fyuVar.dS;
                if (dzsjVar16 == null) {
                    dxioVar = c18;
                    dzsjVar16 = new fxy(fyuVar, 735);
                    fyuVar.dS = dzsjVar16;
                } else {
                    dxioVar = c18;
                }
                dxio c19 = dxjc.c(dzsjVar16);
                dxio c20 = dxjc.c(fttVar21.eW.oJ());
                dxio c21 = dxjc.c(fttVar21.eW.nZ());
                akfa rK = fttVar21.eW.a.rK();
                dxjg.e(rK);
                dxjg.e(fttVar21.eW.a.rz());
                return (T) new ckqq(ri, c14, dX, fh, rp2, rbVar, wf, e, h, c15, c16, c17, dxioVar, c19, c20, c21, rK);
            default:
                throw new AssertionError(i);
        }
    }

    private final T e() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i = this.b;
        switch (i) {
            case cpnx.a /* 300 */:
                return (T) new fgn(this.a);
            case 301:
                return (T) new ewr(this.a);
            case 302:
                return (T) new eth(this.a);
            case 303:
                return (T) new fry(this.a);
            case 304:
                return (T) new frh(this.a);
            case 305:
                return (T) new eye(this.a);
            case 306:
                return (T) new ens(this.a);
            case 307:
                return (T) new fhb(this.a);
            case 308:
                return (T) new fkx(this.a);
            case 309:
                return (T) new fqb(this.a);
            case 310:
                return (T) new fqm(this.a);
            case 311:
                return (T) new emc(this.a);
            case 312:
                return (T) new elr(this.a);
            case 313:
                return (T) new elu(this.a);
            case 314:
                return (T) new ezu(this.a);
            case 315:
                return (T) new fmw(this.a);
            case 316:
                return (T) new fpy(this.a);
            case 317:
                return (T) new fhh(this.a);
            case 318:
                return (T) new erk(this.a);
            case 319:
                return (T) new fla(this.a);
            case 320:
                return (T) new esj(this.a);
            case 321:
                return (T) new eoq(this.a);
            case 322:
                return (T) new eno(this.a);
            case 323:
                return (T) new epv(this.a);
            case 324:
                return (T) new epy(this.a);
            case 325:
                return (T) new eqb(this.a);
            case 326:
                return (T) new eqe(this.a);
            case 327:
                return (T) new esz(this.a);
            case 328:
                return (T) new euc(this.a);
            case 329:
                return (T) new exq(this.a);
            case 330:
                return (T) new fre(this.a);
            case 331:
                return (T) new emu(this.a);
            case 332:
                return (T) new evp(this.a);
            case 333:
                return (T) new fnl(this.a);
            case 334:
                return (T) new fno(this.a);
            case 335:
                return (T) new eya(this.a);
            case 336:
                return (T) new evg(this.a);
            case 337:
                return (T) new fiw(this.a);
            case 338:
                return (T) new fmb(this.a);
            case 339:
                return (T) new fmd(this.a);
            case 340:
                return (T) new fmh(this.a);
            case 341:
                return (T) new fnd(this.a);
            case 342:
                return (T) new fmz(this.a);
            case 343:
                return (T) new fnb(this.a);
            case 344:
                return (T) new ewc(this.a);
            case 345:
                return (T) new fej(this.a);
            case 346:
                return (T) new fsp(this.a);
            case 347:
                return (T) new fss(this.a);
            case 348:
                return (T) new fsv(this.a);
            case 349:
                return (T) new fdr(this.a);
            case 350:
                return (T) new ewg(this.a);
            case 351:
                return (T) new ewi(this.a);
            case 352:
                return (T) new ftr(this.a);
            case 353:
                return (T) new cecn(this.a.eV);
            case 354:
                Resources c = this.a.eW.a.c();
                dxjg.e(c);
                return (T) new bqsq(c);
            case 355:
                return (T) this.a.k();
            case 356:
                ftt fttVar = this.a;
                return (T) new bhtz(fttVar.eV, fttVar.ig());
            case 357:
                T t = (T) ((aput) this.a.m21if().b(69));
                dxjg.f(t);
                return t;
            case 358:
                ftt fttVar2 = this.a;
                Object obj7 = fttVar2.b;
                if (obj7 instanceof dxjf) {
                    synchronized (obj7) {
                        obj = fttVar2.b;
                        if (obj instanceof dxjf) {
                            Context b = fttVar2.eW.a.b();
                            dxjg.e(b);
                            fyu fyuVar = fttVar2.eW;
                            dzsj dzsjVar = fyuVar.bD;
                            if (dzsjVar == null) {
                                dzsjVar = new fxy(fyuVar, 395);
                                fyuVar.bD = dzsjVar;
                            }
                            obj = new bnla(b, dzsjVar, fttVar2.eW.V());
                            dxjc.d(fttVar2.b, obj);
                            fttVar2.b = obj;
                        }
                    }
                    obj7 = obj;
                }
                return (T) ((bnla) obj7);
            case 359:
                ftt fttVar3 = this.a;
                dzsj dzsjVar2 = fttVar3.c;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar3, 360);
                    fttVar3.c = dzsjVar2;
                }
                dxjc.c(dzsjVar2);
                throw new IllegalStateException("Trying to provide megamaid veneer without flag enabled");
            case 360:
                ftt fttVar4 = this.a;
                fttVar4.wk();
                fyu fyuVar2 = fttVar4.eW;
                dzsj dzsjVar3 = fyuVar2.bE;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fxy(fyuVar2, 402);
                    fyuVar2.bE = dzsjVar3;
                }
                dxjc.c(dzsjVar3);
                fyu fyuVar3 = fttVar4.eW;
                dzsj dzsjVar4 = fyuVar3.bF;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fxy(fyuVar3, 403);
                    fyuVar3.bF = dzsjVar4;
                }
                dxjc.c(dzsjVar4);
                return (T) new apqy();
            case 361:
                ftt fttVar5 = this.a;
                T t2 = (T) new aqfz();
                dzsj dzsjVar5 = fttVar5.p;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar5, 362);
                    fttVar5.p = dzsjVar5;
                }
                dxio c2 = dxjc.c(dzsjVar5);
                if (fttVar5.eW.hY().a()) {
                    t2 = (T) ((itb) c2.a());
                }
                dxjg.f(t2);
                return t2;
            case 362:
                ftt fttVar6 = this.a;
                Object obj8 = fttVar6.o;
                if (obj8 instanceof dxjf) {
                    synchronized (obj8) {
                        obj2 = fttVar6.o;
                        if (obj2 instanceof dxjf) {
                            gga wk = fttVar6.wk();
                            dxio c3 = dxjc.c(fttVar6.eW.p());
                            dxio c4 = dxjc.c(fttVar6.P());
                            bwqv rD = fttVar6.eW.a.rD();
                            dxjg.e(rD);
                            dxio c5 = dxjc.c(fttVar6.eW.ed());
                            dxio c6 = dxjc.c(fttVar6.eW.ip());
                            dxio c7 = dxjc.c(fttVar6.eW.iq());
                            dxio c8 = dxjc.c(fttVar6.Q());
                            dxio c9 = dxjc.c(fttVar6.eW.is());
                            dxio c10 = dxjc.c(fttVar6.S());
                            dxio c11 = dxjc.c(fttVar6.eW.iL());
                            dxio c12 = dxjc.c(fttVar6.T());
                            dxio c13 = dxjc.c(fttVar6.eW.aI());
                            dzsj dzsjVar6 = fttVar6.i;
                            if (dzsjVar6 == null) {
                                dzsjVar6 = new fns(fttVar6, 390);
                                fttVar6.i = dzsjVar6;
                            }
                            dxio c14 = dxjc.c(dzsjVar6);
                            dxio c15 = dxjc.c(fttVar6.m());
                            dxio c16 = dxjc.c(fttVar6.L());
                            dxio c17 = dxjc.c(fttVar6.eW.aw());
                            acyp bW = fttVar6.eW.bW();
                            apyx cm = fttVar6.eW.cm();
                            aqci ab = fttVar6.ab();
                            ckmm r = fttVar6.eW.a.r();
                            dxjg.e(r);
                            ckcw rU = fttVar6.eW.a.rU();
                            dxjg.e(rU);
                            Executor sV = fttVar6.eW.a.sV();
                            dxjg.e(sV);
                            obj2 = new apxx(wk, c3, c4, rD, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, bW, cm, ab, r, rU, sV, dxjc.c(fttVar6.eW.iI()), dxjc.c(fttVar6.Z()), dxjc.c(fttVar6.ai()));
                            dxjc.d(fttVar6.o, obj2);
                            fttVar6.o = obj2;
                        }
                    }
                    obj8 = obj2;
                }
                return (T) ((apxx) obj8);
            case 363:
                return (T) this.a.O();
            case 364:
                return (T) this.a.wc();
            case 365:
                ftt fttVar7 = this.a;
                dzsj c18 = dxjh.c(fttVar7.eW.p());
                dzsj dzsjVar7 = fttVar7.d;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar7, 366);
                    fttVar7.d = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<cjqy> al = fttVar7.eW.al();
                dzsj<gce> ie = fttVar7.eW.ie();
                dzsj dzsjVar9 = fttVar7.e;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fns(fttVar7, 367);
                    fttVar7.e = dzsjVar9;
                }
                return (T) new cklg(c18, dzsjVar8, al, ie, dzsjVar9);
            case 366:
                return (T) dbsg.i(dxjc.c(this.a.m()));
            case 367:
                return (T) this.a.o();
            case 368:
                T t3 = (T) ((afwt) this.a.m21if().b(79));
                dxjg.f(t3);
                return t3;
            case 369:
                T t4 = (T) ((afef) this.a.m21if().b(21));
                dxjg.f(t4);
                return t4;
            case 370:
                return (T) this.a.s();
            case 371:
                return (T) new aedf(dxjh.c(this.a.v()));
            case 372:
                return (T) this.a.u();
            case 373:
                ftt fttVar8 = this.a;
                return (T) new aedc(dxjh.c(fttVar8.eW.p()), fttVar8.eW.cb(), fttVar8.eW.bY(), fttVar8.eW.di());
            case 374:
                ftt fttVar9 = this.a;
                return (T) new aedh(fttVar9.eW.K(), fttVar9.eW.V(), fttVar9.eW.aw());
            case 375:
                ftt fttVar10 = this.a;
                dzsj c19 = dxjh.c(fttVar10.eW.p());
                dzsj<agbr> cb = fttVar10.eW.cb();
                dzsj c20 = dxjh.c(fttVar10.x());
                fyu fyuVar4 = fttVar10.eW;
                dzsj dzsjVar10 = fyuVar4.bK;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fxy(fyuVar4, 408);
                    fyuVar4.bK = dzsjVar10;
                }
                return (T) new aedr(c19, cb, c20, dzsjVar10, fttVar10.eW.aA(), fttVar10.eW.di(), fttVar10.eW.o());
            case 376:
                return (T) this.a.w();
            case 377:
                return (T) new aedj(this.a.eW.ii());
            case 378:
                return (T) this.a.C();
            case 379:
                return (T) this.a.z();
            case 380:
                return (T) this.a.wl();
            case 381:
                T t5 = (T) ((afzv) this.a.m21if().b(28));
                dxjg.f(t5);
                return t5;
            case 382:
                T t6 = (T) ((qbt) this.a.m21if().b(12));
                dxjg.f(t6);
                return t6;
            case 383:
                return (T) this.a.I();
            case 384:
                ftt fttVar11 = this.a;
                Object obj9 = fttVar11.f;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj3 = fttVar11.f;
                        if (obj3 instanceof dxjf) {
                            gga wk2 = fttVar11.wk();
                            bwqv rD2 = fttVar11.eW.a.rD();
                            dxjg.e(rD2);
                            obj3 = new cjos(wk2, rD2, dxjc.c(fttVar11.eW.p()), fttVar11.wd(), dxjc.c(fttVar11.K()), dxjc.c(fttVar11.eW.ik()));
                            dxjc.d(fttVar11.f, obj3);
                            fttVar11.f = obj3;
                        }
                    }
                    obj9 = obj3;
                }
                return (T) ((cjot) obj9);
            case 385:
                return (T) this.a.N();
            case 386:
                ftt fttVar12 = this.a;
                gfq wd = fttVar12.wd();
                akdv O = fttVar12.O();
                acyp bW2 = fttVar12.eW.bW();
                btvo rp = fttVar12.eW.a.rp();
                dxjg.e(rp);
                return (T) new cfrt(wd, O, bW2, rp);
            case 387:
                ftt fttVar13 = this.a;
                btrm rz = fttVar13.eW.a.rz();
                dxjg.e(rz);
                bvrb tn = fttVar13.eW.a.tn();
                dxjg.e(tn);
                return (T) new aqdj(rz, tn, fttVar13.eW.hZ(), fttVar13.eW.cm(), dxjc.c(fttVar13.eW.is()), dxjc.c(fttVar13.eW.iy()), dxjc.c(fttVar13.eW.iq()), dxjc.c(fttVar13.eW.iz()));
            case 388:
                return (T) this.a.R();
            case 389:
                return (T) this.a.p();
            case 390:
                ftt fttVar14 = this.a;
                Executor sV2 = fttVar14.eW.a.sV();
                dxjg.e(sV2);
                akfa rK = fttVar14.eW.a.rK();
                dxjg.e(rK);
                apyv hZ = fttVar14.eW.hZ();
                apyx cm2 = fttVar14.eW.cm();
                dxio c21 = dxjc.c(fttVar14.aa());
                dzsj dzsjVar11 = fttVar14.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fns(fttVar14, 394);
                    fttVar14.h = dzsjVar11;
                }
                return (T) new apyb(sV2, rK, hZ, cm2, c21, dxjc.c(dzsjVar11));
            case 391:
                ftt fttVar15 = this.a;
                return (T) new aqgl(dxjh.c(fttVar15.Z()), dxjh.c(fttVar15.eW.iI()), fttVar15.eW.ae());
            case 392:
                return (T) this.a.Y();
            case 393:
                ftt fttVar16 = this.a;
                Object obj10 = fttVar16.g;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj4 = fttVar16.g;
                        if (obj4 instanceof dxjf) {
                            btvo rp2 = fttVar16.eW.a.rp();
                            dxjg.e(rp2);
                            dxio c22 = dxjc.c(fttVar16.eW.p());
                            btmv rY = fttVar16.eW.a.rY();
                            dxjg.e(rY);
                            cqat rR = fttVar16.eW.a.rR();
                            dxjg.e(rR);
                            brpo brpoVar = new brpo(c22, rY, rR);
                            brpoVar.a = rp2.getSearchParameters().i().b;
                            brpoVar.b = "SearchNetworkOnlineSearchCache";
                            brpoVar.b(rp2.getSearchParameters().i().d);
                            obj4 = brpoVar.a();
                            dxjc.d(fttVar16.g, obj4);
                            fttVar16.g = obj4;
                        }
                    }
                    obj10 = obj4;
                }
                return (T) ((brpq) obj10);
            case 394:
                ftt fttVar17 = this.a;
                return (T) new apyc(fttVar17.eW.m(), dxjh.c(fttVar17.Z()), dxjh.c(fttVar17.eW.ax()), dxjh.c(fttVar17.eW.cv()), dxjh.c(fttVar17.eW.iP()));
            case 395:
                return (T) this.a.ao();
            case 396:
                return (T) this.a.ac();
            case 397:
                ftt fttVar18 = this.a;
                Object obj11 = fttVar18.j;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj5 = fttVar18.j;
                        if (obj5 instanceof dxjf) {
                            obj5 = CookieManager.getInstance();
                            dxjg.f(obj5);
                            dxjc.d(fttVar18.j, obj5);
                            fttVar18.j = obj5;
                        }
                    }
                    obj11 = obj5;
                }
                CookieManager cookieManager = (CookieManager) obj11;
                if (fttVar18.l == null) {
                    fttVar18.l = new fns(fttVar18, 398);
                }
                return (T) new bvyc(cookieManager);
            case 398:
                ftt fttVar19 = this.a;
                Object obj12 = fttVar19.k;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj6 = fttVar19.k;
                        if (obj6 instanceof dxjf) {
                            rb rbVar = fttVar19.a;
                            dbsk.m(false, "CookieSyncManager was deprecated in Lollipop");
                            obj6 = CookieSyncManager.createInstance(rbVar);
                            dxjg.f(obj6);
                            dxjc.d(fttVar19.k, obj6);
                            fttVar19.k = obj6;
                        }
                    }
                    obj12 = obj6;
                }
                return (T) ((CookieSyncManager) obj12);
            case 399:
                return (T) new cmrp(this.a.wk());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            case 7:
                switch (i) {
                    case 700:
                        return (T) this.a.hk();
                    case 701:
                        return (T) this.a.hl();
                    case 702:
                        return (T) this.a.hm();
                    case 703:
                        return (T) this.a.hn();
                    case 704:
                        return (T) this.a.ho();
                    case 705:
                        return (T) this.a.hp();
                    case 706:
                        return (T) this.a.hq();
                    case 707:
                        return (T) this.a.hr();
                    case 708:
                        return (T) this.a.hs();
                    case 709:
                        return (T) this.a.ht();
                    case 710:
                        return (T) this.a.hu();
                    case 711:
                        return (T) this.a.hv();
                    case 712:
                        return (T) this.a.hw();
                    case 713:
                        return (T) this.a.hx();
                    case 714:
                        return (T) this.a.hy();
                    case 715:
                        return (T) this.a.hz();
                    case 716:
                        return (T) this.a.hA();
                    case 717:
                        return (T) this.a.hB();
                    case 718:
                        return (T) this.a.hH();
                    case 719:
                        return (T) this.a.hF();
                    case 720:
                        return (T) new askj();
                    case 721:
                        return (T) this.a.hE();
                    case 722:
                        return (T) this.a.hI();
                    case 723:
                        return (T) this.a.hJ();
                    case 724:
                        return (T) this.a.hK();
                    case 725:
                        return (T) this.a.hN();
                    case 726:
                        return (T) this.a.hL();
                    case 727:
                        return (T) this.a.hQ();
                    case 728:
                        return (T) this.a.hO();
                    case 729:
                        return (T) this.a.hU();
                    case 730:
                        return (T) this.a.hS();
                    case 731:
                        return (T) this.a.hX();
                    case 732:
                        return (T) this.a.hY();
                    case 733:
                        return (T) this.a.ia();
                    case 734:
                        return (T) this.a.EK();
                    case 735:
                        return (T) this.a.id();
                    case 736:
                        return (T) this.a.ib();
                    case 737:
                        return (T) this.a.ie();
                    case 738:
                        return (T) this.a.ih();
                    case 739:
                        return (T) this.a.io();
                    case 740:
                        return (T) this.a.il();
                    case 741:
                        return (T) this.a.iq();
                    case 742:
                        return (T) this.a.is();
                    case 743:
                        return (T) this.a.ip();
                    case 744:
                        return (T) new wuw();
                    case 745:
                        return (T) this.a.iM();
                    case 746:
                        return (T) this.a.iu();
                    case 747:
                        return (T) this.a.iw();
                    case 748:
                        return (T) this.a.iz();
                    case 749:
                        return (T) this.a.gY();
                    case 750:
                        return (T) this.a.iC();
                    case 751:
                        return (T) this.a.iE();
                    case 752:
                        return (T) this.a.iD();
                    case 753:
                        return (T) this.a.iG();
                    case 754:
                        return (T) this.a.iI();
                    case 755:
                        return (T) this.a.iK();
                    case 756:
                        return (T) this.a.iL();
                    case 757:
                        return (T) this.a.iO();
                    case 758:
                        return (T) this.a.iN();
                    case 759:
                        return (T) this.a.iP();
                    case 760:
                        return (T) this.a.iQ();
                    case 761:
                        return (T) this.a.iR();
                    case 762:
                        return (T) this.a.iT();
                    case 763:
                        return (T) this.a.iV();
                    case 764:
                        return (T) this.a.jk();
                    case 765:
                        return (T) this.a.fp();
                    case 766:
                        return (T) this.a.iZ();
                    case 767:
                        return (T) this.a.iY();
                    case 768:
                        return (T) this.a.jb();
                    case 769:
                        return (T) this.a.jd();
                    case 770:
                        return (T) this.a.jf();
                    case 771:
                        return (T) this.a.jh();
                    case 772:
                        return (T) this.a.jj();
                    case 773:
                        return (T) this.a.jo();
                    case 774:
                        return (T) cyl.b();
                    case 775:
                        return (T) this.a.jm();
                    case 776:
                        return (T) this.a.jq();
                    case 777:
                        return (T) this.a.ju();
                    case 778:
                        return (T) this.a.js();
                    case 779:
                        return (T) this.a.jw();
                    case 780:
                        return (T) this.a.jz();
                    case 781:
                        return (T) this.a.jy();
                    case 782:
                        return (T) this.a.jC();
                    case 783:
                        return (T) this.a.jB();
                    case 784:
                        return (T) this.a.jF();
                    case 785:
                        return (T) this.a.jX();
                    case 786:
                        return (T) this.a.jR();
                    case 787:
                        return (T) this.a.jJ();
                    case 788:
                        return (T) this.a.jI();
                    case 789:
                        return (T) this.a.jQ();
                    case 790:
                        return (T) this.a.jO();
                    case 791:
                        return (T) this.a.jK();
                    case 792:
                        return (T) this.a.jM();
                    case 793:
                        return (T) this.a.jL();
                    case 794:
                        return (T) this.a.jS();
                    case 795:
                        return (T) this.a.jV();
                    case 796:
                        return (T) this.a.jU();
                    case 797:
                        return (T) this.a.jY();
                    case 798:
                        return (T) this.a.jZ();
                    case 799:
                        return (T) this.a.ka();
                    default:
                        throw new AssertionError(i);
                }
            case 8:
                switch (i) {
                    case 800:
                        return (T) this.a.kc();
                    case 801:
                        return (T) this.a.ke();
                    case 802:
                        return (T) this.a.kh();
                    case 803:
                        return (T) this.a.kg();
                    case 804:
                        return (T) this.a.EL();
                    case 805:
                        ftt fttVar = this.a;
                        afgx afgxVar = fttVar.aG;
                        affy affyVar = afgxVar;
                        if (afgxVar == null) {
                            affy a = ewe.a(fttVar).a();
                            dxjg.f(a);
                            fttVar.aG = a;
                            affyVar = a;
                        }
                        return affyVar;
                    case 806:
                        return (T) this.a.kp();
                    case 807:
                        return (T) this.a.gh();
                    case 808:
                        return (T) this.a.kr();
                    case 809:
                        return (T) this.a.hC();
                    case 810:
                        return (T) this.a.kv();
                    case 811:
                        return (T) this.a.ct();
                    case 812:
                        return (T) this.a.kl();
                    case 813:
                        return (T) this.a.kx();
                    case 814:
                        return (T) this.a.kw();
                    case 815:
                        return (T) this.a.kA();
                    case 816:
                        return (T) this.a.ky();
                    case 817:
                        return (T) this.a.kz();
                    case 818:
                        return (T) this.a.ak();
                    case 819:
                        return (T) this.a.kC();
                    case 820:
                        return (T) this.a.kB();
                    case 821:
                        return (T) this.a.kD();
                    case 822:
                        return (T) this.a.kE();
                    case 823:
                        return (T) this.a.kF();
                    case 824:
                        return (T) this.a.kG();
                    case 825:
                        return (T) this.a.kH();
                    case 826:
                        return (T) this.a.cJ();
                    case 827:
                        return (T) this.a.EM();
                    case 828:
                        return (T) this.a.kN();
                    case 829:
                        return (T) this.a.kM();
                    case 830:
                        return (T) this.a.kJ();
                    case 831:
                        return (T) this.a.kK();
                    case 832:
                        return (T) this.a.kL();
                    case 833:
                        return (T) this.a.EN();
                    case 834:
                        return (T) this.a.dX();
                    case 835:
                        return (T) this.a.kQ();
                    case 836:
                        return (T) this.a.kU();
                    case 837:
                        return (T) this.a.kX();
                    case 838:
                        return (T) this.a.lc();
                    case 839:
                        return (T) this.a.B();
                    case 840:
                        return (T) this.a.lg();
                    case 841:
                        return (T) this.a.lh();
                    case 842:
                        return (T) this.a.lj();
                    case 843:
                        return (T) this.a.ll();
                    case 844:
                        return (T) this.a.lo();
                    case 845:
                        return (T) this.a.lp();
                    case 846:
                        return (T) this.a.fS();
                    case 847:
                        return (T) this.a.lq();
                    case 848:
                        return (T) this.a.lr();
                    case 849:
                        return (T) this.a.EO();
                    case 850:
                        return (T) this.a.aL();
                    case 851:
                        return (T) this.a.lw();
                    case 852:
                        return (T) this.a.wd();
                    case 853:
                        return (T) this.a.lA();
                    case 854:
                        return (T) this.a.de();
                    case 855:
                        return (T) this.a.ed();
                    case 856:
                        return (T) this.a.eC();
                    case 857:
                        return (T) this.a.lG();
                    case 858:
                        return (T) this.a.lE();
                    case 859:
                        return (T) this.a.df();
                    case 860:
                        return (T) this.a.dl();
                    case 861:
                        return (T) this.a.dk();
                    case 862:
                        return (T) this.a.ki();
                    case 863:
                        return (T) this.a.lI();
                    case 864:
                        return (T) this.a.wq();
                    case 865:
                        return (T) this.a.kO();
                    case 866:
                        return (T) this.a.ab();
                    case 867:
                        return (T) this.a.lQ();
                    case 868:
                        return (T) this.a.sl();
                    case 869:
                        return (T) this.a.ra();
                    case 870:
                        return (T) this.a.lT();
                    case 871:
                        return (T) this.a.lV();
                    case 872:
                        return (T) this.a.ma();
                    case 873:
                        return (T) this.a.lY();
                    case 874:
                        return (T) this.a.mc();
                    case 875:
                        return (T) this.a.md();
                    case 876:
                        return (T) ftt.EZ();
                    case 877:
                        return (T) this.a.me();
                    case 878:
                        return (T) this.a.mf();
                    case 879:
                        return (T) this.a.mi();
                    case 880:
                        return (T) this.a.mk();
                    case 881:
                        return (T) this.a.mm();
                    case 882:
                        return (T) this.a.mt();
                    case 883:
                        return (T) this.a.mp();
                    case 884:
                        return (T) this.a.mo();
                    case 885:
                        return (T) this.a.mr();
                    case 886:
                        return (T) this.a.mM();
                    case 887:
                        return (T) this.a.my();
                    case 888:
                        return (T) this.a.mw();
                    case 889:
                        return (T) new becn();
                    case 890:
                        return (T) this.a.mA();
                    case 891:
                        return (T) this.a.mC();
                    case 892:
                        return (T) this.a.mE();
                    case 893:
                        return (T) this.a.mI();
                    case 894:
                        return (T) this.a.mP();
                    case 895:
                        return (T) this.a.nI();
                    case 896:
                        return (T) this.a.nH();
                    case 897:
                        return (T) this.a.mH();
                    case 898:
                        return (T) this.a.mR();
                    case 899:
                        return (T) this.a.mS();
                    default:
                        throw new AssertionError(i);
                }
            case 9:
                switch (i) {
                    case 900:
                        return (T) this.a.mU();
                    case 901:
                        return (T) this.a.mW();
                    case 902:
                        return (T) this.a.mX();
                    case 903:
                        return (T) this.a.mV();
                    case 904:
                        return (T) this.a.na();
                    case 905:
                        return (T) this.a.nl();
                    case 906:
                        return (T) this.a.nk();
                    case 907:
                        return (T) this.a.nc();
                    case 908:
                        return (T) this.a.ne();
                    case 909:
                        return (T) new bknm();
                    case 910:
                        return (T) this.a.nf();
                    case 911:
                        return (T) new bkod();
                    case 912:
                        return (T) this.a.ng();
                    case 913:
                        return (T) this.a.nh();
                    case 914:
                        return (T) this.a.ni();
                    case 915:
                        return (T) this.a.nj();
                    case 916:
                        return (T) this.a.nm();
                    case 917:
                        return (T) this.a.np();
                    case 918:
                        return (T) this.a.nn();
                    case 919:
                        return (T) this.a.nr();
                    case 920:
                        return (T) this.a.nq();
                    case 921:
                        return (T) this.a.ns();
                    case 922:
                        return (T) this.a.nt();
                    case 923:
                        return (T) this.a.no();
                    case 924:
                        return (T) this.a.nw();
                    case 925:
                        return (T) this.a.ny();
                    case 926:
                        return (T) this.a.mT();
                    case 927:
                        return (T) this.a.nA();
                    case 928:
                        return (T) this.a.nz();
                    case 929:
                        return (T) this.a.nC();
                    case 930:
                        return (T) this.a.nF();
                    case 931:
                        return (T) this.a.nD();
                    case 932:
                        return (T) this.a.jE();
                    case 933:
                        return (T) this.a.nK();
                    case 934:
                        return (T) this.a.nM();
                    case 935:
                        return (T) this.a.nL();
                    case 936:
                        return (T) new bmun();
                    case 937:
                        return (T) this.a.nO();
                    case 938:
                        return (T) this.a.nX();
                    case 939:
                        return (T) this.a.nQ();
                    case 940:
                        return (T) this.a.lX();
                    case 941:
                        return (T) this.a.nR();
                    case 942:
                        return (T) new bljv();
                    case 943:
                        return (T) this.a.nV();
                    case 944:
                        return (T) this.a.nT();
                    case 945:
                        return (T) this.a.nU();
                    case 946:
                        return (T) this.a.nZ();
                    case 947:
                        return (T) this.a.nW();
                    case 948:
                        return (T) this.a.op();
                    case 949:
                        return (T) this.a.od();
                    case 950:
                        return (T) new blkr();
                    case 951:
                        return (T) new cece();
                    case 952:
                        return (T) this.a.ob();
                    case 953:
                        return (T) this.a.of();
                    case 954:
                        return (T) this.a.oi();
                    case 955:
                        return (T) this.a.og();
                    case 956:
                        return (T) this.a.oj();
                    case 957:
                        return (T) this.a.ol();
                    case 958:
                        return (T) this.a.ok();
                    case 959:
                        return (T) this.a.ij();
                    case 960:
                        return (T) this.a.oI();
                    case 961:
                        return (T) this.a.ot();
                    case 962:
                        return (T) this.a.or();
                    case 963:
                        return (T) this.a.ow();
                    case 964:
                        return (T) this.a.ov();
                    case 965:
                        return (T) this.a.oA();
                    case 966:
                        return (T) this.a.oy();
                    case 967:
                        return (T) this.a.oC();
                    case 968:
                        return (T) this.a.EQ();
                    case 969:
                        return (T) this.a.oD();
                    case 970:
                        return (T) new blhf();
                    case 971:
                        return (T) this.a.oE();
                    case 972:
                        return (T) this.a.oG();
                    case 973:
                        return (T) this.a.oF();
                    case 974:
                        return (T) this.a.oK();
                    case 975:
                        return (T) this.a.oM();
                    case 976:
                        return (T) this.a.oN();
                    case 977:
                        return (T) this.a.oO();
                    case 978:
                        return (T) this.a.oP();
                    case 979:
                        return (T) this.a.oR();
                    case 980:
                        return (T) this.a.ER();
                    case 981:
                        return (T) this.a.oT();
                    case 982:
                        return (T) this.a.pk();
                    case 983:
                        return (T) this.a.oU();
                    case 984:
                        return (T) this.a.oV();
                    case 985:
                        return (T) this.a.oW();
                    case 986:
                        return (T) this.a.oZ();
                    case 987:
                        return (T) this.a.oY();
                    case 988:
                        return (T) new aenx();
                    case 989:
                        return (T) this.a.pb();
                    case 990:
                        return (T) this.a.pd();
                    case 991:
                        return (T) this.a.pf();
                    case 992:
                        return (T) this.a.pe();
                    case 993:
                        return (T) this.a.ph();
                    case 994:
                        return (T) this.a.pg();
                    case 995:
                        return (T) this.a.pi();
                    case 996:
                        return (T) this.a.pm();
                    case 997:
                        return (T) this.a.jH();
                    case 998:
                        return (T) this.a.po();
                    case 999:
                        return (T) this.a.pp();
                    default:
                        throw new AssertionError(i);
                }
            case 10:
                return i();
            case 11:
                return j();
            case 12:
                return k();
            case 13:
                return l();
            default:
                return m();
        }
    }

    /* JADX WARN: Type inference failed for: r2v132, types: [T, abvw] */
    /* JADX WARN: Type inference failed for: r2v136, types: [abum] */
    /* JADX WARN: Type inference failed for: r2v138, types: [T, abuh] */
    /* JADX WARN: Type inference failed for: r2v39, types: [T, abuo] */
    /* JADX WARN: Type inference failed for: r2v43, types: [abwh] */
    /* JADX WARN: Type inference failed for: r2v62, types: [abvo, abpo] */
    /* JADX WARN: Type inference failed for: r2v69, types: [abva] */
    /* JADX WARN: Type inference failed for: r2v83, types: [abfc, T, abez] */
    private final T j() {
        Object obj;
        Object obj2;
        int i = this.b;
        switch (i) {
            case 1100:
                return (T) new bewk(dxjh.c(this.a.m()));
            case 1101:
                return (T) new bnak(new bngx(this.a.qZ()));
            case 1102:
                ftt fttVar = this.a;
                return (T) new bnaj(fttVar.oB(), fttVar.eW.di());
            case 1103:
                ftt fttVar2 = this.a;
                return (T) new bngv(fttVar2.oh(), fttVar2.qY());
            case 1104:
                ftt fttVar3 = this.a;
                gga wk = fttVar3.wk();
                ccgr fc = fttVar3.eW.fc();
                Executor sU = fttVar3.eW.a.sU();
                dxjg.e(sU);
                return (T) new bnfp(wk, fc, sU);
            case 1105:
                ftt fttVar4 = this.a;
                dzsj<bwqv> er = fttVar4.eW.er();
                dzsj<cqhn> il = fttVar4.eW.il();
                dzsj dzsjVar = fttVar4.bi;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar4, 1106);
                    fttVar4.bi = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<cebm> om = fttVar4.om();
                dzsj dzsjVar3 = fttVar4.bj;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar4, 1108);
                    fttVar4.bj = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fttVar4.bk;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar4, 1109);
                    fttVar4.bk = dzsjVar5;
                }
                return (T) new bngs(er, il, dzsjVar2, om, dzsjVar4, dzsjVar5, fttVar4.on(), dxjh.c(fttVar4.aH()));
            case 1106:
                ftt fttVar5 = this.a;
                dzsj<gga> ad = fttVar5.ad();
                dzsj c = dxjh.c(fttVar5.aR());
                dzsj c2 = dxjh.c(fttVar5.m());
                dzsj<cebu> oc = fttVar5.oc();
                dzsj<ceet> cN = fttVar5.cN();
                dzsj dzsjVar6 = fttVar5.bh;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fns(fttVar5, 1107);
                    fttVar5.bh = dzsjVar6;
                }
                return (T) new bnfu(ad, c, c2, oc, cN, dzsjVar6);
            case 1107:
                ftt fttVar6 = this.a;
                return (T) new bngj(fttVar6.eV, fttVar6.eW.p(), dxjh.c(fttVar6.oh()), dxjh.c(fttVar6.aH()), fttVar6.eW.di());
            case 1108:
                return (T) new bngl(this.a.j());
            case 1109:
                ftt fttVar7 = this.a;
                return (T) new bnfr(fttVar7.kb(), fttVar7.kd(), fttVar7.kf());
            case 1110:
                ftt fttVar8 = this.a;
                gga wk2 = fttVar8.wk();
                btvo rp = fttVar8.eW.a.rp();
                dxjg.e(rp);
                return (T) new bkjh(new bkjz(wk2, rp, new bkjv(new bkkb(dxjh.c(fttVar8.aH()), fttVar8.eW.V()))));
            case 1111:
                ftt fttVar9 = this.a;
                dzsj dzsjVar7 = fttVar9.bH;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar9, 1112);
                    fttVar9.bH = dzsjVar7;
                }
                return (T) new behq(dxjc.c(dzsjVar7), dxjc.c(fttVar9.eW.mq()), dxjc.c(fttVar9.lU()), dxjc.c(fttVar9.mN()), dxjc.c(fttVar9.oL()));
            case 1112:
                return (T) this.a.se();
            case 1113:
                return (T) this.a.re();
            case 1114:
                return (T) this.a.rd();
            case 1115:
                return (T) this.a.rc();
            case 1116:
                return (T) this.a.rh();
            case 1117:
                return (T) this.a.rg();
            case 1118:
                return (T) this.a.ET();
            case 1119:
                ftt fttVar10 = this.a;
                T t = (T) fttVar10.fd;
                if (t != null) {
                    return t;
                }
                ?? r2 = (T) new abuo(fttVar10.eV, dxjh.c(fttVar10.az()));
                fttVar10.fd = r2;
                return r2;
            case 1120:
                return (T) this.a.rk();
            case 1121:
                return (T) this.a.rj();
            case 1122:
                return (T) this.a.EU();
            case 1123:
                return (T) this.a.fm();
            case 1124:
                return (T) this.a.rl();
            case 1125:
                ftt fttVar11 = this.a;
                dzsj dzsjVar8 = fttVar11.bn;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fns(fttVar11, 1126);
                    fttVar11.bn = dzsjVar8;
                }
                return (T) new adkm(dzsjVar8, fttVar11.pC());
            case 1126:
                ftt fttVar12 = this.a;
                T t2 = (T) fttVar12.fe;
                T t3 = t2;
                if (t2 == null) {
                    dzsj<cqhn> il2 = fttVar12.eW.il();
                    dzsj<abuo> rf = fttVar12.rf();
                    dzsj c3 = dxjh.c(fttVar12.aK());
                    dzsj dzsjVar9 = fttVar12.bm;
                    if (dzsjVar9 == null) {
                        dzsjVar9 = new fns(fttVar12, 1127);
                        fttVar12.bm = dzsjVar9;
                    }
                    ?? r22 = (T) new abwh(il2, rf, c3, dzsjVar9);
                    fttVar12.fe = r22;
                    t3 = r22;
                }
                return t3;
            case 1127:
                ftt fttVar13 = this.a;
                dzsj<bnjv> pl = fttVar13.pl();
                dzsj c4 = dxjh.c(fttVar13.az());
                dzsj<rb> dzsjVar10 = fttVar13.eV;
                dzsj<bvpe> je = fttVar13.je();
                dzsj<huc> jg = fttVar13.jg();
                dzsj<ahjq> k = fttVar13.eW.k();
                dzsj<bvsl> kf = fttVar13.eW.kf();
                dzsj dzsjVar11 = fttVar13.bl;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fns(fttVar13, 1128);
                    fttVar13.bl = dzsjVar11;
                }
                return (T) new abwf(pl, c4, dzsjVar10, je, jg, k, kf, dzsjVar11);
            case 1128:
                ftt fttVar14 = this.a;
                return (T) new abwb(fttVar14.eV, dxjh.c(fttVar14.aK()));
            case 1129:
                ftt fttVar15 = this.a;
                dzsj<abfa> mq = fttVar15.eW.mq();
                dzsj<adza> ij = fttVar15.eW.ij();
                dzsj dzsjVar12 = fttVar15.bo;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar15, 1130);
                    fttVar15.bo = dzsjVar12;
                }
                return (T) new adkp(mq, ij, dzsjVar12);
            case 1130:
                ftt fttVar16 = this.a;
                return (T) new adlh(dxjh.c(fttVar16.cY()), fttVar16.eV, fttVar16.eW.il());
            case 1131:
                return (T) this.a.rp();
            case 1132:
                return (T) this.a.pJ().a(new akgp());
            case 1133:
                ftt fttVar17 = this.a;
                return (T) new cbea(fttVar17.ad(), dxjh.c(fttVar17.rn()));
            case 1134:
                return (T) this.a.mK();
            case 1135:
                ftt fttVar18 = this.a;
                return (T) new adai(dxjh.c(fttVar18.rm()), fttVar18.eW.ij());
            case 1136:
                ftt fttVar19 = this.a;
                dzsj<abfa> mq2 = fttVar19.eW.mq();
                dzsj<adza> ij2 = fttVar19.eW.ij();
                dzsj dzsjVar13 = fttVar19.bt;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fns(fttVar19, 1137);
                    fttVar19.bt = dzsjVar13;
                }
                return (T) new adjm(mq2, ij2, dzsjVar13);
            case 1137:
                ftt fttVar20 = this.a;
                dzsj dzsjVar14 = fttVar20.bs;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fns(fttVar20, 1138);
                    fttVar20.bs = dzsjVar14;
                }
                return (T) new adjs(dzsjVar14, fttVar20.pC());
            case 1138:
                ftt fttVar21 = this.a;
                T t4 = (T) fttVar21.br;
                T t5 = t4;
                if (t4 == null) {
                    dzsj<rb> dzsjVar15 = fttVar21.eV;
                    dzsj<cqhn> il3 = fttVar21.eW.il();
                    dzsj<abfa> mq3 = fttVar21.eW.mq();
                    dzsj c5 = dxjh.c(fttVar21.rr());
                    dzsj<akox> as = fttVar21.as();
                    dzsj<abvd> rs = fttVar21.rs();
                    dzsj dzsjVar16 = fttVar21.bp;
                    if (dzsjVar16 == null) {
                        dzsjVar16 = new fns(fttVar21, 1141);
                        fttVar21.bp = dzsjVar16;
                    }
                    dzsj dzsjVar17 = dzsjVar16;
                    dzsj dzsjVar18 = fttVar21.bq;
                    if (dzsjVar18 == null) {
                        dzsjVar18 = new fns(fttVar21, 1142);
                        fttVar21.bq = dzsjVar18;
                    }
                    ?? r23 = (T) new abvo(dzsjVar15, il3, mq3, c5, as, rs, dzsjVar17, dzsjVar18, fttVar21.eW.al());
                    fttVar21.br = r23;
                    t5 = r23;
                }
                return t5;
            case 1139:
                return (T) this.a.rq();
            case 1140:
                ftt fttVar22 = this.a;
                return (T) new abvd(fttVar22.ad(), dxjh.c(fttVar22.J()), dxjh.c(fttVar22.m()), fttVar22.eW.K());
            case 1141:
                ftt fttVar23 = this.a;
                return (T) new abvi(dxjh.c(fttVar23.rr()), fttVar23.as());
            case 1142:
                return (T) this.a.rt();
            case 1143:
                ftt fttVar24 = this.a;
                dzsj<abfa> mq4 = fttVar24.eW.mq();
                dzsj<adza> ij3 = fttVar24.eW.ij();
                dzsj dzsjVar19 = fttVar24.bx;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fns(fttVar24, 1144);
                    fttVar24.bx = dzsjVar19;
                }
                return (T) new adjc(mq4, ij3, dzsjVar19);
            case 1144:
                ftt fttVar25 = this.a;
                dzsj dzsjVar20 = fttVar25.bw;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fns(fttVar25, 1145);
                    fttVar25.bw = dzsjVar20;
                }
                return (T) new adji(dzsjVar20, fttVar25.pC());
            case 1145:
                ftt fttVar26 = this.a;
                T t6 = (T) fttVar26.ff;
                T t7 = t6;
                if (t6 == null) {
                    dzsj<rb> dzsjVar21 = fttVar26.eV;
                    dzsj<cqhn> il4 = fttVar26.eW.il();
                    dzsj<abuo> rf2 = fttVar26.rf();
                    dzsj c6 = dxjh.c(fttVar26.rr());
                    dzsj dzsjVar22 = fttVar26.bv;
                    if (dzsjVar22 == null) {
                        dzsjVar22 = new fns(fttVar26, 1146);
                        fttVar26.bv = dzsjVar22;
                    }
                    ?? r24 = (T) new abva(dzsjVar21, il4, rf2, c6, dzsjVar22, fttVar26.as(), dxjh.c(fttVar26.av()));
                    fttVar26.ff = r24;
                    t7 = r24;
                }
                return t7;
            case 1146:
                ftt fttVar27 = this.a;
                dzsj<bnjv> pl2 = fttVar27.pl();
                dzsj c7 = dxjh.c(fttVar27.az());
                dzsj<rb> dzsjVar23 = fttVar27.eV;
                dzsj<bvpe> je2 = fttVar27.je();
                dzsj<huc> jg2 = fttVar27.jg();
                dzsj<ahjq> k2 = fttVar27.eW.k();
                dzsj<bvsl> kf2 = fttVar27.eW.kf();
                dzsj dzsjVar24 = fttVar27.bu;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fns(fttVar27, 1147);
                    fttVar27.bu = dzsjVar24;
                }
                return (T) new abuy(pl2, c7, dzsjVar23, je2, jg2, k2, kf2, dzsjVar24);
            case 1147:
                ftt fttVar28 = this.a;
                return (T) new abuu(fttVar28.eV, dxjh.c(fttVar28.rr()), fttVar28.as(), dxjh.c(fttVar28.av()));
            case 1148:
                return (T) this.a.ru();
            case 1149:
                ftt fttVar29 = this.a;
                Object obj3 = fttVar29.by;
                if (obj3 instanceof dxjf) {
                    synchronized (obj3) {
                        obj = fttVar29.by;
                        if (obj instanceof dxjf) {
                            dehq tg = fttVar29.eW.a.tg();
                            dxjg.e(tg);
                            bvkx o = fttVar29.eW.a.o();
                            dxjg.e(o);
                            ckcw rU = fttVar29.eW.a.rU();
                            dxjg.e(rU);
                            obj = new aean(tg, o, rU);
                            dxjc.d(fttVar29.by, obj);
                            fttVar29.by = obj;
                        }
                    }
                    obj3 = obj;
                }
                return (T) ((aean) obj3);
            case 1150:
                return (T) this.a.rD();
            case 1151:
                return (T) this.a.rC();
            case 1152:
                ftt fttVar30 = this.a;
                T t8 = (T) fttVar30.bz;
                if (t8 != null) {
                    return t8;
                }
                ?? r25 = (T) new abez(dxjc.c(fttVar30.eW.mq()));
                fttVar30.bz = r25;
                return r25;
            case 1153:
                return (T) this.a.rz();
            case 1154:
                ftt fttVar31 = this.a;
                dzsj<akox> as2 = fttVar31.as();
                dzsj dzsjVar25 = fttVar31.bA;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fns(fttVar31, 1155);
                    fttVar31.bA = dzsjVar25;
                }
                return (T) new abvr(as2, dzsjVar25, fttVar31.rA(), fttVar31.ad(), fttVar31.lN(), fttVar31.eW.mj());
            case 1155:
                ftt fttVar32 = this.a;
                return (T) new aeau(fttVar32.eW.di(), fttVar32.eW.o(), fttVar32.eV);
            case 1156:
                ftt fttVar33 = this.a;
                return (T) new abfl(fttVar33.eW.di(), dxjh.c(fttVar33.eW.at()), dxjh.c(fttVar33.bm()), dxjh.c(fttVar33.aK()), fttVar33.eW.V());
            case 1157:
                ftt fttVar34 = this.a;
                dzsj<cqhn> il5 = fttVar34.eW.il();
                dzsj dzsjVar26 = fttVar34.bB;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new fns(fttVar34, 1158);
                    fttVar34.bB = dzsjVar26;
                }
                return (T) new adhf(il5, dzsjVar26, fttVar34.pC(), fttVar34.ry());
            case 1158:
                return (T) this.a.EV();
            case 1159:
                ftt fttVar35 = this.a;
                return (T) new abvz(fttVar35.eW.V(), fttVar35.as(), fttVar35.rF(), fttVar35.ad(), fttVar35.lN());
            case 1160:
                ftt fttVar36 = this.a;
                return (T) new bsmd(dxjh.c(fttVar36.bm()), dxjh.c(fttVar36.aK()), dxjh.c(fttVar36.J()));
            case 1161:
                return (T) this.a.rZ();
            case 1162:
                ftt fttVar37 = this.a;
                dzsj<gga> ad2 = fttVar37.ad();
                dzsj<btvo> V = fttVar37.eW.V();
                dzsj<cqat> K = fttVar37.eW.K();
                dzsj<cqhn> il6 = fttVar37.eW.il();
                dzsj dzsjVar27 = fttVar37.bC;
                if (dzsjVar27 == null) {
                    dzsjVar27 = new fns(fttVar37, 1163);
                    fttVar37.bC = dzsjVar27;
                }
                return (T) new aejb(ad2, V, K, il6, dzsjVar27, fttVar37.rH(), dxjh.c(fttVar37.rY()));
            case 1163:
                return (T) this.a.qL();
            case 1164:
                ftt fttVar38 = this.a;
                Object obj4 = fttVar38.bD;
                if (obj4 instanceof dxjf) {
                    synchronized (obj4) {
                        obj2 = fttVar38.bD;
                        if (obj2 instanceof dxjf) {
                            obj2 = new aeib(fttVar38.wk(), dxjc.c(fttVar38.eW.lz()), dxjc.c(fttVar38.eW.ec()), dxjc.c(fttVar38.as()), dxjc.c(fttVar38.aK()));
                            dxjc.d(fttVar38.bD, obj2);
                            fttVar38.bD = obj2;
                        }
                    }
                    obj4 = obj2;
                }
                return (T) ((aeic) obj4);
            case 1165:
                ftt fttVar39 = this.a;
                dxio c8 = dxjc.c(fttVar39.rJ());
                bsiq rK = fttVar39.rK();
                bsim rL = fttVar39.rL();
                dxio c9 = dxjc.c(fttVar39.rM());
                dxio c10 = dxjc.c(fttVar39.rO());
                dxio c11 = dxjc.c(fttVar39.rP());
                dxio c12 = dxjc.c(fttVar39.rQ());
                bsiw rR = fttVar39.rR();
                bshy rS = fttVar39.rS();
                bsid rT = fttVar39.rT();
                bsii rU2 = fttVar39.rU();
                dzsj dzsjVar28 = fttVar39.bE;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new fns(fttVar39, 1171);
                    fttVar39.bE = dzsjVar28;
                }
                dxio c13 = dxjc.c(dzsjVar28);
                Resources c14 = fttVar39.eW.a.c();
                dxjg.e(c14);
                btvo rp2 = fttVar39.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bskt(c8, rK, rL, c9, c10, c11, c12, rR, rS, rT, rU2, c13, c14, rp2, fttVar39.eW.io(), fttVar39.eW.cH(), new brfq(fttVar39.a, fttVar39.eW.cH(), fttVar39.B()), fttVar39.eW.ln(), dxjc.c(fttVar39.rX()));
            case 1166:
                return (T) this.a.rI();
            case 1167:
                ftt fttVar40 = this.a;
                return (T) new bsjd(fttVar40.eW.fr(), fttVar40.eW.il());
            case 1168:
                return (T) this.a.rN();
            case 1169:
                return (T) new bshp(this.a.eV);
            case 1170:
                return (T) new bsht(this.a.eV);
            case 1171:
                return (T) this.a.rV();
            case 1172:
                return (T) this.a.rW();
            case 1173:
                return (T) this.a.sa();
            case 1174:
                ftt fttVar41 = this.a;
                T t9 = (T) fttVar41.fg;
                if (t9 != null) {
                    return t9;
                }
                ?? r26 = (T) new abvw(fttVar41.ql());
                fttVar41.fg = r26;
                return r26;
            case 1175:
                ftt fttVar42 = this.a;
                dzsj dzsjVar29 = fttVar42.bG;
                if (dzsjVar29 == null) {
                    dzsjVar29 = new fns(fttVar42, 1176);
                    fttVar42.bG = dzsjVar29;
                }
                return (T) new adiz(dzsjVar29, fttVar42.pC());
            case 1176:
                ftt fttVar43 = this.a;
                T t10 = (T) fttVar43.fi;
                T t11 = t10;
                if (t10 == null) {
                    dzsj<cqhn> il7 = fttVar43.eW.il();
                    dzsj c15 = dxjh.c(fttVar43.eW());
                    dzsj dzsjVar30 = fttVar43.bF;
                    if (dzsjVar30 == null) {
                        dzsjVar30 = new fns(fttVar43, 1177);
                        fttVar43.bF = dzsjVar30;
                    }
                    ?? r27 = (T) new abum(il7, c15, dzsjVar30, dxjh.c(fttVar43.aK()));
                    fttVar43.fi = r27;
                    t11 = r27;
                }
                return t11;
            case 1177:
                ftt fttVar44 = this.a;
                T t12 = (T) fttVar44.fh;
                if (t12 != null) {
                    return t12;
                }
                ?? r28 = (T) new abuh(fttVar44.eV, fttVar44.rf());
                fttVar44.fh = r28;
                return r28;
            case 1178:
                return (T) this.a.sb();
            case 1179:
                ftt fttVar45 = this.a;
                btvo rp3 = fttVar45.eW.a.rp();
                dxjg.e(rp3);
                bfwb lS = fttVar45.lS();
                blkj lX = fttVar45.lX();
                dzsj dzsjVar31 = fttVar45.bI;
                if (dzsjVar31 == null) {
                    dzsjVar31 = new fns(fttVar45, 1180);
                    fttVar45.bI = dzsjVar31;
                }
                dxio c16 = dxjc.c(dzsjVar31);
                dzsj dzsjVar32 = fttVar45.bJ;
                if (dzsjVar32 == null) {
                    dzsjVar32 = new fns(fttVar45, 1181);
                    fttVar45.bJ = dzsjVar32;
                }
                dxio c17 = dxjc.c(dzsjVar32);
                dzsj dzsjVar33 = fttVar45.bK;
                if (dzsjVar33 == null) {
                    dzsjVar33 = new fns(fttVar45, 1182);
                    fttVar45.bK = dzsjVar33;
                }
                dxio c18 = dxjc.c(dzsjVar33);
                dxio c19 = dxjc.c(fttVar45.mj());
                dzsj dzsjVar34 = fttVar45.bL;
                if (dzsjVar34 == null) {
                    dzsjVar34 = new fns(fttVar45, 1183);
                    fttVar45.bL = dzsjVar34;
                }
                dxio c20 = dxjc.c(dzsjVar34);
                dxio c21 = dxjc.c(fttVar45.mg());
                dzsj dzsjVar35 = fttVar45.bM;
                if (dzsjVar35 == null) {
                    dzsjVar35 = new fns(fttVar45, 1184);
                    fttVar45.bM = dzsjVar35;
                }
                dxio c22 = dxjc.c(dzsjVar35);
                dzsj dzsjVar36 = fttVar45.bN;
                if (dzsjVar36 == null) {
                    dzsjVar36 = new fns(fttVar45, 1185);
                    fttVar45.bN = dzsjVar36;
                }
                dxio c23 = dxjc.c(dzsjVar36);
                dzsj dzsjVar37 = fttVar45.bO;
                if (dzsjVar37 == null) {
                    dzsjVar37 = new fns(fttVar45, 1186);
                    fttVar45.bO = dzsjVar37;
                }
                dxio c24 = dxjc.c(dzsjVar37);
                dzsj dzsjVar38 = fttVar45.bP;
                if (dzsjVar38 == null) {
                    dzsjVar38 = new fns(fttVar45, 1187);
                    fttVar45.bP = dzsjVar38;
                }
                dxio c25 = dxjc.c(dzsjVar38);
                dxio c26 = dxjc.c(fttVar45.oL());
                dzsj dzsjVar39 = fttVar45.bQ;
                if (dzsjVar39 == null) {
                    dzsjVar39 = new fns(fttVar45, 1188);
                    fttVar45.bQ = dzsjVar39;
                }
                dxio c27 = dxjc.c(dzsjVar39);
                dxio c28 = dxjc.c(fttVar45.ml());
                dxio c29 = dxjc.c(fttVar45.mn());
                dxio c30 = dxjc.c(fttVar45.mu());
                dxio c31 = dxjc.c(fttVar45.mN());
                dxio c32 = dxjc.c(fttVar45.nJ());
                dxio c33 = dxjc.c(fttVar45.nN());
                dxio c34 = dxjc.c(fttVar45.nP());
                dxjc.c(fttVar45.lW());
                return (T) new behs(rp3, lS, lX, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, dxjc.c(fttVar45.lU()), dxjc.c(fttVar45.nY()), dxjc.c(fttVar45.oa()), dxjc.c(fttVar45.oq()), dxjc.c(fttVar45.oJ()), dxjc.c(fttVar45.pM()), dxjc.c(fttVar45.pn()), dxjc.c(fttVar45.qX()), dxjc.c(fttVar45.eW.p()), fttVar45.hh());
            case 1180:
                return (T) new becs(this.a.sf());
            case 1181:
                ftt fttVar46 = this.a;
                rb rbVar = fttVar46.a;
                btvo rp4 = fttVar46.eW.a.rp();
                dxjg.e(rp4);
                return (T) new becu(new becv(rbVar, rp4, dxjc.c(fttVar46.m())));
            case 1182:
                ftt fttVar47 = this.a;
                rb rbVar2 = fttVar47.a;
                btvo rp5 = fttVar47.eW.a.rp();
                dxjg.e(rp5);
                return (T) new bkhc(new bkhn(rbVar2, rp5, dxjc.c(fttVar47.ef()), dxjc.c(fttVar47.cn())));
            case 1183:
                ftt fttVar48 = this.a;
                return (T) new bkok(new bkom(fttVar48.a, dxjc.c(fttVar48.az()), fttVar48.jH()));
            case 1184:
                return (T) new bikw(new bilj(this.a.a));
            case 1185:
                ftt fttVar49 = this.a;
                rb rbVar3 = fttVar49.a;
                cqat rR2 = fttVar49.eW.a.rR();
                dxjg.e(rR2);
                return (T) new bikv(new bili(rbVar3, rR2));
            case 1186:
                return (T) new bfxn(new bfxo(this.a.a));
            case 1187:
                return (T) new bilm(this.a.ns());
            case 1188:
                return (T) this.a.si();
            case 1189:
                return (T) this.a.sg();
            case 1190:
                ftt fttVar50 = this.a;
                btvo rp6 = fttVar50.eW.a.rp();
                dxjg.e(rp6);
                bfwb lS2 = fttVar50.lS();
                blkj lX2 = fttVar50.lX();
                dxio c35 = dxjc.c(fttVar50.mj());
                dxio c36 = dxjc.c(fttVar50.ml());
                dxio c37 = dxjc.c(fttVar50.mn());
                dxio c38 = dxjc.c(fttVar50.mu());
                dxio c39 = dxjc.c(fttVar50.nJ());
                dxio c40 = dxjc.c(fttVar50.nN());
                dxio c41 = dxjc.c(fttVar50.mN());
                dxio c42 = dxjc.c(fttVar50.qQ());
                dxio c43 = dxjc.c(fttVar50.qR());
                dzsj dzsjVar40 = fttVar50.bR;
                if (dzsjVar40 == null) {
                    dzsjVar40 = new fns(fttVar50, 1191);
                    fttVar50.bR = dzsjVar40;
                }
                dxio c44 = dxjc.c(dzsjVar40);
                dxio c45 = dxjc.c(fttVar50.nP());
                dxjc.c(fttVar50.lW());
                return (T) new behv(rp6, lS2, lX2, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, dxjc.c(fttVar50.lU()), dxjc.c(fttVar50.qm()), dxjc.c(fttVar50.nY()), dxjc.c(fttVar50.oa()), dxjc.c(fttVar50.oq()), dxjc.c(fttVar50.oJ()), dxjc.c(fttVar50.pM()), dxjc.c(fttVar50.pn()), dxjc.c(fttVar50.eW.p()), fttVar50.hh());
            case 1191:
                return (T) new bmho(new bmht(this.a.sj()));
            case 1192:
                return (T) new xhx(dxjh.c(this.a.H()));
            case 1193:
                ftt fttVar51 = this.a;
                dzsj dzsjVar41 = fttVar51.bS;
                if (dzsjVar41 == null) {
                    dzsjVar41 = new fns(fttVar51, 1194);
                    fttVar51.bS = dzsjVar41;
                }
                dxio c46 = dxjc.c(dzsjVar41);
                dzsj dzsjVar42 = fttVar51.bT;
                if (dzsjVar42 == null) {
                    dzsjVar42 = new fns(fttVar51, 1195);
                    fttVar51.bT = dzsjVar42;
                }
                dxio c47 = dxjc.c(dzsjVar42);
                dzsj dzsjVar43 = fttVar51.bU;
                if (dzsjVar43 == null) {
                    dzsjVar43 = new fns(fttVar51, 1196);
                    fttVar51.bU = dzsjVar43;
                }
                dxio c48 = dxjc.c(dzsjVar43);
                dzsj dzsjVar44 = fttVar51.bV;
                if (dzsjVar44 == null) {
                    dzsjVar44 = new fns(fttVar51, 1197);
                    fttVar51.bV = dzsjVar44;
                }
                return (T) new behu(c46, c47, c48, dxjc.c(dzsjVar44));
            case 1194:
                ftt fttVar52 = this.a;
                return (T) new arig(new arip(fttVar52.a, dxjc.c(fttVar52.bd())));
            case 1195:
                return (T) new arif(new ario());
            case 1196:
                return (T) new arid(new arih(this.a.a));
            case 1197:
                ftt fttVar53 = this.a;
                return (T) new arie(new arik(fttVar53.a, fttVar53.sk(), dxjc.c(fttVar53.bd())));
            case 1198:
                return (T) this.a.bV();
            case 1199:
                return (T) this.a.vZ();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v71, types: [T, bvfm, bvfk] */
    /* JADX WARN: Type inference failed for: r2v85, types: [T, bvfe, bvfc] */
    /* JADX WARN: Type inference failed for: r3v35, types: [T, buuk] */
    private final T i() {
        Object obj;
        int i = this.b;
        switch (i) {
            case 1000:
                ftt fttVar = this.a;
                return (T) new bmev(new bmey(fttVar.wk(), fttVar.bl(), fttVar.pq()));
            case 1001:
                ftt fttVar2 = this.a;
                dzsj dzsjVar = fttVar2.aM;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar2, 1002);
                    fttVar2.aM = dzsjVar;
                }
                dzsj dzsjVar2 = fttVar2.aR;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar2, 1003);
                    fttVar2.aR = dzsjVar2;
                }
                return (T) new abed(dzsjVar, dzsjVar2);
            case 1002:
                return (T) new abem();
            case 1003:
                ftt fttVar3 = this.a;
                dzsj dzsjVar3 = fttVar3.aQ;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar3, 1004);
                    fttVar3.aQ = dzsjVar3;
                }
                return (T) new abcz(dzsjVar3);
            case 1004:
                ftt fttVar4 = this.a;
                dzsj<Executor> di = fttVar4.eW.di();
                dzsj<cqhn> il = fttVar4.eW.il();
                dzsj<cqkj> y = fttVar4.y();
                dzsj<gdc> lD = fttVar4.lD();
                dzsj dzsjVar4 = fttVar4.aO;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fns(fttVar4, 1005);
                    fttVar4.aO = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = fttVar4.aP;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fns(fttVar4, 1007);
                    fttVar4.aP = dzsjVar6;
                }
                return (T) new abdf(di, il, y, lD, dzsjVar5, dzsjVar6);
            case 1005:
                ftt fttVar5 = this.a;
                dzsj<rb> dzsjVar7 = fttVar5.eV;
                dzsj dzsjVar8 = fttVar5.aN;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fns(fttVar5, 1006);
                    fttVar5.aN = dzsjVar8;
                }
                return (T) new abdn(dzsjVar7, dzsjVar8);
            case 1006:
                return (T) new abdo(dxjh.c(this.a.m()));
            case 1007:
                ftt fttVar6 = this.a;
                btpc sz = fttVar6.eW.a.sz();
                dxjg.e(sz);
                Executor sU = fttVar6.eW.a.sU();
                dxjg.e(sU);
                buoi buoiVar = fttVar6.fb;
                if (buoiVar == null) {
                    dxio c = dxjc.c(fttVar6.eW.h());
                    bvrb tn = fttVar6.eW.a.tn();
                    dxjg.e(tn);
                    buoiVar = new buoi(new buoh(c, tn));
                    fttVar6.fb = buoiVar;
                }
                return (T) new abdi(sz, sU, buoiVar);
            case 1008:
                ftt fttVar7 = this.a;
                gga wk = fttVar7.wk();
                bwqv rD = fttVar7.eW.a.rD();
                dxjg.e(rD);
                return (T) new acku(new acky(wk, rD, dxjc.c(fttVar7.m()), dxjc.c(fttVar7.J())));
            case 1009:
                ftt fttVar8 = this.a;
                gga wk2 = fttVar8.wk();
                bwqv rD2 = fttVar8.eW.a.rD();
                dxjg.e(rD2);
                dxio c2 = dxjc.c(fttVar8.az());
                cjqy tr = fttVar8.eW.a.tr();
                dxjg.e(tr);
                bgoq pt = fttVar8.pt();
                bgoe bgoeVar = new bgoe(fttVar8.eV, fttVar8.jG(), fttVar8.pv(), dxjh.c(fttVar8.m()), dxjh.c(fttVar8.ai()), dxjh.c(fttVar8.x()), fttVar8.eW.V());
                cjqq tp = fttVar8.eW.a.tp();
                dxjg.e(tp);
                return (T) new bgek(new bgem(wk2, rD2, c2, tr, pt, bgoeVar, tp));
            case 1010:
                return (T) this.a.pr();
            case 1011:
                return (T) this.a.ps();
            case 1012:
                ftt fttVar9 = this.a;
                return (T) new bgpa(fttVar9.eV, fttVar9.eW.il(), fttVar9.jG(), fttVar9.pu(), dxjh.c(fttVar9.m()));
            case 1013:
                ftt fttVar10 = this.a;
                return (T) new bgnj(fttVar10.eV, fttVar10.eW.je(), dxjh.c(fttVar10.aN()), fttVar10.eW.al());
            case 1014:
                ftt fttVar11 = this.a;
                cqhn cqhnVar = new cqhn();
                bhhf k = fttVar11.k();
                bnjj mA = fttVar11.eW.mA();
                gga wk3 = fttVar11.wk();
                bwqv rD3 = fttVar11.eW.a.rD();
                dxjg.e(rD3);
                return (T) new bgeo(new bger(cqhnVar, k, mA, wk3, rD3, new cpv(), fttVar11.pz(), fttVar11.pA(), fttVar11.pB(), fttVar11.lj()));
            case 1015:
                return (T) this.a.pt();
            case 1016:
                ftt fttVar12 = this.a;
                return (T) new bgpj(fttVar12.eV, dxjh.c(fttVar12.m()));
            case 1017:
                ftt fttVar13 = this.a;
                dzsj<rb> dzsjVar9 = fttVar13.eV;
                dzsj<cqhn> il2 = fttVar13.eW.il();
                dzsj<apqe> pw = fttVar13.pw();
                dzsj<cjqy> al = fttVar13.eW.al();
                dzsj<gga> ad = fttVar13.ad();
                dzsj dzsjVar10 = fttVar13.aS;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fns(fttVar13, 1019);
                    fttVar13.aS = dzsjVar10;
                }
                return (T) new bgqk(dzsjVar9, il2, pw, al, ad, dzsjVar10);
            case 1018:
                return (T) this.a.le();
            case 1019:
                return (T) this.a.px();
            case 1020:
                ftt fttVar14 = this.a;
                return (T) new bgos(fttVar14.eV, fttVar14.jG(), fttVar14.pv(), dxjh.c(fttVar14.ai()), dxjh.c(fttVar14.x()), dxjh.c(fttVar14.m()), fttVar14.eW.V());
            case 1021:
                ftt fttVar15 = this.a;
                return (T) new bgpg(fttVar15.eV, fttVar15.eW.V());
            case 1022:
                ftt fttVar16 = this.a;
                return (T) new bgnc(fttVar16.eV, fttVar16.eW.V(), fttVar16.eW.il(), fttVar16.eW.al());
            case 1023:
                return (T) new bgpe(this.a.eV);
            case 1024:
                return (T) new bgpc(this.a.eV);
            case 1025:
                ftt fttVar17 = this.a;
                T t = (T) fttVar17.fc;
                if (t != null) {
                    return t;
                }
                ?? r3 = (T) new buuk((buuj) fttVar17.eW.mc());
                fttVar17.fc = r3;
                return r3;
            case 1026:
                return (T) new bgqq(dxjh.c(this.a.pL()));
            case 1027:
                return (T) this.a.pK();
            case 1028:
                return (T) this.a.lz();
            case 1029:
                ftt fttVar18 = this.a;
                dzsj<rb> dzsjVar11 = fttVar18.eV;
                dzsj<aklk> pD = fttVar18.pD();
                dzsj<aklj> pF = fttVar18.pF();
                dzsj dzsjVar12 = fttVar18.aT;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar18, 1032);
                    fttVar18.aT = dzsjVar12;
                }
                return (T) new aklw(dzsjVar11, pD, pF, dzsjVar12, dxjh.c(fttVar18.m()), fttVar18.pF());
            case 1030:
                return (T) new aklk(dxjc.c(this.a.bm()));
            case 1031:
                return (T) this.a.pE();
            case 1032:
                return (T) this.a.pG();
            case 1033:
                return (T) this.a.pI();
            case 1034:
                return (T) this.a.pH();
            case 1035:
                return (T) new aklt(dxjh.c(this.a.bm()));
            case 1036:
                return (T) new bizh(this.a.ql());
            case 1037:
                ftt fttVar19 = this.a;
                dzsj<bjgu> pO = fttVar19.pO();
                dzsj<bjkq> pW = fttVar19.pW();
                dzsj dzsjVar13 = fttVar19.ba;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fns(fttVar19, 1044);
                    fttVar19.ba = dzsjVar13;
                }
                return (T) new bjhi(pO, pW, dzsjVar13);
            case 1038:
                return (T) this.a.pN();
            case 1039:
                ftt fttVar20 = this.a;
                dzsj<gga> ad2 = fttVar20.ad();
                dzsj<cqhn> il3 = fttVar20.eW.il();
                dzsj<bjbu> fF = fttVar20.fF();
                dzsj dzsjVar14 = fttVar20.aU;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fns(fttVar20, 1040);
                    fttVar20.aU = dzsjVar14;
                }
                return (T) new bjkq(ad2, il3, fF, dzsjVar14, fttVar20.pV());
            case 1040:
                return (T) this.a.pR();
            case 1041:
                return (T) this.a.pP();
            case 1042:
                return (T) this.a.pU();
            case 1043:
                return (T) this.a.pS();
            case 1044:
                ftt fttVar21 = this.a;
                fttVar21.ad();
                fttVar21.eW.il();
                fttVar21.eW.mC();
                if (fttVar21.aV == null) {
                    fttVar21.aV = new fns(fttVar21, 1045);
                }
                if (fttVar21.aY == null) {
                    fttVar21.aY = new fns(fttVar21, 1046);
                }
                if (fttVar21.aZ == null) {
                    fttVar21.aZ = new fns(fttVar21, 1058);
                }
                return (T) new bjzr();
            case 1045:
                ftt fttVar22 = this.a;
                fttVar22.pQ();
                fttVar22.eW.di();
                return (T) new bjqh();
            case 1046:
                ftt fttVar23 = this.a;
                fttVar23.ad();
                fttVar23.fF();
                fttVar23.qk();
                return (T) new bjzp();
            case 1047:
                ftt fttVar24 = this.a;
                fttVar24.ad();
                fttVar24.qg();
                fttVar24.qh();
                fttVar24.qj();
                fttVar24.fF();
                fttVar24.m();
                fttVar24.qb();
                return (T) new bjzf();
            case 1048:
                ftt fttVar25 = this.a;
                return (T) new bjzo(fttVar25.ad(), fttVar25.eW.il(), fttVar25.pX(), fttVar25.eW.er(), fttVar25.eW.n(), fttVar25.pY(), fttVar25.cx(), dxjh.c(fttVar25.m()), fttVar25.eW.V(), fttVar25.qa(), fttVar25.qb(), fttVar25.eW.mC(), fttVar25.qd(), fttVar25.qf());
            case 1049:
                ftt fttVar26 = this.a;
                gga wk4 = fttVar26.wk();
                cjqy tr2 = fttVar26.eW.a.tr();
                dxjg.e(tr2);
                return (T) new bjgo(wk4, tr2);
            case 1050:
                ftt fttVar27 = this.a;
                T t2 = (T) fttVar27.aW;
                if (t2 != null) {
                    return t2;
                }
                dxio c3 = dxjc.c(fttVar27.eW.h());
                bvrb tn2 = fttVar27.eW.a.tn();
                dxjg.e(tn2);
                ?? r2 = (T) new bvfm(new bvfl(c3, tn2));
                fttVar27.aW = r2;
                return r2;
            case 1051:
                return (T) this.a.pZ();
            case 1052:
                ftt fttVar28 = this.a;
                return (T) new bjgy(fttVar28.wk(), fttVar28.eW.mD(), fttVar28.n(), fttVar28.pS(), fttVar28.eW.mz());
            case 1053:
                ftt fttVar29 = this.a;
                dzsj<cqhn> il4 = fttVar29.eW.il();
                dzsj<gga> ad3 = fttVar29.ad();
                dzsj c4 = dxjh.c(fttVar29.eW.p());
                dzsj<bjhc> pT = fttVar29.pT();
                dzsj<bvfc> qc = fttVar29.qc();
                fyu fyuVar = fttVar29.eW;
                dzsj dzsjVar15 = fyuVar.de;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fxy(fyuVar, 609);
                    fyuVar.de = dzsjVar15;
                }
                return (T) new bkak(il4, ad3, c4, pT, qc, dzsjVar15);
            case 1054:
                ftt fttVar30 = this.a;
                T t3 = (T) fttVar30.aX;
                if (t3 != null) {
                    return t3;
                }
                dxio c5 = dxjc.c(fttVar30.eW.h());
                bvrb tn3 = fttVar30.eW.a.tn();
                dxjg.e(tn3);
                ?? r22 = (T) new bvfe(new bvfd(c5, tn3));
                fttVar30.aX = r22;
                return r22;
            case 1055:
                return (T) this.a.qe();
            case 1056:
                ftt fttVar31 = this.a;
                return (T) new bjyr(fttVar31.ad(), fttVar31.cx());
            case 1057:
                return (T) this.a.qi();
            case 1058:
                ftt fttVar32 = this.a;
                fttVar32.ad();
                fttVar32.eW.er();
                fttVar32.pT();
                fttVar32.fF();
                return (T) new bjzq();
            case 1059:
                ftt fttVar33 = this.a;
                dxjc.c(fttVar33.jc());
                dxjg.e(fttVar33.eW.a.rB());
                dxjg.e(fttVar33.eW.a.tn());
                return (T) new bmir(new bmis());
            case 1060:
                ftt fttVar34 = this.a;
                bgsp bgspVar = new bgsp(fttVar34.wk(), fttVar34.qn(), fttVar34.jH(), fttVar34.wj());
                bgsy qo = fttVar34.qo();
                bgte qp = fttVar34.qp();
                bgst qq = fttVar34.qq();
                begg wj = fttVar34.wj();
                bwqv rD4 = fttVar34.eW.a.rD();
                dxjg.e(rD4);
                bgse mF = fttVar34.eW.mF();
                ckcw rU = fttVar34.eW.a.rU();
                dxjg.e(rU);
                return (T) new bgqv(new bgtp(bgspVar, qo, qp, qq, wj, rD4, mF, rU, fttVar34.eW.wf()));
            case 1061:
                return (T) this.a.U();
            case 1062:
                ftt fttVar35 = this.a;
                gga wk5 = fttVar35.wk();
                cqhn cqhnVar2 = new cqhn();
                bkdp bkdpVar = new bkdp(fttVar35.eV, fttVar35.qs());
                bkea qt = fttVar35.qt();
                dzsj<gga> ad4 = fttVar35.ad();
                dzsj dzsjVar16 = fttVar35.bb;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new fns(fttVar35, 1065);
                    fttVar35.bb = dzsjVar16;
                }
                bken bkenVar = new bken(ad4, dzsjVar16, fttVar35.eW.di(), fttVar35.qs(), fttVar35.kI(), fttVar35.eS(), fttVar35.eW.il(), fttVar35.eW.al());
                bkdn bkdnVar = new bkdn(fttVar35.qs());
                btvo rp = fttVar35.eW.a.rp();
                dxjg.e(rp);
                return (T) new bkau(new bkdv(wk5, cqhnVar2, bkdpVar, qt, bkenVar, bkdnVar, rp));
            case 1063:
                return (T) this.a.qr();
            case 1064:
                return (T) new bkeo();
            case 1065:
                return (T) this.a.ES();
            case 1066:
                ftt fttVar36 = this.a;
                bker qu = fttVar36.qu();
                rb rbVar = fttVar36.a;
                btvo rp2 = fttVar36.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bkep(qu, rbVar, rp2);
            case 1067:
                ftt fttVar37 = this.a;
                btvo rp3 = fttVar37.eW.a.rp();
                dxjg.e(rp3);
                return (T) new bhnb(new bhto(rp3, fttVar37.jf(), dxjc.c(fttVar37.qv()), dxjc.c(fttVar37.qw()), dxjc.c(fttVar37.az()), fttVar37.mY(), fttVar37.mZ(), fttVar37.nc(), fttVar37.jd(), fttVar37.qx(), fttVar37.k()));
            case 1068:
                ftt fttVar38 = this.a;
                Object obj2 = fttVar38.bc;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = fttVar38.bc;
                        if (obj instanceof dxjf) {
                            gga wk6 = fttVar38.wk();
                            bwqv rD5 = fttVar38.eW.a.rD();
                            dxjg.e(rD5);
                            obj = new bhng(wk6, rD5);
                            dxjc.d(fttVar38.bc, obj);
                            fttVar38.bc = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((bhng) obj2);
            case 1069:
                T t4 = (T) ((cclq) this.a.m21if().b(45));
                dxjg.f(t4);
                return t4;
            case 1070:
                ftt fttVar39 = this.a;
                rb rbVar2 = fttVar39.a;
                cqhn cqhnVar3 = new cqhn();
                beya qy = fttVar39.qy();
                bfaq aE = fttVar39.aE();
                bfbc qD = fttVar39.qD();
                dxio c6 = dxjc.c(fttVar39.cz());
                bfbe bfbeVar = new bfbe(fttVar39.a, new cqhn(), new cqhu(), fttVar39.aE(), fttVar39.eW.mJ(), dxjc.c(fttVar39.eW.im()), dxjc.c(fttVar39.eW.hN()), new cpv());
                bgng pr = fttVar39.pr();
                bvrb tn4 = fttVar39.eW.a.tn();
                dxjg.e(tn4);
                return (T) new beyk(new bfbj(rbVar2, cqhnVar3, qy, aE, qD, c6, bfbeVar, pr, tn4, dxjc.c(fttVar39.eW.im())));
            case 1071:
                return (T) this.a.qy();
            case 1072:
                return (T) this.a.aE();
            case 1073:
                return (T) this.a.qB();
            case 1074:
                ftt fttVar40 = this.a;
                gga wk7 = fttVar40.wk();
                cqhn cqhnVar4 = new cqhn();
                bvvw bvvwVar = (bvvw) fttVar40.ao();
                bovv fS = fttVar40.fS();
                akfa rK = fttVar40.eW.a.rK();
                dxjg.e(rK);
                return (T) new bgtq(new bgub(wk7, cqhnVar4, bvvwVar, fS, rK, dxjc.c(fttVar40.r())));
            case 1075:
                ftt fttVar41 = this.a;
                bhhf k2 = fttVar41.k();
                bbut be = fttVar41.be();
                boxa cm = fttVar41.cm();
                apup lj = fttVar41.lj();
                apus qF = fttVar41.qF();
                bhhy qG = fttVar41.qG();
                cqhn cqhnVar5 = new cqhn();
                bhhf k3 = fttVar41.k();
                bhje qH = fttVar41.qH();
                bvjj rB = fttVar41.eW.a.rB();
                dxjg.e(rB);
                bhit bhitVar = new bhit(cqhnVar5, k3, qH, rB);
                dzsj dzsjVar17 = fttVar41.bd;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fns(fttVar41, 1076);
                    fttVar41.bd = dzsjVar17;
                }
                return (T) new bhdy(new bhjc(k2, be, cm, lj, qF, qG, bhitVar, dxjc.c(dzsjVar17), fttVar41.qH()));
            case 1076:
                ftt fttVar42 = this.a;
                bhhf k4 = fttVar42.k();
                apwn iH = fttVar42.eW.iH();
                Executor sU2 = fttVar42.eW.a.sU();
                dxjg.e(sU2);
                cqhn cqhnVar6 = new cqhn();
                aqwq co = fttVar42.eW.co();
                akfa rK2 = fttVar42.eW.a.rK();
                dxjg.e(rK2);
                cqat rR = fttVar42.eW.a.rR();
                dxjg.e(rR);
                btvo rp4 = fttVar42.eW.a.rp();
                dxjg.e(rp4);
                return (T) new bhix(k4, iH, sU2, cqhnVar6, co, rK2, rR, rp4, dxjc.c(fttVar42.x()), fttVar42.wk(), fttVar42.wl());
            case 1077:
                ftt fttVar43 = this.a;
                bvpe jd = fttVar43.jd();
                huc jf = fttVar43.jf();
                dzsj<rb> dzsjVar18 = fttVar43.eV;
                dzsj<cqhn> il5 = fttVar43.eW.il();
                dzsj<vsf> jm = fttVar43.eW.jm();
                dzsj c7 = dxjh.c(fttVar43.H());
                dzsj dzsjVar19 = fttVar43.be;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fns(fttVar43, 1078);
                    fttVar43.be = dzsjVar19;
                }
                bhmq bhmqVar = new bhmq(dzsjVar18, il5, jm, c7, dzsjVar19, fttVar43.eW.V());
                rb rbVar3 = fttVar43.a;
                btvo rp5 = fttVar43.eW.a.rp();
                dxjg.e(rp5);
                return (T) new bhlm(new bhmz(jd, jf, bhmqVar, rbVar3, rp5, new cqhn(), fttVar43.eW.g(), new cqhu()));
            case 1078:
                ftt fttVar44 = this.a;
                return (T) new bhml(fttVar44.eW.V(), dxjh.c(fttVar44.H()));
            case 1079:
                return (T) this.a.qK();
            case 1080:
                return (T) this.a.qI();
            case 1081:
                ftt fttVar45 = this.a;
                btvo rp6 = fttVar45.eW.a.rp();
                dxjg.e(rp6);
                gga wk8 = fttVar45.wk();
                aehr ee = fttVar45.eW.ee();
                Resources c8 = fttVar45.eW.a.c();
                dxjg.e(c8);
                return (T) new bfsw(new bfth(rp6, wk8, ee, c8, fttVar45.qL(), dxjc.c(fttVar45.az()), dxjc.c(fttVar45.aK())));
            case 1082:
                return (T) new aeio(this.a.eV);
            case 1083:
                ftt fttVar46 = this.a;
                return (T) new beqe(new betp(fttVar46.wk(), fttVar46.jf(), fttVar46.mY(), fttVar46.jd(), fttVar46.qN(), new beqq(dxjc.c(fttVar46.bh())), new beqn(fttVar46.eW.rG(), dxjc.c(fttVar46.eW.p()), dxjc.c(fttVar46.dj()))));
            case 1084:
                return (T) this.a.qM();
            case 1085:
                ftt fttVar47 = this.a;
                return (T) new bfuf(new bfum(fttVar47.a, (bvvw) fttVar47.ao()));
            case 1086:
                ftt fttVar48 = this.a;
                gga wk9 = fttVar48.wk();
                btvo rp7 = fttVar48.eW.a.rp();
                dxjg.e(rp7);
                dxio c9 = dxjc.c(fttVar48.aR());
                bviq bviqVar = new bviq(fttVar48.eW.il(), fttVar48.ad(), fttVar48.eW.kb(), fttVar48.eW.cx(), fttVar48.eW.K(), fttVar48.eS(), fttVar48.eW.al(), fttVar48.eW.hN());
                isd jm2 = fttVar48.jm();
                bbut be2 = fttVar48.be();
                begg wj2 = fttVar48.wj();
                fttVar48.eW.jc();
                dxjc.c(fttVar48.oh());
                dxjc.c(fttVar48.cN());
                bcri qO = fttVar48.qO();
                dxjc.c(fttVar48.aH());
                return (T) new bkho(new bkja(wk9, rp7, c9, bviqVar, jm2, be2, wj2, qO));
            case 1087:
                ftt fttVar49 = this.a;
                Context b = fttVar49.eW.a.b();
                dxjg.e(b);
                return (T) new bnjy(new bnkf(b, new cqhn(), fttVar49.kO(), fttVar49.eW.mA()), fttVar49.kO());
            case 1088:
                ftt fttVar50 = this.a;
                btvo rp8 = fttVar50.eW.a.rp();
                dxjg.e(rp8);
                huc jf2 = fttVar50.jf();
                dxio c10 = dxjc.c(fttVar50.qv());
                dxio c11 = dxjc.c(fttVar50.qw());
                dxio c12 = dxjc.c(fttVar50.az());
                ccri mY = fttVar50.mY();
                bhru mZ = fttVar50.mZ();
                bhsk nc = fttVar50.nc();
                bvpe jd2 = fttVar50.jd();
                bvjj rB2 = fttVar50.eW.a.rB();
                dxjg.e(rB2);
                return (T) new bhna(new bhsh(rp8, jf2, c10, c11, c12, mY, mZ, nc, jd2, rB2, fttVar50.qx(), fttVar50.k()));
            case 1089:
                ftt fttVar51 = this.a;
                vsf g = fttVar51.eW.g();
                btvo rp9 = fttVar51.eW.a.rp();
                dxjg.e(rp9);
                return (T) new bmhn(new bmhq(g, rp9, fttVar51.qP(), fttVar51.jV()));
            case 1090:
                ftt fttVar52 = this.a;
                return (T) new bmhm(new bmhp(fttVar52.a, fttVar52.h(), fttVar52.eW.g(), dxjc.c(fttVar52.H())));
            case 1091:
                ftt fttVar53 = this.a;
                return (T) new bguc(fttVar53.qV(), fttVar53.fp());
            case 1092:
                ftt fttVar54 = this.a;
                gga wk10 = fttVar54.wk();
                bhat fp = fttVar54.fp();
                bgve bgveVar = new bgve(fttVar54.k(), fttVar54.fp(), new bemz());
                bwqv rD6 = fttVar54.eW.a.rD();
                dxjg.e(rD6);
                return (T) new bgvr(wk10, fp, bgveVar, rD6);
            case 1093:
                ftt fttVar55 = this.a;
                rb rbVar4 = fttVar55.a;
                bhdh qS = fttVar55.qS();
                cqhn cqhnVar7 = new cqhn();
                rb rbVar5 = fttVar55.a;
                cqhn cqhnVar8 = new cqhn();
                cqhu cqhuVar = new cqhu();
                bhat fp2 = fttVar55.fp();
                dxio c13 = dxjc.c(fttVar55.cn());
                dxio c14 = dxjc.c(fttVar55.qT());
                dxio c15 = dxjc.c(fttVar55.bf());
                bhdh qS2 = fttVar55.qS();
                dzsj dzsjVar20 = fttVar55.bf;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fns(fttVar55, 1095);
                    fttVar55.bf = dzsjVar20;
                }
                return (T) new bhdo(rbVar4, qS, cqhnVar7, new bhdr(rbVar5, cqhnVar8, cqhuVar, fp2, c13, c14, c15, qS2, dxjc.c(dzsjVar20), dxjc.c(fttVar55.fe()), dxjc.c(fttVar55.ig()), dxjc.c(fttVar55.aH()), dxjc.c(fttVar55.az()), dxjc.c(fttVar55.lZ())));
            case 1094:
                return (T) this.a.qH();
            case 1095:
                return (T) this.a.qU();
            case 1096:
                ftt fttVar56 = this.a;
                gga wk11 = fttVar56.wk();
                jmc B = fttVar56.B();
                dxio c16 = dxjc.c(fttVar56.eW.im());
                bvjj rB3 = fttVar56.eW.a.rB();
                dxjg.e(rB3);
                return (T) new bhdv(wk11, B, c16, rB3, fttVar56.fp());
            case 1097:
                ftt fttVar57 = this.a;
                return (T) new bnkg(new bnkm(fttVar57.wk(), dxjc.c(fttVar57.m())));
            case 1098:
                return (T) new cvy(this.a.qW());
            case 1099:
                ftt fttVar58 = this.a;
                dzsj dzsjVar21 = fttVar58.bg;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fns(fttVar58, 1100);
                    fttVar58.bg = dzsjVar21;
                }
                return (T) new bewh(dzsjVar21);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [bcpk, T] */
    private final T l() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i = this.b;
        switch (i) {
            case 1300:
                T t = (T) ((bdhl) this.a.m21if().b(61));
                dxjg.f(t);
                return t;
            case 1301:
                return (T) this.a.pJ().a(new akgq());
            case 1302:
                return (T) this.a.pq();
            case 1303:
                return (T) this.a.pz();
            case 1304:
                return (T) this.a.pA();
            case 1305:
                return (T) this.a.pB();
            case 1306:
                return (T) this.a.sd();
            case 1307:
                T t2 = (T) ((cjea) this.a.m21if().b(95));
                dxjg.f(t2);
                return t2;
            case 1308:
                T t3 = (T) ((abal) this.a.m21if().b(3));
                dxjg.f(t3);
                return t3;
            case 1309:
                return (T) this.a.kW();
            case 1310:
                return (T) this.a.kY();
            case 1311:
                return (T) this.a.la();
            case 1312:
                return (T) this.a.lb();
            case 1313:
                return (T) this.a.kZ();
            case 1314:
                return (T) this.a.eL();
            case 1315:
                return (T) new bccu();
            case 1316:
                return (T) this.a.qF();
            case 1317:
                return (T) this.a.W();
            case 1318:
                return (T) this.a.ta();
            case 1319:
                return (T) this.a.bE();
            case 1320:
                ftt fttVar = this.a;
                Application a = fttVar.eW.a.a();
                dxjg.e(a);
                bvjj rB = fttVar.eW.a.rB();
                dxjg.e(rB);
                Executor sU = fttVar.eW.a.sU();
                dxjg.e(sU);
                dehq T = fttVar.eW.T();
                fttVar.eW.v();
                return (T) new awcr(a, rB, sU, T, fttVar.eW.eY(), fttVar.um(), fttVar.eW.D(), dxjc.c(fttVar.eW.t()));
            case 1321:
                ftt fttVar2 = this.a;
                rb rbVar = fttVar2.a;
                bvjj rB2 = fttVar2.eW.a.rB();
                dxjg.e(rB2);
                awgb ul = fttVar2.ul();
                dxio c = dxjc.c(fttVar2.eW.p());
                cjqy tr = fttVar2.eW.a.tr();
                dxjg.e(tr);
                cjqq tp = fttVar2.eW.a.tp();
                dxjg.e(tp);
                return (T) new awga(rbVar, rB2, ul, c, tr, tp, fttVar2.eW.v());
            case 1322:
                return (T) this.a.ik();
            case 1323:
                return (T) this.a.fb();
            case 1324:
                ftt fttVar3 = this.a;
                Object obj11 = fttVar3.cT;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj = fttVar3.cT;
                        if (obj instanceof dxjf) {
                            obj = new ayfd();
                            dxjc.d(fttVar3.cT, obj);
                            fttVar3.cT = obj;
                        }
                    }
                    obj11 = obj;
                }
                return (T) ((ayfd) obj11);
            case 1325:
                akfa rK = this.a.eW.a.rK();
                dxjg.e(rK);
                return (T) new aydz(rK, new aydp());
            case 1326:
                return (T) this.a.fd();
            case 1327:
                return (T) this.a.lm();
            case 1328:
                return (T) this.a.ur();
            case 1329:
                ftt fttVar4 = this.a;
                return (T) new ayyu(fttVar4.eW.m(), fttVar4.eW.aw(), dxjh.c(fttVar4.eW.p()), fttVar4.jA(), fttVar4.sG(), fttVar4.sI(), fttVar4.sR(), fttVar4.nu(), fttVar4.eW.k(), fttVar4.az(), fttVar4.fr(), fttVar4.eW.er(), fttVar4.eW.il(), fttVar4.sY());
            case 1330:
                return (T) this.a.bk();
            case 1331:
                ftt fttVar5 = this.a;
                Application a2 = fttVar5.eW.a.a();
                dxjg.e(a2);
                bbpv aZ = fttVar5.eW.aZ();
                bduw lp = fttVar5.eW.lp();
                bvrb tn = fttVar5.eW.a.tn();
                dxjg.e(tn);
                return (T) new bdkl(a2, aZ, lp, new bdrh(tn));
            case 1332:
                return (T) this.a.us();
            case 1333:
                return (T) this.a.fL();
            case 1334:
                ftt fttVar6 = this.a;
                T t4 = (T) fttVar6.kk();
                new itm(new itq(fttVar6.eW.hN()));
                return t4;
            case 1335:
                return (T) this.a.uw();
            case 1336:
                return (T) this.a.gr();
            case 1337:
                return (T) this.a.eJ();
            case 1338:
                ftt fttVar7 = this.a;
                T t5 = (T) fttVar7.cY;
                if (t5 != null) {
                    return t5;
                }
                bwqv rD = fttVar7.eW.a.rD();
                dxjg.e(rD);
                ?? r3 = (T) new bcpk(rD);
                fttVar7.cY = r3;
                return r3;
            case 1339:
                return (T) this.a.gs();
            case 1340:
                return (T) this.a.gq();
            case 1341:
                return (T) this.a.mY();
            case 1342:
                return (T) this.a.ff();
            case 1343:
                return (T) this.a.qt();
            case 1344:
                return (T) this.a.qZ();
            case 1345:
                ftt fttVar8 = this.a;
                return (T) new xdd(dxjc.c(fttVar8.bz()), dxjc.c(fttVar8.bA()), new xcw(fttVar8.a));
            case 1346:
                ftt fttVar9 = this.a;
                dzsj<Application> m = fttVar9.eW.m();
                dzsj<bvjj> aw = fttVar9.eW.aw();
                dzsj c2 = dxjh.c(fttVar9.eW.p());
                dzsj<bnjv> pl = fttVar9.pl();
                dzsj dzsjVar = fttVar9.dh;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar9, 1347);
                    fttVar9.dh = dzsjVar;
                }
                dzsj c3 = dxjh.c(dzsjVar);
                dzsj<aeqg> jA = fttVar9.jA();
                dzsj<brvm> sG = fttVar9.sG();
                dzsj<bmmq> sI = fttVar9.sI();
                dzsj<bfhu> sR = fttVar9.sR();
                dzsj<brwc> sU2 = fttVar9.sU();
                dzsj<bfgx> nu = fttVar9.nu();
                dzsj<bjkq> pW = fttVar9.pW();
                dzsj<bfwu> nx = fttVar9.nx();
                dzsj<ahjq> k = fttVar9.eW.k();
                dzsj<btvo> V = fttVar9.eW.V();
                dzsj c4 = dxjh.c(fttVar9.az());
                dzsj dzsjVar2 = fttVar9.di;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar9, 1348);
                    fttVar9.di = dzsjVar2;
                }
                dzsj c5 = dxjh.c(dzsjVar2);
                dzsj c6 = dxjh.c(fttVar9.eW.at());
                dzsj<bhhf> l = fttVar9.l();
                dzsj<abfa> mq = fttVar9.eW.mq();
                dzsj<bego> lY = fttVar9.eW.lY();
                dzsj<ccri> uC = fttVar9.uC();
                dzsj dzsjVar3 = fttVar9.dj;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar9, 1349);
                    fttVar9.dj = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fttVar9.dk;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar9, 1350);
                    fttVar9.dk = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<bnjf> jv = fttVar9.jv();
                dzsj<bruu> sY = fttVar9.sY();
                dzsj dzsjVar7 = fttVar9.dl;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar9, 1351);
                    fttVar9.dl = dzsjVar7;
                }
                return (T) new brvv(new brwa(m, aw, c2, pl, c3, jA, sG, sI, sR, sU2, nu, pW, nx, k, V, c4, c5, c6, l, mq, lY, uC, dzsjVar4, dzsjVar6, jv, sY, dzsjVar7, dxjh.c(fttVar9.m())));
            case 1347:
                ftt fttVar10 = this.a;
                return (T) new brvu(fttVar10.eW.V(), fttVar10.eW.k(), dxjh.c(fttVar10.eW.mq()), fttVar10.sD(), fttVar10.sB());
            case 1348:
                return (T) this.a.pJ().a(new akgm());
            case 1349:
                return (T) this.a.qN();
            case 1350:
                return (T) this.a.mh();
            case 1351:
                ftt fttVar11 = this.a;
                bvpe jd = fttVar11.jd();
                huc jf = fttVar11.jf();
                bfmn bfmnVar = new bfmn(fttVar11.eW.fr(), fttVar11.aK());
                bfmj qJ = fttVar11.qJ();
                btvo rp = fttVar11.eW.a.rp();
                dxjg.e(rp);
                return (T) new bfmp(jd, jf, bfmnVar, qJ, rp);
            case 1352:
                ftt fttVar12 = this.a;
                Object obj12 = fttVar12.dm;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj2 = fttVar12.dm;
                        if (obj2 instanceof dxjf) {
                            dxio c7 = dxjc.c(fttVar12.as());
                            Resources c8 = fttVar12.eW.a.c();
                            dxjg.e(c8);
                            cjqq tp2 = fttVar12.eW.a.tp();
                            dxjg.e(tp2);
                            obj2 = new iqu(c7, c8, tp2);
                            dxjc.d(fttVar12.dm, obj2);
                            fttVar12.dm = obj2;
                        }
                    }
                    obj12 = obj2;
                }
                return (T) ((iqu) obj12);
            case 1353:
                ftt fttVar13 = this.a;
                bwqv rD2 = fttVar13.eW.a.rD();
                dxjg.e(rD2);
                dzsj dzsjVar8 = fttVar13.du;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fns(fttVar13, 1354);
                    fttVar13.du = dzsjVar8;
                }
                return (T) new behw(rD2, dxjc.c(dzsjVar8));
            case 1354:
                ftt fttVar14 = this.a;
                dxjg.e(fttVar14.eW.a.rp());
                cebr jc = fttVar14.eW.jc();
                dzsj dzsjVar9 = fttVar14.f26do;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fns(fttVar14, 1355);
                    fttVar14.f26do = dzsjVar9;
                }
                dxio c9 = dxjc.c(dzsjVar9);
                bhhf k2 = fttVar14.k();
                dzsj dzsjVar10 = fttVar14.dt;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fns(fttVar14, 1356);
                    fttVar14.dt = dzsjVar10;
                }
                dxio c10 = dxjc.c(dzsjVar10);
                bwqv rD3 = fttVar14.eW.a.rD();
                dxjg.e(rD3);
                return (T) new behp(jc, c9, k2, c10, new behz(rD3), fttVar14.nl(), fttVar14.eW.mF());
            case 1355:
                return (T) new beho(dxjc.c(this.a.rb()));
            case 1356:
                ftt fttVar15 = this.a;
                dzsj dzsjVar11 = fttVar15.ds;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fns(fttVar15, 1357);
                    fttVar15.ds = dzsjVar11;
                }
                return (T) new behl(dxjc.c(dzsjVar11));
            case 1357:
                ftt fttVar16 = this.a;
                btvo rp2 = fttVar16.eW.a.rp();
                dxjg.e(rp2);
                bego lX = fttVar16.eW.lX();
                dxio c11 = dxjc.c(fttVar16.qE());
                dzsj dzsjVar12 = fttVar16.dp;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar16, 1358);
                    fttVar16.dp = dzsjVar12;
                }
                dxio c12 = dxjc.c(dzsjVar12);
                dzsj dzsjVar13 = fttVar16.dq;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fns(fttVar16, 1359);
                    fttVar16.dq = dzsjVar13;
                }
                dxio c13 = dxjc.c(dzsjVar13);
                dzsj dzsjVar14 = fttVar16.dr;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fns(fttVar16, 1360);
                    fttVar16.dr = dzsjVar14;
                }
                return (T) new behk(rp2, lX, c11, c12, c13, dxjc.c(dzsjVar14), dxjc.c(fttVar16.nJ()), dxjc.c(fttVar16.oS()), dxjc.c(fttVar16.mb()));
            case 1358:
                return (T) new bety(new beuc());
            case 1359:
                ftt fttVar17 = this.a;
                return (T) new bmah(new bmai(fttVar17.eW.lX(), fttVar17.uE()));
            case 1360:
                return (T) new bmdd(new bmdj(this.a.uE()));
            case 1361:
                return (T) this.a.mv();
            case 1362:
                return (T) this.a.mL();
            case 1363:
                return (T) this.a.sh();
            case 1364:
                return (T) this.a.sf();
            case 1365:
                T t6 = (T) ((bnam) this.a.m21if().b(Integer.valueOf((int) R.styleable.AppCompatTheme_tooltipForegroundColor)));
                dxjg.f(t6);
                return t6;
            case 1366:
                ftt fttVar18 = this.a;
                Object obj13 = fttVar18.dv;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj3 = fttVar18.dv;
                        if (obj3 instanceof dxjf) {
                            dxjc.c(fttVar18.aT());
                            dxjc.c(fttVar18.as());
                            obj3 = new bfgy();
                            dxjc.d(fttVar18.dv, obj3);
                            fttVar18.dv = obj3;
                        }
                    }
                    obj13 = obj3;
                }
                return (T) ((bfgy) obj13);
            case 1367:
                return (T) this.a.mG();
            case 1368:
                ftt fttVar19 = this.a;
                Object obj14 = fttVar19.dw;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj4 = fttVar19.dw;
                        if (obj4 instanceof dxjf) {
                            rb rbVar2 = fttVar19.a;
                            cqhn cqhnVar = new cqhn();
                            btvo rp3 = fttVar19.eW.a.rp();
                            dxjg.e(rp3);
                            bvjj rB3 = fttVar19.eW.a.rB();
                            dxjg.e(rB3);
                            obj4 = new bhjf(rbVar2, cqhnVar, rp3, rB3, dxjc.c(fttVar19.x()), dxjc.c(fttVar19.az()), dxjc.c(fttVar19.mQ()), dxjc.c(fttVar19.mJ()), fttVar19.k());
                            dxjc.d(fttVar19.dw, obj4);
                            fttVar19.dw = obj4;
                        }
                    }
                    obj14 = obj4;
                }
                return (T) ((bhjf) obj14);
            case 1369:
                ftt fttVar20 = this.a;
                Object obj15 = fttVar20.dx;
                if (obj15 instanceof dxjf) {
                    synchronized (obj15) {
                        obj5 = fttVar20.dx;
                        if (obj5 instanceof dxjf) {
                            rb rbVar3 = fttVar20.a;
                            cqhn cqhnVar2 = new cqhn();
                            dxio c14 = dxjc.c(fttVar20.x());
                            dxio c15 = dxjc.c(fttVar20.az());
                            btvo rp4 = fttVar20.eW.a.rp();
                            dxjg.e(rp4);
                            obj5 = new bkgw(rbVar3, cqhnVar2, c14, c15, rp4);
                            dxjc.d(fttVar20.dx, obj5);
                            fttVar20.dx = obj5;
                        }
                    }
                    obj15 = obj5;
                }
                return (T) ((bkgw) obj15);
            case 1370:
                return (T) this.a.qV();
            case 1371:
                return (T) bqmn.b();
            case 1372:
                return (T) this.a.fQ();
            case 1373:
                return (T) this.a.fR();
            case 1374:
                ftt fttVar21 = this.a;
                Object obj16 = fttVar21.dB;
                if (obj16 instanceof dxjf) {
                    synchronized (obj16) {
                        obj6 = fttVar21.dB;
                        if (obj6 instanceof dxjf) {
                            dxio c16 = dxjc.c(fttVar21.as());
                            Resources c17 = fttVar21.eW.a.c();
                            dxjg.e(c17);
                            obj6 = new bozx(c16, c17, fttVar21.a, fttVar21.bM());
                            dxjc.d(fttVar21.dB, obj6);
                            fttVar21.dB = obj6;
                        }
                    }
                    obj16 = obj6;
                }
                return (T) ((bozs) obj16);
            case 1375:
                return (T) new bpdu();
            case 1376:
                return (T) this.a.bJ();
            case 1377:
                return (T) this.a.fV();
            case 1378:
                ftt fttVar22 = this.a;
                Object obj17 = fttVar22.dD;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj7 = fttVar22.dD;
                        if (obj7 instanceof dxjf) {
                            obj7 = new bqdk(fttVar22.au());
                            dxjc.d(fttVar22.dD, obj7);
                            fttVar22.dD = obj7;
                        }
                    }
                    obj17 = obj7;
                }
                return (T) ((bqdk) obj17);
            case 1379:
                return (T) this.a.aC();
            case 1380:
                ftt fttVar23 = this.a;
                Object obj18 = fttVar23.dF;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj8 = fttVar23.dF;
                        if (obj8 instanceof dxjf) {
                            rb rbVar4 = fttVar23.a;
                            Executor sU3 = fttVar23.eW.a.sU();
                            dxjg.e(sU3);
                            Executor sV = fttVar23.eW.a.sV();
                            dxjg.e(sV);
                            bduw lp2 = fttVar23.eW.lp();
                            dxio c18 = dxjc.c(fttVar23.eW.lr());
                            btvo rp5 = fttVar23.eW.a.rp();
                            dxjg.e(rp5);
                            obj8 = new bqse(rbVar4, sU3, sV, lp2, c18, rp5);
                            dxjc.d(fttVar23.dF, obj8);
                            fttVar23.dF = obj8;
                        }
                    }
                    obj18 = obj8;
                }
                return (T) ((bqse) obj18);
            case 1381:
                return (T) this.a.rS();
            case 1382:
                return (T) this.a.rT();
            case 1383:
                return (T) this.a.rL();
            case 1384:
                return (T) this.a.rK();
            case 1385:
                return (T) this.a.cs();
            case 1386:
                return (T) this.a.rR();
            case 1387:
                return (T) this.a.rU();
            case 1388:
                ftt fttVar24 = this.a;
                Object obj19 = fttVar24.dI;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj9 = fttVar24.dI;
                        if (obj9 instanceof dxjf) {
                            brbk brbkVar = new brbk(dxjc.c(fttVar24.as()));
                            dxjc.d(fttVar24.dI, brbkVar);
                            fttVar24.dI = brbkVar;
                            obj9 = brbkVar;
                        }
                    }
                    obj19 = obj9;
                }
                return (T) ((brbk) obj19);
            case 1389:
                ftt fttVar25 = this.a;
                dxio c19 = dxjc.c(fttVar25.eW.aw());
                bzmh cH = fttVar25.eW.cH();
                bbdv jq = fttVar25.jq();
                brdi rj = fttVar25.eW.rj();
                brcs ln = fttVar25.eW.ln();
                bvjj rB4 = fttVar25.eW.a.rB();
                dxjg.e(rB4);
                gga wk = fttVar25.wk();
                bryc.b();
                brft brftVar = new brft(rj, ln, rB4, wk, fttVar25.eW.cH());
                dxio c20 = dxjc.c(fttVar25.eW.im());
                bvjj rB5 = fttVar25.eW.a.rB();
                dxjg.e(rB5);
                btvo rp6 = fttVar25.eW.a.rp();
                dxjg.e(rp6);
                bbpg bbpgVar = new bbpg(fttVar25.wk(), fttVar25.vc());
                bryc.b();
                return (T) new brxc(c19, cH, jq, brftVar, new bbem(c20, rB5, rp6, bbpgVar), fttVar25.fl());
            case 1390:
                return (T) this.a.lH();
            case 1391:
                return (T) this.a.gj();
            case 1392:
                T t7 = (T) ((afok) this.a.m21if().b(24));
                dxjg.f(t7);
                return t7;
            case 1393:
                return (T) new sin(this.a.wk());
            case 1394:
                return (T) this.a.cK();
            case 1395:
                ftt fttVar26 = this.a;
                Object obj20 = fttVar26.dQ;
                if (obj20 instanceof dxjf) {
                    synchronized (obj20) {
                        obj10 = fttVar26.dQ;
                        if (obj10 instanceof dxjf) {
                            ste steVar = new ste(fttVar26.wk(), dxjc.c(fttVar26.fy()), fttVar26.eW.bU());
                            dxjc.d(fttVar26.dQ, steVar);
                            fttVar26.dQ = steVar;
                            obj10 = steVar;
                        }
                    }
                    obj20 = obj10;
                }
                return (T) ((stc) obj20);
            case 1396:
                ftt fttVar27 = this.a;
                axbv dQ = fttVar27.eW.dQ();
                dbsg i2 = dbsg.i(dxjc.c(fttVar27.rx()));
                dxio c21 = dxjc.c(fttVar27.as());
                dzsj<bxeg> pn = fttVar27.eW.pn();
                dzsj<axbv> kR = fttVar27.eW.kR();
                dzsj on = fttVar27.eW.on();
                dzsj c22 = dxjh.c(fttVar27.as());
                dzsj dzsjVar15 = fttVar27.dS;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fns(fttVar27, 1397);
                    fttVar27.dS = dzsjVar15;
                }
                bxro bxroVar = new bxro(pn, kR, on, c22, dzsjVar15);
                Executor sV2 = fttVar27.eW.a.sV();
                dxjg.e(sV2);
                return (T) new bxri(dQ, i2, c21, bxroVar, sV2, (bxrf) fttVar27.eW.dR());
            case 1397:
                return (T) dbsg.i(dxjc.c(this.a.rx()));
            case 1398:
                return (T) this.a.go();
            case 1399:
                return (T) this.a.sK();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [cxnc, T] */
    private final T g() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        arqy arqyVar;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        buyv buyvVar;
        ayxb ayxbVar;
        cjqy cjqyVar;
        cjqq cjqqVar;
        Object obj16;
        int i = this.b;
        switch (i) {
            case 500:
                ftt fttVar = this.a;
                Object obj17 = fttVar.E;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj = fttVar.E;
                        if (obj instanceof dxjf) {
                            btrm rz = fttVar.eW.a.rz();
                            dxjg.e(rz);
                            obj = new auey(rz);
                            dxjc.d(fttVar.E, obj);
                            fttVar.E = obj;
                        }
                    }
                    obj17 = obj;
                }
                return (T) ((auey) obj17);
            case 501:
                return (T) this.a.cE();
            case 502:
                return (T) this.a.cG();
            case 503:
                ftt fttVar2 = this.a;
                rb rbVar = fttVar2.a;
                efh h = fttVar2.h();
                efc cc = fttVar2.cc();
                btxv ai = fttVar2.eW.ai();
                dehq tf = fttVar2.eW.a.tf();
                dxjg.e(tf);
                cztz m = fttVar2.eW.a.m();
                dxjg.e(m);
                cjqy tr = fttVar2.eW.a.tr();
                dxjg.e(tr);
                btvo rp = fttVar2.eW.a.rp();
                dxjg.e(rp);
                cjxd aA = fttVar2.aA();
                bvjj rB = fttVar2.eW.a.rB();
                dxjg.e(rB);
                bttf aL = fttVar2.eW.a.aL();
                dxjg.e(aL);
                cqhn cqhnVar = new cqhn();
                btyh sJ = fttVar2.eW.a.sJ();
                dxjg.e(sJ);
                axxf ek = fttVar2.eW.ek();
                axxh z = fttVar2.z();
                afwk cK = fttVar2.cK();
                bhhf k = fttVar2.k();
                dxio c = dxjc.c(fttVar2.cu());
                dxio c2 = dxjc.c(fttVar2.q());
                dxio c3 = dxjc.c(fttVar2.aX());
                dxio c4 = dxjc.c(fttVar2.bT());
                dxio c5 = dxjc.c(fttVar2.aT());
                dxio c6 = dxjc.c(fttVar2.J());
                dxio c7 = dxjc.c(fttVar2.cL());
                dxio c8 = dxjc.c(fttVar2.cM());
                dxio c9 = dxjc.c(fttVar2.aR());
                dxio c10 = dxjc.c(fttVar2.cN());
                dxio c11 = dxjc.c(fttVar2.cP());
                dxio c12 = dxjc.c(fttVar2.cQ());
                dxio c13 = dxjc.c(fttVar2.cB());
                dxio c14 = dxjc.c(fttVar2.bd());
                dxio c15 = dxjc.c(fttVar2.cS());
                dxio c16 = dxjc.c(fttVar2.aV());
                dxio c17 = dxjc.c(fttVar2.bh());
                dxio c18 = dxjc.c(fttVar2.x());
                dxio c19 = dxjc.c(fttVar2.cT());
                dxio c20 = dxjc.c(fttVar2.eW.p());
                akdv O = fttVar2.O();
                dxio c21 = dxjc.c(fttVar2.cV());
                dxio c22 = dxjc.c(fttVar2.cW());
                Boolean aM = fttVar2.eW.a.aM();
                dxjg.e(aM);
                return (T) new afwg(rbVar, h, cc, ai, tf, m, tr, rp, aA, rB, aL, cqhnVar, sJ, ek, z, cK, k, c, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, O, c21, c22, aM);
            case 504:
                ftt fttVar3 = this.a;
                Object obj18 = fttVar3.F;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj2 = fttVar3.F;
                        if (obj2 instanceof dxjf) {
                            obj2 = new bnlf(dxjc.c(fttVar3.eW.p()), dxjc.c(fttVar3.m()), fttVar3.eW.js());
                            dxjc.d(fttVar3.F, obj2);
                            fttVar3.F = obj2;
                        }
                    }
                    obj18 = obj2;
                }
                return (T) ((bnlf) obj18);
            case 505:
                T t = (T) ((apsa) this.a.m21if().b(88));
                dxjg.f(t);
                return t;
            case 506:
                return (T) this.a.bt();
            case 507:
                return (T) this.a.cO();
            case 508:
                return (T) this.a.bs();
            case 509:
                return (T) this.a.cR();
            case 510:
                ftt fttVar4 = this.a;
                Object obj19 = fttVar4.G;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj3 = fttVar4.G;
                        if (obj3 instanceof dxjf) {
                            gga wk = fttVar4.wk();
                            bvjj rB2 = fttVar4.eW.a.rB();
                            dxjg.e(rB2);
                            bttf aL2 = fttVar4.eW.a.aL();
                            dxjg.e(aL2);
                            obj3 = new byco(wk, rB2, aL2, dxjc.c(fttVar4.eW.al()), dxjc.c(fttVar4.eW.hN()), dxjc.c(fttVar4.m()));
                            dxjc.d(fttVar4.G, obj3);
                            fttVar4.G = obj3;
                        }
                    }
                    obj19 = obj3;
                }
                return (T) ((byco) obj19);
            case 511:
                return (T) this.a.cU();
            case 512:
                ftt fttVar5 = this.a;
                dxio c23 = dxjc.c(fttVar5.eW.p());
                dzsj dzsjVar = fttVar5.H;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar5, 513);
                    fttVar5.H = dzsjVar;
                }
                return (T) new cjxl(c23, dxjc.c(dzsjVar), dbsg.i(dxjc.c(fttVar5.m())));
            case 513:
                ftt fttVar6 = this.a;
                T t2 = (T) fttVar6.eZ;
                if (t2 != null) {
                    return t2;
                }
                ?? r2 = (T) new cxnc();
                fttVar6.eZ = r2;
                return r2;
            case 514:
                ftt fttVar7 = this.a;
                return (T) new aftw(fttVar7.wl(), fttVar7.cv());
            case 515:
                return (T) this.a.dd();
            case 516:
                return (T) this.a.cX();
            case 517:
                return (T) this.a.cZ();
            case 518:
                return (T) this.a.dm();
            case 519:
                return (T) this.a.dg();
            case 520:
                return (T) this.a.di();
            case 521:
                return (T) this.a.dv();
            case 522:
                ftt fttVar8 = this.a;
                akox ap = fttVar8.ap();
                bvrb tn = fttVar8.eW.a.tn();
                dxjg.e(tn);
                dzsj dzsjVar2 = fttVar8.L;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar8, 523);
                    fttVar8.L = dzsjVar2;
                }
                dxio c24 = dxjc.c(dzsjVar2);
                cqat rR = fttVar8.eW.a.rR();
                dxjg.e(rR);
                return (T) new aifu(ap, tn, c24, rR);
            case 523:
                return (T) this.a.bK();
            case 524:
                return (T) this.a.dn();
            case 525:
                return (T) this.a.dx();
            case 526:
                return (T) this.a.dw();
            case 527:
                return (T) this.a.dy();
            case 528:
                return (T) this.a.dB();
            case 529:
                ftt fttVar9 = this.a;
                cqat rR2 = fttVar9.eW.a.rR();
                dxjg.e(rR2);
                pfc hg = fttVar9.eW.hg();
                btvo rp2 = fttVar9.eW.a.rp();
                dxjg.e(rp2);
                dxio c25 = dxjc.c(fttVar9.eW.hl());
                dxio c26 = dxjc.c(fttVar9.dz());
                dxio c27 = dxjc.c(fttVar9.av());
                dzsj<gga> ad = fttVar9.ad();
                dzsj<btvo> V = fttVar9.eW.V();
                dzsj dzsjVar3 = fttVar9.M;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar9, 531);
                    fttVar9.M = dzsjVar3;
                }
                return (T) new anbx(rR2, hg, rp2, c25, c26, c27, new anbo(ad, V, dxjh.c(dzsjVar3), dxjh.c(fttVar9.bA()), dxjh.c(fttVar9.bz()), dxjh.c(fttVar9.av())));
            case 530:
                return (T) this.a.bC();
            case 531:
                return (T) this.a.dA();
            case 532:
                return (T) this.a.dP();
            case 533:
                return (T) this.a.dC();
            case 534:
                return (T) this.a.dD();
            case 535:
                return (T) this.a.dH();
            case 536:
                return (T) new aouc();
            case 537:
                return (T) this.a.Fa();
            case 538:
                return (T) this.a.bM();
            case 539:
                return (T) this.a.dG();
            case 540:
                ftt fttVar10 = this.a;
                Object obj20 = fttVar10.N;
                if (obj20 instanceof dxjf) {
                    synchronized (obj20) {
                        obj4 = fttVar10.N;
                        if (obj4 instanceof dxjf) {
                            obj4 = new aohx(fttVar10.wk(), dxjc.c(fttVar10.eW.jI()));
                            dxjc.d(fttVar10.N, obj4);
                            fttVar10.N = obj4;
                        }
                    }
                    obj20 = obj4;
                }
                return (T) ((aohx) obj20);
            case 541:
                return (T) this.a.dK();
            case 542:
                return (T) this.a.n();
            case 543:
                return (T) this.a.dJ();
            case 544:
                return (T) this.a.EG();
            case 545:
                return (T) new fhe();
            case 546:
                ftt fttVar11 = this.a;
                Object obj21 = fttVar11.P;
                if (obj21 instanceof dxjf) {
                    synchronized (obj21) {
                        obj5 = fttVar11.P;
                        if (obj5 instanceof dxjf) {
                            bvju A = fttVar11.eW.a.A();
                            dxjg.e(A);
                            Object obj22 = fttVar11.O;
                            if (obj22 instanceof dxjf) {
                                synchronized (obj22) {
                                    obj6 = fttVar11.O;
                                    if (obj6 instanceof dxjf) {
                                        Context b = fttVar11.eW.a.b();
                                        dxjg.e(b);
                                        bdux bduxVar = new bdux(b);
                                        dxjc.d(fttVar11.O, bduxVar);
                                        fttVar11.O = bduxVar;
                                        obj6 = bduxVar;
                                    }
                                }
                                obj22 = obj6;
                            }
                            aokw aokwVar = new aokw(A, (bdux) obj22);
                            dxjc.d(fttVar11.P, aokwVar);
                            fttVar11.P = aokwVar;
                            obj5 = aokwVar;
                        }
                    }
                    obj21 = obj5;
                }
                return (T) ((aokw) obj21);
            case 547:
                return (T) this.a.dN();
            case 548:
                ftt fttVar12 = this.a;
                T t3 = (T) fttVar12.Q;
                if (!(t3 instanceof dxjf)) {
                    return t3;
                }
                synchronized (t3) {
                    Object obj23 = fttVar12.Q;
                    boolean z2 = obj23 instanceof dxjf;
                    arqyVar = obj23;
                    if (z2) {
                        gga wk2 = fttVar12.wk();
                        cqat rR3 = fttVar12.eW.a.rR();
                        dxjg.e(rR3);
                        bvjj rB3 = fttVar12.eW.a.rB();
                        dxjg.e(rB3);
                        arqy arqyVar2 = new arqy(wk2, rR3, rB3, dxjc.c(fttVar12.m()), fttVar12.dQ());
                        dxjc.d(fttVar12.Q, arqyVar2);
                        fttVar12.Q = arqyVar2;
                        arqyVar = arqyVar2;
                    }
                }
                return arqyVar;
            case 549:
                return (T) this.a.dR();
            case 550:
                ftt fttVar13 = this.a;
                T t4 = (T) fttVar13.S;
                if (!(t4 instanceof dxjf)) {
                    return t4;
                }
                synchronized (t4) {
                    obj7 = fttVar13.S;
                    if (obj7 instanceof dxjf) {
                        gga wk3 = fttVar13.wk();
                        bvkx o = fttVar13.eW.a.o();
                        dxjg.e(o);
                        Object iM = fttVar13.eW.iM();
                        dzsj dzsjVar4 = fttVar13.R;
                        if (dzsjVar4 == null) {
                            dzsjVar4 = new fns(fttVar13, 551);
                            fttVar13.R = dzsjVar4;
                        }
                        dxio c28 = dxjc.c(dzsjVar4);
                        dxio c29 = dxjc.c(fttVar13.az());
                        dxio c30 = dxjc.c(fttVar13.eW.p());
                        dehq tg = fttVar13.eW.a.tg();
                        dxjg.e(tg);
                        dehq tf2 = fttVar13.eW.a.tf();
                        dxjg.e(tf2);
                        bvjj rB4 = fttVar13.eW.a.rB();
                        dxjg.e(rB4);
                        apyv hZ = fttVar13.eW.hZ();
                        bvrb tn2 = fttVar13.eW.a.tn();
                        dxjg.e(tn2);
                        apru apruVar = new apru(wk3, o, (apro) iM, c28, c29, c30, tg, tf2, rB4, hZ, tn2, fttVar13.eW.cu());
                        dxjc.d(fttVar13.S, apruVar);
                        fttVar13.S = apruVar;
                        obj7 = apruVar;
                    }
                }
                return (T) obj7;
            case 551:
                return (T) this.a.X();
            case 552:
                ftt fttVar14 = this.a;
                Object obj24 = fttVar14.T;
                if (obj24 instanceof dxjf) {
                    synchronized (obj24) {
                        obj8 = fttVar14.T;
                        if (obj8 instanceof dxjf) {
                            Context b2 = fttVar14.eW.a.b();
                            dxjg.e(b2);
                            dxio c31 = dxjc.c(fttVar14.ai());
                            ckcw rU = fttVar14.eW.a.rU();
                            dxjg.e(rU);
                            apty aptyVar = new apty(b2, c31, rU);
                            dxjc.d(fttVar14.T, aptyVar);
                            fttVar14.T = aptyVar;
                            obj8 = aptyVar;
                        }
                    }
                    obj24 = obj8;
                }
                return (T) ((apty) obj24);
            case 553:
                ftt fttVar15 = this.a;
                dxjg.e(fttVar15.eW.a.b());
                dxjc.c(fttVar15.ai());
                return (T) new apts();
            case 554:
                return (T) this.a.dS();
            case 555:
                return (T) this.a.dT();
            case 556:
                return (T) this.a.dU();
            case 557:
                return (T) this.a.dV();
            case 558:
                return (T) this.a.dW();
            case 559:
                return (T) this.a.ex();
            case 560:
                return (T) this.a.ea();
            case 561:
                T t5 = (T) ((awnv) this.a.m21if().b(49));
                dxjg.f(t5);
                return t5;
            case 562:
                return (T) this.a.ee();
            case 563:
                return (T) this.a.ev();
            case 564:
                return (T) this.a.ei();
            case 565:
                return (T) this.a.eh();
            case 566:
                return (T) this.a.ej();
            case 567:
                return (T) this.a.eq();
            case 568:
                return (T) this.a.eu();
            case 569:
                return (T) this.a.ek();
            case 570:
                return (T) this.a.el();
            case 571:
                ftt fttVar16 = this.a;
                Object obj25 = fttVar16.U;
                if (obj25 instanceof dxjf) {
                    synchronized (obj25) {
                        obj9 = fttVar16.U;
                        if (obj9 instanceof dxjf) {
                            obj9 = arjl.a(dbsg.i(fttVar16.eW.jM()), dbsg.i(fttVar16.en()));
                            dxjc.d(fttVar16.U, obj9);
                            fttVar16.U = obj9;
                        }
                    }
                    obj25 = obj9;
                }
                return (T) ((dbsg) obj25);
            case 572:
                return (T) dbsg.i(this.a.eW.jN());
            case 573:
                return (T) this.a.es();
            case 574:
                return (T) this.a.eB();
            case 575:
                ftt fttVar17 = this.a;
                Object obj26 = fttVar17.V;
                if (obj26 instanceof dxjf) {
                    synchronized (obj26) {
                        obj10 = fttVar17.V;
                        if (obj10 instanceof dxjf) {
                            gga wk4 = fttVar17.wk();
                            btrm rz2 = fttVar17.eW.a.rz();
                            dxjg.e(rz2);
                            cjqy tr2 = fttVar17.eW.a.tr();
                            dxjg.e(tr2);
                            Executor sV = fttVar17.eW.a.sV();
                            dxjg.e(sV);
                            obj10 = new ckmh(wk4, rz2, tr2, sV);
                            dxjc.d(fttVar17.V, obj10);
                            fttVar17.V = obj10;
                        }
                    }
                    obj26 = obj10;
                }
                return (T) ((ckmh) obj26);
            case 576:
                return (T) this.a.wn();
            case 577:
                ftt fttVar18 = this.a;
                T t6 = (T) fttVar18.W;
                if (!(t6 instanceof dxjf)) {
                    return t6;
                }
                synchronized (t6) {
                    obj11 = fttVar18.W;
                    if (obj11 instanceof dxjf) {
                        Application a = fttVar18.eW.a.a();
                        dxjg.e(a);
                        rb rbVar2 = fttVar18.a;
                        bvrb tn3 = fttVar18.eW.a.tn();
                        dxjg.e(tn3);
                        auem auemVar = new auem(a, rbVar2, tn3, new akoz(fttVar18.as()));
                        dxjc.d(fttVar18.W, auemVar);
                        fttVar18.W = auemVar;
                        obj11 = auemVar;
                    }
                }
                return (T) obj11;
            case 578:
                return (T) this.a.eE();
            case 579:
                return (T) this.a.eI();
            case 580:
                return (T) this.a.eF();
            case 581:
                return (T) this.a.we();
            case 582:
                return (T) this.a.eG();
            case 583:
                return (T) this.a.eH();
            case 584:
                return (T) this.a.eM();
            case 585:
                ftt fttVar19 = this.a;
                btvo rp3 = fttVar19.eW.a.rp();
                dxjg.e(rp3);
                gga wk5 = fttVar19.wk();
                dxio c32 = dxjc.c(fttVar19.m());
                dzsj dzsjVar5 = fttVar19.X;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar19, 586);
                    fttVar19.X = dzsjVar5;
                }
                return (T) new awpr(rp3, wk5, c32, dxjc.c(dzsjVar5));
            case 586:
                ftt fttVar20 = this.a;
                btvo rp4 = fttVar20.eW.a.rp();
                dxjg.e(rp4);
                bvjj rB5 = fttVar20.eW.a.rB();
                dxjg.e(rB5);
                return (T) new awpl(rp4, rB5, dxjc.c(fttVar20.eW.k()));
            case 587:
                ftt fttVar21 = this.a;
                Object obj27 = fttVar21.ae;
                if (obj27 instanceof dxjf) {
                    synchronized (obj27) {
                        obj12 = fttVar21.ae;
                        if (obj12 instanceof dxjf) {
                            dzsj dzsjVar6 = fttVar21.Z;
                            if (dzsjVar6 == null) {
                                dzsjVar6 = new fns(fttVar21, 588);
                                fttVar21.Z = dzsjVar6;
                            }
                            dxjc.c(dzsjVar6);
                            dxio c33 = dxjc.c(fttVar21.eW.kR());
                            dxio c34 = dxjc.c(fttVar21.eW.hT());
                            dzsj dzsjVar7 = fttVar21.aa;
                            if (dzsjVar7 == null) {
                                dzsjVar7 = new fns(fttVar21, 589);
                                fttVar21.aa = dzsjVar7;
                            }
                            dxio c35 = dxjc.c(dzsjVar7);
                            dzsj dzsjVar8 = fttVar21.ab;
                            if (dzsjVar8 == null) {
                                dzsjVar8 = new fns(fttVar21, 592);
                                fttVar21.ab = dzsjVar8;
                            }
                            dxio c36 = dxjc.c(dzsjVar8);
                            dzsj dzsjVar9 = fttVar21.ac;
                            if (dzsjVar9 == null) {
                                dzsjVar9 = new fns(fttVar21, 593);
                                fttVar21.ac = dzsjVar9;
                            }
                            dxio c37 = dxjc.c(dzsjVar9);
                            dzsj dzsjVar10 = fttVar21.ad;
                            if (dzsjVar10 == null) {
                                dzsjVar10 = new fns(fttVar21, 594);
                                fttVar21.ad = dzsjVar10;
                            }
                            dxio c38 = dxjc.c(dzsjVar10);
                            dehq tg2 = fttVar21.eW.a.tg();
                            dxjg.e(tg2);
                            obj12 = new awvi(c33, c34, c35, c36, c37, c38, tg2);
                            dxjc.d(fttVar21.ae, obj12);
                            fttVar21.ae = obj12;
                        }
                    }
                    obj27 = obj12;
                }
                return (T) ((awvi) obj27);
            case 588:
                ftt fttVar22 = this.a;
                T t7 = (T) fttVar22.Y;
                if (!(t7 instanceof dxjf)) {
                    return t7;
                }
                synchronized (t7) {
                    obj13 = fttVar22.Y;
                    if (obj13 instanceof dxjf) {
                        cqat rR4 = fttVar22.eW.a.rR();
                        dxjg.e(rR4);
                        fttVar22.eW.rw();
                        fttVar22.eW.fs();
                        dxjg.e(fttVar22.eW.a.rz());
                        fttVar22.eN();
                        awvm awvmVar = new awvm(rR4, fttVar22.eW.dP());
                        dxjc.d(fttVar22.Y, awvmVar);
                        fttVar22.Y = awvmVar;
                        obj13 = awvmVar;
                    }
                }
                return (T) obj13;
            case 589:
                ftt fttVar23 = this.a;
                Application a2 = fttVar23.eW.a.a();
                dxjg.e(a2);
                efh h2 = fttVar23.h();
                akpe dY = fttVar23.dY();
                dxio c39 = dxjc.c(fttVar23.eW.fp());
                dxio c40 = dxjc.c(fttVar23.as());
                dxio c41 = dxjc.c(fttVar23.eW.k());
                dehq tg3 = fttVar23.eW.a.tg();
                dxjg.e(tg3);
                return (T) new awux(a2, h2, dY, c39, c40, c41, tg3, dxjc.c(fttVar23.eO()), dxjc.c(fttVar23.eQ()));
            case 590:
                return (T) this.a.F();
            case 591:
                return (T) this.a.eP();
            case 592:
                ftt fttVar24 = this.a;
                dxio c42 = dxjc.c(fttVar24.eW.dN());
                ahth cd = fttVar24.eW.cd();
                btrm rz3 = fttVar24.eW.a.rz();
                dxjg.e(rz3);
                return (T) new awva(c42, cd, rz3, fttVar24.F());
            case 593:
                return (T) this.a.eN();
            case 594:
                return (T) this.a.eR();
            case 595:
                ftt fttVar25 = this.a;
                Object obj28 = fttVar25.af;
                if (obj28 instanceof dxjf) {
                    synchronized (obj28) {
                        obj14 = fttVar25.af;
                        if (obj14 instanceof dxjf) {
                            dzsj<gga> ad2 = fttVar25.ad();
                            btvo rp5 = fttVar25.eW.a.rp();
                            dxjg.e(rp5);
                            axib kX = fttVar25.eW.kX();
                            akfa rK = fttVar25.eW.a.rK();
                            dxjg.e(rK);
                            bvjj rB6 = fttVar25.eW.a.rB();
                            dxjg.e(rB6);
                            aufl cu = fttVar25.eW.cu();
                            axqf axqfVar = new axqf(fttVar25.eW.il(), fttVar25.eW.I(), fttVar25.eW.di(), fttVar25.eW.p(), fttVar25.eW.kV(), fttVar25.cP(), fttVar25.P(), fttVar25.eW.bk(), fttVar25.eS());
                            Executor sU = fttVar25.eW.a.sU();
                            dxjg.e(sU);
                            bvrb tn4 = fttVar25.eW.a.tn();
                            dxjg.e(tn4);
                            axjd axjdVar = new axjd(ad2, rp5, kX, rK, rB6, cu, axqfVar, sU, tn4);
                            dxjc.d(fttVar25.af, axjdVar);
                            fttVar25.af = axjdVar;
                            obj14 = axjdVar;
                        }
                    }
                    obj28 = obj14;
                }
                return (T) ((axjd) obj28);
            case 596:
                return (T) new cqhu();
            case 597:
                ftt fttVar26 = this.a;
                Object obj29 = fttVar26.ah;
                if (obj29 instanceof dxjf) {
                    synchronized (obj29) {
                        obj15 = fttVar26.ah;
                        if (obj15 instanceof dxjf) {
                            gga wk6 = fttVar26.wk();
                            axwq qn = fttVar26.eW.qn();
                            axxb qZ = fttVar26.eW.qZ();
                            bwqv rD = fttVar26.eW.a.rD();
                            dxjg.e(rD);
                            btrm rz4 = fttVar26.eW.a.rz();
                            dxjg.e(rz4);
                            cqat rR5 = fttVar26.eW.a.rR();
                            dxjg.e(rR5);
                            ania qq = fttVar26.eW.qq();
                            bvrb tn5 = fttVar26.eW.a.tn();
                            dxjg.e(tn5);
                            cjqy tr3 = fttVar26.eW.a.tr();
                            dxjg.e(tr3);
                            cjqq tp = fttVar26.eW.a.tp();
                            dxjg.e(tp);
                            bzpr bk = fttVar26.bk();
                            dxio c43 = dxjc.c(fttVar26.eW.p());
                            dxio c44 = dxjc.c(fttVar26.P());
                            dxio c45 = dxjc.c(fttVar26.az());
                            dxio c46 = dxjc.c(fttVar26.bm());
                            buyv buyvVar2 = fttVar26.fa;
                            if (buyvVar2 == null) {
                                buyv buyvVar3 = new buyv((buyu) fttVar26.eW.eW());
                                fttVar26.fa = buyvVar3;
                                buyvVar = buyvVar3;
                            } else {
                                buyvVar = buyvVar2;
                            }
                            dxio c47 = dxjc.c(fttVar26.cz());
                            gga wk7 = fttVar26.wk();
                            gfq wd = fttVar26.wd();
                            cqkj wl = fttVar26.wl();
                            bvrb tn6 = fttVar26.eW.a.tn();
                            dxjg.e(tn6);
                            ayxb ayxbVar2 = new ayxb(wk7, wd, wl, tn6, dxjc.c(fttVar26.eW.im()), new ayxl(fttVar26.bh()));
                            dxio c48 = dxjc.c(fttVar26.eW.ax());
                            bvjj rB7 = fttVar26.eW.a.rB();
                            dxjg.e(rB7);
                            dxio c49 = dxjc.c(fttVar26.eW.C());
                            dxio c50 = dxjc.c(fttVar26.eW.dT());
                            dxio c51 = dxjc.c(fttVar26.eU());
                            dxio c52 = dxjc.c(fttVar26.eW.el());
                            dxio c53 = dxjc.c(fttVar26.eW());
                            Executor sU2 = fttVar26.eW.a.sU();
                            dxjg.e(sU2);
                            btvo rp6 = fttVar26.eW.a.rp();
                            dxjg.e(rp6);
                            bath eX = fttVar26.eX();
                            batg eY = fttVar26.eY();
                            batd fb = fttVar26.fb();
                            Object obj30 = fttVar26.ag;
                            if (obj30 instanceof dxjf) {
                                synchronized (obj30) {
                                    obj16 = fttVar26.ag;
                                    if (obj16 instanceof dxjf) {
                                        fttVar26.eW.bW();
                                        gga wk8 = fttVar26.wk();
                                        ayxbVar = ayxbVar2;
                                        bath eX2 = fttVar26.eX();
                                        cjqqVar = tp;
                                        batg eY2 = fttVar26.eY();
                                        cjqyVar = tr3;
                                        dxjg.e(fttVar26.eW.a.rD());
                                        obj16 = new azrt(wk8, eX2, eY2);
                                        dxjc.d(fttVar26.ag, obj16);
                                        fttVar26.ag = obj16;
                                    } else {
                                        ayxbVar = ayxbVar2;
                                        cjqyVar = tr3;
                                        cjqqVar = tp;
                                    }
                                }
                                obj30 = obj16;
                            } else {
                                ayxbVar = ayxbVar2;
                                cjqyVar = tr3;
                                cjqqVar = tp;
                            }
                            axtp axtpVar = new axtp(wk6, qn, qZ, rD, rz4, rR5, qq, tn5, cjqyVar, cjqqVar, bk, c43, c44, c45, c46, buyvVar, c47, ayxbVar, c48, rB7, c49, c50, c51, c52, c53, sU2, rp6, eX, eY, fb, (azrt) obj30, fttVar26.di(), fttVar26.eW.bI(), fttVar26.eW.bW(), fttVar26.eW.fm(), fttVar26.fc());
                            dxjc.d(fttVar26.ah, axtpVar);
                            fttVar26.ah = axtpVar;
                            obj15 = axtpVar;
                        }
                    }
                    obj29 = obj15;
                }
                return (T) ((axtp) obj29);
            case 598:
                return (T) this.a.eT();
            case 599:
                return (T) this.a.eV();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v59, types: [T, burf] */
    /* JADX WARN: Type inference failed for: r3v76, types: [T, butr] */
    private final T f() {
        Object obj;
        Object obj2;
        Object obj3;
        hvw hvwVar;
        Executor executor;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i = this.b;
        switch (i) {
            case 400:
                return (T) this.a.al();
            case 401:
                return (T) this.a.wk();
            case 402:
                ftt fttVar = this.a;
                dzsj<cxnh> ae = fttVar.ae();
                dzsj<gga> ad = fttVar.ad();
                dzsj dzsjVar = fttVar.n;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar, 404);
                    fttVar.n = dzsjVar;
                }
                return (T) new bvus(ae, ad, dzsjVar, dxjh.c(fttVar.m()));
            case 403:
                ftt fttVar2 = this.a;
                Object obj12 = fttVar2.m;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj = fttVar2.m;
                        if (obj instanceof dxjf) {
                            btvo rp = fttVar2.eW.a.rp();
                            dxjg.e(rp);
                            obj = bvuk.a(rp);
                            dxjc.d(fttVar2.m, obj);
                            fttVar2.m = obj;
                        }
                    }
                    obj12 = obj;
                }
                return (T) ((cxnh) obj12);
            case 404:
                ftt fttVar3 = this.a;
                return (T) new bwbz(new bwca(dxjc.c(fttVar3.H()), fttVar3.wk()));
            case 405:
                ftt fttVar4 = this.a;
                ckmm r = fttVar4.eW.a.r();
                dxjg.e(r);
                ckov t = fttVar4.eW.a.t();
                dxjg.e(t);
                ckox u = fttVar4.eW.a.u();
                dxjg.e(u);
                return (T) new bwde(r, t, u);
            case 406:
                return (T) this.a.ag();
            case 407:
                return (T) new bvuy();
            case 408:
                return (T) this.a.ah();
            case 409:
                return (T) new bwbk(this.a.wk());
            case 410:
                return (T) new bwbv(this.a.a);
            case 411:
                ftt fttVar5 = this.a;
                return (T) new bwby(fttVar5.wk(), dxjc.c(fttVar5.ai()));
            case 412:
                return (T) new bwbo(this.a.wk());
            case 413:
                return (T) new bwbr(this.a.wk());
            case 414:
                return (T) new bwbt(this.a.wk());
            case 415:
                return (T) this.a.aj();
            case 416:
                return (T) new ftb(this.a);
            case 417:
                return (T) btbq.b();
            case 418:
                return (T) this.a.an();
            case 419:
                ftt fttVar6 = this.a;
                T t2 = (T) new aqfy();
                dzsj dzsjVar2 = fttVar6.r;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar6, 420);
                    fttVar6.r = dzsjVar2;
                }
                dxjc.c(dzsjVar2);
                fttVar6.eW.hY();
                return t2;
            case 420:
                ftt fttVar7 = this.a;
                Object obj13 = fttVar7.q;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj2 = fttVar7.q;
                        if (obj2 instanceof dxjf) {
                            fttVar7.eW.iE();
                            fttVar7.wk();
                            dxjg.e(fttVar7.eW.a.sU());
                            dxjc.c(fttVar7.eW.p());
                            dxjc.c(fttVar7.eW.is());
                            dxjc.c(fttVar7.S());
                            fttVar7.Y();
                            fttVar7.eW.co();
                            obj2 = new apxf();
                            dxjc.d(fttVar7.q, obj2);
                            fttVar7.q = obj2;
                        }
                    }
                    obj13 = obj2;
                }
                return (T) ((apxf) obj13);
            case 421:
                return (T) this.a.ar();
            case 422:
                ftt fttVar8 = this.a;
                T t3 = (T) fttVar8.s;
                if (!(t3 instanceof dxjf)) {
                    return t3;
                }
                synchronized (t3) {
                    obj3 = fttVar8.s;
                    if (obj3 instanceof dxjf) {
                        Application a = fttVar8.eW.a.a();
                        dxjg.e(a);
                        bvjj rB = fttVar8.eW.a.rB();
                        dxjg.e(rB);
                        ckcw rU = fttVar8.eW.a.rU();
                        dxjg.e(rU);
                        akfa rK = fttVar8.eW.a.rK();
                        dxjg.e(rK);
                        dyy dyyVar = new dyy(a, rB, rU, rK);
                        dxjc.d(fttVar8.s, dyyVar);
                        fttVar8.s = dyyVar;
                        obj3 = dyyVar;
                    }
                }
                return (T) obj3;
            case 423:
                ftt fttVar9 = this.a;
                Object obj14 = fttVar9.u;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        Object obj15 = fttVar9.u;
                        boolean z = obj15 instanceof dxjf;
                        hvwVar = obj15;
                        if (z) {
                            dzsj<rb> dzsjVar3 = fttVar9.eV;
                            dxio c = dxjc.c(fttVar9.as());
                            hvr hvrVar = new hvr(dxjc.c(fttVar9.eW.n()), dxjc.c(fttVar9.eW.iR()));
                            Executor sV = fttVar9.eW.a.sV();
                            dxjg.e(sV);
                            Object obj16 = fttVar9.t;
                            if (obj16 instanceof dxjf) {
                                synchronized (obj16) {
                                    obj4 = fttVar9.t;
                                    if (obj4 instanceof dxjf) {
                                        anat at = fttVar9.at();
                                        dxio c2 = dxjc.c(fttVar9.as());
                                        btrm rz = fttVar9.eW.a.rz();
                                        dxjg.e(rz);
                                        dxio c3 = dxjc.c(fttVar9.as());
                                        dxio c4 = dxjc.c(fttVar9.av());
                                        btrm rz2 = fttVar9.eW.a.rz();
                                        dxjg.e(rz2);
                                        ckcw rU2 = fttVar9.eW.a.rU();
                                        dxjg.e(rU2);
                                        Executor sU = fttVar9.eW.a.sU();
                                        dxjg.e(sU);
                                        dbty<Boolean> iS = fttVar9.eW.iS();
                                        akwu rV = fttVar9.eW.rV();
                                        anat at2 = fttVar9.at();
                                        fyu fyuVar = fttVar9.eW;
                                        dzsj dzsjVar4 = fyuVar.bU;
                                        if (dzsjVar4 == null) {
                                            executor = sV;
                                            dzsjVar4 = new fxy(fyuVar, 442);
                                            fyuVar.bU = dzsjVar4;
                                        } else {
                                            executor = sV;
                                        }
                                        obj4 = new anbb(at, c2, rz, new akxz(c3, c4, rz2, rU2, sU, iS, rV, at2, dzsjVar4));
                                        dxjc.d(fttVar9.t, obj4);
                                        fttVar9.t = obj4;
                                    } else {
                                        executor = sV;
                                    }
                                }
                                obj16 = obj4;
                            } else {
                                executor = sV;
                            }
                            fttVar9.aw();
                            btvo rp2 = fttVar9.eW.a.rp();
                            dxjg.e(rp2);
                            btrm rz3 = fttVar9.eW.a.rz();
                            dxjg.e(rz3);
                            btrm rz4 = fttVar9.eW.a.rz();
                            dxjg.e(rz4);
                            hwq hwqVar = new hwq(rz4, fttVar9.ap());
                            dxio c5 = dxjc.c(fttVar9.eW.ed());
                            dxio c6 = dxjc.c(fttVar9.eW.iT());
                            dxio c7 = dxjc.c(fttVar9.eW.ie());
                            dxio c8 = dxjc.c(fttVar9.eW.iU());
                            dxjc.c(fttVar9.eW.iV());
                            Executor sU2 = fttVar9.eW.a.sU();
                            dxjg.e(sU2);
                            hvw hvwVar2 = new hvw(dzsjVar3, c, hvrVar, executor, (anay) obj16, rp2, rz3, hwqVar, c5, c6, c7, c8, sU2);
                            crzb sO = fttVar9.eW.a.sO();
                            dxjg.e(sO);
                            hvwVar2.d = sO;
                            crzb sP = fttVar9.eW.a.sP();
                            dxjg.e(sP);
                            hvwVar2.e = sP;
                            crzb sQ = fttVar9.eW.a.sQ();
                            dxjg.e(sQ);
                            hvwVar2.f = sQ;
                            crzb sR = fttVar9.eW.a.sR();
                            dxjg.e(sR);
                            hvwVar2.g = sR;
                            crzb sS = fttVar9.eW.a.sS();
                            dxjg.e(sS);
                            hvwVar2.h = sS;
                            crzb sT = fttVar9.eW.a.sT();
                            dxjg.e(sT);
                            hvwVar2.i = sT;
                            hvwVar2.j = fttVar9.eW.iS();
                            dxjc.d(fttVar9.u, hvwVar2);
                            fttVar9.u = hvwVar2;
                            hvwVar = hvwVar2;
                        }
                    }
                    obj14 = hvwVar;
                }
                return (T) ((hvw) obj14);
            case 424:
                return (T) this.a.ap();
            case 425:
                return (T) this.a.au();
            case 426:
                return (T) this.a.ax();
            case 427:
                return (T) this.a.bq();
            case 428:
                return (T) this.a.bp();
            case 429:
                T t4 = (T) ((nut) this.a.m21if().b(6));
                dxjg.f(t4);
                return t4;
            case 430:
                return (T) this.a.wj();
            case 431:
                return (T) this.a.aI();
            case 432:
                ftt fttVar10 = this.a;
                Application a2 = fttVar10.eW.a.a();
                dxjg.e(a2);
                btrm rz5 = fttVar10.eW.a.rz();
                dxjg.e(rz5);
                chht aB = fttVar10.aB();
                dxio c9 = dxjc.c(fttVar10.eW.h());
                bvrb tn = fttVar10.eW.a.tn();
                dxjg.e(tn);
                bvbc b = bvbe.b(c9, tn);
                dxio c10 = dxjc.c(fttVar10.eW.h());
                bvrb tn2 = fttVar10.eW.a.tn();
                dxjg.e(tn2);
                bumi b2 = bumk.b(c10, tn2);
                dxio c11 = dxjc.c(fttVar10.eW.fd());
                dxio c12 = dxjc.c(fttVar10.eW.p());
                bzux bi = fttVar10.eW.bi();
                bqkt aC = fttVar10.aC();
                dxjg.e(fttVar10.eW.a.rB());
                dzsj dzsjVar5 = fttVar10.v;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar10, 435);
                    fttVar10.v = dzsjVar5;
                }
                dxjc.c(dzsjVar5);
                beyi aF = fttVar10.aF();
                fttVar10.eW.jc();
                return (T) new bqmf(a2, rz5, aB, b, b2, c11, c12, bi, aC, aF);
            case 433:
                return (T) this.a.EE();
            case 434:
                return (T) this.a.EF();
            case 435:
                return (T) this.a.aD();
            case 436:
                ftt fttVar11 = this.a;
                Object obj17 = fttVar11.x;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj5 = fttVar11.x;
                        if (obj5 instanceof dxjf) {
                            gga wk = fttVar11.wk();
                            bwqv rD = fttVar11.eW.a.rD();
                            dxjg.e(rD);
                            dxio c13 = dxjc.c(fttVar11.az());
                            dzsj<Executor> di = fttVar11.eW.di();
                            dzsj dzsjVar6 = fttVar11.w;
                            if (dzsjVar6 == null) {
                                dzsjVar6 = new fns(fttVar11, 437);
                                fttVar11.w = dzsjVar6;
                            }
                            blka blkaVar = new blka(di, dzsjVar6);
                            dxio c14 = dxjc.c(fttVar11.m());
                            dxio c15 = dxjc.c(fttVar11.P());
                            bvvw bvvwVar = (bvvw) fttVar11.ao();
                            btvo rp3 = fttVar11.eW.a.rp();
                            dxjg.e(rp3);
                            obj5 = new bkow(wk, rD, c13, blkaVar, c14, c15, bvvwVar, rp3);
                            dxjc.d(fttVar11.x, obj5);
                            fttVar11.x = obj5;
                        }
                    }
                    obj17 = obj5;
                }
                return (T) ((bkpi) obj17);
            case 437:
                ftt fttVar12 = this.a;
                T t5 = (T) fttVar12.eX;
                if (t5 != null) {
                    return t5;
                }
                dxio c16 = dxjc.c(fttVar12.eW.h());
                bvrb tn3 = fttVar12.eW.a.tn();
                dxjg.e(tn3);
                ?? r3 = (T) new burf(new bure(c16, tn3));
                fttVar12.eX = r3;
                return r3;
            case 438:
                return (T) this.a.wo();
            case 439:
                return (T) this.a.aM();
            case 440:
                ftt fttVar13 = this.a;
                return (T) new cbzw(fttVar13.eW.sH(), fttVar13.aL());
            case 441:
                return (T) new cbzg();
            case 442:
                return (T) new cbzy();
            case 443:
                return (T) new cbzx();
            case 444:
                return (T) this.a.aO();
            case 445:
                return (T) this.a.aQ();
            case 446:
                return (T) this.a.aS();
            case 447:
                return (T) this.a.aU();
            case 448:
                return (T) this.a.aW();
            case 449:
                return (T) this.a.ba();
            case 450:
                return (T) this.a.bc();
            case 451:
                return (T) this.a.be();
            case 452:
                return (T) this.a.bg();
            case 453:
                return (T) this.a.bi();
            case 454:
                return (T) this.a.bn();
            case 455:
                return (T) this.a.bl();
            case 456:
                return (T) this.a.br();
            case 457:
                return (T) this.a.bu();
            case 458:
                return (T) this.a.bW();
            case 459:
                return (T) this.a.bv();
            case 460:
                return (T) this.a.bN();
            case 461:
                T t6 = (T) this.a.wh().n();
                dxjg.f(t6);
                return t6;
            case 462:
                T t7 = (T) this.a.wh().o();
                dxjg.f(t7);
                return t7;
            case 463:
                return (T) this.a.bD().a;
            case 464:
                ftt fttVar14 = this.a;
                dxio c17 = dxjc.c(fttVar14.bA());
                vpd dr = fttVar14.eW.dr();
                Resources c18 = fttVar14.eW.a.c();
                dxjg.e(c18);
                return (T) new algi(c17, dr, c18, fttVar14.eW.qw(), fttVar14.eW.sA(), new algk(fttVar14.eW.qw()));
            case 465:
                return (T) this.a.bG();
            case 466:
                return (T) this.a.bI();
            case 467:
                return (T) this.a.bS();
            case 468:
                return (T) new vzh(this.a.wk());
            case 469:
                ftt fttVar15 = this.a;
                Object obj18 = fttVar15.y;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj6 = fttVar15.y;
                        if (obj6 instanceof dxjf) {
                            gga wk2 = fttVar15.wk();
                            buxk vg = fttVar15.eW.vg();
                            btvo rp4 = fttVar15.eW.a.rp();
                            dxjg.e(rp4);
                            bvrb tn4 = fttVar15.eW.a.tn();
                            dxjg.e(tn4);
                            cqat rR = fttVar15.eW.a.rR();
                            dxjg.e(rR);
                            bvjj rB2 = fttVar15.eW.a.rB();
                            dxjg.e(rB2);
                            btrm rz6 = fttVar15.eW.a.rz();
                            dxjg.e(rz6);
                            dxjg.e(fttVar15.eW.a.tr());
                            dxio c19 = dxjc.c(fttVar15.eW.cD());
                            amwp hV = fttVar15.eW.hV();
                            dxio c20 = dxjc.c(fttVar15.as());
                            dxio c21 = dxjc.c(fttVar15.eW.jm());
                            dxio c22 = dxjc.c(fttVar15.eW.at());
                            Executor sU3 = fttVar15.eW.a.sU();
                            dxjg.e(sU3);
                            Executor sV2 = fttVar15.eW.a.sV();
                            dxjg.e(sV2);
                            obj6 = new pyh(wk2, vg, rp4, tn4, rR, rB2, rz6, c19, hV, c20, c21, c22, sU3, sV2);
                            dxjc.d(fttVar15.y, obj6);
                            fttVar15.y = obj6;
                        }
                    }
                    obj18 = obj6;
                }
                return (T) ((pyh) obj18);
            case 470:
                return (T) this.a.bX();
            case 471:
                return (T) this.a.ca();
            case 472:
                ftt fttVar16 = this.a;
                T t8 = (T) fttVar16.eY;
                if (t8 != null) {
                    return t8;
                }
                dxio c23 = dxjc.c(fttVar16.eW.h());
                bvrb tn5 = fttVar16.eW.a.tn();
                dxjg.e(tn5);
                ?? r32 = (T) new butr(new butq(c23, tn5));
                fttVar16.eY = r32;
                return r32;
            case 473:
                return (T) this.a.ch();
            case 474:
                return (T) this.a.cc();
            case 475:
                MainLayout mainLayout = (MainLayout) this.a.a.findViewById(com.google.android.apps.maps.R.id.mainmap_container);
                return (T) dbsg.j(mainLayout == null ? null : mainLayout.ag);
            case 476:
                return (T) this.a.cg();
            case 477:
                return (T) alaz.b();
            case 478:
                return (T) this.a.ce();
            case 479:
                return (T) this.a.ci();
            case 480:
                return (T) this.a.cq();
            case 481:
                return (T) this.a.ck();
            case 482:
                return (T) this.a.cm();
            case 483:
                return (T) this.a.co();
            case 484:
                return (T) this.a.cr();
            case 485:
                ftt fttVar17 = this.a;
                Object obj19 = fttVar17.A;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj7 = fttVar17.A;
                        if (obj7 instanceof dxjf) {
                            gga wk3 = fttVar17.wk();
                            btvo rp5 = fttVar17.eW.a.rp();
                            dxjg.e(rp5);
                            dxio c24 = dxjc.c(fttVar17.eW.p());
                            dxio c25 = dxjc.c(fttVar17.eW.at());
                            fttVar17.cw();
                            fttVar17.cs();
                            cqkj wl = fttVar17.wl();
                            Context b3 = fttVar17.eW.a.b();
                            dxjg.e(b3);
                            affa affaVar = new affa(b3);
                            bvjj rB3 = fttVar17.eW.a.rB();
                            dxjg.e(rB3);
                            dxio c26 = dxjc.c(fttVar17.cx());
                            dxio c27 = dxjc.c(fttVar17.m());
                            aufl cu = fttVar17.eW.cu();
                            Executor sU4 = fttVar17.eW.a.sU();
                            dxjg.e(sU4);
                            dehq tg = fttVar17.eW.a.tg();
                            dxjg.e(tg);
                            dxio c28 = dxjc.c(fttVar17.t());
                            cqat rR2 = fttVar17.eW.a.rR();
                            dxjg.e(rR2);
                            fyu fyuVar2 = fttVar17.eW;
                            dzsj dzsjVar7 = fyuVar2.ca;
                            if (dzsjVar7 == null) {
                                dzsjVar7 = new fxy(fyuVar2, 461);
                                fyuVar2.ca = dzsjVar7;
                            }
                            dxio c29 = dxjc.c(dzsjVar7);
                            btwr sx = fttVar17.eW.a.sx();
                            dxjg.e(sx);
                            dxio c30 = dxjc.c(fttVar17.y());
                            dxio c31 = dxjc.c(fttVar17.cl());
                            dxio c32 = dxjc.c(fttVar17.eW.bO());
                            dzsj dzsjVar8 = fttVar17.z;
                            if (dzsjVar8 == null) {
                                dzsjVar8 = new fns(fttVar17, 488);
                                fttVar17.z = dzsjVar8;
                            }
                            obj7 = new afdd(wk3, rp5, c24, c25, wl, affaVar, rB3, c26, c27, cu, sU4, tg, c28, rR2, c29, sx, c30, c31, c32, dxjc.c(dzsjVar8), dxjc.c(fttVar17.eW.ed()));
                            dxjc.d(fttVar17.A, obj7);
                            fttVar17.A = obj7;
                        }
                    }
                    obj19 = obj7;
                }
                return (T) ((afdd) obj19);
            case 486:
                T t9 = (T) ((afwr) this.a.m21if().b(25));
                dxjg.f(t9);
                return t9;
            case 487:
                T t10 = (T) ((afgy) this.a.m21if().b(22));
                dxjg.f(t10);
                return t10;
            case 488:
                ftt fttVar18 = this.a;
                gga wk4 = fttVar18.wk();
                afey cw = fttVar18.cw();
                ckcw rU3 = fttVar18.eW.a.rU();
                dxjg.e(rU3);
                eff cs = fttVar18.cs();
                cqkj wl2 = fttVar18.wl();
                dxio c33 = dxjc.c(fttVar18.eW.p());
                Executor sU5 = fttVar18.eW.a.sU();
                dxjg.e(sU5);
                dehq tg2 = fttVar18.eW.a.tg();
                dxjg.e(tg2);
                return (T) new afcq(wk4, cw, rU3, cs, wl2, c33, sU5, tg2);
            case 489:
                ftt fttVar19 = this.a;
                Object obj20 = fttVar19.C;
                if (obj20 instanceof dxjf) {
                    synchronized (obj20) {
                        obj8 = fttVar19.C;
                        if (obj8 instanceof dxjf) {
                            gga wk5 = fttVar19.wk();
                            efh h = fttVar19.h();
                            btvo rp6 = fttVar19.eW.a.rp();
                            dxjg.e(rp6);
                            cjqy tr = fttVar19.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = fttVar19.eW.a.tp();
                            dxjg.e(tp);
                            affz kn = fttVar19.kn();
                            dzsj dzsjVar9 = fttVar19.aF;
                            if (dzsjVar9 == null) {
                                dzsjVar9 = new fns(fttVar19, 805);
                                fttVar19.aF = dzsjVar9;
                            }
                            affw affwVar = new affw(h, rp6, tr, tp, kn, dxjc.c(dzsjVar9), dxjc.c(fttVar19.eW.ed()));
                            efc cc = fttVar19.cc();
                            dzsj dzsjVar10 = fttVar19.B;
                            if (dzsjVar10 == null) {
                                dzsjVar10 = new fns(fttVar19, 490);
                                fttVar19.B = dzsjVar10;
                            }
                            afgb afgbVar = new afgb(wk5, affwVar, cc, dzsjVar10);
                            dxjc.d(fttVar19.C, afgbVar);
                            fttVar19.C = afgbVar;
                            obj8 = afgbVar;
                        }
                    }
                    obj20 = obj8;
                }
                return (T) ((afgb) obj20);
            case 490:
                ftt fttVar20 = this.a;
                rb rbVar = fttVar20.a;
                Application a3 = fttVar20.eW.a.a();
                dxjg.e(a3);
                return (T) new afgw(rbVar, a3, fttVar20.cc(), dxjc.c(fttVar20.bT()), dxjc.c(fttVar20.m()));
            case 491:
                ftt fttVar21 = this.a;
                rb rbVar2 = fttVar21.a;
                dxio c34 = dxjc.c(fttVar21.eW.p());
                dxio c35 = dxjc.c(fttVar21.eW.at());
                cqkj wl3 = fttVar21.wl();
                fttVar21.eW.aH();
                bvrb tn6 = fttVar21.eW.a.tn();
                dxjg.e(tn6);
                return (T) new afgs(rbVar2, c34, c35, wl3, tn6);
            case 492:
                ftt fttVar22 = this.a;
                Object obj21 = fttVar22.K;
                if (obj21 instanceof dxjf) {
                    synchronized (obj21) {
                        obj9 = fttVar22.K;
                        if (obj9 instanceof dxjf) {
                            gga wk6 = fttVar22.wk();
                            efd cI = fttVar22.cI();
                            bvjj rB4 = fttVar22.eW.a.rB();
                            dxjg.e(rB4);
                            btrm rz7 = fttVar22.eW.a.rz();
                            dxjg.e(rz7);
                            cqhn cqhnVar = new cqhn();
                            busn EC = fttVar22.EC();
                            dxio c36 = dxjc.c(fttVar22.cz());
                            btvo rp7 = fttVar22.eW.a.rp();
                            dxjg.e(rp7);
                            cjqy tr2 = fttVar22.eW.a.tr();
                            dxjg.e(tr2);
                            cjqq tp2 = fttVar22.eW.a.tp();
                            dxjg.e(tp2);
                            efh h2 = fttVar22.h();
                            efc cc2 = fttVar22.cc();
                            bwqv rD2 = fttVar22.eW.a.rD();
                            dxjg.e(rD2);
                            fttVar22.cJ();
                            akox ap = fttVar22.ap();
                            dxio c37 = dxjc.c(fttVar22.av());
                            btxv ai = fttVar22.eW.ai();
                            dzsj dzsjVar11 = fttVar22.I;
                            if (dzsjVar11 == null) {
                                dzsjVar11 = new fns(fttVar22, 503);
                                fttVar22.I = dzsjVar11;
                            }
                            dzsj dzsjVar12 = dzsjVar11;
                            bzmd co = fttVar22.co();
                            bhhf k = fttVar22.k();
                            dxio c38 = dxjc.c(fttVar22.bd());
                            dxio c39 = dxjc.c(fttVar22.cC());
                            dxio c40 = dxjc.c(fttVar22.eW.im());
                            dxio c41 = dxjc.c(fttVar22.m());
                            dxio c42 = dxjc.c(fttVar22.A());
                            dxio c43 = dxjc.c(fttVar22.eW.C());
                            Executor sU6 = fttVar22.eW.a.sU();
                            dxjg.e(sU6);
                            akfa rK2 = fttVar22.eW.a.rK();
                            dxjg.e(rK2);
                            dzsj dzsjVar13 = fttVar22.J;
                            if (dzsjVar13 == null) {
                                dzsjVar13 = new fns(fttVar22, 514);
                                fttVar22.J = dzsjVar13;
                            }
                            dxio c44 = dxjc.c(dzsjVar13);
                            fttVar22.eW.bW();
                            cpv cpvVar = new cpv();
                            gcg sD = fttVar22.eW.a.sD();
                            dxjg.e(sD);
                            obj9 = new afuu(wk6, cI, rB4, rz7, cqhnVar, EC, c36, rp7, tr2, tp2, h2, cc2, rD2, ap, c37, ai, dzsjVar12, co, k, c38, c39, c40, c41, c42, c43, sU6, rK2, c44, cpvVar, sD, dxjc.c(fttVar22.eW.ie()), fttVar22.cv());
                            dxjc.d(fttVar22.K, obj9);
                            fttVar22.K = obj9;
                        }
                    }
                    obj21 = obj9;
                }
                return (T) ((afuu) obj21);
            case 493:
                return (T) this.a.bB();
            case 494:
                ftt fttVar23 = this.a;
                Object obj22 = fttVar23.aH;
                if (obj22 instanceof dxjf) {
                    synchronized (obj22) {
                        obj10 = fttVar23.aH;
                        if (obj10 instanceof dxjf) {
                            obj10 = new gke(fttVar23.a, fttVar23.wn(), fttVar23.eA());
                            dxjc.d(fttVar23.aH, obj10);
                            fttVar23.aH = obj10;
                        }
                    }
                    obj22 = obj10;
                }
                return (T) ((glj) obj22);
            case 495:
                T t11 = (T) ((anbj) this.a.m21if().b(33));
                dxjg.f(t11);
                return t11;
            case 496:
                T t12 = (T) ((ahwf) this.a.m21if().b(29));
                dxjg.f(t12);
                return t12;
            case 497:
                T t13 = (T) ((byej) this.a.m21if().b(84));
                dxjg.f(t13);
                return t13;
            case 498:
                return (T) this.a.bL();
            case 499:
                ftt fttVar24 = this.a;
                Object obj23 = fttVar24.D;
                if (obj23 instanceof dxjf) {
                    synchronized (obj23) {
                        obj11 = fttVar24.D;
                        if (obj11 instanceof dxjf) {
                            obj11 = (bnli) fttVar24.m21if().b(66);
                            dxjg.f(obj11);
                            dxjc.d(fttVar24.D, obj11);
                            fttVar24.D = obj11;
                        }
                    }
                    obj23 = obj11;
                }
                return (T) ((bnli) obj23);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object, buxy] */
    private final T h() {
        Object obj;
        Object obj2;
        Object obj3;
        bwqv bwqvVar;
        gfq gfqVar;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        int i = this.b;
        switch (i) {
            case 600:
                return (T) this.a.eX();
            case 601:
                return (T) this.a.fa();
            case 602:
                return (T) this.a.bD();
            case 603:
                return (T) this.a.fj();
            case 604:
                return (T) this.a.db();
            case 605:
                return (T) this.a.cp();
            case 606:
                return (T) this.a.fg();
            case 607:
                return (T) this.a.fi();
            case 608:
                return (T) axyl.b();
            case 609:
                return (T) this.a.fn();
            case 610:
                return (T) this.a.aA();
            case 611:
                return (T) this.a.fo();
            case 612:
                return (T) this.a.fv();
            case 613:
                return (T) this.a.fq();
            case 614:
                return (T) this.a.fw();
            case 615:
                return (T) this.a.fx();
            case 616:
                return (T) this.a.fB();
            case 617:
                return (T) this.a.eg();
            case 618:
                return (T) new jdj();
            case 619:
                ftt fttVar = this.a;
                return (T) new bnmh(fttVar.eW.V(), dxjh.c(fttVar.eW.aw()), dxjh.c(fttVar.m()), fttVar.ad());
            case 620:
                ftt fttVar2 = this.a;
                Object obj17 = fttVar2.ai;
                if (obj17 instanceof dxjf) {
                    synchronized (obj17) {
                        obj = fttVar2.ai;
                        if (obj instanceof dxjf) {
                            obj = new bhhg(fttVar2.wk(), fttVar2.be());
                            dxjc.d(fttVar2.ai, obj);
                            fttVar2.ai = obj;
                        }
                    }
                    obj17 = obj;
                }
                return (T) ((bhhg) obj17);
            case 621:
                return (T) this.a.fU();
            case 622:
                return (T) this.a.fH();
            case 623:
                ftt fttVar3 = this.a;
                return (T) new chla(fttVar3.bb(), fttVar3.aR(), fttVar3.cQ(), fttVar3.fD(), fttVar3.fh(), fttVar3.fF(), fttVar3.eW.at(), fttVar3.fG(), fttVar3.eW.di(), fttVar3.eV, dxjh.c(fttVar3.m()));
            case 624:
                return (T) this.a.fC();
            case 625:
                return (T) this.a.fE();
            case 626:
                return (T) this.a.EH();
            case 627:
                ftt fttVar4 = this.a;
                dzsj dzsjVar = fttVar4.aj;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar4, 628);
                    fttVar4.aj = dzsjVar;
                }
                return (T) new chkd(dzsjVar);
            case 628:
                ftt fttVar5 = this.a;
                return (T) new chkb(fttVar5.eW.il(), fttVar5.eW.bu());
            case 629:
                return (T) new cqre();
            case 630:
                return (T) this.a.aq();
            case 631:
                return (T) this.a.h();
            case 632:
                return (T) new jmx();
            case 633:
                return (T) this.a.aB();
            case 634:
                return (T) new bote(dxjc.c(this.a.P()));
            case 635:
                ftt fttVar6 = this.a;
                gga wk = fttVar6.wk();
                bwqv rD = fttVar6.eW.a.rD();
                dxjg.e(rD);
                dxio c = dxjc.c(fttVar6.eW.p());
                cztz m = fttVar6.eW.a.m();
                dxjg.e(m);
                btpc sz = fttVar6.eW.a.sz();
                dxjg.e(sz);
                Object obj18 = fttVar6.ak;
                if (obj18 instanceof dxjf) {
                    synchronized (obj18) {
                        obj2 = fttVar6.ak;
                        if (obj2 instanceof dxjf) {
                            btvo rp = fttVar6.eW.a.rp();
                            dxjg.e(rp);
                            obj2 = new bqai(rp);
                            dxjc.d(fttVar6.ak, obj2);
                            fttVar6.ak = obj2;
                        }
                    }
                    obj18 = obj2;
                }
                return (T) new bpye(wk, rD, c, m, sz, (bqai) obj18, fttVar6.fV());
            case 636:
                ftt fttVar7 = this.a;
                Object obj19 = fttVar7.aq;
                if (obj19 instanceof dxjf) {
                    synchronized (obj19) {
                        obj3 = fttVar7.aq;
                        if (obj3 instanceof dxjf) {
                            gga wk2 = fttVar7.wk();
                            efh h = fttVar7.h();
                            cqkj wl = fttVar7.wl();
                            cjqy tr = fttVar7.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = fttVar7.eW.a.tp();
                            dxjg.e(tp);
                            btvo rp2 = fttVar7.eW.a.rp();
                            dxjg.e(rp2);
                            brat ll = fttVar7.eW.ll();
                            bwqv rD2 = fttVar7.eW.a.rD();
                            dxjg.e(rD2);
                            gfq wd = fttVar7.wd();
                            ahjq wf = fttVar7.eW.wf();
                            bvsl sA = fttVar7.eW.sA();
                            aehr ee = fttVar7.eW.ee();
                            aeht qe = fttVar7.eW.qe();
                            btrm rz = fttVar7.eW.a.rz();
                            dxjg.e(rz);
                            bvrb tn = fttVar7.eW.a.tn();
                            dxjg.e(tn);
                            cqat rR = fttVar7.eW.a.rR();
                            dxjg.e(rR);
                            anhk qm = fttVar7.eW.qm();
                            akox ap = fttVar7.ap();
                            broq V = fttVar7.V();
                            bvsf qQ = fttVar7.eW.qQ();
                            Object obj20 = fttVar7.al;
                            if (obj20 instanceof dxjf) {
                                synchronized (obj20) {
                                    obj4 = fttVar7.al;
                                    if (obj4 instanceof dxjf) {
                                        gga wk3 = fttVar7.wk();
                                        btrm rz2 = fttVar7.eW.a.rz();
                                        dxjg.e(rz2);
                                        gfqVar = wd;
                                        bwqvVar = rD2;
                                        obj4 = new brbr(wk3, rz2, dxjc.c(fttVar7.eW.im()), fttVar7.co());
                                        dxjc.d(fttVar7.al, obj4);
                                        fttVar7.al = obj4;
                                    } else {
                                        bwqvVar = rD2;
                                        gfqVar = wd;
                                    }
                                }
                                obj20 = obj4;
                            } else {
                                bwqvVar = rD2;
                                gfqVar = wd;
                            }
                            brbr brbrVar = (brbr) obj20;
                            dxio c2 = dxjc.c(fttVar7.dF());
                            dzsj dzsjVar2 = fttVar7.am;
                            if (dzsjVar2 == null) {
                                dzsjVar2 = new fns(fttVar7, 637);
                                fttVar7.am = dzsjVar2;
                            }
                            dxio c3 = dxjc.c(dzsjVar2);
                            dxio c4 = dxjc.c(fttVar7.H());
                            dxio c5 = dxjc.c(fttVar7.aT());
                            dxio c6 = dxjc.c(fttVar7.aP());
                            dxio c7 = dxjc.c(fttVar7.az());
                            dxio c8 = dxjc.c(fttVar7.eW.im());
                            dxio c9 = dxjc.c(fttVar7.eW.at());
                            dxio c10 = dxjc.c(fttVar7.cu());
                            dxio c11 = dxjc.c(fttVar7.ge());
                            iqq gf = fttVar7.gf();
                            bxrt dS = fttVar7.eW.dS();
                            dzsj dzsjVar3 = fttVar7.an;
                            if (dzsjVar3 == null) {
                                dzsjVar3 = new fns(fttVar7, 642);
                                fttVar7.an = dzsjVar3;
                            }
                            dzsj dzsjVar4 = dzsjVar3;
                            dzsj dzsjVar5 = fttVar7.ao;
                            if (dzsjVar5 == null) {
                                dzsjVar5 = new fns(fttVar7, 643);
                                fttVar7.ao = dzsjVar5;
                            }
                            dzsj dzsjVar6 = dzsjVar5;
                            cjns au = fttVar7.eW.au();
                            dzsj dzsjVar7 = fttVar7.ap;
                            if (dzsjVar7 == null) {
                                dzsjVar7 = new fns(fttVar7, 644);
                                fttVar7.ap = dzsjVar7;
                            }
                            dxio c12 = dxjc.c(dzsjVar7);
                            brdi rj = fttVar7.eW.rj();
                            brcs ln = fttVar7.eW.ln();
                            affr qf = fttVar7.eW.qf();
                            cxb lo = fttVar7.eW.lo();
                            cvn lj = fttVar7.eW.lj();
                            dxio c13 = dxjc.c(fttVar7.eW.cx());
                            dxio c14 = dxjc.c(fttVar7.eW.ik());
                            brmt gh = fttVar7.gh();
                            brcc gi = fttVar7.gi();
                            brpm gj = fttVar7.gj();
                            bsqi gk = fttVar7.gk();
                            bvjj rB = fttVar7.eW.a.rB();
                            dxjg.e(rB);
                            bsqg bsqgVar = new bsqg(rB, fttVar7.eW.dH(), dxjc.c(fttVar7.H()));
                            btvo rp3 = fttVar7.eW.a.rp();
                            dxjg.e(rp3);
                            obj3 = new brab(wk2, h, wl, tr, tp, rp2, ll, bwqvVar, gfqVar, wf, sA, ee, qe, rz, tn, rR, qm, ap, V, qQ, brbrVar, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, gf, dS, dzsjVar4, dzsjVar6, au, c12, rj, ln, qf, lo, lj, c13, c14, gh, gi, gj, gk, bsqgVar, new bsqf(rp3));
                            dxjc.d(fttVar7.aq, obj3);
                            fttVar7.aq = obj3;
                        }
                    }
                    obj19 = obj3;
                }
                return (T) ((brab) obj19);
            case 637:
                return (T) this.a.fW();
            case 638:
                return (T) this.a.gd();
            case 639:
                return (T) this.a.fX();
            case 640:
                return (T) this.a.ga();
            case 641:
                ftt fttVar8 = this.a;
                return (T) new bryi(fttVar8.eW.il(), dxjh.c(fttVar8.H()));
            case 642:
                return (T) this.a.ft();
            case 643:
                return (T) this.a.fs();
            case 644:
                return (T) new brcg();
            case 645:
                return (T) this.a.gg();
            case 646:
                ftt fttVar9 = this.a;
                Object obj21 = fttVar9.ar;
                if (obj21 instanceof dxjf) {
                    synchronized (obj21) {
                        obj5 = fttVar9.ar;
                        if (obj5 instanceof dxjf) {
                            gga wk4 = fttVar9.wk();
                            akfa rK = fttVar9.eW.a.rK();
                            dxjg.e(rK);
                            cjxd aA = fttVar9.aA();
                            dxio c15 = dxjc.c(fttVar9.eW.lm());
                            bvkx o = fttVar9.eW.a.o();
                            dxjg.e(o);
                            btvo rp4 = fttVar9.eW.a.rp();
                            dxjg.e(rp4);
                            obj5 = new bsva(wk4, rK, aA, c15, o, rp4, dxjc.c(fttVar9.eW.as()), dxjc.c(fttVar9.ai()), dxjc.c(fttVar9.m()));
                            dxjc.d(fttVar9.ar, obj5);
                            fttVar9.ar = obj5;
                        }
                    }
                    obj21 = obj5;
                }
                return (T) ((bsva) obj21);
            case 647:
                ftt fttVar10 = this.a;
                Object obj22 = fttVar10.at;
                if (obj22 instanceof dxjf) {
                    synchronized (obj22) {
                        obj6 = fttVar10.at;
                        if (obj6 instanceof dxjf) {
                            gga wk5 = fttVar10.wk();
                            btrm rz3 = fttVar10.eW.a.rz();
                            dxjg.e(rz3);
                            cjqy tr2 = fttVar10.eW.a.tr();
                            dxjg.e(tr2);
                            bwqv rD3 = fttVar10.eW.a.rD();
                            dxjg.e(rD3);
                            dxio c16 = dxjc.c(fttVar10.as());
                            dxio c17 = dxjc.c(fttVar10.ay());
                            dxjc.c(fttVar10.cl());
                            dxio c18 = dxjc.c(fttVar10.cD());
                            dzsj dzsjVar8 = fttVar10.as;
                            if (dzsjVar8 == null) {
                                dzsjVar8 = new fns(fttVar10, 648);
                                fttVar10.as = dzsjVar8;
                            }
                            obj6 = new bwjt(wk5, rz3, tr2, rD3, c16, c17, c18, dxjc.c(dzsjVar8));
                            dxjc.d(fttVar10.at, obj6);
                            fttVar10.at = obj6;
                        }
                    }
                    obj22 = obj6;
                }
                return (T) ((bwjt) obj22);
            case 648:
                ftt fttVar11 = this.a;
                btrm rz4 = fttVar11.eW.a.rz();
                dxjg.e(rz4);
                dxjg.e(fttVar11.eW.a.a());
                dxio c19 = dxjc.c(fttVar11.as());
                btrm rz5 = fttVar11.eW.a.rz();
                dxjg.e(rz5);
                cqat rR2 = fttVar11.eW.a.rR();
                dxjg.e(rR2);
                dxio c20 = dxjc.c(fttVar11.eW.k());
                bvrb tn2 = fttVar11.eW.a.tn();
                dxjg.e(tn2);
                bvjj rB2 = fttVar11.eW.a.rB();
                dxjg.e(rB2);
                Application a = fttVar11.eW.a.a();
                dxjg.e(a);
                btmv rY = fttVar11.eW.a.rY();
                dxjg.e(rY);
                Executor sV = fttVar11.eW.a.sV();
                dxjg.e(sV);
                bwiz bwizVar = new bwiz(a, rY, sV);
                dxio c21 = dxjc.c(fttVar11.eW.jm());
                dxio c22 = dxjc.c(fttVar11.eW.p());
                ckcw rU = fttVar11.eW.a.rU();
                dxjg.e(rU);
                bvjj rB3 = fttVar11.eW.a.rB();
                dxjg.e(rB3);
                ?? eV = fttVar11.eW.eV();
                dxio c23 = dxjc.c(fttVar11.eW.p());
                dxjc.c(fttVar11.eW.iO());
                bwjr bwjrVar = new bwjr(c19, rz5, rR2, c20, tn2, rB2, bwizVar, c21, c22, new bwjl(rU, rB3, eV, c23));
                Executor sV2 = fttVar11.eW.a.sV();
                dxjg.e(sV2);
                Application a2 = fttVar11.eW.a.a();
                dxjg.e(a2);
                return (T) new bwjh(rz4, bwjrVar, sV2, a2);
            case 649:
                return (T) this.a.gl();
            case 650:
                this.a.wk();
                return (T) new ckpz();
            case 651:
                return (T) this.a.gm();
            case 652:
                ftt fttVar12 = this.a;
                Object obj23 = fttVar12.au;
                if (obj23 instanceof dxjf) {
                    synchronized (obj23) {
                        obj7 = fttVar12.au;
                        if (obj7 instanceof dxjf) {
                            gga wk6 = fttVar12.wk();
                            btrm rz6 = fttVar12.eW.a.rz();
                            dxjg.e(rz6);
                            dxjg.e(fttVar12.eW.a.tn());
                            byoi cw = fttVar12.eW.cw();
                            fttVar12.eW.ar();
                            dxjc.c(fttVar12.gn());
                            cjqq tp2 = fttVar12.eW.a.tp();
                            dxjg.e(tp2);
                            obj7 = new byeh(wk6, rz6, cw, tp2, fttVar12.go());
                            dxjc.d(fttVar12.au, obj7);
                            fttVar12.au = obj7;
                        }
                    }
                    obj23 = obj7;
                }
                return (T) ((byeh) obj23);
            case 653:
                return (T) this.a.bR();
            case 654:
                return (T) this.a.gp();
            case 655:
                return (T) this.a.gt();
            case 656:
                return (T) this.a.gv();
            case 657:
                ftt fttVar13 = this.a;
                return (T) new cezn(fttVar13.ap(), fttVar13.wk());
            case 658:
                ftt fttVar14 = this.a;
                Object obj24 = fttVar14.av;
                if (obj24 instanceof dxjf) {
                    synchronized (obj24) {
                        obj8 = fttVar14.av;
                        if (obj8 instanceof dxjf) {
                            gga wk7 = fttVar14.wk();
                            akox ap2 = fttVar14.ap();
                            cgep gw = fttVar14.gw();
                            bwqv rD4 = fttVar14.eW.a.rD();
                            dxjg.e(rD4);
                            cgej cgejVar = new cgej(rD4);
                            fyu fyuVar = fttVar14.eW;
                            dzsj dzsjVar9 = fyuVar.cF;
                            if (dzsjVar9 == null) {
                                dzsjVar9 = new fxy(fyuVar, 552);
                                fyuVar.cF = dzsjVar9;
                            }
                            obj8 = new cgek(wk7, ap2, gw, cgejVar, dxjc.c(dzsjVar9));
                            dxjc.d(fttVar14.av, obj8);
                            fttVar14.av = obj8;
                        }
                    }
                    obj24 = obj8;
                }
                return (T) ((cgek) obj24);
            case 659:
                return (T) this.a.gx();
            case 660:
                ftt fttVar15 = this.a;
                Object obj25 = fttVar15.aw;
                if (obj25 instanceof dxjf) {
                    synchronized (obj25) {
                        obj9 = fttVar15.aw;
                        if (obj9 instanceof dxjf) {
                            chnu gy = fttVar15.gy();
                            btvo rp5 = fttVar15.eW.a.rp();
                            dxjg.e(rp5);
                            obj9 = new chnl(gy, rp5, dxjc.c(fttVar15.eW.p()), dxjc.c(fttVar15.P()), fttVar15.eW.lu(), fttVar15.gG(), fttVar15.gH(), fttVar15.gF());
                            dxjc.d(fttVar15.aw, obj9);
                            fttVar15.aw = obj9;
                        }
                    }
                    obj25 = obj9;
                }
                return (T) ((chnl) obj25);
            case 661:
                return (T) this.a.gz();
            case 662:
                return (T) this.a.gw();
            case 663:
                return (T) this.a.gI();
            case 664:
                ftt fttVar16 = this.a;
                Object obj26 = fttVar16.ax;
                if (obj26 instanceof dxjf) {
                    synchronized (obj26) {
                        obj10 = fttVar16.ax;
                        if (obj10 instanceof dxjf) {
                            gga wk8 = fttVar16.wk();
                            dxio c24 = dxjc.c(fttVar16.eW.p());
                            akdv O = fttVar16.O();
                            bbrq ja = fttVar16.eW.ja();
                            ckcw rU2 = fttVar16.eW.a.rU();
                            dxjg.e(rU2);
                            bvrb tn3 = fttVar16.eW.a.tn();
                            dxjg.e(tn3);
                            dxjg.e(fttVar16.eW.a.rB());
                            obj10 = new cdfs(wk8, c24, O, ja, rU2, tn3, fttVar16.eW.qm(), dxjc.c(fttVar16.gJ()), fttVar16.eW.aZ());
                            dxjc.d(fttVar16.ax, obj10);
                            fttVar16.ax = obj10;
                        }
                    }
                    obj26 = obj10;
                }
                return (T) ((cdfs) obj26);
            case 665:
                return (T) this.a.EJ();
            case 666:
                ftt fttVar17 = this.a;
                Object obj27 = fttVar17.ay;
                if (obj27 instanceof dxjf) {
                    synchronized (obj27) {
                        obj11 = fttVar17.ay;
                        if (obj11 instanceof dxjf) {
                            fttVar17.wk();
                            obj11 = new cbrv();
                            dxjc.d(fttVar17.ay, obj11);
                            fttVar17.ay = obj11;
                        }
                    }
                    obj27 = obj11;
                }
                return (T) ((cbrv) obj27);
            case 667:
                ftt fttVar18 = this.a;
                cqkj wl2 = fttVar18.wl();
                btvo rp6 = fttVar18.eW.a.rp();
                dxjg.e(rp6);
                Executor sU = fttVar18.eW.a.sU();
                dxjg.e(sU);
                fyu fyuVar2 = fttVar18.eW;
                dxio c25 = dxjc.c(fyuVar2.h());
                bvrb tn4 = fyuVar2.a.tn();
                dxjg.e(tn4);
                bvnb bvnbVar = new bvnb(new bvag(c25, tn4), fttVar18.wk(), fttVar18.eW.qm());
                fttVar18.eC();
                gga wk9 = fttVar18.wk();
                dxio c26 = dxjc.c(fttVar18.m());
                dxio c27 = dxjc.c(fttVar18.v());
                cjqy tr3 = fttVar18.eW.a.tr();
                dxjg.e(tr3);
                cjqq tp3 = fttVar18.eW.a.tp();
                dxjg.e(tp3);
                return (T) new bvnr(new bvnf(wl2, rp6, sU, bvnbVar, wk9, c26, c27, tr3, tp3));
            case 668:
                return (T) this.a.gL();
            case 669:
                ftt fttVar19 = this.a;
                Object obj28 = fttVar19.az;
                if (obj28 instanceof dxjf) {
                    synchronized (obj28) {
                        obj12 = fttVar19.az;
                        if (obj12 instanceof dxjf) {
                            gga wk10 = fttVar19.wk();
                            btrm rz7 = fttVar19.eW.a.rz();
                            dxjg.e(rz7);
                            cjqy tr4 = fttVar19.eW.a.tr();
                            dxjg.e(tr4);
                            ania qq = fttVar19.eW.qq();
                            ckcw rU3 = fttVar19.eW.a.rU();
                            dxjg.e(rU3);
                            efc cc = fttVar19.cc();
                            dxio c28 = dxjc.c(fttVar19.bT());
                            dxio c29 = dxjc.c(fttVar19.az());
                            dxio c30 = dxjc.c(fttVar19.J());
                            dxio c31 = dxjc.c(fttVar19.aK());
                            dxio c32 = dxjc.c(fttVar19.H());
                            dxjc.c(fttVar19.eW());
                            cklq io = fttVar19.eW.io();
                            cqat rR3 = fttVar19.eW.a.rR();
                            dxjg.e(rR3);
                            obj12 = new bwim(wk10, rz7, tr4, qq, rU3, cc, c28, c29, c30, c31, c32, io, rR3, fttVar19.eW.iS());
                            dxjc.d(fttVar19.az, obj12);
                            fttVar19.az = obj12;
                        }
                    }
                    obj28 = obj12;
                }
                return (T) ((bwim) obj28);
            case 670:
                return (T) this.a.gM();
            case 671:
                return (T) this.a.gN();
            case 672:
                return (T) this.a.gS();
            case 673:
                return (T) this.a.gO();
            case 674:
                return (T) this.a.cj();
            case 675:
                return (T) this.a.gP();
            case 676:
                return (T) this.a.gQ();
            case 677:
                bttf aL = this.a.eW.a.aL();
                dxjg.e(aL);
                return (T) new bycq(aL);
            case 678:
                ftt fttVar20 = this.a;
                Object obj29 = fttVar20.aA;
                if (obj29 instanceof dxjf) {
                    synchronized (obj29) {
                        obj13 = fttVar20.aA;
                        if (obj13 instanceof dxjf) {
                            dxjg.e(fttVar20.eW.a.rp());
                            fttVar20.h();
                            bypo bypoVar = new bypo(fttVar20.eW.uR());
                            dxjc.d(fttVar20.aA, bypoVar);
                            fttVar20.aA = bypoVar;
                            obj13 = bypoVar;
                        }
                    }
                    obj29 = obj13;
                }
                return (T) ((bypo) obj29);
            case 679:
                ftt fttVar21 = this.a;
                cjxd aA2 = fttVar21.aA();
                btvo rp7 = fttVar21.eW.a.rp();
                dxjg.e(rp7);
                dxio c33 = dxjc.c(fttVar21.eW.p());
                bzph dK = fttVar21.dK();
                bvjj rB4 = fttVar21.eW.a.rB();
                dxjg.e(rB4);
                btvo rp8 = fttVar21.eW.a.rp();
                dxjg.e(rp8);
                cjnu cjnuVar = new cjnu(rB4, rp8);
                ckcw rU4 = fttVar21.eW.a.rU();
                dxjg.e(rU4);
                return (T) new cjnv(aA2, rp7, c33, dK, cjnuVar, rU4);
            case 680:
                return (T) this.a.gR();
            case 681:
                return (T) this.a.gU();
            case 682:
                return (T) this.a.gT();
            case 683:
                return (T) this.a.gV();
            case 684:
                ftt fttVar22 = this.a;
                Object obj30 = fttVar22.aB;
                if (obj30 instanceof dxjf) {
                    synchronized (obj30) {
                        obj14 = fttVar22.aB;
                        if (obj14 instanceof dxjf) {
                            btrm rz8 = fttVar22.eW.a.rz();
                            dxjg.e(rz8);
                            dxio c34 = dxjc.c(fttVar22.eW.p());
                            cdgl lv = fttVar22.eW.lv();
                            btvo rp9 = fttVar22.eW.a.rp();
                            dxjg.e(rp9);
                            bvjj rB5 = fttVar22.eW.a.rB();
                            dxjg.e(rB5);
                            obj14 = new bzrf(rz8, c34, lv, rp9, rB5, fttVar22.eW.cu());
                            dxjc.d(fttVar22.aB, obj14);
                            fttVar22.aB = obj14;
                        }
                    }
                    obj30 = obj14;
                }
                return (T) ((bzrf) obj30);
            case 685:
                return (T) this.a.gX();
            case 686:
                return (T) this.a.cv();
            case 687:
                ftt fttVar23 = this.a;
                Object obj31 = fttVar23.aC;
                if (obj31 instanceof dxjf) {
                    synchronized (obj31) {
                        obj15 = fttVar23.aC;
                        if (obj15 instanceof dxjf) {
                            cqkj wl3 = fttVar23.wl();
                            Executor sU2 = fttVar23.eW.a.sU();
                            dxjg.e(sU2);
                            eff cs = fttVar23.cs();
                            bzgl gY = fttVar23.gY();
                            gga wk11 = fttVar23.wk();
                            dxio c35 = dxjc.c(fttVar23.eW.lx());
                            dxio c36 = dxjc.c(fttVar23.gW());
                            dxio c37 = dxjc.c(fttVar23.m());
                            cqat rR4 = fttVar23.eW.a.rR();
                            dxjg.e(rR4);
                            obj15 = new byyu(wl3, sU2, cs, gY, wk11, c35, c36, c37, rR4);
                            dxjc.d(fttVar23.aC, obj15);
                            fttVar23.aC = obj15;
                        }
                    }
                    obj31 = obj15;
                }
                return (T) ((byyu) obj31);
            case 688:
                return (T) new xfa(this.a.wk());
            case 689:
                return (T) this.a.gZ();
            case 690:
                return (T) this.a.hc();
            case 691:
                return (T) this.a.ha();
            case 692:
                ftt fttVar24 = this.a;
                Object obj32 = fttVar24.aD;
                if (obj32 instanceof dxjf) {
                    synchronized (obj32) {
                        obj16 = fttVar24.aD;
                        if (obj16 instanceof dxjf) {
                            rb rbVar = fttVar24.a;
                            dxio c38 = dxjc.c(fttVar24.as());
                            btrm rz9 = fttVar24.eW.a.rz();
                            dxjg.e(rz9);
                            btvo rp10 = fttVar24.eW.a.rp();
                            dxjg.e(rp10);
                            dxio c39 = dxjc.c(fttVar24.eW.p());
                            bvrb tn5 = fttVar24.eW.a.tn();
                            dxjg.e(tn5);
                            obj16 = new pev(rbVar, c38, rz9, rp10, c39, tn5, fttVar24.hd());
                            dxjc.d(fttVar24.aD, obj16);
                            fttVar24.aD = obj16;
                        }
                    }
                    obj32 = obj16;
                }
                return (T) ((pev) obj32);
            case 693:
                return (T) this.a.he();
            case 694:
                return (T) this.a.hf();
            case 695:
                return (T) this.a.hj();
            case 696:
                ftt fttVar25 = this.a;
                dzsj<gga> ad = fttVar25.ad();
                dzsj dzsjVar10 = fttVar25.aE;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fns(fttVar25, 697);
                    fttVar25.aE = dzsjVar10;
                }
                return (T) new aeuc(ad, dxjh.c(dzsjVar10), dxjh.c(fttVar25.cl()), dxjh.c(fttVar25.ef()), dxjh.c(fttVar25.eW.k()), dxjh.c(fttVar25.eW.n()), dxjh.c(fttVar25.eW.R()), fttVar25.eW.hN());
            case 697:
                return (T) this.a.hi();
            case 698:
                return (T) this.a.hW();
            case 699:
                return (T) this.a.hR();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [T, bmom] */
    /* JADX WARN: Type inference failed for: r4v34, types: [cvv, java.lang.Object] */
    private final T k() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.b;
        switch (i) {
            case 1200:
                return (T) this.a.sk();
            case 1201:
                return (T) this.a.ss();
            case 1202:
                return (T) this.a.eK();
            case 1203:
                return (T) this.a.sv();
            case 1204:
                return (T) this.a.wm();
            case 1205:
                ftt fttVar = this.a;
                gga wk = fttVar.wk();
                bwqv rD = fttVar.eW.a.rD();
                dxjg.e(rD);
                return (T) new bber(wk, rD, dxjc.c(fttVar.eW.aw()), dxjc.c(fttVar.eW.p()));
            case 1206:
                return (T) this.a.kn();
            case 1207:
                return (T) this.a.pj();
            case 1208:
                ftt fttVar2 = this.a;
                rb rbVar = fttVar2.a;
                bgrd qn = fttVar2.qn();
                bgsy qo = fttVar2.qo();
                bgte qp = fttVar2.qp();
                bgst qq = fttVar2.qq();
                begg wj = fttVar2.wj();
                bnjv jH = fttVar2.jH();
                brwl ta = fttVar2.ta();
                fttVar2.eW.mF();
                cjqy tr = fttVar2.eW.a.tr();
                dxjg.e(tr);
                return (T) new bgtm(rbVar, qn, qo, qp, qq, wj, jH, ta, tr);
            case 1209:
                ftt fttVar3 = this.a;
                return (T) new brwh(fttVar3.sD(), fttVar3.eW.V(), fttVar3.sB());
            case 1210:
                ftt fttVar4 = this.a;
                dcdg q = dcdn.q(24);
                dghs dghsVar = dghs.APPOINTMENT;
                final beav sA = fttVar4.sA();
                q.f(dghsVar, new brva(sA) { // from class: bdvz
                    private final beav a;

                    {
                        this.a = sA;
                    }

                    @Override // defpackage.brva
                    public final brvb a(jba jbaVar, brrx brrxVar) {
                        return this.a.a(brrxVar, dnwv.APPOINTMENT, 2131232953);
                    }
                });
                dghs dghsVar2 = dghs.ORDER_FOOD;
                final beav sA2 = fttVar4.sA();
                q.f(dghsVar2, new brva(sA2) { // from class: bdwa
                    private final beav a;

                    {
                        this.a = sA2;
                    }

                    @Override // defpackage.brva
                    public final brvb a(jba jbaVar, brrx brrxVar) {
                        return this.a.a(brrxVar, dnwv.ORDER_FOOD, 2131232886);
                    }
                });
                dghs dghsVar3 = dghs.RESTAURANT_RESERVATION;
                final beav sA3 = fttVar4.sA();
                q.f(dghsVar3, new brva(sA3) { // from class: bdwb
                    private final beav a;

                    {
                        this.a = sA3;
                    }

                    @Override // defpackage.brva
                    public final brvb a(jba jbaVar, brrx brrxVar) {
                        return this.a.a(brrxVar, dnwv.RESTAURANT_RESERVATION, 2131232885);
                    }
                });
                q.f(dghs.DIRECTIONS, new ziy(fttVar4.ad(), fttVar4.sB(), fttVar4.sz(), fttVar4.eW.V()));
                q.f(dghs.START_NAVIGATION, new znv(fttVar4.ad(), fttVar4.sz(), fttVar4.eW.V()));
                q.f(dghs.ADD_STOP, new zgg(fttVar4.eV, dxjh.c(fttVar4.H()), fttVar4.sB(), fttVar4.sz()));
                q.f(dghs.ADD_PARKING, new zge(fttVar4.eV, fttVar4.sB(), fttVar4.sz()));
                q.f(dghs.EXPLORE, new abti(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.MESSAGE, new apwp(fttVar4.eV, fttVar4.eW.V(), dxjh.c(fttVar4.x()), dxjh.c(fttVar4.mJ()), fttVar4.mx(), fttVar4.sz()));
                q.f(dghs.MORE_INFO, new barj(fttVar4.eV, fttVar4.sz()));
                q.f(dghs.SAVE, new azbv(fttVar4.eV, fttVar4.sz(), fttVar4.J(), fttVar4.iW()));
                q.f(dghs.BOOK, new bfrw(fttVar4.eV, dxjh.c(fttVar4.aK()), dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.CALL, new beab(fttVar4.eV, fttVar4.nG(), fttVar4.sz()));
                q.f(dghs.SEE_ON_MAP, new becg(fttVar4.eV, dxjh.c(fttVar4.aK()), fttVar4.sz()));
                q.f(dghs.ALREADY_HERE, new bdzz(fttVar4.eV, fttVar4.sB(), fttVar4.sz()));
                q.f(dghs.CHECK_IN, new bead(fttVar4.eV, fttVar4.sB(), fttVar4.sz()));
                q.f(dghs.REVIEWS, new bece(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.DIRECTORY, new beai(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.MENU, new beao(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz(), fttVar4.nb()));
                q.f(dghs.HOME_REVIEW, new beak(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.TICKETS, new bmmw(fttVar4.eV, dxjh.c(fttVar4.az()), fttVar4.sz()));
                q.f(dghs.EDIT, new boxm(dxjh.c(fttVar4.cn()), fttVar4.eV, fttVar4.sz()));
                q.f(dghs.SEARCH_RESULT_MORE_INFO, new brwn(fttVar4.eV, fttVar4.sz()));
                q.f(dghs.SHARE, new bwii(fttVar4.eV, fttVar4.sC(), fttVar4.sz()));
                return (T) q.b();
            case 1211:
                ftt fttVar5 = this.a;
                dxio c = dxjc.c(fttVar5.az());
                ?? li = fttVar5.eW.li();
                btvo rp = fttVar5.eW.a.rp();
                dxjg.e(rp);
                return (T) new brsc(c, li, rp);
            case 1212:
                ftt fttVar6 = this.a;
                T t = (T) fttVar6.bZ;
                if (t != null) {
                    return t;
                }
                akfa rK = fttVar6.eW.a.rK();
                dxjg.e(rK);
                bvjj rB = fttVar6.eW.a.rB();
                dxjg.e(rB);
                ckcw rU = fttVar6.eW.a.rU();
                dxjg.e(rU);
                dxio c2 = dxjc.c(fttVar6.eW.jB());
                dxio c3 = dxjc.c(fttVar6.eW.hj());
                bmnj kZ = fttVar6.kZ();
                cqat rR = fttVar6.eW.a.rR();
                dxjg.e(rR);
                fttVar6.hh();
                aese le = fttVar6.eW.le();
                bvrb tn = fttVar6.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) new bmom(rK, rB, rU, c2, c3, kZ, rR, le, tn);
                fttVar6.bZ = r2;
                return r2;
            case 1213:
                ftt fttVar7 = this.a;
                return (T) new bmel(fttVar7.h(), dxjc.c(fttVar7.ef()), fttVar7.fg());
            case 1214:
                return (T) new brvk(this.a.ad());
            case 1215:
                return (T) new brvm();
            case 1216:
                return (T) this.a.sH();
            case 1217:
                return (T) new bmmo(this.a.ad());
            case 1218:
                ftt fttVar8 = this.a;
                return (T) new bfhu(fttVar8.eV, fttVar8.eW.V(), fttVar8.eW.il(), fttVar8.eS(), fttVar8.eW.mx(), fttVar8.nv(), fttVar8.qz(), fttVar8.sL(), fttVar8.sN(), fttVar8.eW.er(), fttVar8.sO(), fttVar8.sP(), fttVar8.jx(), fttVar8.eW.lY(), fttVar8.sQ());
            case 1219:
                ftt fttVar9 = this.a;
                rb rbVar2 = fttVar9.a;
                beya qy = fttVar9.qy();
                bfaq aE = fttVar9.aE();
                beyb sJ = fttVar9.sJ();
                beya qy2 = fttVar9.qy();
                gga wk2 = fttVar9.wk();
                jmc B = fttVar9.B();
                bzmh cH = fttVar9.eW.cH();
                cjqq tp = fttVar9.eW.a.tp();
                dxjg.e(tp);
                beye beyeVar = new beye(qy2, wk2, B, cH, tp, new cpv());
                bfct sK = fttVar9.sK();
                bfdb bfdbVar = new bfdb(fttVar9.eV, fttVar9.eW.K(), fttVar9.eW.il(), fttVar9.eS(), fttVar9.qA(), fttVar9.ad(), fttVar9.eW.R(), dxjh.c(fttVar9.eW.im()), dxjh.c(fttVar9.eW.hN()));
                bfdf bfdfVar = new bfdf(fttVar9.a, new cqhn(), new cqhu(), fttVar9.qy(), fttVar9.eW.bX(), dxjc.c(fttVar9.G()), dxjc.c(fttVar9.eW.im()), dxjc.c(fttVar9.eW.hN()));
                bfbc qD = fttVar9.qD();
                gga wk3 = fttVar9.wk();
                beya qy3 = fttVar9.qy();
                bfaq aE2 = fttVar9.aE();
                jmc B2 = fttVar9.B();
                bzmh cH2 = fttVar9.eW.cH();
                cjqq tp2 = fttVar9.eW.a.tp();
                dxjg.e(tp2);
                beyh beyhVar = new beyh(wk3, qy3, aE2, B2, cH2, tp2, new cpv());
                dxio c4 = dxjc.c(fttVar9.eW.p());
                akdv O = fttVar9.O();
                dxio c5 = dxjc.c(fttVar9.eW.im());
                bvrb tn2 = fttVar9.eW.a.tn();
                dxjg.e(tn2);
                cjqq tp3 = fttVar9.eW.a.tp();
                dxjg.e(tp3);
                return (T) new bfcz(rbVar2, qy, aE, sJ, beyeVar, sK, bfdbVar, bfdfVar, qD, beyhVar, c4, O, c5, tn2, tp3, dxjc.c(fttVar9.eW.hj()));
            case 1220:
                return (T) this.a.sJ();
            case 1221:
                return (T) this.a.sM();
            case 1222:
                ftt fttVar10 = this.a;
                return (T) new bfhx(fttVar10.az(), new cqhn(), fttVar10.eW.lX());
            case 1223:
                ftt fttVar11 = this.a;
                rb rbVar3 = fttVar11.a;
                cqat rR2 = fttVar11.eW.a.rR();
                dxjg.e(rR2);
                return (T) new bfha(rbVar3, rR2, fttVar11.eW.qq());
            case 1224:
                ftt fttVar12 = this.a;
                cjqq tp4 = fttVar12.eW.a.tp();
                dxjg.e(tp4);
                cjqy tr2 = fttVar12.eW.a.tr();
                dxjg.e(tr2);
                return (T) new bfgq(tp4, tr2);
            case 1225:
                ftt fttVar13 = this.a;
                return (T) new brwc(fttVar13.sS(), fttVar13.sT(), fttVar13.eV, fttVar13.eW.V(), fttVar13.eW.lY());
            case 1226:
                return (T) this.a.mO();
            case 1227:
                return (T) this.a.qu();
            case 1228:
                ftt fttVar14 = this.a;
                dzsj<Application> m = fttVar14.eW.m();
                dzsj<bvjj> aw = fttVar14.eW.aw();
                dzsj c6 = dxjh.c(fttVar14.eW.p());
                dzsj<btvo> V = fttVar14.eW.V();
                dzsj<brat> mO = fttVar14.eW.mO();
                dzsj<brwh> sE = fttVar14.sE();
                dzsj dzsjVar = fttVar14.ca;
                if (dzsjVar == null) {
                    dzsjVar = new fns(fttVar14, 1229);
                    fttVar14.ca = dzsjVar;
                }
                return (T) new brwv(m, aw, c6, V, mO, sE, dzsjVar, fttVar14.jA(), fttVar14.sF(), fttVar14.sI(), fttVar14.sG(), fttVar14.sR(), fttVar14.sU(), fttVar14.nu(), fttVar14.eW.k(), fttVar14.jv(), fttVar14.sV(), dxjh.c(fttVar14.aK()), fttVar14.sW(), fttVar14.sX(), fttVar14.sY(), fttVar14.sZ(), fttVar14.eW.il(), fttVar14.eS(), fttVar14.sS());
            case 1229:
                ftt fttVar15 = this.a;
                return (T) new brwr(fttVar15.sD(), fttVar15.eW.V(), fttVar15.sB());
            case 1230:
                ftt fttVar16 = this.a;
                return (T) new bfks(fttVar16.eV, fttVar16.eW.al(), fttVar16.iX(), fttVar16.eW.V(), fttVar16.bf(), fttVar16.ja(), fttVar16.da(), fttVar16.eW.R(), fttVar16.eW.il(), dxjh.c(fttVar16.jc()), fttVar16.eW.aw(), fttVar16.je(), fttVar16.jg(), fttVar16.ji(), fttVar16.ja());
            case 1231:
                ftt fttVar17 = this.a;
                dzsj<btvo> V2 = fttVar17.eW.V();
                dzsj c7 = dxjh.c(fttVar17.eW.p());
                dzsj c8 = dxjh.c(fttVar17.x());
                dzsj<becb> mz = fttVar17.mz();
                dzsj dzsjVar2 = fttVar17.cb;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fns(fttVar17, 1232);
                    fttVar17.cb = dzsjVar2;
                }
                return (T) new brvr(V2, c7, c8, mz, dzsjVar2, fttVar17.mB(), fttVar17.mD(), fttVar17.mF(), fttVar17.eW.mr(), fttVar17.eW.ms());
            case 1232:
                return (T) new brvs(this.a.nE());
            case 1233:
                ftt fttVar18 = this.a;
                dxio c9 = dxjc.c(fttVar18.bf());
                dxio c10 = dxjc.c(fttVar18.eW.my());
                btvo rp2 = fttVar18.eW.a.rp();
                dxjg.e(rp2);
                return (T) new brbn(c9, c10, rp2, fttVar18.eW.mQ());
            case 1234:
                ftt fttVar19 = this.a;
                dxjg.e(fttVar19.eW.a.rp());
                vsf g = fttVar19.eW.g();
                fttVar19.H();
                fttVar19.eW.K();
                fttVar19.eW.il();
                fttVar19.jN();
                return (T) new bruu(g);
            case 1235:
                return (T) this.a.qW();
            case 1236:
                ftt fttVar20 = this.a;
                dzsj dzsjVar3 = fttVar20.ce;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fns(fttVar20, 1237);
                    fttVar20.ce = dzsjVar3;
                }
                T t2 = (T) ((apzh) dxjc.c(dzsjVar3).a());
                dxjg.f(t2);
                return t2;
            case 1237:
                ftt fttVar21 = this.a;
                Object obj5 = fttVar21.cd;
                if (obj5 instanceof dxjf) {
                    synchronized (obj5) {
                        obj = fttVar21.cd;
                        if (obj instanceof dxjf) {
                            gga wk4 = fttVar21.wk();
                            dxio c11 = dxjc.c(fttVar21.eW.is());
                            dxio c12 = dxjc.c(fttVar21.S());
                            btvo rp3 = fttVar21.eW.a.rp();
                            dxjg.e(rp3);
                            Executor sV = fttVar21.eW.a.sV();
                            dxjg.e(sV);
                            obj = new apyh(wk4, c11, c12, rp3, sV);
                            dxjc.d(fttVar21.cd, obj);
                            fttVar21.cd = obj;
                        }
                    }
                    obj5 = obj;
                }
                return (T) ((apyh) obj5);
            case 1238:
                return (T) this.a.oo();
            case 1239:
                T t3 = (T) ((bnmo) this.a.m21if().b(67));
                dxjg.f(t3);
                return t3;
            case 1240:
                return (T) this.a.gK();
            case 1241:
                T t4 = (T) ((cbrv) this.a.m21if().b(102));
                dxjg.f(t4);
                return t4;
            case 1242:
                return (T) this.a.gC();
            case 1243:
                return (T) this.a.gD();
            case 1244:
                ftt fttVar22 = this.a;
                Object obj6 = fttVar22.ci;
                if (obj6 instanceof dxjf) {
                    synchronized (obj6) {
                        obj2 = fttVar22.ci;
                        if (obj2 instanceof dxjf) {
                            rb rbVar4 = fttVar22.a;
                            bvsl sA4 = fttVar22.eW.sA();
                            Executor sV2 = fttVar22.eW.a.sV();
                            dxjg.e(sV2);
                            dhm dhmVar = new dhm(rbVar4, sA4, sV2);
                            dxjc.d(fttVar22.ci, dhmVar);
                            fttVar22.ci = dhmVar;
                            obj2 = dhmVar;
                        }
                    }
                    obj6 = obj2;
                }
                return (T) ((dhm) obj6);
            case 1245:
                ftt fttVar23 = this.a;
                Object obj7 = fttVar23.cj;
                if (obj7 instanceof dxjf) {
                    synchronized (obj7) {
                        obj3 = fttVar23.cj;
                        if (obj3 instanceof dxjf) {
                            rb rbVar5 = fttVar23.a;
                            Executor sV3 = fttVar23.eW.a.sV();
                            dxjg.e(sV3);
                            dhp dhpVar = new dhp(rbVar5, sV3, fttVar23.eW.sF());
                            dxjc.d(fttVar23.cj, dhpVar);
                            fttVar23.cj = dhpVar;
                            obj3 = dhpVar;
                        }
                    }
                    obj7 = obj3;
                }
                return (T) ((dhp) obj7);
            case 1246:
                return (T) this.a.aw();
            case 1247:
                return (T) this.a.by();
            case 1248:
                return (T) this.a.en();
            case 1249:
                T t5 = (T) ((beii) this.a.m21if().b(Integer.valueOf((int) R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)));
                dxjg.f(t5);
                return t5;
            case 1250:
                return (T) this.a.aY();
            case 1251:
                return (T) this.a.tj();
            case 1252:
                T t6 = (T) ((blpp) this.a.m21if().b(73));
                dxjg.f(t6);
                return t6;
            case 1253:
                return (T) this.a.gH();
            case 1254:
                return (T) this.a.gB();
            case 1255:
                return (T) this.a.tm();
            case 1256:
                return (T) this.a.qP();
            case 1257:
                return (T) this.a.tq();
            case 1258:
                ftt fttVar24 = this.a;
                cqat rR3 = fttVar24.eW.a.rR();
                dxjg.e(rR3);
                return (T) new qrt(rR3, fttVar24.eW.bK());
            case 1259:
                return (T) this.a.tp();
            case 1260:
                ftt fttVar25 = this.a;
                Application a = fttVar25.eW.a.a();
                dxjg.e(a);
                akox ap = fttVar25.ap();
                akox ap2 = fttVar25.ap();
                Application a2 = fttVar25.eW.a.a();
                dxjg.e(a2);
                return (T) new qxa(a, ap, new qxd(ap2, a2), fttVar25.hO());
            case 1261:
                return (T) new rbp(this.a.tr());
            case 1262:
                return (T) this.a.gc();
            case 1263:
                ftt fttVar26 = this.a;
                dzsj<rb> dzsjVar4 = fttVar26.eV;
                dzsj dzsjVar5 = fttVar26.ct;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar26, 1264);
                    fttVar26.ct = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fttVar26.cu;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fns(fttVar26, 1267);
                    fttVar26.cu = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = fttVar26.cw;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fns(fttVar26, 1268);
                    fttVar26.cw = dzsjVar9;
                }
                return (T) new rkr(dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar9, fttVar26.eW.il(), fttVar26.eW.di());
            case 1264:
                ftt fttVar27 = this.a;
                dzsj<Application> m2 = fttVar27.eW.m();
                dzsj dzsjVar10 = fttVar27.cr;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fns(fttVar27, 1265);
                    fttVar27.cr = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj<bsvm> aV = fttVar27.aV();
                dzsj c13 = dxjh.c(fttVar27.J());
                dzsj<axse> eU = fttVar27.eU();
                dzsj c14 = dxjh.c(fttVar27.eW.aw());
                dzsj c15 = dxjh.c(fttVar27.eW.K());
                dzsj<Executor> di = fttVar27.eW.di();
                dzsj dzsjVar12 = fttVar27.cs;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar27, 1266);
                    fttVar27.cs = dzsjVar12;
                }
                return (T) new qyq(m2, dzsjVar11, aV, c13, eU, c14, c15, di, dzsjVar12, fttVar27.eW.V(), dxjh.c(fttVar27.m()));
            case 1265:
                return (T) new qyh();
            case 1266:
                ftt fttVar28 = this.a;
                Application a3 = fttVar28.eW.a.a();
                dxjg.e(a3);
                dehp tl = fttVar28.eW.a.tl();
                dxjg.e(tl);
                return (T) new qyg(a3, tl);
            case 1267:
                ftt fttVar29 = this.a;
                return (T) new rkx(fttVar29.eV, fttVar29.eW.di(), fttVar29.eW.V(), dxjh.c(fttVar29.eW.hK()), dxjh.c(fttVar29.hP()));
            case 1268:
                ftt fttVar30 = this.a;
                dzsj<rb> dzsjVar13 = fttVar30.eV;
                dzsj dzsjVar14 = fttVar30.cv;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fns(fttVar30, 1269);
                    fttVar30.cv = dzsjVar14;
                }
                return (T) new rkl(dzsjVar13, dzsjVar14, dxjh.c(fttVar30.hP()), dxjh.c(fttVar30.eW.aw()), dxjh.c(fttVar30.eW.K()));
            case 1269:
                return (T) this.a.tt();
            case 1270:
                return (T) new yil(this.a.wk());
            case 1271:
                return (T) this.a.dc();
            case 1272:
                ftt fttVar31 = this.a;
                btvo rp4 = fttVar31.eW.a.rp();
                dxjg.e(rp4);
                ahjq wf = fttVar31.eW.wf();
                czkm<dsw> kl = fttVar31.eW.kl();
                dehq tf = fttVar31.eW.a.tf();
                dxjg.e(tf);
                return (T) new dtc(rp4, wf, kl, tf, new dta(fttVar31.lf(), dxjh.c(fttVar31.eW.im()), fttVar31.ad(), fttVar31.eW.bk()));
            case 1273:
                return (T) this.a.jT();
            case 1274:
                T t7 = (T) ((auen) this.a.m21if().b(44));
                dxjg.f(t7);
                return t7;
            case 1275:
                T t8 = (T) ((byzd) this.a.m21if().b(85));
                dxjg.f(t8);
                return t8;
            case 1276:
                return (T) this.a.V();
            case 1277:
                return (T) this.a.tD();
            case 1278:
                return (T) this.a.in();
            case 1279:
                ftt fttVar32 = this.a;
                Object obj8 = fttVar32.cz;
                if (obj8 instanceof dxjf) {
                    synchronized (obj8) {
                        obj4 = fttVar32.cz;
                        if (obj4 instanceof dxjf) {
                            rb rbVar6 = fttVar32.a;
                            dzsj dzsjVar15 = fttVar32.cy;
                            if (dzsjVar15 == null) {
                                dzsjVar15 = new fns(fttVar32, 1280);
                                fttVar32.cy = dzsjVar15;
                            }
                            byaw byawVar = new byaw(dzsjVar15, new bybk(fttVar32.eW.R(), fttVar32.eW.oe()));
                            rb rbVar7 = fttVar32.a;
                            dxio c16 = dxjc.c(fttVar32.bA());
                            amfi qp2 = fttVar32.eW.qp();
                            bvrb tn3 = fttVar32.eW.a.tn();
                            dxjg.e(tn3);
                            bybn bybnVar = new bybn(rbVar7, new bybf(rbVar7, c16, qp2, tn3), fttVar32.dp(), new bycf(fttVar32.ap()), fttVar32.dq());
                            bvrb tn4 = fttVar32.eW.a.tn();
                            dxjg.e(tn4);
                            bybt bybtVar = new bybt(rbVar6, byawVar, bybnVar, new bybo(tn4));
                            dxjc.d(fttVar32.cz, bybtVar);
                            fttVar32.cz = bybtVar;
                            obj4 = bybtVar;
                        }
                    }
                    obj8 = obj4;
                }
                return (T) ((bybt) obj8);
            case 1280:
                return (T) this.a.tG();
            case 1281:
                return (T) new byce(this.a.eW.ei());
            case 1282:
                btmv rY = this.a.eW.a.rY();
                dxjg.e(rY);
                return (T) new bycc(rY);
            case 1283:
                T t9 = (T) ((qce) this.a.m21if().b(74));
                dxjg.f(t9);
                return t9;
            case 1284:
                return (T) this.a.iS();
            case 1285:
                T t10 = (T) ((xfa) this.a.m21if().b(Integer.valueOf((int) R.styleable.AppCompatTheme_textAppearanceListItem)));
                dxjg.f(t10);
                return t10;
            case 1286:
                return (T) this.a.tc();
            case 1287:
                ftt fttVar33 = this.a;
                dbsg<arkb> tL = fttVar33.tL();
                Executor sU = fttVar33.eW.a.sU();
                dxjg.e(sU);
                return (T) new ycw(tL, sU);
            case 1288:
                return (T) this.a.bO();
            case 1289:
                return (T) this.a.ey();
            case 1290:
                ftt fttVar34 = this.a;
                rb rbVar8 = fttVar34.a;
                pnn jL = fttVar34.eW.jL();
                cqhn cqhnVar = new cqhn();
                bvjj rB2 = fttVar34.eW.a.rB();
                dxjg.e(rB2);
                dxio c17 = dxjc.c(fttVar34.cl());
                Executor sU2 = fttVar34.eW.a.sU();
                dxjg.e(sU2);
                bvrb tn5 = fttVar34.eW.a.tn();
                dxjg.e(tn5);
                return (T) new ppd(rbVar8, jL, cqhnVar, rB2, c17, sU2, tn5, fttVar34.wl(), (bvvw) fttVar34.ao());
            case 1291:
                T t11 = (T) ((awps) this.a.m21if().b(Integer.valueOf((int) R.styleable.AppCompatTheme_switchStyle)));
                dxjg.f(t11);
                return t11;
            case 1292:
                return (T) this.a.tL();
            case 1293:
                return (T) this.a.tn();
            case 1294:
                return (T) this.a.bY();
            case 1295:
                return (T) this.a.bZ();
            case 1296:
                return (T) this.a.pJ().a(new akgl());
            case 1297:
                return (T) new aaps(dxjc.c(this.a.bh()));
            case 1298:
                T t12 = (T) ((akge) this.a.m21if().b(31));
                dxjg.f(t12);
                return t12;
            case 1299:
                return (T) this.a.ln();
            default:
                throw new AssertionError(i);
        }
    }
}
