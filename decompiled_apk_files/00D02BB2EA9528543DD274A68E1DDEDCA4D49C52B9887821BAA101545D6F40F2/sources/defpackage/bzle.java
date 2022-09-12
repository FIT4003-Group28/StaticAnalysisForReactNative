package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bzle  reason: default package */
/* loaded from: classes4.dex */
public final class bzle {
    public final vtn a;
    private final Application b;
    private final bysv c;
    private final bzlk d;

    public bzle(Application application, vtn vtnVar, bzlk bzlkVar, bysv bysvVar) {
        this.b = application;
        this.a = vtnVar;
        this.d = bzlkVar;
        this.c = bysvVar;
    }

    @dzsi
    public final Bitmap a(Collection<dpce> collection) {
        dcdc z = dcbg.b(collection).o(bzkz.a).s(bzla.a).z();
        try {
            final deig d = deig.d();
            this.a.h(z, new vti(d) { // from class: bzlb
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.vti
                public final void a() {
                    this.a.j(null);
                }
            });
            d.get(10L, TimeUnit.SECONDS);
            TextView textView = new TextView(this.b);
            bzlk bzlkVar = this.d;
            bzkw bzkwVar = bzlkVar.a;
            vtn vtnVar = bzlkVar.b;
            alcb d2 = bzkwVar.d(textView);
            d2.b = vtnVar;
            d2.d = bzkwVar.e(R.dimen.transit_line_icon_size);
            d2.b();
            textView.setText(d2.a().b(collection));
            return bzkw.a(textView);
        } catch (InterruptedException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (TimeoutException unused) {
            this.c.c(cken.WARNING_REQUEST_ICONS_TIMED_OUT);
            return null;
        }
    }
}
