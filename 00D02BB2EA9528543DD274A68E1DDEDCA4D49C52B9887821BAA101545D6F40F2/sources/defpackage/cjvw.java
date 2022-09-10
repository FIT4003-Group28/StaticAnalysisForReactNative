package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: cjvw  reason: default package */
/* loaded from: classes4.dex */
final class cjvw implements btzi<dwup, dwur> {
    final cjvz a;
    final /* synthetic */ cjvx b;

    public cjvw(cjvx cjvxVar, cjvz cjvzVar) {
        this.b = cjvxVar;
        this.a = cjvzVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwup> btzrVar, btzy btzyVar) {
        cjvx cjvxVar = this.b;
        cjvz cjvzVar = this.a;
        cjwe cjweVar = cjvxVar.a;
        cjvp cjvpVar = (cjvp) cjvzVar;
        btlu btluVar = cjvpVar.a;
        dcdc<cjtk> dcdcVar = cjvpVar.b;
        bvrj.UI_THREAD.d();
        if (cjweVar.c.d) {
            cjvv cjvvVar = cjweVar.c;
            if (!cjvvVar.e.getAndSet(true)) {
                try {
                    SQLiteDatabase b = cjvvVar.b.b();
                    b.beginTransaction();
                    cjvv.d(b);
                    b.setTransactionSuccessful();
                    cjvvVar.d = false;
                    b.endTransaction();
                } catch (Exception e) {
                    bvoo.j(e);
                }
            }
        }
        if (cjweVar.c.d) {
            return;
        }
        cjvv cjvvVar2 = cjweVar.c;
        if (!cjvvVar2.d) {
            try {
                SQLiteDatabase b2 = cjvvVar2.b.b();
                b2.beginTransaction();
                dcpe<cjtk> listIterator = dcdcVar.listIterator();
                while (listIterator.hasNext()) {
                    cjtk next = listIterator.next();
                    long b3 = cjvvVar2.c.b() - (cjvvVar2.c.e() - next.h());
                    String b4 = cjvv.b(btluVar);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("user_account_id", b4);
                    contentValues.put("ue3", next.l().bS());
                    contentValues.put("timestamp", Long.valueOf(b3));
                    b2.insert("userevent3_table", null, contentValues);
                }
                b2.setTransactionSuccessful();
                b2.endTransaction();
            } catch (Exception e2) {
                cjvvVar2.d = true;
                bvoo.j(e2);
            }
        }
        dcdcVar.size();
        if (btlu.p(btluVar)) {
            return;
        }
        String str = btluVar.d;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwup> btzrVar, dwur dwurVar) {
        final btlu btluVar = ((cjvp) this.a).a;
        if (btlu.n(btluVar)) {
            cjvx cjvxVar = this.b;
            final cjwe cjweVar = cjvxVar.a;
            cjweVar.a(new bvrp(cjweVar, btluVar) { // from class: cjwd
                private final cjwe a;
                private final btlu b;

                {
                    this.a = cjweVar;
                    this.b = btluVar;
                }

                @Override // defpackage.bvrp
                public final Object a(Object obj, Object obj2) {
                    return this.a.c.a(new dbrn(this.b, ((Long) obj).longValue(), ((Long) obj2).longValue()) { // from class: cjvs
                        private final btlu a;
                        private final long b;
                        private final long c;

                        {
                            this.a = r1;
                            this.b = r2;
                            this.c = r4;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj3) {
                            btlu btluVar2 = this.a;
                            long j = this.b;
                            long j2 = this.c;
                            return ((SQLiteDatabase) obj3).query("userevent3_table", cjvv.a, "user_account_id = ? AND timestamp > ?", new String[]{cjvv.b(btluVar2), Long.toString(j)}, null, null, "timestamp", Long.toString(j2));
                        }
                    });
                }
            });
            cjvxVar.e(cjvxVar.a.d, cjwj.HIGH);
            return;
        }
        cjvx cjvxVar2 = this.b;
        cjwe cjweVar2 = cjvxVar2.a;
        final cjvv cjvvVar = cjweVar2.c;
        cjvvVar.getClass();
        cjweVar2.a(new bvrp(cjvvVar) { // from class: cjwc
            private final cjvv a;

            {
                this.a = cjvvVar;
            }

            @Override // defpackage.bvrp
            public final Object a(Object obj, Object obj2) {
                return this.a.a(new dbrn(((Long) obj).longValue(), ((Long) obj2).longValue()) { // from class: cjvr
                    private final long a;
                    private final long b;

                    {
                        this.a = r1;
                        this.b = r3;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj3) {
                        return ((SQLiteDatabase) obj3).query("userevent3_table", cjvv.a, "timestamp > ?", new String[]{Long.toString(this.a)}, null, null, "timestamp", Long.toString(this.b));
                    }
                });
            }
        });
        cjvxVar2.e(cjvxVar2.a.d, cjwj.HIGH);
    }
}
