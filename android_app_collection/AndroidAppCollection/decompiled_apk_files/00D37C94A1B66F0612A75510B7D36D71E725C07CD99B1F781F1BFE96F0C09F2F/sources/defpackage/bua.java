package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: bua  reason: default package */
/* loaded from: classes2.dex */
public final class bua {
    public final bks a;
    private final bkm b;
    private final bkw c;

    public bua(bks bksVar) {
        this.a = bksVar;
        this.b = new bty(bksVar);
        this.c = new btz(bksVar);
    }

    public final btx a(String str) {
        bku a = bku.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            return f.moveToFirst() ? new btx(f.getString(ld.h(f, "work_spec_id")), f.getInt(ld.h(f, "system_id"))) : null;
        } finally {
            f.close();
            a.i();
        }
    }

    public final void b(btx btxVar) {
        this.a.e();
        this.a.f();
        try {
            this.b.a(btxVar);
            this.a.h();
        } finally {
            this.a.g();
        }
    }

    public final void c(String str) {
        this.a.e();
        bmb d = this.c.d();
        if (str == null) {
            d.e(1);
        } else {
            d.f(1, str);
        }
        this.a.f();
        try {
            d.a();
            this.a.h();
        } finally {
            this.a.g();
            this.c.e(d);
        }
    }
}
