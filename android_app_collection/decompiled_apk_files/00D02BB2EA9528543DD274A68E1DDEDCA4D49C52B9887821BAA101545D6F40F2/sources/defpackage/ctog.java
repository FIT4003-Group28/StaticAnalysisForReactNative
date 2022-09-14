package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: ctog  reason: default package */
/* loaded from: classes5.dex */
public final class ctog implements ctxo {
    private static ctog c;
    private final Context d;
    private final cnjz e;
    public boolean a = true;
    public final Set<ctxo> b = Collections.newSetFromMap(new WeakHashMap());
    private final Executor f = Executors.newSingleThreadExecutor();

    private ctog(Context context) {
        this.d = context;
        this.e = new cnjz(context, "LIGHTER_ANDROID", null);
    }

    public static synchronized ctog a(Context context) {
        ctog ctogVar;
        synchronized (ctog.class) {
            ctogVar = c;
            if (ctogVar == null) {
                ctogVar = new ctog(context.getApplicationContext());
                c = ctogVar;
            }
        }
        return ctogVar;
    }

    public static final dejw c(ContactId contactId) {
        final dejv bZ = dejw.e.bZ();
        String a = contactId.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((dejw) bZ.b).b = a;
        String b = contactId.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dejw) bZ.b).d = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.c().ordinal();
        if (ordinal == 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dejw) bZ.b).a = dxov.a(2);
        } else if (ordinal == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dejw) bZ.b).a = dxov.a(3);
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dejw) bZ.b).a = dxov.a(4);
        } else if (ordinal == 3) {
            cstn.a(contactId.d(), new mw(bZ) { // from class: ctnj
                private final dejv a;

                {
                    this.a = bZ;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    dejv dejvVar = this.a;
                    String str = (String) obj;
                    if (dejvVar.c) {
                        dejvVar.bF();
                        dejvVar.c = false;
                    }
                    dejw dejwVar = dejw.e;
                    ((dejw) dejvVar.b).a = dxov.a(5);
                    if (dejvVar.c) {
                        dejvVar.bF();
                        dejvVar.c = false;
                    }
                    str.getClass();
                    ((dejw) dejvVar.b).c = str;
                }
            });
        } else if (ordinal == 4) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dejw) bZ.b).a = dxov.a(7);
        }
        return bZ.bK();
    }

    @Override // defpackage.ctxo
    public final void b(final ctxn ctxnVar) {
        int i;
        ctmv ctmvVar = new ctmv();
        final dejj bZ = dejk.r.bZ();
        String packageName = this.d.getPackageName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        packageName.getClass();
        ((dejk) bZ.b).p = packageName;
        int a = ctxnVar.a();
        if (a != 10088) {
            switch (a) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                case 19:
                    i = 21;
                    break;
                case 20:
                    i = 22;
                    break;
                case 21:
                    i = 23;
                    break;
                case 22:
                    i = 24;
                    break;
                case 23:
                    i = 25;
                    break;
                case 24:
                    i = 26;
                    break;
                case 25:
                    i = 27;
                    break;
                case 26:
                    i = 28;
                    break;
                case 27:
                    i = 29;
                    break;
                case 28:
                    i = 30;
                    break;
                case 29:
                    i = 31;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    i = 32;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    i = 33;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    i = 34;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    i = 35;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    i = 36;
                    break;
                case 35:
                    i = 37;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    i = 38;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    i = 39;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    i = 40;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    i = 41;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    i = 42;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    i = 43;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    i = 44;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    i = 45;
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    i = 46;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    i = 47;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    i = 48;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    i = 49;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    i = 50;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i = 51;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i = 52;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    i = 53;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    i = 54;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    i = 55;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    i = 56;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    i = 57;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    i = 58;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    i = 59;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    i = 60;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    i = 61;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    i = 62;
                    break;
                default:
                    switch (a) {
                        case 100:
                            i = 102;
                            break;
                        case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                            i = R.styleable.AppCompatTheme_textAppearanceListItem;
                            break;
                        case 102:
                            i = 104;
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                            i = 105;
                            break;
                        case 104:
                            i = R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
                            break;
                        case 105:
                            i = R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                            break;
                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                            i = R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                            i = R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                            i = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
                            break;
                        case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                            i = R.styleable.AppCompatTheme_textColorSearchUrl;
                            break;
                        case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                            i = R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                            break;
                        case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                            i = R.styleable.AppCompatTheme_toolbarStyle;
                            break;
                        case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                            i = R.styleable.AppCompatTheme_tooltipForegroundColor;
                            break;
                        case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                            i = R.styleable.AppCompatTheme_tooltipFrameBackground;
                            break;
                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                            i = R.styleable.AppCompatTheme_viewInflaterClass;
                            break;
                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                            i = R.styleable.AppCompatTheme_windowActionBar;
                            break;
                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                            i = R.styleable.AppCompatTheme_windowActionBarOverlay;
                            break;
                        case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                            i = R.styleable.AppCompatTheme_windowActionModeOverlay;
                            break;
                        case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                            i = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                            break;
                        case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                            i = R.styleable.AppCompatTheme_windowFixedHeightMinor;
                            break;
                        case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                            i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
                            break;
                        case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                            i = R.styleable.AppCompatTheme_windowFixedWidthMinor;
                            break;
                        case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                            i = R.styleable.AppCompatTheme_windowMinWidthMajor;
                            break;
                        case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                            i = R.styleable.AppCompatTheme_windowMinWidthMinor;
                            break;
                        case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                            i = R.styleable.AppCompatTheme_windowNoTitle;
                            break;
                        case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                            i = 127;
                            break;
                        case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                            i = 128;
                            break;
                        case 127:
                            i = 129;
                            break;
                        case 128:
                            i = 130;
                            break;
                        case 129:
                            i = 131;
                            break;
                        case 130:
                            i = 132;
                            break;
                        case 131:
                            i = 133;
                            break;
                        case 132:
                            i = 134;
                            break;
                        case 133:
                            i = 135;
                            break;
                        case 134:
                            i = 136;
                            break;
                        case 135:
                            i = 137;
                            break;
                        case 136:
                            i = 138;
                            break;
                        case 137:
                            i = 139;
                            break;
                        case 138:
                            i = 140;
                            break;
                        case 139:
                            i = 141;
                            break;
                        case 140:
                            i = 142;
                            break;
                        case 141:
                            i = 143;
                            break;
                        default:
                            switch (a) {
                                case 201:
                                    i = 203;
                                    break;
                                case 202:
                                    i = 204;
                                    break;
                                case 203:
                                    i = 205;
                                    break;
                                case 204:
                                    i = 206;
                                    break;
                                default:
                                    switch (a) {
                                        case 10000:
                                            i = 10002;
                                            break;
                                        case 10001:
                                            i = 10003;
                                            break;
                                        case 10002:
                                            i = 10004;
                                            break;
                                        case 10003:
                                            i = 10005;
                                            break;
                                        case 10004:
                                            i = 10006;
                                            break;
                                        case 10005:
                                            i = 10007;
                                            break;
                                        case 10006:
                                            i = 10008;
                                            break;
                                        case 10007:
                                            i = 10009;
                                            break;
                                        case 10008:
                                            i = 10010;
                                            break;
                                        case 10009:
                                            i = 10011;
                                            break;
                                        case 10010:
                                            i = 10012;
                                            break;
                                        case 10011:
                                            i = 10013;
                                            break;
                                        case 10012:
                                            i = 10014;
                                            break;
                                        case 10013:
                                            i = 10015;
                                            break;
                                        case 10014:
                                            i = 10016;
                                            break;
                                        case 10015:
                                            i = 10017;
                                            break;
                                        case 10016:
                                            i = 10018;
                                            break;
                                        case 10017:
                                            i = 10019;
                                            break;
                                        case 10018:
                                            i = 10020;
                                            break;
                                        case 10019:
                                            i = 10021;
                                            break;
                                        case 10020:
                                            i = 10022;
                                            break;
                                        case 10021:
                                            i = 10023;
                                            break;
                                        case 10022:
                                            i = 10024;
                                            break;
                                        case 10023:
                                            i = 10025;
                                            break;
                                        case 10024:
                                            i = 10026;
                                            break;
                                        case 10025:
                                            i = 10027;
                                            break;
                                        case 10026:
                                            i = 10028;
                                            break;
                                        case 10027:
                                            i = 10029;
                                            break;
                                        case 10028:
                                            i = 10030;
                                            break;
                                        case 10029:
                                            i = 10031;
                                            break;
                                        case 10030:
                                            i = 10032;
                                            break;
                                        case 10031:
                                            i = 10033;
                                            break;
                                        case 10032:
                                            i = 10034;
                                            break;
                                        case 10033:
                                            i = 10035;
                                            break;
                                        case 10034:
                                            i = 10036;
                                            break;
                                        case 10035:
                                            i = 10037;
                                            break;
                                        case 10036:
                                            i = 10038;
                                            break;
                                        case 10037:
                                            i = 10039;
                                            break;
                                        case 10038:
                                            i = 10040;
                                            break;
                                        case 10039:
                                            i = 10041;
                                            break;
                                        case 10040:
                                            i = 10042;
                                            break;
                                        case 10041:
                                            i = 10043;
                                            break;
                                        case 10042:
                                            i = 10044;
                                            break;
                                        case 10043:
                                            i = 10045;
                                            break;
                                        case 10044:
                                            i = 10046;
                                            break;
                                        case 10045:
                                            i = 10047;
                                            break;
                                        case 10046:
                                            i = 10048;
                                            break;
                                        case 10047:
                                            i = 10049;
                                            break;
                                        case 10048:
                                            i = 10050;
                                            break;
                                        case 10049:
                                            i = 10051;
                                            break;
                                        case 10050:
                                            i = 10052;
                                            break;
                                        case 10051:
                                            i = 10053;
                                            break;
                                        case 10052:
                                            i = 10054;
                                            break;
                                        case 10053:
                                            i = 10055;
                                            break;
                                        case 10054:
                                            i = 10056;
                                            break;
                                        case 10055:
                                            i = 10057;
                                            break;
                                        case 10056:
                                            i = 10058;
                                            break;
                                        case 10057:
                                            i = 10059;
                                            break;
                                        case 10058:
                                            i = 10060;
                                            break;
                                        case 10059:
                                            i = 10061;
                                            break;
                                        case 10060:
                                            i = 10062;
                                            break;
                                        case 10061:
                                            i = 10063;
                                            break;
                                        case 10062:
                                            i = 10064;
                                            break;
                                        case 10063:
                                            i = 10065;
                                            break;
                                        case 10064:
                                            i = 10066;
                                            break;
                                        case 10065:
                                            i = 10067;
                                            break;
                                        case 10066:
                                            i = 10068;
                                            break;
                                        case 10067:
                                            i = 10069;
                                            break;
                                        case 10068:
                                            i = 10070;
                                            break;
                                        case 10069:
                                            i = 10071;
                                            break;
                                        case 10070:
                                            i = 10072;
                                            break;
                                        case 10071:
                                            i = 10073;
                                            break;
                                        case 10072:
                                            i = 10074;
                                            break;
                                        case 10073:
                                            i = 10075;
                                            break;
                                        case 10074:
                                            i = 10076;
                                            break;
                                        case 10075:
                                            i = 10077;
                                            break;
                                        case 10076:
                                            i = 10078;
                                            break;
                                        case 10077:
                                            i = 10079;
                                            break;
                                        default:
                                            switch (a) {
                                                case 10099:
                                                    i = 10101;
                                                    break;
                                                case 10100:
                                                    i = 10102;
                                                    break;
                                                case 10101:
                                                    i = 10103;
                                                    break;
                                                case 10102:
                                                    i = 10104;
                                                    break;
                                                case 10103:
                                                    i = 10105;
                                                    break;
                                                case 10104:
                                                    i = 10106;
                                                    break;
                                                case 10105:
                                                    i = 10107;
                                                    break;
                                                case 10106:
                                                    i = 10108;
                                                    break;
                                                default:
                                                    i = 0;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            i = 10090;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dejk) bZ.b).a = deiz.a(i);
        cstn.a(ctxnVar.b(), new mw(bZ) { // from class: ctni
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                dejw c2 = ctog.c((ContactId) obj);
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                c2.getClass();
                ((dejk) dejjVar.b).b = c2;
            }
        });
        dbsg<String> c2 = ctxnVar.c();
        bZ.getClass();
        cstn.a(c2, new mw(bZ) { // from class: ctnt
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                String str = (String) obj;
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                str.getClass();
                ((dejk) dejjVar.b).c = str;
            }
        });
        dbsg<String> d = ctxnVar.d();
        bZ.getClass();
        cstn.a(d, new mw(bZ) { // from class: ctnx
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                String str = (String) obj;
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                str.getClass();
                ((dejk) dejjVar.b).f = str;
            }
        });
        cstn.a(ctxnVar.q(), new mw(bZ) { // from class: ctny
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                ctxz ctxzVar = (ctxz) obj;
                dejl bZ2 = dejm.d.bZ();
                cstn.a(ctxzVar.b(), new mw(bZ2) { // from class: ctnu
                    private final dejl a;

                    {
                        this.a = bZ2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejl dejlVar = this.a;
                        int intValue = ((Integer) obj2).intValue();
                        if (dejlVar.c) {
                            dejlVar.bF();
                            dejlVar.c = false;
                        }
                        dejm dejmVar = dejm.d;
                        ((dejm) dejlVar.b).b = intValue;
                    }
                });
                cstn.a(ctxzVar.a(), new mw(bZ2) { // from class: ctnv
                    private final dejl a;

                    {
                        this.a = bZ2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejl dejlVar = this.a;
                        int intValue = ((Integer) obj2).intValue();
                        if (dejlVar.c) {
                            dejlVar.bF();
                            dejlVar.c = false;
                        }
                        dejm dejmVar = dejm.d;
                        ((dejm) dejlVar.b).a = intValue;
                    }
                });
                cstn.a(ctxzVar.c(), new mw(bZ2) { // from class: ctnw
                    private final dejl a;

                    {
                        this.a = bZ2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejl dejlVar = this.a;
                        long longValue = ((Long) obj2).longValue();
                        if (dejlVar.c) {
                            dejlVar.bF();
                            dejlVar.c = false;
                        }
                        dejm dejmVar = dejm.d;
                        ((dejm) dejlVar.b).c = longValue;
                    }
                });
                dejm bK = bZ2.bK();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                bK.getClass();
                ((dejk) dejjVar.b).q = bK;
            }
        });
        cstn.a(ctxnVar.e(), new mw(bZ) { // from class: ctnz
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                dejw c3 = ctog.c((ContactId) obj);
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                c3.getClass();
                ((dejk) dejjVar.b).d = c3;
            }
        });
        cstn.a(ctxnVar.f(), new mw(bZ) { // from class: ctoa
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejw bK;
                dejj dejjVar = this.a;
                ConversationId conversationId = (ConversationId) obj;
                if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
                    bK = ctog.c(conversationId.e());
                } else {
                    dejv bZ2 = dejw.e.bZ();
                    String b = conversationId.d().b();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    b.getClass();
                    ((dejw) bZ2.b).d = b;
                    String a2 = conversationId.d().a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    a2.getClass();
                    ((dejw) bZ2.b).b = a2;
                    ((dejw) bZ2.b).a = dxov.a(6);
                    bK = bZ2.bK();
                }
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                bK.getClass();
                ((dejk) dejjVar.b).d = bK;
            }
        });
        cstn.a(ctxnVar.g(), new mw(bZ) { // from class: ctob
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                int i2;
                dejj dejjVar = this.a;
                switch (((Integer) obj).intValue()) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case 9:
                        i2 = 11;
                        break;
                    case 10:
                        i2 = 12;
                        break;
                    case 11:
                        i2 = 13;
                        break;
                    case 12:
                        i2 = 14;
                        break;
                    case 13:
                        i2 = 15;
                        break;
                    case 14:
                        i2 = 16;
                        break;
                    case 15:
                        i2 = 17;
                        break;
                    case 16:
                        i2 = 18;
                        break;
                    case 17:
                        i2 = 19;
                        break;
                    case 18:
                        i2 = 20;
                        break;
                    case 19:
                        i2 = 21;
                        break;
                    case 20:
                        i2 = 22;
                        break;
                    case 21:
                        i2 = 23;
                        break;
                    case 22:
                        i2 = 24;
                        break;
                    case 23:
                        i2 = 25;
                        break;
                    case 24:
                        i2 = 26;
                        break;
                    case 25:
                        i2 = 27;
                        break;
                    case 26:
                        i2 = 28;
                        break;
                    case 27:
                        i2 = 29;
                        break;
                    case 28:
                        i2 = 30;
                        break;
                    case 29:
                        i2 = 31;
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        i2 = 32;
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        i2 = 33;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        i2 = 34;
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        i2 = 35;
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        i2 = 36;
                        break;
                    case 35:
                        i2 = 37;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        i2 = 38;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        i2 = 39;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        i2 = 40;
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        i2 = 41;
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        i2 = 42;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        i2 = 43;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        i2 = 44;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        i2 = 45;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        i2 = 46;
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        i2 = 47;
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        i2 = 48;
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        i2 = 49;
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        i2 = 50;
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    default:
                        i2 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        i2 = 53;
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        i2 = 54;
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        i2 = 55;
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        i2 = 56;
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        i2 = 57;
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        i2 = 58;
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        i2 = 59;
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        i2 = 60;
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        i2 = 61;
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        i2 = 62;
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        i2 = 64;
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        i2 = 65;
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        i2 = 66;
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        i2 = 67;
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        i2 = 68;
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        i2 = 69;
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        i2 = 70;
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        i2 = 73;
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        i2 = 74;
                        break;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        i2 = 75;
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        i2 = 76;
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        i2 = 77;
                        break;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        i2 = 78;
                        break;
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        i2 = 79;
                        break;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                        i2 = 80;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        i2 = 81;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        i2 = 82;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                        i2 = 83;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                        i2 = 84;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                        i2 = 85;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                        i2 = 86;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        i2 = 87;
                        break;
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                        i2 = 88;
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        i2 = 89;
                        break;
                }
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).e = dejb.a(i2);
            }
        });
        cstn.a(ctxnVar.h(), new mw(bZ) { // from class: ctoc
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                int i2;
                dejj dejjVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (intValue == 201) {
                    i2 = 203;
                } else if (intValue == 202) {
                    i2 = 204;
                } else if (intValue == 441) {
                    i2 = 443;
                } else if (intValue != 442) {
                    switch (intValue) {
                        case 0:
                            i2 = 2;
                            break;
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 4;
                            break;
                        case 3:
                            i2 = 5;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                            i2 = 7;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case 9:
                            i2 = 11;
                            break;
                        case 10:
                            i2 = 12;
                            break;
                        default:
                            switch (intValue) {
                                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                    i2 = 53;
                                    break;
                                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                    i2 = 54;
                                    break;
                                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                    i2 = 55;
                                    break;
                                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                    i2 = 56;
                                    break;
                                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                    i2 = 57;
                                    break;
                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                    i2 = 58;
                                    break;
                                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                    i2 = 59;
                                    break;
                                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                    i2 = 60;
                                    break;
                                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                    i2 = 61;
                                    break;
                                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                    i2 = 62;
                                    break;
                                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                    i2 = 63;
                                    break;
                                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                    i2 = 64;
                                    break;
                                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                    i2 = 65;
                                    break;
                                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                    i2 = 66;
                                    break;
                                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                    i2 = 67;
                                    break;
                                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                    i2 = 68;
                                    break;
                                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                    i2 = 69;
                                    break;
                                default:
                                    switch (intValue) {
                                        case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                            i2 = R.styleable.AppCompatTheme_textAppearanceListItem;
                                            break;
                                        case 102:
                                            i2 = 104;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                            i2 = 105;
                                            break;
                                        case 104:
                                            i2 = R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
                                            break;
                                        case 105:
                                            i2 = R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                            i2 = R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                                            i2 = R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                                            i2 = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
                                            break;
                                        case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                                            i2 = R.styleable.AppCompatTheme_textColorSearchUrl;
                                            break;
                                        case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                                            i2 = R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                                            break;
                                        case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                                            i2 = R.styleable.AppCompatTheme_toolbarStyle;
                                            break;
                                        case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                                            i2 = R.styleable.AppCompatTheme_tooltipForegroundColor;
                                            break;
                                        case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                                            i2 = R.styleable.AppCompatTheme_tooltipFrameBackground;
                                            break;
                                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                                            i2 = R.styleable.AppCompatTheme_viewInflaterClass;
                                            break;
                                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                                            i2 = R.styleable.AppCompatTheme_windowActionBar;
                                            break;
                                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                                            i2 = R.styleable.AppCompatTheme_windowActionBarOverlay;
                                            break;
                                        default:
                                            switch (intValue) {
                                                case 131:
                                                    i2 = 133;
                                                    break;
                                                case 132:
                                                    i2 = 134;
                                                    break;
                                                case 133:
                                                    i2 = 135;
                                                    break;
                                                case 134:
                                                    i2 = 136;
                                                    break;
                                                case 135:
                                                    i2 = 137;
                                                    break;
                                                case 136:
                                                    i2 = 138;
                                                    break;
                                                case 137:
                                                    i2 = 139;
                                                    break;
                                                case 138:
                                                    i2 = 140;
                                                    break;
                                                case 139:
                                                    i2 = 141;
                                                    break;
                                                case 140:
                                                    i2 = 142;
                                                    break;
                                                default:
                                                    switch (intValue) {
                                                        case 151:
                                                            i2 = 153;
                                                            break;
                                                        case 152:
                                                            i2 = 154;
                                                            break;
                                                        case 153:
                                                            i2 = 155;
                                                            break;
                                                        case 154:
                                                            i2 = 156;
                                                            break;
                                                        case 155:
                                                            i2 = 157;
                                                            break;
                                                        case 156:
                                                            i2 = 158;
                                                            break;
                                                        default:
                                                            switch (intValue) {
                                                                case 221:
                                                                    i2 = 223;
                                                                    break;
                                                                case 222:
                                                                    i2 = 224;
                                                                    break;
                                                                case 223:
                                                                    i2 = 225;
                                                                    break;
                                                                case 224:
                                                                    i2 = 226;
                                                                    break;
                                                                case 225:
                                                                    i2 = 227;
                                                                    break;
                                                                case 226:
                                                                    i2 = 228;
                                                                    break;
                                                                case 227:
                                                                    i2 = 229;
                                                                    break;
                                                                case 228:
                                                                    i2 = 230;
                                                                    break;
                                                                default:
                                                                    switch (intValue) {
                                                                        case 301:
                                                                            i2 = 303;
                                                                            break;
                                                                        case 371:
                                                                            i2 = 373;
                                                                            break;
                                                                        case 381:
                                                                            i2 = 383;
                                                                            break;
                                                                        case 391:
                                                                            i2 = 393;
                                                                            break;
                                                                        case 392:
                                                                            i2 = 394;
                                                                            break;
                                                                        case 393:
                                                                            i2 = 395;
                                                                            break;
                                                                        case 394:
                                                                            i2 = 396;
                                                                            break;
                                                                        case 395:
                                                                            i2 = 397;
                                                                            break;
                                                                        case 396:
                                                                            i2 = 398;
                                                                            break;
                                                                        case 397:
                                                                            i2 = 399;
                                                                            break;
                                                                        case 398:
                                                                            i2 = 400;
                                                                            break;
                                                                        case 399:
                                                                            i2 = 401;
                                                                            break;
                                                                        case 400:
                                                                            i2 = 402;
                                                                            break;
                                                                        case 401:
                                                                            i2 = 403;
                                                                            break;
                                                                        case 402:
                                                                            i2 = 404;
                                                                            break;
                                                                        case 403:
                                                                            i2 = 405;
                                                                            break;
                                                                        case 404:
                                                                            i2 = 406;
                                                                            break;
                                                                        case 405:
                                                                            i2 = 407;
                                                                            break;
                                                                        case 406:
                                                                            i2 = 408;
                                                                            break;
                                                                        case 407:
                                                                            i2 = 409;
                                                                            break;
                                                                        case 408:
                                                                            i2 = 410;
                                                                            break;
                                                                        case 409:
                                                                            i2 = 411;
                                                                            break;
                                                                        case 461:
                                                                            i2 = 463;
                                                                            break;
                                                                        case 462:
                                                                            i2 = 464;
                                                                            break;
                                                                        case 463:
                                                                            i2 = 465;
                                                                            break;
                                                                        case 464:
                                                                            i2 = 466;
                                                                            break;
                                                                        default:
                                                                            switch (intValue) {
                                                                                case 341:
                                                                                    i2 = 343;
                                                                                    break;
                                                                                case 342:
                                                                                    i2 = 344;
                                                                                    break;
                                                                                case 343:
                                                                                    i2 = 345;
                                                                                    break;
                                                                                case 344:
                                                                                    i2 = 346;
                                                                                    break;
                                                                                case 345:
                                                                                    i2 = 347;
                                                                                    break;
                                                                                case 346:
                                                                                    i2 = 348;
                                                                                    break;
                                                                                case 347:
                                                                                    i2 = 349;
                                                                                    break;
                                                                                case 348:
                                                                                    i2 = 350;
                                                                                    break;
                                                                                default:
                                                                                    i2 = 0;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    i2 = 444;
                }
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).g = deja.a(i2);
            }
        });
        dbsg<Integer> i2 = ctxnVar.i();
        bZ.getClass();
        cstn.a(i2, new mw(bZ) { // from class: ctod
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).h = intValue;
            }
        });
        dbsg<Integer> j = ctxnVar.j();
        bZ.getClass();
        cstn.a(j, new mw(bZ) { // from class: ctmy
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).i = intValue;
            }
        });
        dbsg<Integer> n = ctxnVar.n();
        bZ.getClass();
        cstn.a(n, new mw(bZ) { // from class: ctmz
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).m = intValue;
            }
        });
        if (!ctxnVar.l().isEmpty()) {
            dejt bZ2 = deju.b.bZ();
            dcdc<Long> l = ctxnVar.l();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deju dejuVar = (deju) bZ2.b;
            dsri dsriVar = dejuVar.a;
            if (!dsriVar.a()) {
                dejuVar.a = dsqw.ci(dsriVar);
            }
            dsod.bv(l, dejuVar.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deju bK = bZ2.bK();
            bK.getClass();
            ((dejk) bZ.b).j = bK;
        }
        dbsg<Integer> k = ctxnVar.k();
        bZ.getClass();
        cstn.a(k, new mw(bZ) { // from class: ctna
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                int intValue = ((Integer) obj).intValue();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                ((dejk) dejjVar.b).k = intValue;
            }
        });
        cstn.a(ctxnVar.m(), new mw(bZ) { // from class: ctnb
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                cuil cuilVar = (cuil) obj;
                final dejr bZ3 = dejs.j.bZ();
                dbsg<Long> a2 = cuilVar.a();
                bZ3.getClass();
                cstn.a(a2, new mw(bZ3) { // from class: ctnm
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        long longValue = ((Long) obj2).longValue();
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        ((dejs) dejrVar.b).c = longValue;
                    }
                });
                dbsg<String> b = cuilVar.b();
                bZ3.getClass();
                cstn.a(b, new mw(bZ3) { // from class: ctnn
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        String str = (String) obj2;
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        str.getClass();
                        ((dejs) dejrVar.b).h = str;
                    }
                });
                dbsg<String> c3 = cuilVar.c();
                bZ3.getClass();
                cstn.a(c3, new mw(bZ3) { // from class: ctno
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        String str = (String) obj2;
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        str.getClass();
                        ((dejs) dejrVar.b).e = str;
                    }
                });
                dbsg<Long> e = cuilVar.e();
                bZ3.getClass();
                cstn.a(e, new mw(bZ3) { // from class: ctnp
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        long longValue = ((Long) obj2).longValue();
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        ((dejs) dejrVar.b).d = longValue;
                    }
                });
                dbsg<Long> d2 = cuilVar.d();
                bZ3.getClass();
                cstn.a(d2, new mw(bZ3) { // from class: ctnq
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        long longValue = ((Long) obj2).longValue();
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        ((dejs) dejrVar.b).f = longValue;
                    }
                });
                cstn.a(cuilVar.g(), new mw(bZ3) { // from class: ctnr
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        cuij cuijVar = (cuij) obj2;
                        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
                        int b2 = cuijVar.b();
                        int i3 = b2 - 1;
                        if (b2 != 0) {
                            int i4 = 4;
                            if (i3 == 1) {
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar = dejs.j;
                                ((dejs) dejrVar.b).g = dejc.a(3);
                                ctyb d3 = cuijVar.d();
                                dejd bZ4 = deje.g.bZ();
                                String a3 = d3.a();
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                a3.getClass();
                                ((deje) bZ4.b).a = a3;
                                int d4 = d3.d();
                                if (d4 == 1) {
                                    i4 = 3;
                                } else if (d4 != 2) {
                                    i4 = 2;
                                }
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                ((deje) bZ4.b).d = dxor.a(i4);
                                cstn.a(d3.e(), new mw(bZ4) { // from class: ctne
                                    private final dejd a;

                                    {
                                        this.a = bZ4;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj3) {
                                        dejd dejdVar = this.a;
                                        boolean z = ctzd.PREFILL_MESSAGE.l == ((Integer) obj3).intValue();
                                        if (dejdVar.c) {
                                            dejdVar.bF();
                                            dejdVar.c = false;
                                        }
                                        deje dejeVar = deje.g;
                                        ((deje) dejdVar.b).f = z;
                                    }
                                });
                                cstn.a(d3.b(), new mw(bZ4) { // from class: ctnf
                                    private final dejd a;

                                    {
                                        this.a = bZ4;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj3) {
                                        dejd dejdVar = this.a;
                                        int intValue = ((Integer) obj3).intValue();
                                        if (dejdVar.c) {
                                            dejdVar.bF();
                                            dejdVar.c = false;
                                        }
                                        deje dejeVar = deje.g;
                                        ((deje) dejdVar.b).b = intValue;
                                    }
                                });
                                cstn.a(d3.c(), new mw(bZ4) { // from class: ctng
                                    private final dejd a;

                                    {
                                        this.a = bZ4;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj3) {
                                        dejd dejdVar = this.a;
                                        int intValue = ((Integer) obj3).intValue();
                                        if (dejdVar.c) {
                                            dejdVar.bF();
                                            dejdVar.c = false;
                                        }
                                        deje dejeVar = deje.g;
                                        ((deje) dejdVar.b).c = intValue;
                                    }
                                });
                                cstn.a(d3.e(), new mw(bZ4) { // from class: ctnh
                                    private final dejd a;

                                    {
                                        this.a = bZ4;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj3) {
                                        dejd dejdVar = this.a;
                                        int c4 = ctug.c(((Integer) obj3).intValue());
                                        if (dejdVar.c) {
                                            dejdVar.bF();
                                            dejdVar.c = false;
                                        }
                                        deje dejeVar = deje.g;
                                        ((deje) dejdVar.b).e = dxoo.a(c4);
                                    }
                                });
                                deje bK2 = bZ4.bK();
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar2 = (dejs) dejrVar.b;
                                bK2.getClass();
                                dejsVar2.b = bK2;
                                dejsVar2.a = 7;
                                return;
                            } else if (i3 == 2) {
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar3 = dejs.j;
                                ((dejs) dejrVar.b).g = dejc.a(5);
                                return;
                            } else if (i3 == 4) {
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar4 = dejs.j;
                                ((dejs) dejrVar.b).g = dejc.a(7);
                                return;
                            } else if (i3 == 5) {
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar5 = dejs.j;
                                ((dejs) dejrVar.b).g = dejc.a(8);
                                return;
                            } else if (i3 != 6) {
                                return;
                            } else {
                                ctyd a4 = cuijVar.a();
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar6 = dejs.j;
                                ((dejs) dejrVar.b).g = dejc.a(6);
                                dejf bZ5 = dejg.e.bZ();
                                boolean c4 = a4.c();
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                ((dejg) bZ5.b).c = c4;
                                boolean a5 = a4.a();
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                ((dejg) bZ5.b).a = a5;
                                long b3 = a4.b();
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                ((dejg) bZ5.b).b = b3;
                                boolean d5 = a4.d();
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                ((dejg) bZ5.b).d = d5;
                                dejg bK3 = bZ5.bK();
                                if (dejrVar.c) {
                                    dejrVar.bF();
                                    dejrVar.c = false;
                                }
                                dejs dejsVar7 = (dejs) dejrVar.b;
                                bK3.getClass();
                                dejsVar7.b = bK3;
                                dejsVar7.a = 9;
                                return;
                            }
                        }
                        throw null;
                    }
                });
                dbsg<String> f = cuilVar.f();
                bZ3.getClass();
                cstn.a(f, new mw(bZ3) { // from class: ctns
                    private final dejr a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejr dejrVar = this.a;
                        String str = (String) obj2;
                        if (dejrVar.c) {
                            dejrVar.bF();
                            dejrVar.c = false;
                        }
                        dejs dejsVar = dejs.j;
                        str.getClass();
                        ((dejs) dejrVar.b).i = str;
                    }
                });
                dejs bK2 = bZ3.bK();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                bK2.getClass();
                ((dejk) dejjVar.b).l = bK2;
            }
        });
        cstn.a(ctxnVar.p(), new mw(bZ) { // from class: ctnc
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                ctyj ctyjVar = (ctyj) obj;
                final dejn bZ3 = dejo.c.bZ();
                dbsg<Integer> a2 = ctyjVar.a();
                bZ3.getClass();
                cstn.a(a2, new mw(bZ3) { // from class: ctnk
                    private final dejn a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejn dejnVar = this.a;
                        int intValue = ((Integer) obj2).intValue();
                        if (dejnVar.c) {
                            dejnVar.bF();
                            dejnVar.c = false;
                        }
                        dejo dejoVar = dejo.c;
                        ((dejo) dejnVar.b).a = intValue;
                    }
                });
                dbsg<Integer> b = ctyjVar.b();
                bZ3.getClass();
                cstn.a(b, new mw(bZ3) { // from class: ctnl
                    private final dejn a;

                    {
                        this.a = bZ3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        dejn dejnVar = this.a;
                        int intValue = ((Integer) obj2).intValue();
                        if (dejnVar.c) {
                            dejnVar.bF();
                            dejnVar.c = false;
                        }
                        dejo dejoVar = dejo.c;
                        ((dejo) dejnVar.b).b = intValue;
                    }
                });
                dejo bK2 = bZ3.bK();
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejk dejkVar = dejk.r;
                bK2.getClass();
                ((dejk) dejjVar.b).o = bK2;
            }
        });
        cstn.a(ctxnVar.o(), new mw(bZ) { // from class: ctnd
            private final dejj a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dejj dejjVar = this.a;
                dejp bZ3 = dejq.b.bZ();
                long longValue = ((Long) obj).longValue();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ((dejq) bZ3.b).a = longValue;
                if (dejjVar.c) {
                    dejjVar.bF();
                    dejjVar.c = false;
                }
                dejq bK2 = bZ3.bK();
                dejk dejkVar = dejk.r;
                bK2.getClass();
                ((dejk) dejjVar.b).n = bK2;
            }
        });
        dspd bR = bZ.bK().bR();
        if (bR != null) {
            ctmvVar.a = bR;
            ctmvVar.b = Integer.valueOf(ctxnVar.a());
            if (this.a && ctxnVar.b().a() && ctxnVar.b().b().c().equals(ContactId.ContactType.EMAIL)) {
                ctmvVar.f = dbsg.i(ctxnVar.b().b().a());
            }
            cnjz cnjzVar = this.e;
            String str = ctmvVar.a == null ? " event" : "";
            if (ctmvVar.b == null) {
                str = str.concat(" eventCode");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            ctmw ctmwVar = new ctmw(ctmvVar.a, ctmvVar.b.intValue(), ctmvVar.c, ctmvVar.d, ctmvVar.e, ctmvVar.f);
            cnjv d2 = cnjzVar.d(ctmwVar.a.G());
            d2.d(ctmwVar.b);
            if (ctmwVar.c.a()) {
                d2.e(ctmwVar.c.b().intValue());
            }
            if (ctmwVar.d.a()) {
                d2.b(ctmwVar.d.b());
            }
            if (ctmwVar.e.a()) {
                d2.i = ctmwVar.e.b();
            }
            if (ctmwVar.f.a()) {
                d2.f(ctmwVar.f.b());
            }
            d2.a();
            this.f.execute(new Runnable(this, ctxnVar) { // from class: ctmx
                private final ctog a;
                private final ctxn b;

                {
                    this.a = this;
                    this.b = ctxnVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ctog ctogVar = this.a;
                    ctxn ctxnVar2 = this.b;
                    synchronized (ctogVar.b) {
                        for (ctxo ctxoVar : ctogVar.b) {
                            ctxoVar.b(ctxnVar2);
                        }
                    }
                }
            });
            return;
        }
        throw new NullPointerException("Null event");
    }
}
