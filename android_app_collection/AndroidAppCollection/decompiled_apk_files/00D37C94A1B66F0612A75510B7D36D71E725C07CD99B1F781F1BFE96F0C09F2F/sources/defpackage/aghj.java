package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aghj  reason: default package */
/* loaded from: classes.dex */
public final class aghj implements agvr {
    public final azqb a;
    public final agis b;
    private final azqb c;
    private final Executor d;
    private final ahdf e;

    public aghj(azqb azqbVar, Executor executor, azqb azqbVar2, agis agisVar, ahdf ahdfVar) {
        this.c = azqbVar;
        executor.getClass();
        this.d = executor;
        this.a = azqbVar2;
        this.b = agisVar;
        this.e = ahdfVar;
    }

    @Override // defpackage.agvr
    public final int a(String str, String str2) {
        agkx c;
        ylr.b();
        if (this.b.z() && (c = ((aglj) this.a.get()).h.c(str, str2)) != null) {
            return c.g;
        }
        return 0;
    }

    @Override // defpackage.agvr
    public final int b(String str) {
        agkv a;
        ylr.b();
        if (this.b.z() && (a = ((aglj) this.a.get()).i.a(str)) != null) {
            return a.a;
        }
        return 0;
    }

    @Override // defpackage.agvr
    public final InstreamAdImpl c(String str, String str2) {
        String str3;
        ylr.b();
        if (!this.e.e() && this.b.z()) {
            aglj agljVar = (aglj) this.a.get();
            str.getClass();
            str2.getClass();
            zgh.m(str);
            try {
                agkx c = agljVar.h.c(str, str2);
                if (c != null && (str3 = c.c) != null) {
                    agqm J2 = agljVar.J(str3, null);
                    agql agqlVar = J2 != null ? J2.a : null;
                    if (agqlVar == null || !agqlVar.i()) {
                        return null;
                    }
                }
                Cursor query = agljVar.h.b.a().query("ads", new String[]{"vast"}, "original_video_id=? AND ad_break_id=?", new String[]{str, str2}, null, null, null, null);
                try {
                    if (!query.moveToNext()) {
                        return null;
                    }
                    InstreamAdImpl instreamAdImpl = (InstreamAdImpl) InstreamAdImpl.a.f(new JSONObject(zgt.c(query.getBlob(0))));
                    query.close();
                    return instreamAdImpl;
                } finally {
                    query.close();
                }
            } catch (IOException | JSONException e) {
                StringBuilder sb = new StringBuilder(str.length() + 45);
                sb.append("[Offline] Error loading ad [originalVideoId=");
                sb.append(str);
                sb.append("]");
                zep.d(sb.toString(), e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.agvr
    public final agqe d(String str) {
        ylr.b();
        if (!this.b.z()) {
            return null;
        }
        agkv a = ((aglj) this.a.get()).i.a(str);
        return a == null ? agqe.DELETED : a.b;
    }

    @Override // defpackage.agvr
    public final List e(String str) {
        List i;
        ylr.b();
        if (this.e.e()) {
            return amuk.q();
        }
        if (!this.b.z()) {
            return amuk.q();
        }
        aglj agljVar = (aglj) this.a.get();
        str.getClass();
        zgh.m(str);
        try {
            Cursor query = agljVar.g.a.a().query("adbreaks", new String[]{"adbreaks"}, "original_video_id=?", new String[]{str}, null, null, null, null);
            if (query.getCount() <= 0) {
                i = Collections.emptyList();
            } else {
                query.moveToNext();
                i = InstreamAdBreak.b.i(new JSONArray(zgt.c(query.getBlob(0))));
            }
            query.close();
            return i;
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder(str.length() + 52);
            sb.append("[Offline] Error loading ad breaks [originalVideoId=");
            sb.append(str);
            sb.append("]");
            zep.d(sb.toString(), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.agvr
    public final Map f() {
        ArrayList<agky> arrayList;
        if (!this.b.z()) {
            return amyc.b;
        }
        agka agkaVar = (agka) this.c.get();
        SQLiteDatabase a = agkaVar.d.h.b.a();
        String d = ymr.d("ads", agkz.a);
        String d2 = ymr.d("ad_videos", agkw.a);
        int i = 1;
        String c = ymr.c("ads", "ad_video_id");
        String c2 = ymr.c("ad_videos", "ad_video_id");
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 44 + String.valueOf(d2).length() + String.valueOf(c).length() + String.valueOf(c2).length());
        sb.append("SELECT ");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(" FROM ads LEFT JOIN ad_videos ON ");
        sb.append(c);
        sb.append(" = ");
        sb.append(c2);
        Cursor rawQuery = a.rawQuery(sb.toString(), null);
        try {
            if (rawQuery.getCount() <= 0) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    agkx a2 = agkx.a("ads", rawQuery);
                    agkv a3 = agkv.a("ad_videos", rawQuery);
                    if (a2 != null) {
                        arrayList.add(new agky(a2, a3));
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (agky agkyVar : arrayList) {
                String str = agkyVar.a.a;
                aopa createBuilder = arzk.a.createBuilder();
                agna agnaVar = agna.EMPTY;
                int ordinal = agkyVar.a.d.ordinal();
                if (ordinal == 0) {
                    createBuilder.copyOnWrite();
                    arzk arzkVar = (arzk) createBuilder.instance;
                    arzkVar.c = 0;
                    arzkVar.b |= 1;
                    createBuilder.copyOnWrite();
                    arzk arzkVar2 = (arzk) createBuilder.instance;
                    arzkVar2.b |= 8;
                    arzkVar2.f = 0;
                } else if (ordinal == i) {
                    createBuilder.copyOnWrite();
                    arzk arzkVar3 = (arzk) createBuilder.instance;
                    arzkVar3.c = 2;
                    arzkVar3.b |= 1;
                    long max = Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(agkyVar.a.e - agkaVar.c.c()));
                    createBuilder.copyOnWrite();
                    arzk arzkVar4 = (arzk) createBuilder.instance;
                    arzkVar4.b |= 8;
                    arzkVar4.f = (int) max;
                    agkx agkxVar = agkyVar.a;
                    int max2 = Math.max(0, agkxVar.f - agkxVar.g);
                    createBuilder.copyOnWrite();
                    arzk arzkVar5 = (arzk) createBuilder.instance;
                    arzkVar5.b |= 4;
                    arzkVar5.e = max2;
                } else if (ordinal == 2) {
                    String str2 = agkyVar.a.b;
                    if (str2 == null) {
                        createBuilder.copyOnWrite();
                        arzk arzkVar6 = (arzk) createBuilder.instance;
                        arzkVar6.c = 0;
                        arzkVar6.b |= i;
                        createBuilder.copyOnWrite();
                        arzk arzkVar7 = (arzk) createBuilder.instance;
                        arzkVar7.b |= 8;
                        arzkVar7.f = 0;
                    } else {
                        agkv agkvVar = agkyVar.b;
                        if (agkvVar == null || agkvVar.b != agqe.COMPLETE) {
                            createBuilder.copyOnWrite();
                            arzk arzkVar8 = (arzk) createBuilder.instance;
                            arzkVar8.c = 3;
                            arzkVar8.b |= i;
                        } else {
                            createBuilder.copyOnWrite();
                            arzk arzkVar9 = (arzk) createBuilder.instance;
                            arzkVar9.c = 4;
                            arzkVar9.b |= i;
                        }
                        agkv agkvVar2 = agkyVar.b;
                        int i2 = agkvVar2 != null ? agkvVar2.a : 0;
                        long max3 = Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(agkyVar.a.e - agkaVar.c.c()));
                        createBuilder.copyOnWrite();
                        arzk arzkVar10 = (arzk) createBuilder.instance;
                        arzkVar10.b |= 8;
                        arzkVar10.f = (int) max3;
                        createBuilder.copyOnWrite();
                        arzk arzkVar11 = (arzk) createBuilder.instance;
                        arzkVar11.b |= 2;
                        arzkVar11.d = str2;
                        agkx agkxVar2 = agkyVar.a;
                        int max4 = Math.max(0, agkxVar2.f - Math.max(i2, agkxVar2.g));
                        createBuilder.copyOnWrite();
                        arzk arzkVar12 = (arzk) createBuilder.instance;
                        arzkVar12.b |= 4;
                        arzkVar12.e = max4;
                    }
                }
                aopa createBuilder2 = arzl.a.createBuilder();
                createBuilder2.copyOnWrite();
                arzl arzlVar = (arzl) createBuilder2.instance;
                arzk arzkVar13 = (arzk) createBuilder.mo39build();
                arzkVar13.getClass();
                aopu aopuVar = arzlVar.b;
                if (!aopuVar.c()) {
                    arzlVar.b = aopi.mutableCopy(aopuVar);
                }
                arzlVar.b.add(arzkVar13);
                arzl arzlVar2 = (arzl) createBuilder2.mo39build();
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(str, list);
                }
                list.add(arzlVar2);
                i = 1;
            }
            return hashMap;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.agvr
    public final void g(final String str, final String str2) {
        this.d.execute(new Runnable() { // from class: aghi
            @Override // java.lang.Runnable
            public final void run() {
                aghj aghjVar = aghj.this;
                String str3 = str;
                String str4 = str2;
                if (!aghjVar.b.z()) {
                    return;
                }
                ((aglj) aghjVar.a.get()).h.b.a().execSQL("UPDATE ads SET vast_playback_count = vast_playback_count + 1 WHERE original_video_id = ? AND ad_break_id = ?", new Object[]{str3, str4});
            }
        });
    }

    @Override // defpackage.agvr
    public final void h(String str) {
        str.getClass();
        this.d.execute(new aghh(this, str, 1));
    }

    @Override // defpackage.agvr
    public final void i(String str) {
        this.d.execute(new aghh(this, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0296 A[Catch: IOException -> 0x02d1, TRY_LEAVE, TryCatch #6 {IOException -> 0x02d1, blocks: (B:73:0x028d, B:75:0x0296, B:92:0x02cd, B:93:0x02d0, B:88:0x02c5), top: B:107:0x013c }] */
    @Override // defpackage.agvr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(java.lang.String r27, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r28) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghj.j(java.lang.String, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):java.lang.String");
    }
}
