package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fdj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdj implements yjc {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fdj u = new fdj(20);
    public static final /* synthetic */ fdj t = new fdj(19);
    public static final /* synthetic */ fdj s = new fdj(18);
    public static final /* synthetic */ fdj r = new fdj(17);
    public static final /* synthetic */ fdj q = new fdj(16);
    public static final /* synthetic */ fdj p = new fdj(15);
    public static final /* synthetic */ fdj o = new fdj(14);
    public static final /* synthetic */ fdj n = new fdj(13);
    public static final /* synthetic */ fdj m = new fdj(12);
    public static final /* synthetic */ fdj l = new fdj(11);
    public static final /* synthetic */ fdj k = new fdj(10);
    public static final /* synthetic */ fdj j = new fdj(9);
    public static final /* synthetic */ fdj i = new fdj(8);
    public static final /* synthetic */ fdj h = new fdj(7);
    public static final /* synthetic */ fdj g = new fdj(6);
    public static final /* synthetic */ fdj f = new fdj(5);
    public static final /* synthetic */ fdj e = new fdj(4);
    public static final /* synthetic */ fdj d = new fdj(3);
    public static final /* synthetic */ fdj c = new fdj(2);
    public static final /* synthetic */ fdj b = new fdj(1);
    public static final /* synthetic */ fdj a = new fdj();

    private /* synthetic */ fdj() {
    }

    private /* synthetic */ fdj(int i2) {
        this.v = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r12v63, types: [ljp, aopi] */
    @Override // defpackage.yjc
    public final Object a(Object obj, Object obj2) {
        Object obj3;
        switch (this.v) {
            case 0:
                obj3 = (SharedPreferences.Editor) obj;
                fda fdaVar = (fda) obj2;
                amvn amvnVar = fdl.a;
                if ((fdaVar.b & 1) != 0) {
                    obj3.putString("cross_device_offline_device_name", fdaVar.c);
                }
                if ((fdaVar.b & 2) != 0) {
                    obj3.putBoolean("cross_device_offline_device_state", fdaVar.d);
                }
                if ((fdaVar.b & 4) != 0) {
                    obj3.putBoolean("offline_has_shown_1080p_option", fdaVar.e);
                }
                if ((fdaVar.b & 8) != 0) {
                    obj3.putBoolean("offline_has_shown_1080p_tooltip", fdaVar.f);
                }
                if ((fdaVar.b & 16) != 0) {
                    obj3.putBoolean("offline_has_shown_download_expiration_disclaimer", fdaVar.g);
                }
                if ((fdaVar.b & 32) == 0) {
                    obj3.remove("offline_stream_snackbar_impressions");
                } else {
                    obj3.putLong("offline_stream_snackbar_impressions", fdaVar.h);
                }
                if ((fdaVar.b & 64) == 0) {
                    obj3.remove("offline_stream_snackbar_last_shown");
                } else {
                    obj3.putLong("offline_stream_snackbar_last_shown", fdaVar.i);
                }
                if ((fdaVar.b & 128) != 0) {
                    obj3.putBoolean("offline_recs_enabled", fdaVar.k);
                }
                if ((fdaVar.b & 256) != 0) {
                    obj3.putLong("offline_quality_preference_updated_timestamp_millis", fdaVar.l);
                }
                if ((fdaVar.b & 512) != 0) {
                    obj3.putLong("last_downloads_page_usage_seconds", fdaVar.m);
                }
                for (Map.Entry entry : Collections.unmodifiableMap(fdaVar.j).entrySet()) {
                    String str = (String) entry.getKey();
                    String q2 = zhn.q("offline_access_enabled%s", str);
                    String q3 = zhn.q("offline_access_updated_at%s", str);
                    fcv fcvVar = (fcv) entry.getValue();
                    if (!fcv.a.equals(fcvVar)) {
                        obj3.putBoolean(q2, fcvVar.c);
                        obj3.putLong(q3, fcvVar.d);
                    } else {
                        obj3.remove(q2);
                        obj3.remove(q3);
                    }
                }
                break;
            case 1:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                fcy fcyVar = (fcy) obj2;
                amvn amvnVar2 = fdl.a;
                if ((fcyVar.b & 2) != 0) {
                    editor.putBoolean(fcw.OFFLINE_FIRST_ADD_TOOLTIP, fcyVar.d);
                }
                if ((fcyVar.b & 1) != 0) {
                    editor.putBoolean(fcw.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, fcyVar.c);
                }
                if ((fcyVar.b & 4) != 0) {
                    editor.putBoolean(fcw.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, fcyVar.e);
                }
                if ((fcyVar.b & 8) != 0) {
                    editor.putLong(fcw.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, fcyVar.f);
                }
                int[] o2 = ntr.o();
                int i2 = 0;
                while (true) {
                    long j2 = 0;
                    if (i2 < 2) {
                        int i3 = o2[i2];
                        String e2 = fdl.e(i3);
                        int i4 = i3 - 1;
                        if (i3 != 0) {
                            if (fcyVar.a(i4)) {
                                aoqp aoqpVar = fcyVar.g;
                                Integer valueOf = Integer.valueOf(i4);
                                if (aoqpVar.containsKey(valueOf)) {
                                    j2 = ((Long) aoqpVar.get(valueOf)).longValue();
                                }
                                editor.putLong(e2, j2);
                            } else {
                                editor.remove(e2);
                            }
                            i2++;
                        } else {
                            throw null;
                        }
                    } else {
                        if (fcyVar.a(0)) {
                            aoqp aoqpVar2 = fcyVar.g;
                            if (aoqpVar2.containsKey(0)) {
                                j2 = ((Long) aoqpVar2.get(0)).longValue();
                            }
                            editor.putLong(fcw.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS, j2);
                        }
                        return editor;
                    }
                }
            case 2:
                aopa aopaVar = (aopa) obj2;
                amvn amvnVar3 = fdl.a;
                amzs it = ((yvg) obj).a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object value = entry2.getValue();
                    if (value != null) {
                        if (fcw.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS.equals(entry2.getKey())) {
                            aopaVar.g(0, ((Long) value).longValue());
                        } else {
                            try {
                                aopaVar.g(Integer.parseInt(fdl.b("offline_last_scheduled_ad_hoc_refresh_time_millis_", (String) entry2.getKey())), ((Long) value).longValue());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
                return aopaVar;
            case 3:
                aopa aopaVar2 = (aopa) obj2;
                amvn amvnVar4 = fdl.a;
                amzs it2 = ((yvg) obj).a.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    Object value2 = entry3.getValue();
                    if (value2 != null) {
                        if (((String) entry3.getKey()).startsWith("offline_access_enabled")) {
                            String b2 = fdl.b("offline_access_enabled", (String) entry3.getKey());
                            aopa mo52toBuilder = aopaVar2.h(b2, fcv.a).mo52toBuilder();
                            boolean booleanValue = ((Boolean) value2).booleanValue();
                            mo52toBuilder.copyOnWrite();
                            fcv fcvVar2 = (fcv) mo52toBuilder.instance;
                            fcvVar2.b |= 1;
                            fcvVar2.c = booleanValue;
                            aopaVar2.i(b2, (fcv) mo52toBuilder.mo39build());
                        } else {
                            String b3 = fdl.b("offline_access_updated_at", (String) entry3.getKey());
                            aopa mo52toBuilder2 = aopaVar2.h(b3, fcv.a).mo52toBuilder();
                            long longValue = ((Long) value2).longValue();
                            mo52toBuilder2.copyOnWrite();
                            fcv fcvVar3 = (fcv) mo52toBuilder2.instance;
                            fcvVar3.b |= 2;
                            fcvVar3.d = longValue;
                            aopaVar2.i(b3, (fcv) mo52toBuilder2.mo39build());
                        }
                    }
                }
                return aopaVar2;
            case 4:
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                fgl fglVar = (fgl) obj2;
                if ((fglVar.b & 1) != 0) {
                    editor2.putInt(etk.AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING, fglVar.c);
                }
                return editor2;
            case 5:
                aopa aopaVar3 = (aopa) obj2;
                amzs it3 = ((yvg) obj).a.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it3.next();
                    String str2 = (String) entry4.getKey();
                    List h2 = amqf.c(":").h(str2);
                    ampq j3 = h2.isEmpty() ? amon.a : ampq.j((String) h2.get(0));
                    if (j3.h()) {
                        String str3 = (String) j3.c();
                        fgp fgpVar = fgp.a;
                        Map unmodifiableMap = Collections.unmodifiableMap(((fgu) aopaVar3.instance).f);
                        if (unmodifiableMap.containsKey(str3)) {
                            fgpVar = (fgp) unmodifiableMap.get(str3);
                        }
                        aopa mo52toBuilder3 = fgpVar.mo52toBuilder();
                        if (ezv.d(str2)) {
                            boolean booleanValue2 = entry4.getValue() == null ? false : ((Boolean) entry4.getValue()).booleanValue();
                            mo52toBuilder3.copyOnWrite();
                            fgp fgpVar2 = (fgp) mo52toBuilder3.instance;
                            fgpVar2.b |= 1;
                            fgpVar2.c = booleanValue2;
                        } else {
                            int intValue = entry4.getValue() == null ? 0 : ((Integer) entry4.getValue()).intValue();
                            mo52toBuilder3.copyOnWrite();
                            fgp fgpVar3 = (fgp) mo52toBuilder3.instance;
                            fgpVar3.b |= 2;
                            fgpVar3.d = intValue;
                        }
                        aopaVar3.j((String) j3.c(), (fgp) mo52toBuilder3.mo39build());
                    }
                }
                return aopaVar3;
            case 6:
                SharedPreferences.Editor editor3 = (SharedPreferences.Editor) obj;
                fgu fguVar = (fgu) obj2;
                String[] strArr = fgs.a;
                if ((fguVar.b & 1) != 0) {
                    editor3.putBoolean("snap_zoom_initially_zoomed", fguVar.c);
                }
                if ((fguVar.b & 2) != 0) {
                    editor3.putBoolean(etk.VIDEO_ZOOM_USER_EDUCATION_SHOWN, fguVar.d);
                }
                if ((fguVar.b & 4) != 0) {
                    editor3.putInt("inline_global_play_pause", fguVar.e);
                }
                if (fguVar.f.size() > 0) {
                    for (Map.Entry entry5 : Collections.unmodifiableMap(fguVar.f).entrySet()) {
                        String str4 = (String) entry5.getKey();
                        fgp fgpVar4 = (fgp) entry5.getValue();
                        if ((fgpVar4.b & 1) != 0) {
                            editor3.putBoolean(ezv.c("bollard_enabled", str4), fgpVar4.c);
                        }
                        if ((fgpVar4.b & 2) != 0) {
                            editor3.putInt(ezv.c("bollard_frequency_mins", str4), fgpVar4.d);
                        }
                    }
                }
                return editor3;
            case 7:
                return gfy.a((vlq) obj, (gft) obj2);
            case 8:
                aopa mo52toBuilder4 = ((gft) obj).mo52toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                mo52toBuilder4.copyOnWrite();
                gft gftVar = (gft) mo52toBuilder4.instance;
                gftVar.b |= 4;
                gftVar.e = booleanValue3;
                mo52toBuilder4.copyOnWrite();
                gft gftVar2 = (gft) mo52toBuilder4.instance;
                gftVar2.b |= 32;
                gftVar2.h = true;
                return (gft) mo52toBuilder4.mo39build();
            case 9:
                String str5 = (String) obj2;
                aopa mo52toBuilder5 = ((gft) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                gft gftVar3 = (gft) mo52toBuilder5.instance;
                str5.getClass();
                gftVar3.b |= 8;
                gftVar3.f = str5;
                mo52toBuilder5.copyOnWrite();
                gft gftVar4 = (gft) mo52toBuilder5.instance;
                gftVar4.b |= 2;
                gftVar4.d = true;
                return (gft) mo52toBuilder5.mo39build();
            case 10:
                aopa aopaVar4 = (aopa) obj2;
                amzs it4 = ((yvg) obj).a.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it4.next();
                    aopaVar4.k((String) entry6.getKey(), ((Long) entry6.getValue()).longValue());
                }
                return aopaVar4;
            case 11:
                aopa aopaVar5 = (aopa) obj;
                aopa aopaVar6 = (aopa) obj2;
                aopaVar5.copyOnWrite();
                artu artuVar = (artu) aopaVar5.instance;
                aroy aroyVar = (aroy) aopaVar6.mo39build();
                artu artuVar2 = artu.a;
                aroyVar.getClass();
                artuVar.c = aroyVar;
                artuVar.b |= 1;
                asag asagVar = ((artu) aopaVar5.instance).e;
                if (asagVar == null) {
                    asagVar = asag.a;
                }
                aopa mo52toBuilder6 = asagVar.mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                asag asagVar2 = (asag) mo52toBuilder6.instance;
                aroy aroyVar2 = (aroy) aopaVar6.mo39build();
                aroyVar2.getClass();
                asagVar2.c = aroyVar2;
                asagVar2.b |= 1;
                aopaVar5.copyOnWrite();
                artu artuVar3 = (artu) aopaVar5.instance;
                asag asagVar3 = (asag) mo52toBuilder6.mo39build();
                asagVar3.getClass();
                artuVar3.e = asagVar3;
                artuVar3.b |= 4;
                return aopaVar5;
            case 12:
                aopa aopaVar7 = (aopa) obj;
                aopaVar7.copyOnWrite();
                artx artxVar = (artx) aopaVar7.instance;
                aroy aroyVar3 = (aroy) ((aopa) obj2).mo39build();
                artx artxVar2 = artx.a;
                aroyVar3.getClass();
                artxVar.e = aroyVar3;
                artxVar.b |= 1;
                return aopaVar7;
            case 13:
                aopa aopaVar8 = (aopa) obj;
                aopaVar8.copyOnWrite();
                asxz asxzVar = (asxz) aopaVar8.instance;
                aroy aroyVar4 = (aroy) ((aopa) obj2).mo39build();
                asxz asxzVar2 = asxz.a;
                aroyVar4.getClass();
                asxzVar.c = aroyVar4;
                asxzVar.b |= 1;
                return aopaVar8;
            case 14:
                String str6 = (String) obj2;
                aopa createBuilder = llr.a.createBuilder();
                createBuilder.copyOnWrite();
                llr llrVar = (llr) createBuilder.instance;
                str6.getClass();
                llrVar.b |= 1;
                llrVar.c = str6;
                llr llrVar2 = (llr) createBuilder.mo39build();
                aopa mo52toBuilder7 = ((llq) obj).mo52toBuilder();
                mo52toBuilder7.copyOnWrite();
                llq llqVar = (llq) mo52toBuilder7.instance;
                llrVar2.getClass();
                llqVar.c = llrVar2;
                llqVar.b |= 1;
                return (llq) mo52toBuilder7.mo39build();
            case 15:
                int b4 = zgh.b((String) obj2, -1);
                aopa mo52toBuilder8 = ((fgu) obj).mo52toBuilder();
                mo52toBuilder8.copyOnWrite();
                fgu fguVar2 = (fgu) mo52toBuilder8.instance;
                fguVar2.b |= 4;
                fguVar2.e = b4;
                return (fgu) mo52toBuilder8.mo39build();
            case 16:
                aopa mo52toBuilder9 = ((fgu) obj).mo52toBuilder();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                mo52toBuilder9.copyOnWrite();
                fgu fguVar3 = (fgu) mo52toBuilder9.instance;
                fguVar3.b |= 1;
                fguVar3.c = booleanValue4;
                return (fgu) mo52toBuilder9.mo39build();
            case 17:
                aopa mo52toBuilder10 = ((kkb) obj).mo52toBuilder();
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                mo52toBuilder10.copyOnWrite();
                kkb kkbVar = (kkb) mo52toBuilder10.instance;
                kkbVar.b |= 1;
                kkbVar.c = booleanValue5;
                return (kkb) mo52toBuilder10.mo39build();
            case 18:
                long b5 = babq.b((String) obj2);
                aopa mo52toBuilder11 = ((kkb) obj).mo52toBuilder();
                mo52toBuilder11.copyOnWrite();
                kkb kkbVar2 = (kkb) mo52toBuilder11.instance;
                kkbVar2.b |= 2;
                kkbVar2.d = b5;
                return (kkb) mo52toBuilder11.mo39build();
            case 19:
                aopa mo52toBuilder12 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                mo52toBuilder12.copyOnWrite();
                ljp ljpVar = (ljp) mo52toBuilder12.instance;
                ljpVar.b |= 512;
                ljpVar.l = booleanValue6;
                return (ljp) mo52toBuilder12.mo39build();
            default:
                Boolean bool = (Boolean) obj2;
                aopa mo52toBuilder13 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue7 = bool.booleanValue();
                mo52toBuilder13.copyOnWrite();
                ljp ljpVar2 = (ljp) mo52toBuilder13.instance;
                ljpVar2.b |= 8;
                ljpVar2.f = booleanValue7;
                obj3 = (ljp) mo52toBuilder13.mo39build();
                if (bool.booleanValue()) {
                    aopa mo52toBuilder14 = obj3.mo52toBuilder();
                    boolean z = obj3.g;
                    mo52toBuilder14.copyOnWrite();
                    ljp ljpVar3 = (ljp) mo52toBuilder14.instance;
                    ljpVar3.b |= 1024;
                    ljpVar3.m = z;
                    boolean z2 = obj3.h;
                    mo52toBuilder14.copyOnWrite();
                    ljp ljpVar4 = (ljp) mo52toBuilder14.instance;
                    ljpVar4.b |= 2048;
                    ljpVar4.n = z2;
                    boolean z3 = obj3.i;
                    mo52toBuilder14.copyOnWrite();
                    ljp ljpVar5 = (ljp) mo52toBuilder14.instance;
                    ljpVar5.b |= 4096;
                    ljpVar5.o = z3;
                    boolean z4 = obj3.j;
                    mo52toBuilder14.copyOnWrite();
                    ljp ljpVar6 = (ljp) mo52toBuilder14.instance;
                    ljpVar6.b |= 8192;
                    ljpVar6.p = z4;
                    boolean z5 = obj3.k;
                    mo52toBuilder14.copyOnWrite();
                    ljp ljpVar7 = (ljp) mo52toBuilder14.instance;
                    ljpVar7.b |= 16384;
                    ljpVar7.q = z5;
                    return (ljp) mo52toBuilder14.mo39build();
                }
                break;
        }
        return obj3;
    }
}
