package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyrq  reason: default package */
/* loaded from: classes5.dex */
public final class cyrq extends cyrn {
    private final bn a;
    private final bc<cyqg> b;
    private final bt c;

    public cyrq(bn bnVar) {
        this.a = bnVar;
        this.b = new cyro(bnVar);
        this.c = new cyrp(bnVar);
    }

    @Override // defpackage.cyqf
    public final List<Long> e(List<cyqg> list) {
        this.a.E();
        this.a.F();
        try {
            bc<cyqg> bcVar = this.b;
            awj e = bcVar.e();
            ArrayList arrayList = new ArrayList(list.size());
            int i = 0;
            for (cyqg cyqgVar : list) {
                bcVar.c(e, cyqgVar);
                arrayList.add(i, Long.valueOf(e.b()));
                i++;
            }
            bcVar.f(e);
            this.a.l();
            return arrayList;
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cyqf
    public final void f() {
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

    @Override // defpackage.cyrn
    public final List<cysl> g(String str, Set<String> set, int i) {
        cyqg cyqgVar;
        StringBuilder a = ca.a();
        a.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ");
        a.append("?");
        a.append("   AND   t.field_type IN (");
        int size = set.size();
        ca.b(a, size);
        a.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ");
        a.append("?");
        int i2 = 2;
        int i3 = size + 2;
        br a2 = br.a(a.toString(), i3);
        if (str == null) {
            a2.f(1);
        } else {
            a2.i(1, str);
        }
        for (String str2 : set) {
            if (str2 == null) {
                a2.f(i2);
            } else {
                a2.i(i2, str2);
            }
            i2++;
        }
        a2.g(i3, i);
        this.a.E();
        Cursor q = this.a.q(a2);
        try {
            int a3 = bx.a(q, "contact_id");
            int a4 = bx.a(q, "contact_affinity");
            int a5 = bx.a(q, "contact_proto_bytes");
            int a6 = bx.a(q, "token_contact_id");
            int a7 = bx.a(q, "token_value");
            int a8 = bx.a(q, "token_affinity");
            int a9 = bx.a(q, "token_field_type");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                cysn cysnVar = null;
                if (q.isNull(a3) && q.isNull(a4) && q.isNull(a5)) {
                    cyqgVar = null;
                    if (q.isNull(a6) || !q.isNull(a7) || !q.isNull(a8) || !q.isNull(a9)) {
                        cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                    }
                    arrayList.add(new cysl(cysnVar, cyqgVar));
                }
                cyqgVar = new cyqg(q.getLong(a3), q.getDouble(a4), dspd.x(q.getBlob(a5)));
                if (q.isNull(a6)) {
                }
                cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                arrayList.add(new cysl(cysnVar, cyqgVar));
            }
            return arrayList;
        } finally {
            q.close();
            a2.c();
        }
    }

    @Override // defpackage.cyrn
    public final List<cysl> h(String str, Set<String> set, int i) {
        cyqg cyqgVar;
        StringBuilder a = ca.a();
        a.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ");
        a.append("?");
        a.append("   AND   t.field_type IN (");
        int size = set.size();
        ca.b(a, size);
        a.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ");
        a.append("?");
        int i2 = 2;
        int i3 = size + 2;
        br a2 = br.a(a.toString(), i3);
        if (str == null) {
            a2.f(1);
        } else {
            a2.i(1, str);
        }
        for (String str2 : set) {
            if (str2 == null) {
                a2.f(i2);
            } else {
                a2.i(i2, str2);
            }
            i2++;
        }
        a2.g(i3, i);
        this.a.E();
        Cursor q = this.a.q(a2);
        try {
            int a3 = bx.a(q, "contact_id");
            int a4 = bx.a(q, "contact_affinity");
            int a5 = bx.a(q, "contact_proto_bytes");
            int a6 = bx.a(q, "token_contact_id");
            int a7 = bx.a(q, "token_value");
            int a8 = bx.a(q, "token_affinity");
            int a9 = bx.a(q, "token_field_type");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                cysn cysnVar = null;
                if (q.isNull(a3) && q.isNull(a4) && q.isNull(a5)) {
                    cyqgVar = null;
                    if (q.isNull(a6) || !q.isNull(a7) || !q.isNull(a8) || !q.isNull(a9)) {
                        cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                    }
                    arrayList.add(new cysl(cysnVar, cyqgVar));
                }
                cyqgVar = new cyqg(q.getLong(a3), q.getDouble(a4), dspd.x(q.getBlob(a5)));
                if (q.isNull(a6)) {
                }
                cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                arrayList.add(new cysl(cysnVar, cyqgVar));
            }
            return arrayList;
        } finally {
            q.close();
            a2.c();
        }
    }

    @Override // defpackage.cyrn
    public final List<cysl> i(Set<String> set, int i) {
        cyqg cyqgVar;
        StringBuilder a = ca.a();
        a.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.field_type IN (");
        int size = set.size();
        ca.b(a, size);
        a.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ");
        a.append("?");
        int i2 = 1;
        int i3 = size + 1;
        br a2 = br.a(a.toString(), i3);
        for (String str : set) {
            if (str == null) {
                a2.f(i2);
            } else {
                a2.i(i2, str);
            }
            i2++;
        }
        a2.g(i3, i);
        this.a.E();
        Cursor q = this.a.q(a2);
        try {
            int a3 = bx.a(q, "contact_id");
            int a4 = bx.a(q, "contact_affinity");
            int a5 = bx.a(q, "contact_proto_bytes");
            int a6 = bx.a(q, "token_contact_id");
            int a7 = bx.a(q, "token_value");
            int a8 = bx.a(q, "token_affinity");
            int a9 = bx.a(q, "token_field_type");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                cysn cysnVar = null;
                if (q.isNull(a3) && q.isNull(a4) && q.isNull(a5)) {
                    cyqgVar = null;
                    if (q.isNull(a6) || !q.isNull(a7) || !q.isNull(a8) || !q.isNull(a9)) {
                        cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                    }
                    arrayList.add(new cysl(cysnVar, cyqgVar));
                }
                cyqgVar = new cyqg(q.getLong(a3), q.getDouble(a4), dspd.x(q.getBlob(a5)));
                if (q.isNull(a6)) {
                }
                cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                arrayList.add(new cysl(cysnVar, cyqgVar));
            }
            return arrayList;
        } finally {
            q.close();
            a2.c();
        }
    }

    @Override // defpackage.cyrn
    public final List<cysl> j(Set<String> set, int i) {
        cyqg cyqgVar;
        StringBuilder a = ca.a();
        a.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.field_type IN (");
        int size = set.size();
        ca.b(a, size);
        a.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ");
        a.append("?");
        int i2 = 1;
        int i3 = size + 1;
        br a2 = br.a(a.toString(), i3);
        for (String str : set) {
            if (str == null) {
                a2.f(i2);
            } else {
                a2.i(i2, str);
            }
            i2++;
        }
        a2.g(i3, i);
        this.a.E();
        Cursor q = this.a.q(a2);
        try {
            int a3 = bx.a(q, "contact_id");
            int a4 = bx.a(q, "contact_affinity");
            int a5 = bx.a(q, "contact_proto_bytes");
            int a6 = bx.a(q, "token_contact_id");
            int a7 = bx.a(q, "token_value");
            int a8 = bx.a(q, "token_affinity");
            int a9 = bx.a(q, "token_field_type");
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                cysn cysnVar = null;
                if (q.isNull(a3) && q.isNull(a4) && q.isNull(a5)) {
                    cyqgVar = null;
                    if (q.isNull(a6) || !q.isNull(a7) || !q.isNull(a8) || !q.isNull(a9)) {
                        cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                    }
                    arrayList.add(new cysl(cysnVar, cyqgVar));
                }
                cyqgVar = new cyqg(q.getLong(a3), q.getDouble(a4), dspd.x(q.getBlob(a5)));
                if (q.isNull(a6)) {
                }
                cysnVar = new cysn(q.getLong(a6), q.getString(a7), q.getDouble(a8), cysn.a(q.getString(a9)));
                arrayList.add(new cysl(cysnVar, cyqgVar));
            }
            return arrayList;
        } finally {
            q.close();
            a2.c();
        }
    }
}
