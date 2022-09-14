package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cysc  reason: default package */
/* loaded from: classes5.dex */
public final class cysc extends cyry {
    private final bn a;
    private final bc<cysi> b;
    private final bb<cysi> c;
    private final bt d;

    public cysc(bn bnVar) {
        this.a = bnVar;
        this.b = new cyrz(bnVar);
        this.c = new cysa(bnVar);
        this.d = new cysb(bnVar);
    }

    @Override // defpackage.cyry
    public final List<cysi> a(int i) {
        br a = br.a("SELECT * FROM RpcCache ORDER BY timestamp ASC, type, key LIMIT ?", 1);
        a.g(1, i);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            int a2 = bx.a(q, "type");
            int a3 = bx.a(q, "key");
            int a4 = bx.a(q, "timestamp");
            int a5 = bx.a(q, "proto_bytes");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(new cysi(q.getString(a2), q.getString(a3), q.getLong(a4), cysi.a(q.getBlob(a5))));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }

    @Override // defpackage.cyry
    public final int b(List<cysi> list) {
        this.a.E();
        this.a.F();
        try {
            bb<cysi> bbVar = this.c;
            awj e = bbVar.e();
            int i = 0;
            for (cysi cysiVar : list) {
                e.i(1, cysiVar.a);
                e.i(2, cysiVar.b);
                i += e.a();
            }
            bbVar.f(e);
            this.a.l();
            return i;
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cyry, defpackage.cysh
    public final void c(int i) {
        this.a.F();
        try {
            b(a(i));
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cysh
    public final void d(List<cysi> list) {
        this.a.E();
        this.a.F();
        try {
            this.b.b(list);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cysh
    public final int e(long j) {
        this.a.E();
        awj e = this.d.e();
        e.g(1, j);
        this.a.F();
        try {
            int a = e.a();
            this.a.l();
            return a;
        } finally {
            this.a.k();
            this.d.f(e);
        }
    }

    @Override // defpackage.cysh
    public final List<cysi> f(String str, List<String> list, long j) {
        StringBuilder a = ca.a();
        a.append("SELECT   type,   key,   timestamp,   proto_bytes FROM   RpcCache WHERE   type = ");
        a.append("?");
        a.append("   AND   key IN (");
        int size = list.size();
        ca.b(a, size);
        a.append(")   AND   timestamp >= ");
        a.append("?");
        a.append(" ");
        int i = 2;
        int i2 = size + 2;
        br a2 = br.a(a.toString(), i2);
        if (str == null) {
            a2.f(1);
        } else {
            a2.i(1, str);
        }
        for (String str2 : list) {
            if (str2 == null) {
                a2.f(i);
            } else {
                a2.i(i, str2);
            }
            i++;
        }
        a2.g(i2, j);
        this.a.E();
        Cursor q = this.a.q(a2);
        try {
            int a3 = bx.a(q, "type");
            int a4 = bx.a(q, "key");
            int a5 = bx.a(q, "timestamp");
            int a6 = bx.a(q, "proto_bytes");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(new cysi(q.getString(a3), q.getString(a4), q.getLong(a5), cysi.a(q.getBlob(a6))));
            }
            return arrayList;
        } finally {
            q.close();
            a2.c();
        }
    }

    @Override // defpackage.cysh
    public final long g() {
        br a = br.a("SELECT COUNT(*) FROM RpcCache", 0);
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            return q.moveToFirst() ? q.getLong(0) : 0L;
        } finally {
            q.close();
            a.c();
        }
    }
}
