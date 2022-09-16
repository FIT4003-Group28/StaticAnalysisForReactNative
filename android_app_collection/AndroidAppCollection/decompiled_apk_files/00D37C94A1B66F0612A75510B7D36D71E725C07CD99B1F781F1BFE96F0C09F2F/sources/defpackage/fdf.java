package defpackage;
/* compiled from: PG */
/* renamed from: fdf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdf implements zdq {
    public final /* synthetic */ ampt a;
    public final /* synthetic */ yuy b;
    private final /* synthetic */ int c;

    public /* synthetic */ fdf(ampt amptVar, yuy yuyVar) {
        this.a = amptVar;
        this.b = yuyVar;
    }

    public /* synthetic */ fdf(ampt amptVar, yuy yuyVar, int i) {
        this.c = i;
        this.a = amptVar;
        this.b = yuyVar;
    }

    @Override // defpackage.zdq
    public final void a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ampt amptVar = this.a;
                yuy yuyVar = this.b;
                String str = (String) obj;
                amvn amvnVar = fdl.a;
                if (!amptVar.a(fcw.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED)) {
                    return;
                }
                boolean booleanValue = ((Boolean) yuyVar.a(fcw.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, false)).booleanValue();
                aopa aopaVar = (aopa) obj2;
                aopaVar.copyOnWrite();
                fcy fcyVar = (fcy) aopaVar.instance;
                fcy fcyVar2 = fcy.a;
                fcyVar.b |= 1;
                fcyVar.c = booleanValue;
                return;
            case 1:
                ampt amptVar2 = this.a;
                yuy yuyVar2 = this.b;
                String str2 = (String) obj;
                amvn amvnVar2 = eon.a;
                if (!amptVar2.a(str2)) {
                    return;
                }
                boolean booleanValue2 = ((Boolean) yuyVar2.a(str2, true)).booleanValue();
                aopa aopaVar2 = (aopa) obj2;
                aopaVar2.copyOnWrite();
                eof eofVar = (eof) aopaVar2.instance;
                eof eofVar2 = eof.a;
                eofVar.b |= 2;
                eofVar.d = !booleanValue2;
                return;
            case 2:
                ampt amptVar3 = this.a;
                yuy yuyVar3 = this.b;
                String str3 = (String) obj;
                amvn amvnVar3 = fdl.a;
                if (!amptVar3.a(fcw.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS)) {
                    return;
                }
                long longValue = ((Long) yuyVar3.a(fcw.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, 0L)).longValue();
                aopa aopaVar3 = (aopa) obj2;
                aopaVar3.copyOnWrite();
                fcy fcyVar3 = (fcy) aopaVar3.instance;
                fcy fcyVar4 = fcy.a;
                fcyVar3.b |= 8;
                fcyVar3.f = longValue;
                return;
            case 3:
                ampt amptVar4 = this.a;
                yuy yuyVar4 = this.b;
                String str4 = (String) obj;
                amvn amvnVar4 = fdl.a;
                if (!amptVar4.a("cross_device_offline_device_name")) {
                    return;
                }
                String str5 = (String) yuyVar4.a("cross_device_offline_device_name", "");
                aopa aopaVar4 = (aopa) obj2;
                aopaVar4.copyOnWrite();
                fda fdaVar = (fda) aopaVar4.instance;
                fda fdaVar2 = fda.a;
                str5.getClass();
                fdaVar.b |= 1;
                fdaVar.c = str5;
                return;
            case 4:
                ampt amptVar5 = this.a;
                yuy yuyVar5 = this.b;
                String str6 = (String) obj;
                amvn amvnVar5 = fdl.a;
                if (!amptVar5.a("cross_device_offline_device_state")) {
                    return;
                }
                boolean booleanValue3 = ((Boolean) yuyVar5.a("cross_device_offline_device_state", false)).booleanValue();
                aopa aopaVar5 = (aopa) obj2;
                aopaVar5.copyOnWrite();
                fda fdaVar3 = (fda) aopaVar5.instance;
                fda fdaVar4 = fda.a;
                fdaVar3.b |= 2;
                fdaVar3.d = booleanValue3;
                return;
            case 5:
                ampt amptVar6 = this.a;
                yuy yuyVar6 = this.b;
                String str7 = (String) obj;
                amvn amvnVar6 = fdl.a;
                if (!amptVar6.a("offline_has_shown_1080p_option")) {
                    return;
                }
                boolean booleanValue4 = ((Boolean) yuyVar6.a("offline_has_shown_1080p_option", false)).booleanValue();
                aopa aopaVar6 = (aopa) obj2;
                aopaVar6.copyOnWrite();
                fda fdaVar5 = (fda) aopaVar6.instance;
                fda fdaVar6 = fda.a;
                fdaVar5.b |= 4;
                fdaVar5.e = booleanValue4;
                return;
            case 6:
                ampt amptVar7 = this.a;
                yuy yuyVar7 = this.b;
                String str8 = (String) obj;
                amvn amvnVar7 = fdl.a;
                if (!amptVar7.a("offline_has_shown_1080p_tooltip")) {
                    return;
                }
                boolean booleanValue5 = ((Boolean) yuyVar7.a("offline_has_shown_1080p_tooltip", false)).booleanValue();
                aopa aopaVar7 = (aopa) obj2;
                aopaVar7.copyOnWrite();
                fda fdaVar7 = (fda) aopaVar7.instance;
                fda fdaVar8 = fda.a;
                fdaVar7.b |= 8;
                fdaVar7.f = booleanValue5;
                return;
            case 7:
                ampt amptVar8 = this.a;
                yuy yuyVar8 = this.b;
                String str9 = (String) obj;
                amvn amvnVar8 = fdl.a;
                if (!amptVar8.a("offline_has_shown_download_expiration_disclaimer")) {
                    return;
                }
                boolean booleanValue6 = ((Boolean) yuyVar8.a("offline_has_shown_download_expiration_disclaimer", false)).booleanValue();
                aopa aopaVar8 = (aopa) obj2;
                aopaVar8.copyOnWrite();
                fda fdaVar9 = (fda) aopaVar8.instance;
                fda fdaVar10 = fda.a;
                fdaVar9.b |= 16;
                fdaVar9.g = booleanValue6;
                return;
            case 8:
                ampt amptVar9 = this.a;
                yuy yuyVar9 = this.b;
                String str10 = (String) obj;
                amvn amvnVar9 = fdl.a;
                if (!amptVar9.a("offline_stream_snackbar_impressions")) {
                    return;
                }
                long longValue2 = ((Long) yuyVar9.a("offline_stream_snackbar_impressions", 0L)).longValue();
                aopa aopaVar9 = (aopa) obj2;
                aopaVar9.copyOnWrite();
                fda fdaVar11 = (fda) aopaVar9.instance;
                fda fdaVar12 = fda.a;
                fdaVar11.b |= 32;
                fdaVar11.h = longValue2;
                return;
            case 9:
                ampt amptVar10 = this.a;
                yuy yuyVar10 = this.b;
                String str11 = (String) obj;
                amvn amvnVar10 = fdl.a;
                if (!amptVar10.a("offline_stream_snackbar_last_shown")) {
                    return;
                }
                long longValue3 = ((Long) yuyVar10.a("offline_stream_snackbar_last_shown", 0L)).longValue();
                aopa aopaVar10 = (aopa) obj2;
                aopaVar10.copyOnWrite();
                fda fdaVar13 = (fda) aopaVar10.instance;
                fda fdaVar14 = fda.a;
                fdaVar13.b |= 64;
                fdaVar13.i = longValue3;
                return;
            case 10:
                ampt amptVar11 = this.a;
                yuy yuyVar11 = this.b;
                String str12 = (String) obj;
                amvn amvnVar11 = fdl.a;
                if (!amptVar11.a("offline_recs_enabled")) {
                    return;
                }
                boolean booleanValue7 = ((Boolean) yuyVar11.a("offline_recs_enabled", true)).booleanValue();
                aopa aopaVar11 = (aopa) obj2;
                aopaVar11.copyOnWrite();
                fda fdaVar15 = (fda) aopaVar11.instance;
                fda fdaVar16 = fda.a;
                fdaVar15.b |= 128;
                fdaVar15.k = booleanValue7;
                return;
            case 11:
                ampt amptVar12 = this.a;
                yuy yuyVar12 = this.b;
                String str13 = (String) obj;
                amvn amvnVar12 = fdl.a;
                if (!amptVar12.a("offline_quality_preference_updated_timestamp_millis")) {
                    return;
                }
                long longValue4 = ((Long) yuyVar12.a("offline_quality_preference_updated_timestamp_millis", 0L)).longValue();
                aopa aopaVar12 = (aopa) obj2;
                aopaVar12.copyOnWrite();
                fda fdaVar17 = (fda) aopaVar12.instance;
                fda fdaVar18 = fda.a;
                fdaVar17.b |= 256;
                fdaVar17.l = longValue4;
                return;
            case 12:
                ampt amptVar13 = this.a;
                yuy yuyVar13 = this.b;
                String str14 = (String) obj;
                amvn amvnVar13 = fdl.a;
                if (!amptVar13.a("last_downloads_page_usage_seconds")) {
                    return;
                }
                long longValue5 = ((Long) yuyVar13.a("last_downloads_page_usage_seconds", 0L)).longValue();
                aopa aopaVar13 = (aopa) obj2;
                aopaVar13.copyOnWrite();
                fda fdaVar19 = (fda) aopaVar13.instance;
                fda fdaVar20 = fda.a;
                fdaVar19.b |= 512;
                fdaVar19.m = longValue5;
                return;
            case 13:
                ampt amptVar14 = this.a;
                yuy yuyVar14 = this.b;
                String str15 = (String) obj;
                amvn amvnVar14 = nwn.a;
                if (!amptVar14.a(str15)) {
                    return;
                }
                long longValue6 = ((Long) yuyVar14.a(str15, 0L)).longValue();
                aopa aopaVar14 = (aopa) obj2;
                aopaVar14.copyOnWrite();
                nwo nwoVar = (nwo) aopaVar14.instance;
                nwo nwoVar2 = nwo.a;
                nwoVar.b |= 1;
                nwoVar.c = longValue6;
                return;
            default:
                ampt amptVar15 = this.a;
                yuy yuyVar15 = this.b;
                String str16 = (String) obj;
                amvn amvnVar15 = nwn.a;
                if (!amptVar15.a(str16)) {
                    return;
                }
                int intValue = ((Integer) yuyVar15.a(str16, 0)).intValue();
                aopa aopaVar15 = (aopa) obj2;
                aopaVar15.copyOnWrite();
                nwo nwoVar3 = (nwo) aopaVar15.instance;
                nwo nwoVar4 = nwo.a;
                nwoVar3.b |= 2;
                nwoVar3.d = intValue;
                return;
        }
    }
}
