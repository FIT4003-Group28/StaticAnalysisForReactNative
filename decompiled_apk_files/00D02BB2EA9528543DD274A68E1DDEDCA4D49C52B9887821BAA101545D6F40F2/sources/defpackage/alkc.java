package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alkc  reason: default package */
/* loaded from: classes.dex */
public final class alkc {
    public final akzz a;
    public final View b;
    public final akzh c;
    public final Executor d;
    private int h;
    private final akyb f = new alkb(this);
    @dzsi
    private akzt g = null;
    @dzsi
    public Collection<akzy> e = null;

    public alkc(View view, akzh akzhVar, akzz akzzVar, Executor executor) {
        this.b = view;
        this.c = akzhVar;
        this.a = akzzVar;
        this.d = executor;
    }

    public final void a() {
        this.a.k(true != (this.g != null || this.e != null) ? null : this);
    }

    @dzsi
    public final synchronized akzt b() {
        akzt akztVar;
        akztVar = this.g;
        this.g = null;
        a();
        return akztVar;
    }

    public final void c(akyc akycVar, @dzsi akzt akztVar) {
        dbsk.m(this.h == 0, "GmmCamera moved during a cancellation");
        if (this.g != null) {
            this.h++;
            try {
                akzt b = b();
                if (b != null) {
                    b.c();
                }
            } finally {
                this.h--;
            }
        }
        this.g = akztVar;
        a();
        if (akztVar != null) {
            akztVar.a();
        }
        akycVar.a(this.f);
    }
}
