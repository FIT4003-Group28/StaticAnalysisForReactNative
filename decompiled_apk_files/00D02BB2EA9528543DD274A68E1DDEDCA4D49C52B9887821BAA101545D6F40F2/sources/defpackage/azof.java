package defpackage;

import android.app.Application;
import android.database.Cursor;
import java.util.List;
/* compiled from: PG */
/* renamed from: azof  reason: default package */
/* loaded from: classes.dex */
public final class azof {
    public final aznn a;
    public final ckcw b;

    public azof(Application application, ckcw ckcwVar, afec afecVar) {
        this.a = new aznn(application, afecVar);
        this.b = ckcwVar;
    }

    public static <T extends azwm<T>> dcdc<T> d(azxm<T> azxmVar, List<aznp> list) {
        dccx F = dcdc.F();
        for (aznp aznpVar : list) {
            azwm e = e(azxmVar, aznpVar);
            if (e != null) {
                F.g(e);
            }
        }
        return F.f();
    }

    @dzsi
    public static <T extends azwm<T>> T e(azxm<T> azxmVar, aznp aznpVar) {
        azwh<T> azwhVar;
        try {
            azwhVar = azxmVar.c(aznpVar.f);
        } catch (RuntimeException e) {
            bvoo.f(e);
            azwhVar = null;
        }
        if (azwhVar == null) {
            return null;
        }
        azwhVar.c = aznpVar.a;
        azwhVar.d = aznpVar.c;
        azwhVar.g = aznpVar.g;
        azwhVar.h = aznpVar.l;
        return azwhVar.b();
    }

    public static <T extends azwm<T>> aznp n(azxm<T> azxmVar, T t, String str, aznl aznlVar) {
        azno aznoVar = new azno(azxmVar.b(), str, azxmVar.f(t), aznlVar);
        aznoVar.c = t.q();
        akqi b = t.b();
        if (!akqi.d(b)) {
            aznoVar.d = null;
        } else {
            aznoVar.d = Long.valueOf(b.n().a);
        }
        akqq d = t.d();
        if (d != null) {
            aznoVar.e = Integer.valueOf(aznp.a(d.a));
            aznoVar.f = Integer.valueOf(aznp.a(d.b));
        } else {
            aznoVar.e = null;
            aznoVar.f = null;
        }
        azwl azwlVar = t.j;
        dbsk.s(azwlVar);
        String str2 = azwlVar.b;
        if (str2 != null) {
            aznoVar.b = str2;
        }
        Long QH = t.QH();
        if (QH != null) {
            aznoVar.g = QH;
        }
        String str3 = t.l;
        if (str3 != null) {
            aznoVar.h = str3;
        }
        return aznoVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T extends azwm<T>> dcdc<T> p(azxm<T> azxmVar, decs decsVar) {
        List<aznp> e;
        try {
            String[] strArr = {Integer.toString(azxmVar.b().n), Long.toString(decsVar.a), Integer.toString(aznl.DELETE.e)};
            synchronized (aznn.class) {
                Cursor c = aznn.c("corpus = ? AND feature_fprint = ? AND sync_state != ? ", strArr, null);
                try {
                    e = aznn.e(c);
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
            return d(azxmVar, e);
        } catch (azom e2) {
            throw new axxc("Read transaction error.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T extends azwm<T>> dcdc<T> q(azxm<T> azxmVar, String str) {
        List<aznp> e;
        try {
            String[] strArr = {Integer.toString(azxmVar.b().n), str, Integer.toString(aznl.DELETE.e)};
            synchronized (aznn.class) {
                Cursor c = aznn.c("corpus = ? AND server_id = ? AND sync_state != ? ", strArr, null);
                try {
                    e = aznn.e(c);
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
            return d(azxmVar, e);
        } catch (azom e2) {
            throw new axxc("Read transaction error.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T extends azwm<T>> dcdc<T> r(azxm<T> azxmVar, String str) {
        List<aznp> e;
        try {
            String[] strArr = {Integer.toString(azxmVar.b().n), str, Integer.toString(aznl.DELETE.e)};
            synchronized (aznn.class) {
                Cursor c = aznn.c("corpus = ? AND string_index = ? AND sync_state != ? ", strArr, null);
                try {
                    e = aznn.e(c);
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
            return d(azxmVar, e);
        } catch (azom e2) {
            throw new axxc("Read transaction error.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final <T extends azwm<T>> dcdc<azkt<T>> s(azxm<T> azxmVar) {
        List<aznp> e;
        if (azxmVar != null) {
            try {
                String[] strArr = {Integer.toString(azxmVar.b().n), Integer.toString(aznl.SYNCED.e)};
                synchronized (aznn.class) {
                    Cursor c = aznn.c("corpus = ? AND sync_state != ? ", strArr, "timestamp ASC");
                    try {
                        e = aznn.e(c);
                    } finally {
                        c.close();
                    }
                }
                dccx F = dcdc.F();
                for (aznp aznpVar : e) {
                    azwm e2 = e(azxmVar, aznpVar);
                    if (e2 != null) {
                        F.g(new azkt(e2, aznpVar.e));
                    }
                }
                return F.f();
            } catch (azom e3) {
                throw new axxc("Read transaction error.", e3);
            }
        }
        return dcdc.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean t() {
        try {
            Cursor query = aznn.b(false).query("sync_item_data", aznn.a, "sync_state != ? ", new String[]{Integer.toString(aznl.SYNCED.e)}, null, null, null, "1");
            boolean d = aznn.d(query);
            query.close();
            return d;
        } catch (azom e) {
            throw new axxc("Failed to determine state of unsynced items", e);
        }
    }

    private final <T extends azwm<T>> long u(azxm<T> azxmVar) {
        Long l = (Long) aznn.g(new aznv(azxmVar));
        dbsk.s(l);
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends azwm<T>> dcdc<T> a(azxm<T> azxmVar) {
        List<aznp> e;
        if (azxmVar == null) {
            return dcdc.e();
        }
        ((ckco) this.b.a(ckkf.a)).a(azxmVar.b().n);
        try {
            String[] strArr = {Integer.toString(azxmVar.b().n), Integer.toString(aznl.DELETE.e)};
            synchronized (aznn.class) {
                Cursor c = aznn.c("corpus = ? AND sync_state != ? ", strArr, "timestamp DESC");
                try {
                    e = aznn.e(c);
                } finally {
                    c.close();
                }
            }
            return d(azxmVar, e);
        } catch (azom e2) {
            throw new axxc("Read transaction error.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends azwm<T>> dbsg<T> b(azxm<T> azxmVar, String str) {
        try {
            azwm e = e(azxmVar, aznn.p(azxmVar.b(), str));
            if (e == null) {
                azxmVar.b();
                return dbpy.a;
            }
            return dbsg.i(e);
        } catch (azom e2) {
            throw new axxc("Failed to retrieve item from database.", e2);
        } catch (IllegalArgumentException unused) {
            return dbpy.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(azxl azxlVar, String str) {
        try {
            return aznn.p(azxlVar, str).e == aznl.SYNCED;
        } catch (azom e) {
            throw new axxc("Read transaction error.", e);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends azwm<T>> boolean f(azxm<T> azxmVar, aznj<T> aznjVar, doiz doizVar, long j, bati batiVar) {
        ckcq ckcqVar;
        boolean z;
        int a;
        boolean booleanValue;
        int a2 = dois.a(doizVar.h);
        if (a2 != 0 && a2 == 1) {
            String str = null;
            if (azxmVar.g() != null) {
                ckcw ckcwVar = this.b;
                ckhg g = azxmVar.g();
                dbsk.s(g);
                ckcqVar = ((ckcr) ckcwVar.a(g)).a();
            } else {
                ckcqVar = null;
            }
            boolean z2 = false;
            for (dojx dojxVar : doizVar.f) {
                try {
                    a = dojw.a(dojxVar.c);
                } catch (azom unused) {
                }
                if (a != 0 && a == 1) {
                    Boolean bool = (Boolean) aznn.g(new aznx(this, dojxVar, j));
                    dbsk.s(bool);
                    booleanValue = bool.booleanValue();
                    z2 |= booleanValue;
                    batiVar.b();
                }
                booleanValue = false;
                z2 |= booleanValue;
                batiVar.b();
            }
            batiVar.b();
            if (doizVar.g) {
                try {
                    Integer num = (Integer) aznn.g(new azny(this, azxmVar));
                    dbsk.s(num);
                    z2 |= num.intValue() > 0;
                } catch (azom unused2) {
                    z = true;
                }
            }
            z = false;
            batiVar.b();
            for (azwj azwjVar : azxmVar.d(doizVar)) {
                try {
                    Boolean bool2 = (Boolean) aznn.g(new aznz(this, aznjVar.b(azwjVar)));
                    dbsk.s(bool2);
                    z2 = bool2.booleanValue() | z2;
                } catch (azom unused3) {
                    z = true;
                }
                batiVar.b();
            }
            batiVar.b();
            for (T t : azxmVar.e(doizVar)) {
                try {
                    z2 = (!(h(azxmVar, aznjVar.a(t)) == null)) | z2;
                } catch (azom unused4) {
                    z = true;
                }
                batiVar.b();
            }
            batiVar.b();
            if (!z) {
                try {
                    if ((doizVar.a & 2) != 0) {
                        str = doizVar.e;
                    }
                    i(azxmVar.b(), doizVar.d, str);
                } catch (azom e) {
                    throw new axxc("Failed to store sync token.", e);
                }
            }
            if (ckcqVar != null) {
                ckcqVar.b();
            }
            if (z) {
                throw new axxc();
            }
            return true == z2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends azwm<T>> T g(azxm<T> azxmVar, T t) {
        azxm<T> h = t.h();
        dbsk.s(h);
        ((ckco) this.b.a(ckkf.b)).a(h.b().n);
        azwh<T> i = t.i();
        azwl azwlVar = t.j;
        dbsk.s(azwlVar);
        String str = azwlVar.a;
        if (str.equals("Auto-generate a ClientId, please!")) {
            try {
                str = azwl.a(u(azxmVar));
                i.d = str;
            } catch (azom e) {
                throw new axxc("Failed to auto-generate clientId.", e);
            }
        }
        try {
            Long l = (Long) aznn.g(new azoa(this, azxmVar, str, t));
            dbsk.s(l);
            i.c = l.longValue();
            return i.b();
        } catch (azom e2) {
            throw new axxc("Failed to add or update item in SyncDatabase.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final <T extends azwm<T>> T h(azxm<T> azxmVar, T t) {
        azwl azwlVar = t.j;
        dbsk.s(azwlVar);
        String str = azwlVar.a;
        if (str.equals("Auto-generate a ClientId, please!")) {
            str = azwl.a(u(azxmVar));
        }
        azwh<T> i = t.i();
        Long l = (Long) aznn.g(new azob(this, t, azxmVar, str));
        dbsk.s(l);
        long longValue = l.longValue();
        if (longValue == 0) {
            return null;
        }
        i.c = longValue;
        i.d = str;
        return i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(azxl azxlVar, @dzsi String str, @dzsi String str2) {
        aznn.g(new azoc(azxlVar, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(azwm<?> azwmVar) {
        azxm<?> h = azwmVar.h();
        dbsk.s(h);
        ((ckco) this.b.a(ckkf.b)).a(h.b().n);
        try {
            Boolean bool = (Boolean) aznn.g(new aznq(this, azwmVar));
            dbsk.s(bool);
            return bool.booleanValue();
        } catch (azom e) {
            throw new axxc("Read transaction error.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(List<azwm<?>> list) {
        try {
            Boolean bool = (Boolean) aznn.g(new aznr(this, list));
            dbsk.s(bool);
            return bool.booleanValue();
        } catch (azom e) {
            throw new axxc("Read transaction error.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends azwm<T>> azoh l(azxm<T> azxmVar) {
        try {
            azoh azohVar = (azoh) aznn.g(new azns(azxmVar));
            dbsk.s(azohVar);
            return azohVar;
        } catch (azom e) {
            throw new axxc("Read transaction error.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final Long m() {
        try {
            return (Long) aznn.g(new aznu());
        } catch (azom e) {
            throw new axxc("Read transaction error.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(azxl azxlVar, @dzsi Long l) {
        try {
            aznn.g(new azod(azxlVar, l));
        } catch (azom unused) {
        }
    }
}
