package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wwr  reason: default package */
/* loaded from: classes4.dex */
public final class wwr extends wwo {
    protected final snc g;
    wwq h;
    final long i;
    private final Object j;
    private final Object k;
    private final afvn l;

    public wwr(Context context, String str, apej apejVar, String str2, String str3, wwi wwiVar, snc sncVar, long j, afvn afvnVar, boolean z, boolean z2, int i) {
        super(context, str, apejVar, str2, str3, wwiVar, z, z2, i);
        this.g = sncVar;
        aqxo.y(j >= 0);
        this.i = j;
        afvnVar.getClass();
        this.l = afvnVar;
        this.j = new Object();
        this.k = new Object();
    }

    @Override // defpackage.wwo, defpackage.wwl
    public final String b() {
        ylr.b();
        synchronized (this.j) {
            wwq wwqVar = this.h;
            if (j(wwqVar)) {
                return wwqVar.a;
            }
            synchronized (this.k) {
                synchronized (this.j) {
                    if (j(this.h)) {
                        return this.h.a;
                    }
                    String i = i();
                    String b = super.b();
                    synchronized (this.j) {
                        long c = this.g.c();
                        if (!TextUtils.isEmpty(b) && c > 0) {
                            this.h = new wwq(b, c, i);
                        } else {
                            this.h = null;
                        }
                    }
                    return b;
                }
            }
        }
    }

    @Override // defpackage.wwo, defpackage.wwl
    public final void e(Executor executor) {
        executor.execute(new wwp(this));
    }

    @Override // defpackage.wwo, defpackage.wwl
    public final void f() {
        ylr.b();
        b();
    }

    protected final String i() {
        return this.l.c().d();
    }

    protected final boolean j(wwq wwqVar) {
        String str;
        long j = this.i;
        if (wwqVar == null || TextUtils.isEmpty(wwqVar.a) || (str = wwqVar.a) == null || str.length() <= 8) {
            return false;
        }
        long min = Math.min(this.i, j);
        long j2 = wwqVar.b;
        long c = this.g.c();
        return c >= j2 && c < j2 + min && TextUtils.equals(wwqVar.c, i());
    }
}
