package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: asjt  reason: default package */
/* loaded from: classes2.dex */
public final class asjt {
    public static final dcqe a = dcqe.c("asjt");
    public final cqkf<cqkp> b;
    @dzsi
    public vwy c;
    public boolean d;
    final degu<vwy> e = new asjr(this);

    static {
        new Locale("en", "IN");
        new Locale("en", "KE");
    }

    public asjt(cqkj cqkjVar) {
        cqkf<cqkp> e = cqkjVar.e(new asqi());
        dbsk.s(e);
        this.b = e;
    }

    public final View a() {
        this.d = true;
        this.b.e(new asjq());
        vwy vwyVar = this.c;
        if (vwyVar != null) {
            vwyVar.a();
        }
        return this.b.c();
    }

    public final void b() {
        this.d = false;
        vwy vwyVar = this.c;
        if (vwyVar != null) {
            bvrj.UI_THREAD.c();
            if (vwyVar.e) {
                vwyVar.e = false;
                vwyVar.d.stop();
            }
        }
        this.b.e(null);
    }

    public final void c(final vwx vwxVar, bvrb bvrbVar, @dzsi final dqvj dqvjVar) {
        View c = this.b.c();
        final ImageView imageView = (ImageView) cqkx.d(c, asqi.b);
        TextView textView = (TextView) cqkx.d(c, asqi.c);
        final deig d = deig.d();
        vwxVar.b.b(new Runnable(vwxVar, d, imageView, dqvjVar) { // from class: vww
            private final vwx a;
            private final deig b;
            private final ImageView c;
            private final dqvj d;

            {
                this.a = vwxVar;
                this.b = d;
                this.c = imageView;
                this.d = dqvjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vwx vwxVar2 = this.a;
                this.b.j(new vwy(vwxVar2.a, this.c, this.d));
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        deha.q(d, this.e, bvrbVar.h());
    }
}
