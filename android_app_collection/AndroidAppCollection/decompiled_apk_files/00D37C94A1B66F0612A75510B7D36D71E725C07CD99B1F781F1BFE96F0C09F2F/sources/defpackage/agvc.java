package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agvc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agvc implements yjc {
    private final /* synthetic */ int v;
    public static final /* synthetic */ agvc u = new agvc(20);
    public static final /* synthetic */ agvc t = new agvc(19);
    public static final /* synthetic */ agvc s = new agvc(18);
    public static final /* synthetic */ agvc r = new agvc(17);
    public static final /* synthetic */ agvc q = new agvc(16);
    public static final /* synthetic */ agvc p = new agvc(15);
    public static final /* synthetic */ agvc o = new agvc(14);
    public static final /* synthetic */ agvc n = new agvc(13);
    public static final /* synthetic */ agvc m = new agvc(12);
    public static final /* synthetic */ agvc l = new agvc(11);
    public static final /* synthetic */ agvc k = new agvc(10);
    public static final /* synthetic */ agvc j = new agvc(9);
    public static final /* synthetic */ agvc i = new agvc(8);
    public static final /* synthetic */ agvc h = new agvc(7);
    public static final /* synthetic */ agvc g = new agvc(6);
    public static final /* synthetic */ agvc f = new agvc(5);
    public static final /* synthetic */ agvc e = new agvc(4);
    public static final /* synthetic */ agvc d = new agvc(3);
    public static final /* synthetic */ agvc c = new agvc(2);
    public static final /* synthetic */ agvc b = new agvc(1);
    public static final /* synthetic */ agvc a = new agvc();

    private /* synthetic */ agvc() {
    }

    private /* synthetic */ agvc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.yjc
    public final Object a(Object obj, Object obj2) {
        awvj awvjVar;
        switch (this.v) {
            case 0:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                arzg arzgVar = (arzg) aopaVar.instance;
                aroy aroyVar = (aroy) ((aopa) obj2).mo39build();
                arzg arzgVar2 = arzg.a;
                aroyVar.getClass();
                arzgVar.c = aroyVar;
                arzgVar.b |= 1;
                return aopaVar;
            case 1:
                aopa aopaVar2 = (aopa) obj2;
                amzs it = ((yvg) obj).a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (str.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount")) {
                        aopaVar2.bs(str, ((Integer) entry.getValue()).intValue());
                    } else if (str.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance")) {
                        aopaVar2.bt(str, ((Integer) entry.getValue()).intValue());
                    } else {
                        aopaVar2.bu(str, ((Boolean) entry.getValue()).booleanValue());
                    }
                }
                return aopaVar2;
            case 2:
                aopa aopaVar3 = (aopa) obj;
                aopaVar3.copyOnWrite();
                aryo aryoVar = (aryo) aopaVar3.instance;
                aroy aroyVar2 = (aroy) ((aopa) obj2).mo39build();
                aryo aryoVar2 = aryo.a;
                aroyVar2.getClass();
                aryoVar.c = aroyVar2;
                aryoVar.b |= 1;
                return aopaVar3;
            case 3:
                aopa aopaVar4 = (aopa) obj;
                aopaVar4.copyOnWrite();
                aryr aryrVar = (aryr) aopaVar4.instance;
                aroy aroyVar3 = (aroy) ((aopa) obj2).mo39build();
                aryr aryrVar2 = aryr.a;
                aroyVar3.getClass();
                aryrVar.c = aroyVar3;
                aryrVar.b |= 1;
                return aopaVar4;
            case 4:
                aopa aopaVar5 = (aopa) obj;
                aopaVar5.copyOnWrite();
                atsn atsnVar = (atsn) aopaVar5.instance;
                aroy aroyVar4 = (aroy) ((aopa) obj2).mo39build();
                atsn atsnVar2 = atsn.a;
                aroyVar4.getClass();
                atsnVar.c = aroyVar4;
                atsnVar.b |= 1;
                return aopaVar5;
            case 5:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                for (Map.Entry entry2 : Collections.unmodifiableMap(((awvb) obj2).d).entrySet()) {
                    String q2 = zhn.q("offline_auto_offline_time_%s", (String) entry2.getKey());
                    awuz awuzVar = (awuz) entry2.getValue();
                    if (!awuz.a.equals(awuzVar)) {
                        editor.putLong(q2, awuzVar.c);
                    } else {
                        editor.remove(q2);
                    }
                }
                return editor;
            case 6:
                aopa mo52toBuilder = ((awvc) obj).mo52toBuilder();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                mo52toBuilder.copyOnWrite();
                awvc awvcVar = (awvc) mo52toBuilder.instance;
                awvcVar.b |= 4;
                awvcVar.e = booleanValue;
                return (awvc) mo52toBuilder.mo39build();
            case 7:
                aopa mo52toBuilder2 = ((awvc) obj).mo52toBuilder();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                mo52toBuilder2.copyOnWrite();
                awvc awvcVar2 = (awvc) mo52toBuilder2.instance;
                awvcVar2.b |= 2;
                awvcVar2.d = booleanValue2;
                return (awvc) mo52toBuilder2.mo39build();
            case 8:
                aopa mo52toBuilder3 = ((awvc) obj).mo52toBuilder();
                aopa createBuilder = aooo.a.createBuilder();
                long parseLong = Long.parseLong((String) obj2);
                createBuilder.copyOnWrite();
                ((aooo) createBuilder.instance).b = parseLong;
                mo52toBuilder3.copyOnWrite();
                awvc awvcVar3 = (awvc) mo52toBuilder3.instance;
                aooo aoooVar = (aooo) createBuilder.mo39build();
                aoooVar.getClass();
                awvcVar3.c = aoooVar;
                awvcVar3.b |= 1;
                return (awvc) mo52toBuilder3.mo39build();
            case 9:
                aopa aopaVar6 = (aopa) obj;
                aopaVar6.copyOnWrite();
                asdc asdcVar = (asdc) aopaVar6.instance;
                aroy aroyVar5 = (aroy) ((aopa) obj2).mo39build();
                asdc asdcVar2 = asdc.a;
                aroyVar5.getClass();
                asdcVar.c = aroyVar5;
                asdcVar.b |= 1;
                return aopaVar6;
            case 10:
                aopa aopaVar7 = (aopa) obj;
                aopaVar7.copyOnWrite();
                asag asagVar = (asag) aopaVar7.instance;
                aroy aroyVar6 = (aroy) ((aopa) obj2).mo39build();
                asag asagVar2 = asag.a;
                aroyVar6.getClass();
                asagVar.c = aroyVar6;
                asagVar.b |= 1;
                return aopaVar7;
            case 11:
                aopa aopaVar8 = (aopa) obj2;
                amzs it2 = ((yvg) obj).a.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    if (aiow.f((String) entry3.getKey())) {
                        aopaVar8.bw((String) entry3.getKey(), entry3.getValue() == null ? false : ((Boolean) entry3.getValue()).booleanValue());
                    } else {
                        aopaVar8.bx((String) entry3.getKey(), entry3.getValue() == null ? 0L : ((Long) entry3.getValue()).longValue());
                    }
                }
                return aopaVar8;
            case 12:
                aopa mo52toBuilder4 = ((awvj) obj).mo52toBuilder();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                mo52toBuilder4.copyOnWrite();
                awvj awvjVar2 = (awvj) mo52toBuilder4.instance;
                awvjVar2.b |= 1;
                awvjVar2.d = booleanValue3;
                return (awvj) mo52toBuilder4.mo39build();
            case 13:
                awvj awvjVar3 = (awvj) obj;
                try {
                    long parseLong2 = Long.parseLong((String) obj2);
                    if (awvjVar3 == null) {
                        aopa createBuilder2 = awvj.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awvj awvjVar4 = (awvj) createBuilder2.instance;
                        awvjVar4.b |= 2;
                        awvjVar4.e = parseLong2;
                        awvjVar = (awvj) createBuilder2.mo39build();
                    } else {
                        aopa mo52toBuilder5 = awvjVar3.mo52toBuilder();
                        mo52toBuilder5.copyOnWrite();
                        awvj awvjVar5 = (awvj) mo52toBuilder5.instance;
                        awvjVar5.b |= 2;
                        awvjVar5.e = parseLong2;
                        awvjVar = (awvj) mo52toBuilder5.mo39build();
                    }
                    return awvjVar;
                } catch (NumberFormatException e2) {
                    zep.d("Wrong custom interval string was set.", e2);
                    return awvjVar3;
                }
            case 14:
                aopa aopaVar9 = (aopa) obj;
                aopaVar9.copyOnWrite();
                aseo aseoVar = (aseo) aopaVar9.instance;
                aroy aroyVar7 = (aroy) ((aopa) obj2).mo39build();
                aseo aseoVar2 = aseo.a;
                aroyVar7.getClass();
                aseoVar.c = aroyVar7;
                aseoVar.b |= 1;
                return aopaVar9;
            case 15:
                aopa aopaVar10 = (aopa) obj;
                float floatValue = ((Float) obj2).floatValue();
                aopaVar10.copyOnWrite();
                awvl awvlVar = (awvl) aopaVar10.instance;
                awvl awvlVar2 = awvl.a;
                awvlVar.b |= 2;
                awvlVar.d = floatValue;
                return aopaVar10;
            case 16:
                aopa aopaVar11 = (aopa) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                aopaVar11.copyOnWrite();
                awvl awvlVar3 = (awvl) aopaVar11.instance;
                awvl awvlVar4 = awvl.a;
                awvlVar3.b |= 8;
                awvlVar3.f = floatValue2;
                return aopaVar11;
            case 17:
                aopa aopaVar12 = (aopa) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                aopaVar12.copyOnWrite();
                awvl awvlVar5 = (awvl) aopaVar12.instance;
                awvl awvlVar6 = awvl.a;
                awvlVar5.b |= 32;
                awvlVar5.h = floatValue3;
                return aopaVar12;
            case 18:
                aopa aopaVar13 = (aopa) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                aopaVar13.copyOnWrite();
                awvl awvlVar7 = (awvl) aopaVar13.instance;
                awvl awvlVar8 = awvl.a;
                awvlVar7.b |= 16;
                awvlVar7.g = floatValue4;
                return aopaVar13;
            case 19:
                aopa aopaVar14 = (aopa) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                aopaVar14.copyOnWrite();
                awvl awvlVar9 = (awvl) aopaVar14.instance;
                awvl awvlVar10 = awvl.a;
                awvlVar9.b |= 1;
                awvlVar9.c = floatValue5;
                return aopaVar14;
            default:
                aopa aopaVar15 = (aopa) obj;
                float floatValue6 = ((Float) obj2).floatValue();
                aopaVar15.copyOnWrite();
                awvl awvlVar11 = (awvl) aopaVar15.instance;
                awvl awvlVar12 = awvl.a;
                awvlVar11.b |= 4;
                awvlVar11.e = floatValue6;
                return aopaVar15;
        }
    }
}
