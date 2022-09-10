package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: bzpb  reason: default package */
/* loaded from: classes4.dex */
public final class bzpb extends bzpz {
    public final gga a;
    private final Context f;
    private final bzpc g;

    public bzpb(final gga ggaVar, akfa akfaVar, Context context, Activity activity, bzpc bzpcVar) {
        super(activity, akfaVar, new bzpx(ggaVar) { // from class: bzow
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.bzpx
            public final void a() {
                this.a.g().f();
            }
        });
        this.a = ggaVar;
        this.f = context;
        this.g = bzpcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bzpy
    public final void a(String str) {
        char c;
        dsmh dsmhVar;
        switch (str.hashCode()) {
            case -2076650431:
                if (str.equals("timeline")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1913947781:
                if (str.equals("home_and_work_alias_setting")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1393162301:
                if (str.equals("your_places_visited")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1306298021:
                if (str.equals("todo_list_item")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -793579057:
                if (str.equals("odelay_cardui")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -699172305:
                if (str.equals("timeline_checkin")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -475384504:
                if (str.equals("personal_content_settings")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -211472997:
                if (str.equals("geo_personal_place_note")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -161785964:
                if (str.equals("smart_drive")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 39362059:
                if (str.equals("add_a_place")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 122103968:
                if (str.equals("gmm_commute_settings")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 504054808:
                if (str.equals("geo_personal_place_label_or_contact")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 601241991:
                if (str.equals("local_stream_personalized_feature_setting_for_temporary_use")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 631188961:
                if (str.equals("geo_personal_place_upcoming_reservations")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 681200401:
                if (str.equals("personal_score_setup")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                dsmhVar = dsmh.GMM_TIMELINE;
                break;
            case 1:
                dsmhVar = dsmh.GMM_PERSONAL_SCORE_SETUP;
                break;
            case 2:
                dsmhVar = dsmh.GMM_YOUR_PLACES_VISITED;
                break;
            case 3:
                dsmhVar = dsmh.GMM_UPCOMING_EVENTS;
                break;
            case 4:
                dsmhVar = dsmh.GMM_ADD_A_MISSING_PLACE;
                break;
            case 5:
                dsmhVar = dsmh.GMM_TIMELINE_CHECKIN;
                break;
            case 6:
                dsmhVar = dsmh.GMM_PERSONAL_CONTENT_SETTINGS;
                break;
            case 7:
                dsmhVar = dsmh.GMM_ZERO_SUGGEST_PAGE_WAA_PROMPT;
                break;
            case '\b':
                dsmhVar = dsmh.GMM_SMART_DRIVE_SUGGESTIONS;
                break;
            case '\t':
                dsmhVar = dsmh.GMM_LOCAL_STREAM_WAA_SIGN_IN_PROMO;
                break;
            case '\n':
                dsmhVar = dsmh.GMM_CUSTOMIZE_PLACE;
                break;
            case 11:
                dsmhVar = dsmh.GMM_ADD_NOTE_TO_PLACE;
                break;
            case '\f':
                dsmhVar = dsmh.GMM_EDIT_USER_SPECIFIC_INFORMATION;
                break;
            case '\r':
                dsmhVar = dsmh.GMM_COMUTE_SETTINGS;
                break;
            case 14:
                dsmhVar = dsmh.GMM_TODO_LIST_ITEM;
                break;
            default:
                dsmhVar = dsmh.UNKNOWN;
                break;
        }
        dsmh dsmhVar2 = dsmhVar;
        if (dsmhVar2 == dsmh.UNKNOWN) {
            c();
            return;
        }
        Account e = e();
        dskf dskfVar = dskf.WEB_AND_APP_ACTIVITY;
        try {
            cxji.a(this.f);
        } catch (IllegalStateException unused) {
        }
        bzpc bzpcVar = this.g;
        cqca.c = new bzpa(this.c.getApplicationContext());
        cxgt cxgtVar = new cxgt();
        cxgtVar.f = cxhf.a;
        cxgtVar.c = new cqaz();
        Context applicationContext = bzpcVar.a.getApplicationContext();
        if (applicationContext != null) {
            cxgtVar.a = applicationContext;
            cxgtVar.b = "Android Maps";
            String str2 = cxgtVar.b;
            if (!(str2 == null ? dbpy.a : dbsg.i(str2)).a()) {
                cxgtVar.b = "common";
            }
            cxgtVar.d = new cxif(cxgtVar.a());
            cxgtVar.e = new cxgj(cxgtVar.a());
            String str3 = cxgtVar.a == null ? " context" : "";
            if (cxgtVar.b == null) {
                str3 = str3.concat(" instanceId");
            }
            if (cxgtVar.c == null) {
                str3 = String.valueOf(str3).concat(" clock");
            }
            if (cxgtVar.e == null) {
                str3 = String.valueOf(str3).concat(" loggerFactory");
            }
            if (cxgtVar.f == null) {
                str3 = String.valueOf(str3).concat(" facsClientFactory");
            }
            if (cxgtVar.d == null) {
                str3 = String.valueOf(str3).concat(" flags");
            }
            if (!str3.isEmpty()) {
                String valueOf = String.valueOf(str3);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            cqca.a = new cxhi(new cxgu(cxgtVar.a, cxgtVar.b, cxgtVar.c, cxgtVar.e, cxgtVar.f, cxgtVar.d));
            cqca cqcaVar = new cqca();
            Activity activity = this.c;
            bzox bzoxVar = new bzox(this, e, dskfVar, dsmhVar2);
            cqbw a = cqbv.a(activity, Integer.valueOf(dbsy.a.nextInt()), dsmhVar2, e, dskfVar);
            a.b(2);
            dbsk.t(cqca.c, "You should use ConsentFlow.setGrpcChannelFactory to set the desired network stack");
            if (dxyj.c() || dxyj.b()) {
                dbsk.t(cqca.a, "Did you call ConsentFlow.setGmsCoreFacsCacheFactory?");
            }
            deha.q(cqcaVar.b.a(activity, e, dskfVar, cqbs.a(activity), dsmhVar2, true), new cqbz(a, bzoxVar), dege.a);
            return;
        }
        throw new NullPointerException("Null context");
    }
}
