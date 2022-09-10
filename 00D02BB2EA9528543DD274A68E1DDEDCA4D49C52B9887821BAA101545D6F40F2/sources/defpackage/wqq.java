package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: wqq  reason: default package */
/* loaded from: classes7.dex */
public class wqq implements wpn {
    public final eeu a;
    public final Context b;
    public final vtn c;
    public final cpv d;
    public final wsp e = new wsp();
    public List<wqs> f = Collections.emptyList();
    public List<wpo> g = Collections.emptyList();
    public cjtd h = cjtd.b;
    public final cqkn<wpo> i = new wqo(this);
    private final cqkn<wpn> j = new wqp(this);
    @dzsi
    private final wry k;

    public wqq(Application application, eeu eeuVar, vtn vtnVar, cpv cpvVar, wry wryVar) {
        this.a = eeuVar;
        this.b = application;
        this.c = vtnVar;
        this.d = cpvVar;
        this.k = wryVar;
    }

    @Override // defpackage.wpn
    public List<wpo> a() {
        return this.g;
    }

    @Override // defpackage.wpn
    public Boolean b() {
        boolean z = true;
        if (this.g.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.wpn
    public cqkn<wpn> c() {
        return this.j;
    }

    @Override // defpackage.wpn
    public Boolean d() {
        return Boolean.valueOf(!g());
    }

    @Override // defpackage.wpn
    public cjtd e() {
        return this.h;
    }

    public final void f() {
        for (wqs wqsVar : this.f) {
            this.e.b(wqsVar.b, wqsVar.a);
        }
    }

    public final boolean g() {
        return this.e.c() == this.g.size();
    }

    public final void h() {
        boolean z = false;
        for (wqs wqsVar : this.f) {
            z |= wqsVar.i(this.e.a(wqsVar.g()));
            if (z) {
                cqkx.p(wqsVar);
            }
        }
        cqkx.p(this);
        wry wryVar = this.k;
        if (wryVar != null) {
            wsc wscVar = wryVar.a;
            wqn wqnVar = wscVar.m;
            if (wqnVar.a.equals(wscVar.n.e.f())) {
                return;
            }
            wsc wscVar2 = wryVar.a;
            wscVar2.I(wscVar2.a);
            wryVar.a.t = true;
        }
    }

    public void i(View view) {
        f();
        h();
        this.d.f(view, wqs.h(this.b.getString(R.string.TRANSIT_STATION_ACCESSIBILITY_ALL_LINES), true, this.b));
    }
}
