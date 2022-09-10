package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: btou  reason: default package */
/* loaded from: classes.dex */
public final class btou implements Iterable<btos>, Closeable {
    public static final dcqe a = dcqe.c("btou");
    public final dbsg<Cursor> b;
    private boolean c;

    public btou(Context context, final Uri uri, btoq btoqVar) {
        final String str;
        Cursor a2;
        if (Build.VERSION.SDK_INT >= 26) {
            final btnz btnzVar = new btnz(context);
            final String[] f = btoqVar.a().f();
            final Bundle bundle = new Bundle();
            if (btoqVar.e().a()) {
                bundle.putInt("android:query-arg-limit", btoqVar.e().b().intValue());
            }
            if (btoqVar.b().a()) {
                bundle.putString("android:query-arg-sql-selection", btoqVar.b().b());
            }
            if (btoqVar.c().a()) {
                bundle.putStringArray("android:query-arg-sql-selection-args", btoqVar.c().b());
            }
            if (btoqVar.d().a()) {
                bundle.putString("android:query-arg-sql-sort-order", btoqVar.d().b());
            }
            final CancellationSignal f2 = btoqVar.f().f();
            a2 = btnz.a(new btny(btnzVar, uri, f, bundle, f2) { // from class: btnu
                private final btnz a;
                private final Uri b;
                private final String[] c;
                private final Bundle d;
                private final CancellationSignal e;

                {
                    this.a = btnzVar;
                    this.b = uri;
                    this.c = f;
                    this.d = bundle;
                    this.e = f2;
                }

                @Override // defpackage.btny
                public final Object a() {
                    btnz btnzVar2 = this.a;
                    return btnzVar2.a.query(this.b, this.c, this.d, this.e);
                }
            });
        } else {
            String f3 = btoqVar.d().f();
            String str2 = (String) btoqVar.e().h(btoc.a).f();
            if (str2 != null) {
                f3 = f3 == null ? "" : f3;
                if (str2.length() != 0) {
                    f3 = f3.concat(str2);
                } else {
                    str = new String(f3);
                    final btnz btnzVar2 = new btnz(context);
                    final String[] f4 = btoqVar.a().f();
                    final String f5 = btoqVar.b().f();
                    final String[] f6 = btoqVar.c().f();
                    final CancellationSignal f7 = btoqVar.f().f();
                    a2 = btnz.a(new btny(btnzVar2, uri, f4, f5, f6, str, f7) { // from class: btnt
                        private final btnz a;
                        private final Uri b;
                        private final String[] c;
                        private final String d;
                        private final String[] e;
                        private final String f;
                        private final CancellationSignal g;

                        {
                            this.a = btnzVar2;
                            this.b = uri;
                            this.c = f4;
                            this.d = f5;
                            this.e = f6;
                            this.f = str;
                            this.g = f7;
                        }

                        @Override // defpackage.btny
                        public final Object a() {
                            btnz btnzVar3 = this.a;
                            return btnzVar3.a.query(this.b, this.c, this.d, this.e, this.f, this.g);
                        }
                    });
                }
            }
            str = f3;
            final btnz btnzVar22 = new btnz(context);
            final String[] f42 = btoqVar.a().f();
            final String f52 = btoqVar.b().f();
            final String[] f62 = btoqVar.c().f();
            final CancellationSignal f72 = btoqVar.f().f();
            a2 = btnz.a(new btny(btnzVar22, uri, f42, f52, f62, str, f72) { // from class: btnt
                private final btnz a;
                private final Uri b;
                private final String[] c;
                private final String d;
                private final String[] e;
                private final String f;
                private final CancellationSignal g;

                {
                    this.a = btnzVar22;
                    this.b = uri;
                    this.c = f42;
                    this.d = f52;
                    this.e = f62;
                    this.f = str;
                    this.g = f72;
                }

                @Override // defpackage.btny
                public final Object a() {
                    btnz btnzVar3 = this.a;
                    return btnzVar3.a.query(this.b, this.c, this.d, this.e, this.f, this.g);
                }
            });
        }
        this.c = false;
        dbsg<Cursor> j = dbsg.j(a2);
        this.b = j;
        if (!j.a()) {
            bvoo.h("Cursor was missing (null) for Uri %s", uri);
        }
    }

    public static <T> btor<T> j(dbsg<Cursor> dbsgVar, final String str, final bton<T> btonVar) {
        dbsg h = dbsgVar.h(new dbrn(str) { // from class: btob
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Integer.valueOf(((Cursor) obj).getColumnIndex(this.a));
            }
        });
        if (h.a() && ((Integer) h.b()).intValue() < 0) {
            h = dbpy.a;
        }
        return (btor) h.h(new dbrn(btonVar) { // from class: btok
            private final bton a;

            {
                this.a = btonVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new btot(((Integer) obj).intValue(), this.a);
            }
        }).e(btol.a);
    }

    public final btor<String> a(String str) {
        return j(this.b, str, btoa.a);
    }

    public final btor<Integer> b(String str) {
        return j(this.b, str, btod.a);
    }

    public final btor<Long> c(String str) {
        return j(this.b, str, btoe.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.a()) {
            this.b.b().close();
        }
    }

    public final btor<Float> d(String str) {
        return j(this.b, str, btof.a);
    }

    public final btor<Double> e(String str) {
        return j(this.b, str, btog.a);
    }

    public final <T> dbsg<T> f(dbrn<btos, dbsg<T>> dbrnVar) {
        if (i() > 0) {
            Cursor b = this.b.b();
            int position = b.getPosition();
            if (position != 0 && !b.moveToFirst()) {
                bvoo.h("Could not move cursor into position.", new Object[0]);
            }
            dbsg<T> a2 = dbrnVar.a(new btos(b));
            if (b.getPosition() != position && !b.moveToPosition(position) && b.getPosition() != position) {
                bvoo.h("Could not move cursor into position.", new Object[0]);
            }
            if (a2 != null) {
                return a2;
            }
        }
        return dbpy.a;
    }

    public final <T> dbsg<T> g(final btor<T> btorVar) {
        return f(new dbrn(btorVar) { // from class: btoi
            private final btor a;

            {
                this.a = btorVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((btos) obj).a(this.a);
            }
        });
    }

    public final dbsg<btos> h() {
        return i() > 0 ? dbsg.i(iterator().next()) : dbpy.a;
    }

    public final int i() {
        return ((Integer) this.b.h(btoj.a).c(0)).intValue();
    }

    @Override // java.lang.Iterable
    public final Iterator<btos> iterator() {
        dbsk.m(!this.c, "An iterator has already been created for this query.");
        this.c = true;
        int i = i();
        if (i <= 0) {
            return dcdc.e().listIterator();
        }
        return new btom(i, this.b.b());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public btou(android.content.Context r2, android.net.Uri r3, java.lang.String... r4) {
        /*
            r1 = this;
            btop r0 = defpackage.btoq.h()
            r0.b(r4)
            btoq r4 = r0.a()
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btou.<init>(android.content.Context, android.net.Uri, java.lang.String[]):void");
    }
}
