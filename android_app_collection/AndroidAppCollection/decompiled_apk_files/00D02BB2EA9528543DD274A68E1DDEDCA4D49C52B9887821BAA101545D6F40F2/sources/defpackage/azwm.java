package defpackage;

import android.content.Context;
import defpackage.azwm;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azwm  reason: default package */
/* loaded from: classes.dex */
public abstract class azwm<T extends azwm<T>> implements Serializable {
    protected static final dolk h = dolk.h;
    protected static final dojz i = dojz.c;
    private final long a;
    @dzsi
    private final bvrt<dolk> b;
    @dzsi
    private final bvrt<dojz> c;
    @dzsi
    public final azwl j;
    public final long k;
    @dzsi
    public final String l;
    public final long m;

    /* JADX INFO: Access modifiers changed from: protected */
    public azwm(azwh<T> azwhVar) {
        boolean z = true;
        dbsk.b(azwhVar.e != null, "SyncPlaceData is null");
        dbsk.b(azwhVar.f == null ? false : z, "SyncDataAnnotations is null");
        this.k = azwhVar.c;
        this.j = new azwl(azwhVar.d, azwhVar.g);
        this.l = azwhVar.h;
        this.m = 0L;
        this.a = 0L;
        this.b = bvrt.b(azwhVar.e);
        this.c = bvrt.b(azwhVar.f);
        String str = azwhVar.i;
    }

    public static azwm<?> p(String str, long j) {
        return new azwg(j, str);
    }

    @dzsi
    public Long QH() {
        return null;
    }

    public akqi b() {
        dbsk.b(this.b != null, "SyncPlaceData is null and should not be used outside of Sync V2 context.");
        dolk r = r();
        dbsk.s(r);
        if (r.g.isEmpty()) {
            return akqi.a;
        }
        dolk r2 = r();
        dbsk.s(r2);
        return akqi.b(r2.g);
    }

    public String c() {
        dbsk.b(this.b != null, "SyncPlaceData is null and should not be used outside of Sync V2 context.");
        dolk r = r();
        dbsk.s(r);
        return r.d;
    }

    public akqq d() {
        dbsk.b(this.b != null, "SyncPlaceData is null and should not be used outside of Sync V2 context.");
        dolk r = r();
        dbsk.s(r);
        dnoh dnohVar = r.e;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        return new akqq(dnohVar.b, dnohVar.c);
    }

    public abstract String e(@dzsi Context context);

    public boolean f() {
        return this.m != 0;
    }

    @dzsi
    public abstract azxm<T> h();

    public abstract azwh<T> i();

    public final long q() {
        if (this.c != null) {
            dojz s = s();
            dbsk.s(s);
            return s.b;
        }
        return this.a;
    }

    @dzsi
    public final dolk r() {
        bvrt<dolk> bvrtVar = this.b;
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e((dssr) dolk.h.cu(7), dolk.h);
    }

    @dzsi
    public final dojz s() {
        bvrt<dojz> bvrtVar = this.c;
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e((dssr) dojz.c.cu(7), dojz.c);
    }

    public final String t() {
        dbsk.b(this.b != null, "SyncPlaceData is null and should not be used outside of Sync V2 context.");
        dolk r = r();
        dbsk.s(r);
        return r.b;
    }

    public final boolean u() {
        dbsk.b(this.b != null, "SyncPlaceData is null and should not be used outside of Sync V2 context.");
        dolk r = r();
        dbsk.s(r);
        return r.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public azwm(String str, long j, long j2) {
        new azwk(str);
        this.j = null;
        this.l = null;
        this.a = j;
        this.m = j2;
        this.k = 0L;
        this.b = null;
        this.c = null;
    }
}
