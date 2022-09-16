package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agmr  reason: default package */
/* loaded from: classes.dex */
public final class agmr {
    public final Executor a;
    public final aghe b;
    public final agmk c;
    public final agmu d;
    public final ConditionVariable e = new ConditionVariable();
    public final List f;
    public final ayoi g;
    public volatile agmz h;
    public final agmk i;
    private final agli j;
    private final agme k;
    private final agnb l;
    private volatile boolean m;

    public agmr(Executor executor, aghe agheVar, agli agliVar, agmu agmuVar, agme agmeVar, agmk agmkVar, agmk agmkVar2, agmz agmzVar, agnb agnbVar, Set set, ayoi ayoiVar, byte[] bArr) {
        this.a = executor;
        this.b = agheVar;
        this.j = agliVar;
        this.d = agmuVar;
        this.k = agmeVar;
        this.i = agmkVar;
        this.c = agmkVar2;
        this.h = agmzVar;
        this.l = agnbVar;
        this.g = ayoiVar;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(set);
        this.m = false;
        agmeVar.b(new agmp(this));
        agmkVar.x(new agmo(this));
        agmkVar2.g(new agmq(this));
    }

    private final void u() {
        this.e.block();
    }

    public final SQLiteDatabase a() {
        u();
        return this.j.a();
    }

    public final agml b(String str) {
        return c().a(str);
    }

    public final agmz c() {
        u();
        return this.h;
    }

    public final Collection d() {
        Collection values;
        agmz c = c();
        synchronized (c.k) {
            values = c.c.values();
        }
        return values;
    }

    public final List e() {
        LinkedList linkedList;
        agmz c = c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            for (agmy agmyVar : c.d.values()) {
                linkedList.add(agmyVar.a());
            }
        }
        return linkedList;
    }

    public final List f() {
        LinkedList linkedList;
        agmz c = c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            for (agmx agmxVar : c.b.values()) {
                linkedList.add(agmxVar.e());
            }
        }
        return linkedList;
    }

    public final Set g(String str) {
        Set L;
        agmz c = c();
        synchronized (c.k) {
            L = zew.L(c.h, str);
        }
        return L;
    }

    public final void h(String str) {
        c().d(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02d1 A[Catch: all -> 0x054d, TryCatch #5 {all -> 0x054d, blocks: (B:18:0x0103, B:19:0x0176, B:21:0x017e, B:22:0x0182, B:24:0x018c, B:26:0x0192, B:28:0x01a6, B:31:0x01b2, B:33:0x01b6, B:37:0x01c4, B:39:0x01d0, B:42:0x01d8, B:44:0x01db, B:45:0x01df, B:48:0x01e8, B:50:0x01f0, B:53:0x0215, B:58:0x021e, B:60:0x022a, B:62:0x0237, B:64:0x024b, B:66:0x0254, B:68:0x025d, B:70:0x0266, B:72:0x0270, B:73:0x0276, B:117:0x02e1, B:119:0x02f3, B:121:0x031c, B:123:0x0322, B:124:0x032f, B:111:0x02c5, B:113:0x02d1, B:115:0x02db, B:114:0x02d6, B:56:0x021a, B:126:0x0358, B:127:0x0367, B:129:0x036d, B:131:0x0377, B:133:0x037f, B:137:0x038d, B:139:0x0391, B:141:0x0399, B:142:0x039f, B:145:0x03a8, B:134:0x0386), top: B:243:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d6 A[Catch: all -> 0x054d, TryCatch #5 {all -> 0x054d, blocks: (B:18:0x0103, B:19:0x0176, B:21:0x017e, B:22:0x0182, B:24:0x018c, B:26:0x0192, B:28:0x01a6, B:31:0x01b2, B:33:0x01b6, B:37:0x01c4, B:39:0x01d0, B:42:0x01d8, B:44:0x01db, B:45:0x01df, B:48:0x01e8, B:50:0x01f0, B:53:0x0215, B:58:0x021e, B:60:0x022a, B:62:0x0237, B:64:0x024b, B:66:0x0254, B:68:0x025d, B:70:0x0266, B:72:0x0270, B:73:0x0276, B:117:0x02e1, B:119:0x02f3, B:121:0x031c, B:123:0x0322, B:124:0x032f, B:111:0x02c5, B:113:0x02d1, B:115:0x02db, B:114:0x02d6, B:56:0x021a, B:126:0x0358, B:127:0x0367, B:129:0x036d, B:131:0x0377, B:133:0x037f, B:137:0x038d, B:139:0x0391, B:141:0x0399, B:142:0x039f, B:145:0x03a8, B:134:0x0386), top: B:243:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0391 A[Catch: all -> 0x054d, TryCatch #5 {all -> 0x054d, blocks: (B:18:0x0103, B:19:0x0176, B:21:0x017e, B:22:0x0182, B:24:0x018c, B:26:0x0192, B:28:0x01a6, B:31:0x01b2, B:33:0x01b6, B:37:0x01c4, B:39:0x01d0, B:42:0x01d8, B:44:0x01db, B:45:0x01df, B:48:0x01e8, B:50:0x01f0, B:53:0x0215, B:58:0x021e, B:60:0x022a, B:62:0x0237, B:64:0x024b, B:66:0x0254, B:68:0x025d, B:70:0x0266, B:72:0x0270, B:73:0x0276, B:117:0x02e1, B:119:0x02f3, B:121:0x031c, B:123:0x0322, B:124:0x032f, B:111:0x02c5, B:113:0x02d1, B:115:0x02db, B:114:0x02d6, B:56:0x021a, B:126:0x0358, B:127:0x0367, B:129:0x036d, B:131:0x0377, B:133:0x037f, B:137:0x038d, B:139:0x0391, B:141:0x0399, B:142:0x039f, B:145:0x03a8, B:134:0x0386), top: B:243:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i() {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmr.i():void");
    }

    public final void j(agql agqlVar) {
        for (agin aginVar : this.f) {
        }
        agmz c = c();
        synchronized (c.k) {
            if (c.a.get(agqlVar.g()) != null) {
                c.g(agqlVar);
            } else {
                boolean z = agqlVar.c;
                agql agqlVar2 = null;
                agql agqlVar3 = true != z ? null : agqlVar;
                if (true != z) {
                    agqlVar2 = agqlVar;
                }
                c.a.put(agqlVar.g(), new agmw(c, agqlVar2, agqlVar3));
            }
        }
    }

    public final void k(String str) {
        agmz c = c();
        synchronized (c.k) {
            zgh.m(str);
            c.c.remove(str);
            Set<String> set = (Set) c.g.remove(str);
            if (set != null) {
                for (String str2 : set) {
                    zew.N(c.f, str2, str);
                }
            }
        }
    }

    public final void l(String str) {
        agmz c = c();
        synchronized (c.k) {
            zgh.m(str);
            c.a.remove(str);
        }
        for (agin aginVar : this.f) {
        }
    }

    public final void m(String str) {
        agmz c = c();
        synchronized (c.k) {
            zgh.m(str);
            agmx agmxVar = (agmx) c.b.remove(str);
            c.e.remove(str);
            if (agmxVar != null) {
                c.l.b(agmxVar);
            }
        }
        for (agin aginVar : this.f) {
        }
    }

    public final boolean n(agql agqlVar, List list) {
        agml a;
        if (agqlVar != null) {
            agpz c = agqlVar.c(list);
            if (c == null) {
                return false;
            }
            String str = c.a;
            if (agqlVar.l == null && str != null && (a = this.h.a(agqlVar.g())) != null) {
                String str2 = c.a;
                agqk d = agqlVar.d();
                d.e = str2;
                a.g(d.a());
                agme agmeVar = this.k;
                String g = agqlVar.g();
                int a2 = agqlVar.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("storage_id", str);
                long update = agmeVar.c.a().update("streams", contentValues, "video_id = ? AND itag = ?", new String[]{g, Integer.toString(a2)});
                if (update != 1) {
                    StringBuilder sb = new StringBuilder(75);
                    sb.append("Update stream transfer_started_timestamp affected ");
                    sb.append(update);
                    sb.append(" rows");
                    throw new SQLException(sb.toString());
                }
            }
        }
        return true;
    }

    public final agmv o(String str) {
        return c().i(str);
    }

    public final agmx p(String str) {
        return c().j(str);
    }

    public final agmy q(String str) {
        agmy agmyVar;
        agmz c = c();
        synchronized (c.k) {
            zgh.m(str);
            agmyVar = (agmy) c.d.get(str);
        }
        return agmyVar;
    }

    public final void r(agqf agqfVar, List list, attl attlVar, int i, long j, long j2, int i2) {
        c().m(agqfVar, list, attlVar, j, j2, i2);
    }

    public final void s(agqq agqqVar, List list, List list2, int i) {
        c().l(agqqVar, list, list2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(agqo agqoVar, attl attlVar, int i, byte[] bArr, agqe agqeVar, agqn agqnVar, long j) {
        c().k(agqoVar, attlVar, i, bArr, agqeVar, agqnVar, j);
        for (agin aginVar : this.f) {
            agqoVar.f();
            ((agpp) aginVar.a.m.get()).a();
        }
    }
}
