package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: qtq  reason: default package */
/* loaded from: classes4.dex */
public final class qtq {
    private int d;
    private final afw c = new afw();
    public final rvh b = new rvh();
    private boolean e = false;
    public final afw a = new afw();

    public qtq(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((qsy) it.next()).o(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(qtp qtpVar, ConnectionResult connectionResult, String str) {
        this.a.put(qtpVar, connectionResult);
        this.c.put(qtpVar, str);
        this.d--;
        if (!connectionResult.c()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.b.a(new qsq(this.a));
                return;
            }
            this.b.b(this.c);
        }
    }
}
