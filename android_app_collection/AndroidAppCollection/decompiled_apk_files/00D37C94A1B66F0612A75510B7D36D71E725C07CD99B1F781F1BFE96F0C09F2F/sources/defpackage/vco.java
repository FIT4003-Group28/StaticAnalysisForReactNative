package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vco  reason: default package */
/* loaded from: classes4.dex */
public final class vco {
    public static final vcn a = new vcn();
    final vbk b;
    final String c;
    public final boolean g;
    private volatile String h;
    public final boolean f = false;
    final String d = "";
    final vde e = new vde(new vcm(this, 1));

    /* JADX INFO: Access modifiers changed from: protected */
    public vco(vbk vbkVar, String str, boolean z) {
        this.b = vbkVar;
        this.c = str;
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final Object a(String str) {
        Object obj;
        vde vdeVar = this.e;
        Map map = vdeVar.b;
        if (map == null) {
            synchronized (vdeVar.a) {
                Map map2 = vdeVar.b;
                Map map3 = map2;
                if (map2 == null) {
                    ?? r1 = vdeVar.c.get();
                    r1.getClass();
                    vdeVar.b = r1;
                    vdeVar.c = null;
                    map3 = r1;
                }
                obj = map3.get(str);
            }
            return obj;
        }
        return map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ankt b() {
        if (this.h.isEmpty()) {
            return ankq.a;
        }
        return anhq.i(this.b.d().a(this.h), vby.class, new vdm(this, 1), this.b.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map c() {
        vdr vdrVar;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                vdrVar = (vdr) anlz.c(vdq.g(this.b, this.c, this.d, this.g).a());
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Unable to retrieve flag snapshot for ");
            sb.append(str);
            sb.append(" from storage.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            vdrVar = null;
        }
        if (vdrVar == null || vdrVar.c.isEmpty()) {
            this.b.c().execute(new vdn(this));
            String str2 = this.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 54);
            sb2.append("Unable to retrieve flag snapshot for ");
            sb2.append(str2);
            sb2.append(", using defaults.");
            Log.w("ProtoDataStoreFlagStore", sb2.toString());
            return amyc.b;
        }
        this.h = vdrVar.c;
        this.b.c().execute(new vdn(this, 1));
        this.b.c().execute(new vdn(this, 2));
        return vdq.c(vdrVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        ankt d = vdq.d(this.b, this.c, this.d);
        anii.i(d, new vdm(this), this.b.c()).qY(new vdo(this, d, 1), this.b.c());
    }

    public final /* synthetic */ void e(ankt anktVar) {
        try {
            amup c = vdq.c((vdr) anlz.y(anktVar));
            vde vdeVar = this.e;
            c.getClass();
            synchronized (vdeVar.a) {
                if (vdeVar.b == null) {
                    vdeVar.b = c;
                    vdeVar.c = null;
                    return;
                }
                boolean equals = vdeVar.b.equals(c);
                if (equals) {
                    return;
                }
                this.b.b();
                this.b.b().a();
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Unable to update local snapshot for ");
            sb.append(str);
            sb.append(", may result in stale flags.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
        }
    }
}
