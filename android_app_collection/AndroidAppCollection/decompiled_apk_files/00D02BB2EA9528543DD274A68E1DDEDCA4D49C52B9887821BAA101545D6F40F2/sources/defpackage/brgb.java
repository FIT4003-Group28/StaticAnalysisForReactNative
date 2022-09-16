package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: brgb  reason: default package */
/* loaded from: classes4.dex */
public class brgb implements brgo {
    public final brga b;
    public final List<brgm> c;
    public final brdi d;
    public final brdl e;
    public final cqhn f;
    public final Activity g;
    private final Executor i;
    public final brfu a = new brfx(this);
    public brgn h = brgn.OPTIONS_LIST;
    private final brgs j = new brfz(this);

    public brgb(brga brgaVar, brdi brdiVar, brdl brdlVar, cqhn cqhnVar, Executor executor, Activity activity) {
        dbsk.l(true);
        this.b = brgaVar;
        this.c = new ArrayList();
        this.d = brdiVar;
        this.e = brdlVar;
        this.f = cqhnVar;
        this.i = executor;
        this.g = activity;
    }

    public void a() {
        this.h = brgn.PROGRESS_SPINNER;
        deha.q(this.e.b(), new brfy(this), this.i);
    }

    @Override // defpackage.brgo
    public brgn b() {
        return this.h;
    }

    @Override // defpackage.brgo
    public List<brgm> c() {
        return this.c;
    }

    @Override // defpackage.brgo
    public jib d() {
        Activity activity = this.g;
        jhz e = jib.g(activity, activity.getString(R.string.EV_PROFILE_EDIT_CONNECTORS_TITLE_V2)).e();
        e.f(new View.OnClickListener(this) { // from class: brfw
            private final brgb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.a();
            }
        });
        e.o = cjtd.a(dtxo.ak);
        e.j = cqrt.l(R.string.BACK_BUTTON);
        e.x = false;
        return e.b();
    }

    @Override // defpackage.brgo
    public brgs e() {
        return this.j;
    }
}
