package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: btw  reason: default package */
/* loaded from: classes2.dex */
public final class btw {
    private final bks a;
    private final bkm b;

    public btw(bks bksVar) {
        this.a = bksVar;
        this.b = new btv(bksVar);
    }

    public final Long a(String str) {
        bku a = bku.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.f(1, str);
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            Long l = null;
            if (f.moveToFirst() && !f.isNull(0)) {
                l = Long.valueOf(f.getLong(0));
            }
            return l;
        } finally {
            f.close();
            a.i();
        }
    }

    public final void b(btu btuVar) {
        this.a.e();
        this.a.f();
        try {
            this.b.a(btuVar);
            this.a.h();
        } finally {
            this.a.g();
        }
    }
}
