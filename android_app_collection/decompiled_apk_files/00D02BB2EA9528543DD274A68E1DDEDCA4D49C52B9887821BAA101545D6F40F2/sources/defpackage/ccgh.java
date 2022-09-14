package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ccgh  reason: default package */
/* loaded from: classes.dex */
public final class ccgh extends afhx {
    public static final dbsl<afga> b = ccgg.a;
    public final dxio<cgen> a;
    private final gga c;
    private final gfq d;
    private final cjqy e;
    private final dxio<bsvm> i;

    public ccgh(Intent intent, @dzsi String str, gga ggaVar, gfq gfqVar, cjqy cjqyVar, dxio<cgen> dxioVar, dxio<bsvm> dxioVar2) {
        super(intent, str, afid.UGC_TASKS);
        this.c = ggaVar;
        this.d = gfqVar;
        this.e = cjqyVar;
        this.a = dxioVar;
        this.i = dxioVar2;
    }

    public static Intent d(Context context, @dzsi String str, dpyv dpyvVar, dhjz dhjzVar) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 17);
        sb.append(packageName);
        sb.append(".");
        sb.append("MissionsActivity");
        intent.setComponent(new ComponentName(context, sb.toString()));
        if (str != null) {
            intent.putExtra("feature_id", str);
        }
        intent.putExtra("notification_type", dpyvVar.dm);
        intent.putExtra("location", dhjzVar.bS());
        return intent;
    }

    @dzsi
    private static String e(Intent intent) {
        return dbsj.f(intent.getStringExtra("feature_id"));
    }

    @dzsi
    private static dhjz h(Intent intent) {
        try {
            return (dhjz) dsqw.cq(dhjz.e, intent.getByteArrayExtra("location"));
        } catch (dsrm | NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.afhx
    public final void a() {
        cgem cgemVar;
        Uri data = this.f.getData();
        if (data != null) {
            if ("TrTNearbyNeedSettings".equals(data.getScheme())) {
                if (!affw.b(this.f)) {
                    this.d.c();
                }
                this.i.a().r();
                return;
            } else if ("TrTPlaceReminderSettings".equals(data.getScheme())) {
                if (!affw.b(this.f)) {
                    this.d.c();
                }
                this.i.a().s();
                return;
            } else if ("TrTNotificationWithTaskSet".equals(data.getScheme())) {
                String e = e(this.f);
                akqq j = akqq.j(h(this.f));
                String f = dbsj.f(this.f.getStringExtra("task_set_id"));
                dspd B = f != null ? dspd.B(f) : null;
                if (dpyv.b(this.f.getIntExtra("notification_type", dpyv.UNKNOWN_NOTIFICATION_ID.dm)) == dpyv.UGC_HOME_STREET) {
                    cgemVar = cgem.DOOR_TO_DOOR_NOTIFICATION;
                } else {
                    cgemVar = cgem.NOTIFICATION;
                }
                dbsk.s(e);
                dbsk.s(j);
                dbsk.s(B);
                this.a.a().j(e, j, B, cgemVar);
                return;
            }
        }
        final String e2 = e(this.f);
        final dpyv b2 = dpyv.b(this.f.getIntExtra("notification_type", dpyv.UNKNOWN_NOTIFICATION_ID.dm));
        final dqgh b3 = dqgh.b(this.f.getIntExtra("attribute_type", dqgh.UNDEFINED.af));
        if (b2 == dpyv.UGC_TASKS_NEARBY_NEED && e2 != null) {
            this.e.i(cjtd.a(dtyd.ap));
        }
        final dhjz h = h(this.f);
        affw.a(this.f, this.c, new Runnable(this, b2, b3, e2, h) { // from class: ccgf
            private final ccgh a;
            private final dpyv b;
            private final dqgh c;
            private final String d;
            private final dhjz e;

            {
                this.a = this;
                this.b = b2;
                this.c = b3;
                this.d = e2;
                this.e = h;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ilo d;
                ccgh ccghVar = this.a;
                dpyv dpyvVar = this.b;
                dqgh dqghVar = this.c;
                String str = this.d;
                dhjz dhjzVar = this.e;
                cgen a = ccghVar.a.a();
                if (str == null) {
                    d = null;
                } else {
                    ily ilyVar = new ily();
                    ilyVar.k(str);
                    d = ilyVar.d();
                }
                a.i(dpyvVar, dqghVar, d, dhjzVar);
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_MISSIONS_NOTIFICATION;
    }
}
