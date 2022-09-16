package defpackage;

import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: xwr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xwr implements View.OnClickListener {
    public final /* synthetic */ xwx a;
    public final /* synthetic */ xrp b;
    private final /* synthetic */ int c;

    public /* synthetic */ xwr(xwx xwxVar, xrp xrpVar) {
        this.a = xwxVar;
        this.b = xrpVar;
    }

    public /* synthetic */ xwr(xwx xwxVar, xrp xrpVar, int i) {
        this.c = i;
        this.a = xwxVar;
        this.b = xrpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i == 0) {
            this.a.w(this.b);
        } else if (i == 1) {
            this.a.w(this.b);
        } else {
            xwx xwxVar = this.a;
            xrp xrpVar = this.b;
            final xrl xrlVar = xwxVar.e;
            amuk r = amuk.r(xrpVar.a);
            ylr.c();
            amuf f = amuk.f();
            amzt listIterator = r.listIterator();
            while (listIterator.hasNext()) {
                Uri uri = (Uri) listIterator.next();
                xrp xrpVar2 = (xrp) xrlVar.g.get(uri);
                if (xrpVar2 != null) {
                    xrlVar.f.remove(uri);
                    xrlVar.f(uri);
                    f.h(xrpVar2);
                }
            }
            final amuk g = f.g();
            if (g.isEmpty()) {
                return;
            }
            xrlVar.i.execute(new Runnable() { // from class: xre
                @Override // java.lang.Runnable
                public final void run() {
                    xrl.this.b.c(xrh.b(g));
                }
            });
        }
    }
}
