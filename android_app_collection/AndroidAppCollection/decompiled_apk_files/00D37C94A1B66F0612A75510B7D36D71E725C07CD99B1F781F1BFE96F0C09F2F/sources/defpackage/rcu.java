package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
/* compiled from: PG */
/* renamed from: rcu  reason: default package */
/* loaded from: classes4.dex */
public final class rcu {
    public static final Object a = new Object();
    public final Context b;
    public final SharedPreferences c;
    public final String d;
    private final rco e;
    private boolean f;

    public rcu(Context context, int i, rco rcoVar, boolean z) {
        this.f = false;
        this.b = context;
        this.d = Integer.toString(i - 1);
        this.c = context.getSharedPreferences("pcvmspf", 0);
        this.e = rcoVar;
        this.f = z;
    }

    public static String b(dva dvaVar) {
        aopa createBuilder = dvb.a.createBuilder();
        dvb dvbVar = dvaVar.b;
        if (dvbVar == null) {
            dvbVar = dvb.a;
        }
        String str = dvbVar.c;
        createBuilder.copyOnWrite();
        dvb dvbVar2 = (dvb) createBuilder.instance;
        str.getClass();
        dvbVar2.b |= 1;
        dvbVar2.c = str;
        dvb dvbVar3 = dvaVar.b;
        if (dvbVar3 == null) {
            dvbVar3 = dvb.a;
        }
        String str2 = dvbVar3.d;
        createBuilder.copyOnWrite();
        dvb dvbVar4 = (dvb) createBuilder.instance;
        str2.getClass();
        dvbVar4.b |= 2;
        dvbVar4.d = str2;
        dvb dvbVar5 = dvaVar.b;
        if (dvbVar5 == null) {
            dvbVar5 = dvb.a;
        }
        long j = dvbVar5.f;
        createBuilder.copyOnWrite();
        dvb dvbVar6 = (dvb) createBuilder.instance;
        dvbVar6.b |= 8;
        dvbVar6.f = j;
        dvb dvbVar7 = dvaVar.b;
        if (dvbVar7 == null) {
            dvbVar7 = dvb.a;
        }
        long j2 = dvbVar7.g;
        createBuilder.copyOnWrite();
        dvb dvbVar8 = (dvb) createBuilder.instance;
        dvbVar8.b |= 16;
        dvbVar8.g = j2;
        dvb dvbVar9 = dvaVar.b;
        if (dvbVar9 == null) {
            dvbVar9 = dvb.a;
        }
        long j3 = dvbVar9.e;
        createBuilder.copyOnWrite();
        dvb dvbVar10 = (dvb) createBuilder.instance;
        dvbVar10.b |= 4;
        dvbVar10.e = j3;
        return qyi.a(((dvb) createBuilder.mo39build()).toByteString().I());
    }

    public final File a(String str) {
        return new File(new File(this.b.getDir("pccache", 0), this.d), str);
    }

    public final String c() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    public final String d() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    public final void e(int i, long j) {
        rco rcoVar = this.e;
        if (rcoVar != null) {
            rcoVar.a(i, j);
        }
    }

    public final void f(int i, long j, String str) {
        rco rcoVar = this.e;
        if (rcoVar != null) {
            rcoVar.b(i, j, str);
        }
    }

    public final dvb g(int i) {
        String string;
        aoos b;
        if (i == 1) {
            string = this.c.getString(d(), null);
        } else {
            string = this.c.getString(c(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aoob x = aoob.x(qyi.b(string));
            if (this.f) {
                b = aoos.a();
            } else {
                b = aoos.b();
            }
            return (dvb) aopi.parseFrom(dvb.a, x, b);
        } catch (aopx unused) {
            return null;
        } catch (NullPointerException unused2) {
            e(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            e(2032, currentTimeMillis);
            return null;
        }
    }
}
