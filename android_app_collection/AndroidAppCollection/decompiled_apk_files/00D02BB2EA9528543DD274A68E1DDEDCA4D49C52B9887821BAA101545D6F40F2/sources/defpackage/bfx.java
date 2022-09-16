package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: bfx  reason: default package */
/* loaded from: classes3.dex */
public final class bfx {
    public final bn a;
    private final bc<bfu> b;
    private final bt c;

    public bfx(bn bnVar) {
        this.a = bnVar;
        this.b = new bfv(bnVar);
        this.c = new bfw(bnVar);
    }

    public final void a(bfu bfuVar) {
        this.a.E();
        this.a.F();
        try {
            this.b.a(bfuVar);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    public final void b(String str) {
        this.a.E();
        awj e = this.c.e();
        if (str == null) {
            e.f(1);
        } else {
            e.i(1, str);
        }
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.c.f(e);
        }
    }

    public final bfu c(String str) {
        br a = br.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            return q.moveToFirst() ? new bfu(q.getString(bx.a(q, "work_spec_id")), q.getInt(bx.a(q, "system_id"))) : null;
        } finally {
            q.close();
            a.c();
        }
    }
}
