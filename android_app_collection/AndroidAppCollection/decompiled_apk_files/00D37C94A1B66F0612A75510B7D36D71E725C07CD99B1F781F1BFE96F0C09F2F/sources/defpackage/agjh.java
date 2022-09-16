package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agjh  reason: default package */
/* loaded from: classes.dex */
public final class agjh implements agwc {
    static final long a = TimeUnit.MINUTES.toMillis(2);
    public final agis b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final String f;
    public final agyr g;
    public final agvw h;
    public final snc i;
    public final agkj j = new agkj();
    public final agjg k = new agjg(this);
    private final azqb l;
    private final azqb m;
    private final azqb n;
    private final azqb o;
    private final aadd p;
    private final ahdn q;
    private final azqb r;
    private final Executor s;

    public agjh(azqb azqbVar, agis agisVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, aadd aaddVar, String str, agyr agyrVar, ahdn ahdnVar, agvw agvwVar, snc sncVar, azqb azqbVar8, Executor executor) {
        this.l = azqbVar;
        this.b = agisVar;
        this.c = azqbVar2;
        this.m = azqbVar3;
        this.n = azqbVar4;
        this.d = azqbVar5;
        this.e = azqbVar6;
        this.o = azqbVar7;
        this.p = aaddVar;
        this.f = str;
        this.g = agyrVar;
        this.q = ahdnVar;
        this.h = agvwVar;
        this.i = sncVar;
        this.r = azqbVar8;
        this.s = executor;
    }

    private final synchronized void r(String str) {
        zgh.m(str);
        SQLiteDatabase a2 = ((agmr) this.o.get()).a();
        a2.beginTransaction();
        try {
            agmk agmkVar = (agmk) this.e.get();
            long delete = agmkVar.a.a().delete("video_listsV13", "id = ?", new String[]{str});
            if (delete == 1) {
                List f = agmkVar.f(str);
                agmkVar.a.a().delete("video_list_videos", "video_list_id = ?", new String[]{str});
                for (agmi agmiVar : agmkVar.d) {
                    agmiVar.b(f);
                }
                a2.setTransactionSuccessful();
                this.j.f(str);
                String.valueOf(str).length();
                this.b.v(new agob(str));
                a2.endTransaction();
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Delete video list affected ");
                sb.append(delete);
                sb.append(" rows");
                throw new SQLException(sb.toString());
            }
        } catch (SQLException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("[Offline] Error deleting video list ");
            sb2.append(str);
            sb2.append(" from database");
            zep.d(sb2.toString(), e);
            a2.endTransaction();
        }
    }

    private final synchronized boolean s(agqq agqqVar, List list) {
        boolean z;
        SQLiteDatabase a2 = ((agmr) this.o.get()).a();
        a2.beginTransaction();
        try {
            ((agmk) this.e.get()).h(agqqVar, list);
            a2.setTransactionSuccessful();
            a2.endTransaction();
            z = true;
        } catch (SQLException e) {
            zep.d("[Offline] Error syncing final video list videos", e);
            a2.endTransaction();
            z = false;
        }
        return z;
    }

    private final synchronized boolean t(agqq agqqVar, List list, agqe agqeVar, attl attlVar, int i, byte[] bArr) {
        boolean z;
        SQLiteDatabase a2 = ((agmr) this.o.get()).a();
        a2.beginTransaction();
        try {
            agmk agmkVar = (agmk) this.e.get();
            agmkVar.n(agqqVar, list, agqeVar, attlVar, ((agvq) this.l.get()).U(attlVar), i, bArr);
            agmkVar.i(agqqVar);
            a2.setTransactionSuccessful();
            a2.endTransaction();
            z = true;
        } catch (SQLException e) {
            zep.d("[Offline] Error syncing playlist", e);
            a2.endTransaction();
            z = false;
        }
        return z;
    }

    private final void u(agqq agqqVar) {
        this.q.b(true);
        try {
            agmk agmkVar = (agmk) this.e.get();
            snc sncVar = agmkVar.c;
            ContentValues contentValues = new ContentValues();
            long c = sncVar.c();
            contentValues.put("id", agqqVar.a);
            contentValues.put("type", Integer.valueOf(agqqVar.c));
            contentValues.put("size", Integer.valueOf(agqqVar.b));
            Long valueOf = Long.valueOf(c);
            contentValues.put("last_update_timestamp", valueOf);
            contentValues.put("saved_timestamp", valueOf);
            contentValues.put("video_list_offline_request_source", (Integer) 2);
            agmkVar.a.a().insertOrThrow("video_listsV13", null, contentValues);
            ((agmr) this.o.get()).s(agqqVar, Collections.emptyList(), null, 3);
        } catch (SQLException e) {
            zep.d("[Offline] Error inserting offline video list.", e);
        }
    }

    @Override // defpackage.agwc
    public final agqq a(String str) {
        ylr.b();
        if (!this.b.z()) {
            return null;
        }
        return ((agmk) this.e.get()).b(str);
    }

    @Override // defpackage.agwc
    public final agqr b(String str) {
        agqs c;
        if (this.b.z()) {
            agkk b = this.j.b(str);
            if (b == null && (c = c(str)) != null) {
                this.j.a(c.a, null);
                b = this.j.b(str);
            }
            if (b != null) {
                return b.b();
            }
        }
        return null;
    }

    public final agqs c(String str) {
        agmy q;
        if (!this.b.z() || TextUtils.isEmpty(str) || (q = ((agmr) this.o.get()).q(str)) == null) {
            return null;
        }
        return q.a();
    }

    @Override // defpackage.agwc
    public final ankt d(final String str) {
        return aglp.b(this.b.o(), new Callable() { // from class: agja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                agjh agjhVar = agjh.this;
                agqs c = agjhVar.c(str);
                if (c == null) {
                    return amuk.q();
                }
                ArrayList arrayList = new ArrayList();
                agjz agjzVar = (agjz) agjhVar.d.get();
                for (String str2 : c.b) {
                    agqv e = agjzVar.e(str2);
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                return amuk.o(arrayList);
            }
        }, amuk.q(), this.s);
    }

    @Override // defpackage.agwc
    public final Collection e() {
        if (this.b.z()) {
            return ((agmr) this.o.get()).e();
        }
        return amuk.q();
    }

    @Override // defpackage.agwc
    public final Set f(String str) {
        HashSet hashSet;
        if (!this.b.z()) {
            return amyg.a;
        }
        agmz c = ((agmr) this.o.get()).c();
        synchronized (c.k) {
            zgh.m(str);
            hashSet = new HashSet();
            Set<String> L = zew.L(c.i, str);
            if (L != null && !L.isEmpty()) {
                for (String str2 : L) {
                    agmx agmxVar = (agmx) c.b.get(str2);
                    if (agmxVar != null && agmxVar.e() != null) {
                        hashSet.add(agmxVar.e());
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.agwc
    public final Set g(String str) {
        if (this.b.z()) {
            zgh.m(str);
            return ((agmr) this.o.get()).g(str);
        }
        return amyg.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(agqr agqrVar) {
        if (agqrVar != null) {
            this.b.v(new agoc(agqrVar));
        }
    }

    @Override // defpackage.agwc
    public final void i(final String str) {
        this.b.s(new Runnable() { // from class: agiz
            @Override // java.lang.Runnable
            public final void run() {
                agjh agjhVar = agjh.this;
                String str2 = str;
                if (!agjhVar.b.z()) {
                    return;
                }
                agjhVar.j(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(String str) {
        ylr.b();
        if (((agmk) this.e.get()).b(str) == null) {
            return;
        }
        r(str);
    }

    @Override // defpackage.agwc
    public final void k(final String str, final List list) {
        this.b.s(new Runnable() { // from class: agjb
            @Override // java.lang.Runnable
            public final void run() {
                agjh agjhVar = agjh.this;
                String str2 = str;
                List list2 = list;
                if (!agjhVar.b.z()) {
                    return;
                }
                agjhVar.l(str2, list2);
            }
        });
    }

    public final synchronized void l(String str, List list) {
        ylr.b();
        agqs c = c(str);
        if (c == null) {
            return;
        }
        if (!t(new agqq(c.a, list.size()), list, agqe.METADATA_ONLY, attl.UNKNOWN_FORMAT_TYPE, -1, aadi.b)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
            sb.append("[Offline] Failed syncing video list ");
            sb.append(str);
            sb.append(" to database");
            zep.b(sb.toString());
            return;
        }
        ((aghk) this.n.get()).c(list);
        agkg agkgVar = (agkg) this.m.get();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agkgVar.d(((agqo) it.next()).f(), false);
        }
    }

    @Override // defpackage.agwc
    public final Collection m() {
        if (this.b.z()) {
            ArrayList arrayList = new ArrayList();
            for (agqs agqsVar : ((agmr) this.o.get()).e()) {
                if (agqsVar.a.c == 2) {
                    arrayList.add(agqsVar);
                }
            }
            return arrayList;
        }
        return amuk.q();
    }

    @Override // defpackage.agwc
    public final List n() {
        ylr.b();
        if (!this.b.z()) {
            return amuk.q();
        }
        Cursor query = ((agmk) this.e.get()).a.a().query("video_listsV13", agmj.a, "type = ?", new String[]{"1"}, null, null, "saved_timestamp DESC", null);
        try {
            return agpr.g(query, query.getColumnIndexOrThrow("id"), query.getColumnIndexOrThrow("size"), query.getColumnIndexOrThrow("type"));
        } finally {
            query.close();
        }
    }

    @Override // defpackage.agwc
    public final void o(final String str, final List list) {
        final atsu atsuVar = atsu.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
        final attl u = ((agvq) this.l.get()).u();
        final agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
        final byte[] bArr = aadi.b;
        this.b.s(new Runnable() { // from class: agjc
            @Override // java.lang.Runnable
            public final void run() {
                agjh agjhVar = agjh.this;
                String str2 = str;
                List list2 = list;
                atsu atsuVar2 = atsuVar;
                attl attlVar = u;
                agqn agqnVar2 = agqnVar;
                byte[] bArr2 = bArr;
                if (!agjhVar.b.z()) {
                    return;
                }
                agjhVar.p(str2, list2, atsuVar2, Long.MAX_VALUE, false, attlVar, agqnVar2, -1, bArr2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r31, java.util.List r32, defpackage.atsu r33, long r34, boolean r36, defpackage.attl r37, defpackage.agqn r38, int r39, byte[] r40) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjh.p(java.lang.String, java.util.List, atsu, long, boolean, attl, agqn, int, byte[]):void");
    }

    @Override // defpackage.agwc
    public final void q(agqq agqqVar) {
        ylr.b();
        if (!this.b.z()) {
            return;
        }
        u(agqqVar);
    }
}
