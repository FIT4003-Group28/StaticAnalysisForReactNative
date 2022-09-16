package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: bft  reason: default package */
/* loaded from: classes3.dex */
public final class bft {
    private final bn a;
    private final bc<bfr> b;

    public bft(bn bnVar) {
        this.a = bnVar;
        this.b = new bfs(bnVar);
    }

    public final void a(bfr bfrVar) {
        this.a.E();
        this.a.F();
        try {
            this.b.a(bfrVar);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    public final Long b(String str) {
        br a = br.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.i(1, str);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            Long l = null;
            if (q.moveToFirst() && !q.isNull(0)) {
                l = Long.valueOf(q.getLong(0));
            }
            return l;
        } finally {
            q.close();
            a.c();
        }
    }
}
