package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzbn  reason: default package */
/* loaded from: classes4.dex */
public final class bzbn {
    public static final int a = dpyv.TRANSIT_SEND_TRACK.dm;
    public final auhi b;
    private final Application c;
    private final auhj d;
    private final auyw e;
    private final bvjj f;

    public bzbn(Application application, auhi auhiVar, auhj auhjVar, auyw auywVar, bvjj bvjjVar) {
        this.c = application;
        this.b = auhiVar;
        this.d = auhjVar;
        this.e = auywVar;
        this.f = bvjjVar;
    }

    public final void a(bzdk bzdkVar) {
        String string = this.c.getString(aufw.TRANSIT_SEND_TRACK_NOTIFICATION_TITLE);
        bzdo bzdoVar = (bzdo) bzdkVar;
        String string2 = this.c.getString(byyn.TRANSIT_SEND_TRACK_NOTIFICATION_TEXT, new Object[]{bzdoVar.d});
        augc b = this.d.b(a, this.e);
        b.w(2131232625);
        b.D(akm.c(this.c, R.color.quantum_googblue));
        b.f = string;
        b.g = string2;
        b.C(true);
        b.v = -1;
        amte amteVar = bzdoVar.e;
        dbsk.s(amteVar);
        String str = bzdoVar.g;
        dbsk.s(str);
        bzdh bzdhVar = bzdoVar.b;
        String c = bzdhVar instanceof bzcw ? ((bzcw) bzdhVar).c() : "";
        if (!this.f.i(bvjk.dj)) {
            b.E(umz.e(this.c, amteVar, false, bzdoVar.f, false, -1, str), auhw.ACTIVITY);
        } else {
            b.E(bzgk.b(this.c, bzgk.a(amteVar.e()), bzgk.a(amteVar.g()), c, str), auhw.ACTIVITY_WITHOUT_TASK_AFFINITY);
        }
        this.b.j(b.a());
    }
}
