package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agjg  reason: default package */
/* loaded from: classes.dex */
public final class agjg implements agxf {
    final Map a = new HashMap();
    final /* synthetic */ agjh b;

    public agjg(agjh agjhVar) {
        this.b = agjhVar;
    }

    private final void m(agqz agqzVar) {
        for (final String str : this.b.g(agxg.t(agqzVar.f))) {
            agqs c = this.b.c(str);
            if (c != null && c.c != null) {
                final ArrayList arrayList = new ArrayList();
                final agmk agmkVar = (agmk) this.b.e.get();
                this.b.b.s(new Runnable() { // from class: agjf
                    @Override // java.lang.Runnable
                    public final void run() {
                        long min;
                        agqn agqnVar;
                        agjg agjgVar = agjg.this;
                        String str2 = str;
                        List list = arrayList;
                        agmk agmkVar2 = agmkVar;
                        agjh agjhVar = agjgVar.b;
                        atsu c2 = agmkVar2.c(str2);
                        agvw agvwVar = agjgVar.b.h;
                        String str3 = "main_app_auto_offline_storage_limit_megabytes_%s";
                        if (!agvwVar.b.c().z()) {
                            str3 = zhn.q(str3, agvwVar.b.c().d());
                        }
                        long j = 0;
                        long j2 = agvwVar.a.contains(str3) ? agvwVar.a.getInt(str3, 0) * 1048576 : 0L;
                        long b = agjgVar.b.h.b();
                        if (j2 == 0) {
                            min = b;
                        } else {
                            agwg agwgVar = (agwg) agjgVar.b.c.get();
                            if (str2 != null) {
                                agqs o = ((aglj) agwgVar.a.get()).o(str2);
                                if (o != null) {
                                    List<String> list2 = o.b;
                                    aglj agljVar = (aglj) agwgVar.a.get();
                                    for (String str4 : list2) {
                                        agqv p = agljVar.p(str4);
                                        if (p != null) {
                                            j += p.e();
                                        }
                                    }
                                }
                                min = Math.min(b, j2 - j);
                            } else {
                                throw new IllegalArgumentException("Either specify playlistId or videoListId");
                            }
                        }
                        attl d = agmkVar2.d(str2);
                        Cursor query = agmkVar2.a.a().query("video_listsV13", new String[]{"stream_transfer_condition"}, "id = ?", new String[]{str2}, null, null, null, null);
                        try {
                            if (query.moveToNext()) {
                                agqnVar = agqn.a(query.getInt(0));
                            } else {
                                agqnVar = agqn.OFFLINE_IMMEDIATELY;
                            }
                            query.close();
                            agjhVar.p(str2, list, c2, min, true, d, agqnVar, agmkVar2.a(str2), agmkVar2.k(str2));
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                });
            }
        }
    }

    private final void n(final agqz agqzVar) {
        this.b.b.s(new Runnable() { // from class: agje
            @Override // java.lang.Runnable
            public final void run() {
                agjg agjgVar = agjg.this;
                agqz agqzVar2 = agqzVar;
                for (agkk agkkVar : agjgVar.b.j.c(agxg.t(agqzVar2.f))) {
                    agkkVar.g(agqzVar2);
                    agjgVar.b.h(agkkVar.b());
                }
            }
        });
    }

    @Override // defpackage.agxf
    public final void a(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void b(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void c() {
    }

    @Override // defpackage.agxf
    public final void d(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        n(agqzVar);
    }

    @Override // defpackage.agxf
    public final void e(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        n(agqzVar);
        String t = agxg.t(agqzVar.f);
        if (this.a.containsKey(t) && this.b.i.c() - ((Long) this.a.get(t)).longValue() > agjh.a) {
            m(agqzVar);
        }
        this.a.put(t, Long.valueOf(this.b.i.c()));
    }

    @Override // defpackage.agxf
    public final void f(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        for (agkk agkkVar : this.b.j.c(agxg.t(agqzVar.f))) {
            agkkVar.f(agqzVar);
            this.b.h(agkkVar.b());
        }
    }

    @Override // defpackage.agxf
    public final void g() {
        this.b.b.s(new Runnable() { // from class: agjd
            @Override // java.lang.Runnable
            public final void run() {
                agjg agjgVar = agjg.this;
                String a = agjgVar.b.g.a();
                if (!agjgVar.b.f.equals(a)) {
                    return;
                }
                for (agqz agqzVar : agjgVar.b.g.b(a).values()) {
                    if (agqzVar.c()) {
                        String t = agxg.t(agqzVar.f);
                        for (String str : agjgVar.b.g(t)) {
                            agkk b = agjgVar.b.j.b(str);
                            if (b == null) {
                                agqs c = agjgVar.b.c(str);
                                if (c != null) {
                                    b = agjgVar.b.j.a(c.a, null);
                                    agjgVar.b.h(b.b());
                                } else {
                                    zep.b("[Offline] pudl transfer video list not in database");
                                }
                            }
                            b.c(t);
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.agxf
    public final void h(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        n(agqzVar);
    }

    @Override // defpackage.agxf
    public final void i(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void j(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void k(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        n(agqzVar);
        if (!agqeVar.b()) {
            return;
        }
        m(agqzVar);
    }

    @Override // defpackage.agxf
    public final void l(agqz agqzVar) {
    }
}
