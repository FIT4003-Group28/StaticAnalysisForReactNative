package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: auan  reason: default package */
/* loaded from: classes2.dex */
public final class auan {
    public final btrm a;
    @dzsi
    public amuo b;
    public int c;
    public int d;
    @dzsi
    public dqvj e;
    public boolean f = false;
    public boolean g = false;
    @dzsi
    public GmmLocation h;
    @dzsi
    public auaq i;

    public auan(btrm btrmVar) {
        dbsk.s(btrmVar);
        this.a = btrmVar;
    }

    public static int a(int i, dowa dowaVar) {
        return (i > 0 && dowaVar != dowa.KILOMETERS) ? Math.round(i * 0.62137f) : i;
    }

    public final void b(boolean z) {
        dbsk.s(this.i);
        auaq auaqVar = this.i;
        int i = true != z ? 2 : 3;
        auax auaxVar = auaqVar.a;
        int i2 = auaxVar.A;
        if (i2 != 0) {
            if (i2 == i) {
                return;
            }
            auaxVar.A = i;
            auaxVar.b();
            auaqVar.a.i.c();
            return;
        }
        throw null;
    }

    public final void c(@dzsi dowa dowaVar) {
        this.d = -1;
        auaq auaqVar = this.i;
        if (auaqVar != null) {
            auaqVar.a(-1, -1, dowaVar);
        }
    }

    public final void d() {
        auaq auaqVar = this.i;
        if (auaqVar != null) {
            auaqVar.b();
        }
    }
}
