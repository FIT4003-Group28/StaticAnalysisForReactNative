package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rcr  reason: default package */
/* loaded from: classes4.dex */
public final class rcr implements rcg {
    public final rcs a;
    private final Object b;
    private final rcd c;
    private final dtl d;

    public rcr(Object obj, rcs rcsVar, dtl dtlVar, rcd rcdVar) {
        this.b = obj;
        this.a = rcsVar;
        this.d = dtlVar;
        this.c = rcdVar;
    }

    private static long h(long j) {
        return System.currentTimeMillis() - j;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        aopa createBuilder = dob.a.createBuilder();
        createBuilder.copyOnWrite();
        dob dobVar = (dob) createBuilder.instance;
        dobVar.e = 4;
        dobVar.b = 4 | dobVar.b;
        createBuilder.f(aoob.x(bArr));
        return Base64.encodeToString(((dob) createBuilder.mo39build()).toByteArray(), 11);
    }

    private final synchronized byte[] j(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.c(2007, h(currentTimeMillis), e);
            return null;
        }
        return (byte[]) this.b.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.b, null, map);
    }

    @Override // defpackage.rcg
    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map a;
        dtl dtlVar = this.d;
        a = dtlVar.a();
        a.put("lts", Long.valueOf(dtlVar.c.a()));
        a.put("f", "c");
        a.put("ctx", context);
        a.put("cs", str);
        a.put("aid", null);
        a.put("view", view);
        a.put("act", activity);
        return i(j(a));
    }

    @Override // defpackage.rcg
    public final synchronized String b(Context context, View view, Activity activity) {
        Map a;
        a = this.d.a();
        a.put("f", "v");
        a.put("ctx", context);
        a.put("aid", null);
        a.put("view", view);
        a.put("act", activity);
        return i(j(a));
    }

    @Override // defpackage.rcg
    public final synchronized String c(Context context) {
        Map a;
        long j;
        dtl dtlVar = this.d;
        a = dtlVar.a();
        dnw a2 = rcn.a(dtlVar.b.d, rcl.a);
        a.put("gai", Boolean.valueOf(dtlVar.a.b));
        a.put("did", a2.ab);
        int a3 = dnt.a(a2.ac);
        if (a3 == 0) {
            a3 = 3;
        }
        a.put("dst", Integer.valueOf(a3 - 1));
        a.put("doo", Boolean.valueOf(a2.ad));
        dta dtaVar = dtlVar.d;
        if (dtaVar != null) {
            synchronized (dta.class) {
                NetworkCapabilities networkCapabilities = dtaVar.a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        j = 2;
                    } else if (dtaVar.a.hasTransport(1)) {
                        j = 1;
                    } else if (dtaVar.a.hasTransport(0)) {
                        j = 0;
                    }
                }
                j = -1;
            }
            a.put("nt", Long.valueOf(j));
        }
        a.put("f", "q");
        a.put("ctx", context);
        a.put("aid", null);
        return i(j(a));
    }

    @Override // defpackage.rcg
    public final synchronized void d(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.b.getClass().getDeclaredMethod("he", Map.class).invoke(this.b, hashMap);
            this.c.d(3003, h(currentTimeMillis));
        } catch (Exception e) {
            throw new rcv(2005, e);
        }
    }

    public final synchronized int e() {
        try {
        } catch (Exception e) {
            throw new rcv(2006, e);
        }
        return ((Integer) this.b.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.b, new Object[0])).intValue();
    }

    public final synchronized void f() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.b.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.b, new Object[0]);
            this.c.d(3001, h(currentTimeMillis));
        } catch (Exception e) {
            throw new rcv(2003, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g() {
        try {
        } catch (Exception e) {
            throw new rcv(2001, e);
        }
        return ((Boolean) this.b.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.b, new Object[0])).booleanValue();
    }
}
