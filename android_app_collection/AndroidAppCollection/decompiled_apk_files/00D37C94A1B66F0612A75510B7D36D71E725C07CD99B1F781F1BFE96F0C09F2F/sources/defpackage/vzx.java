package defpackage;

import com.google.android.libraries.backup.Backup;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vzx  reason: default package */
/* loaded from: classes4.dex */
public final class vzx {
    @Backup
    public static final String ACCOUNT_NAME = "user_account";
    @Backup
    public static final String DATASYNC_ID = "datasync_id";
    @Backup
    public static final String DELEGATION_CONTEXT = "delegation_context";
    @Backup
    public static final String DELEGTATION_TYPE = "delegation_type";
    @Backup
    public static final String EXTERNAL_ID = "user_identity_id";
    @Backup
    public static final String IDENTITY_VERSION = "identity_version";
    @Backup
    public static final String IS_GRIFFIN = "HAS_GRIFFIN_POLICY";
    @Backup
    public static final String IS_INCOGNITO = "IS_INCOGNITO_SESSION_IDENTITY";
    @Backup
    public static final String IS_TEENACORN = "IS_CHILD_ACCOUNT_OVER_13";
    @Backup
    public static final String IS_UNICORN = "IS_UNICORN_CHILD_ACCOUNT";
    @Backup
    public static final String NEXT_INCOGNITO_SESSION_INDEX = "NEXT_INCOGNITO_SESSION_INDEX";
    @Backup
    public static final String PAGE_ID = "user_identity";
    @Backup
    public static final String PERSONA_ACCOUNT = "persona_account";
    @Backup
    public static final String USERNAME = "username";
    @Backup
    public static final String USER_SIGNED_OUT = "user_signed_out";

    public static boolean a(aacz aaczVar) {
        aowu aowuVar = aaczVar.b().j;
        if (aowuVar == null) {
            aowuVar = aowu.a;
        }
        return aowuVar.b;
    }

    public static String b(xdu xduVar) {
        StringBuilder sb = new StringBuilder(xduVar.c().name());
        sb.append(" ");
        c(sb, xduVar.d);
        c(sb, xduVar.e);
        c(sb, xduVar.f);
        return sb.toString();
    }

    public static void c(StringBuilder sb, List list) {
        int i = 0;
        while (true) {
            amxx amxxVar = (amxx) list;
            if (i < amxxVar.c) {
                sb.append(((xek) list.get(i)).b().name());
                i++;
                if (i == amxxVar.c) {
                    sb.append(";");
                } else {
                    sb.append(",");
                }
            } else {
                return;
            }
        }
    }

    public static void d(Map map, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14) {
        map.put(apcf.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED, azqbVar);
        map.put(apcf.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED, azqbVar);
        map.put(apcf.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED, azqbVar);
        map.put(apcf.TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_LAYOUT_ID_EXITED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_SLOT_ID_EXITED, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE, azqbVar3);
        map.put(apcf.TRIGGER_TYPE_IN_MEDIA_TIME_RANGE_AND_SLOT_FULFILLED_NON_EMPTY, azqbVar3);
        map.put(apcf.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED, azqbVar3);
        map.put(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, azqbVar7);
        map.put(apcf.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED, azqbVar8);
        map.put(apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, azqbVar9);
        map.put(apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, azqbVar9);
        map.put(apcf.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED, azqbVar10);
        map.put(apcf.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED, azqbVar11);
        map.put(apcf.TRIGGER_TYPE_SKIP_REQUESTED, azqbVar12);
        map.put(apcf.TRIGGER_TYPE_ON_LOADED_DIFFERENT_VIDEO_ID_THAN_EXPECTED, azqbVar7);
        map.put(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_SURVEY_SUBMITTED, azqbVar13);
        map.put(apcf.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED, azqbVar7);
        map.put(apcf.TRIGGER_TYPE_LAYOUT_EXITED_FOR_OTHER_REASON, azqbVar2);
        map.put(apcf.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR, azqbVar4);
        map.put(apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED, azqbVar5);
        map.put(apcf.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED, azqbVar5);
        map.put(apcf.TRIGGER_TYPE_MEDIA_PAUSED, azqbVar6);
        map.put(apcf.TRIGGER_TYPE_MEDIA_RESUMED, azqbVar6);
        map.put(apcf.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, azqbVar6);
        map.put(apcf.TRIGGER_TYPE_CLOSE_REQUESTED, azqbVar6);
        map.put(apcf.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED, azqbVar14);
    }
}
