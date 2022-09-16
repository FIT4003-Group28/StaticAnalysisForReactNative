package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: cyrl  reason: default package */
/* loaded from: classes5.dex */
public final class cyrl extends cyri {
    private final bn a;
    private final bc<cyqe> b;
    private final bt c;

    public cyrl(bn bnVar) {
        this.a = bnVar;
        this.b = new cyrj(bnVar);
        this.c = new cyrk(bnVar);
    }

    @Override // defpackage.cyqd
    public final dbsg<cyqe> a() {
        cyqe cyqeVar;
        dudy dudyVar;
        br a = br.a("SELECT   rowid,   last_updated,   num_contacts,   affinity_response_context FROM   CacheInfo WHERE   rowid = 1 ", 0);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "rowid");
            int a3 = bx.a(q, "last_updated");
            int a4 = bx.a(q, "num_contacts");
            int a5 = bx.a(q, "affinity_response_context");
            if (q.moveToFirst()) {
                long j = q.getLong(a2);
                long j2 = q.getLong(a3);
                long j3 = q.getLong(a4);
                byte[] blob = q.getBlob(a5);
                if (blob != null) {
                    try {
                        dudyVar = (dudy) dsqw.cr(dudy.d, blob, dsqa.c());
                    } catch (dsrm unused) {
                        dudyVar = dudy.d;
                    }
                } else {
                    dudyVar = dudy.d;
                }
                cyqeVar = new cyqe(j, j2, j3, dudyVar);
            } else {
                cyqeVar = null;
            }
            return dbsg.j(cyqeVar);
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.cyqd
    public final void b(cyqe cyqeVar) {
        this.a.E();
        this.a.F();
        try {
            this.b.a(cyqeVar);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cyqd
    public final void c() {
        this.a.E();
        awj e = this.c.e();
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.c.f(e);
        }
    }
}
