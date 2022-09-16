package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.sceneform.rendering.Material;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
/* compiled from: PG */
/* renamed from: duu  reason: default package */
/* loaded from: classes6.dex */
public final class duu extends duw implements dtu {
    public final dut a;
    private final duz c;
    private final Executor d;
    private final ahrn e;
    private final ahrn f;
    private final float[] g;
    private final dbdz h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    @dzsi
    private PointF n;
    @dzsi
    private dvd o;
    @dzsi
    private duw p;

    public duu(duz duzVar, Executor executor, dvd dvdVar, duw duwVar, dtx dtxVar) {
        dut dutVar = new dut(dvdVar, duwVar.D(), dtxVar);
        this.e = new ahrn();
        this.f = new ahrn();
        this.g = new float[9];
        this.h = new dbdz();
        this.i = false;
        this.c = duzVar;
        this.d = executor;
        this.o = dvdVar;
        this.p = duwVar;
        this.a = dutVar;
    }

    private final void G(dbhe dbheVar, int i) {
        dbsk.l(this.l);
        dbep dbepVar = new dbep(i);
        for (int i2 = 0; i2 < dbheVar.i(); i2++) {
            dbheVar.f(i2).d("overrideColorRGB", dbepVar);
        }
    }

    private static void H(dbhe dbheVar, PointF pointF) {
        for (int i = 0; i < dbheVar.i(); i++) {
            dbheVar.f(i).c("texture_offset", pointF.x, pointF.y);
        }
    }

    @Override // defpackage.dtu
    public final void A(dae daeVar, final float... fArr) {
        final duy duyVar = (duy) daeVar;
        this.c.a(R.raw.external_texture).thenAccept(new Consumer(this, duyVar, fArr) { // from class: duk
            private final duu a;
            private final duy b;
            private final float[] c;

            {
                this.a = this;
                this.b = duyVar;
                this.c = fArr;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                duu duuVar = this.a;
                duy duyVar2 = this.b;
                float[] fArr2 = this.c;
                Material material = (Material) obj;
                material.e("externalTexture", duyVar2.a);
                dbgt a = dvb.a(material, fArr2);
                duuVar.E(a);
                duuVar.a.d(a);
            }
        }).exceptionally(dul.a);
    }

    @Override // defpackage.duw
    @dzsi
    public final dvd C() {
        return this.o;
    }

    @Override // defpackage.duw
    public final dbcn D() {
        return this.a;
    }

    public final void E(dbhe dbheVar) {
        bvrj.UI_THREAD.c();
        dbheVar.g(this.j);
        dbheVar.h(this.k);
        if (this.i) {
            dbheVar.p();
        }
        if (this.l) {
            G(dbheVar, this.m);
        }
        PointF pointF = this.n;
        if (pointF != null) {
            H(dbheVar, pointF);
        }
    }

    @Override // defpackage.dtu
    public final dtw a() {
        duw duwVar = this.p;
        dbsk.t(duwVar, "Calling getParent on a detached node");
        return duwVar;
    }

    @Override // defpackage.dtu
    public final dehn<dtu> b(final Object obj, Callable<InputStream> callable, final bnvs bnvsVar) {
        bvrj.UI_THREAD.c();
        dvd dvdVar = this.o;
        dbsk.s(dvdVar);
        dbhq dbhqVar = dvdVar.c;
        dbgs c = dbgt.c();
        Context c2 = dbhqVar.c();
        dbjb.c(callable);
        c.c = null;
        c.d = callable;
        c.b = c2;
        c.a = obj;
        CompletableFuture<dbgt> g = c.g();
        final deig d = deig.d();
        g.thenAcceptAsync(new Consumer(this, bnvsVar, d) { // from class: duo
            private final duu a;
            private final bnvs b;
            private final deig c;

            {
                this.a = this;
                this.b = bnvsVar;
                this.c = d;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                duu duuVar = this.a;
                bnvs bnvsVar2 = this.b;
                deig deigVar = this.c;
                dbgt dbgtVar = (dbgt) obj2;
                if (dbgtVar == null) {
                    return;
                }
                duuVar.a.p(new dbeb(bnvsVar2.e(), bnvsVar2.f(), bnvsVar2.g()));
                duuVar.E(dbgtVar);
                duuVar.a.d(dbgtVar);
                deigVar.j(duuVar);
            }
        }, this.d).exceptionally(new Function(d, obj) { // from class: dup
            private final deig a;
            private final Object b;

            {
                this.a = d;
                this.b = obj;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                deig deigVar = this.a;
                Throwable th = (Throwable) obj2;
                if (!dcft.m(dbue.f(th), dbst.d(CancellationException.class)).a()) {
                    deigVar.k(th);
                    return null;
                }
                deigVar.cancel(false);
                return null;
            }
        });
        return d;
    }

    @Override // defpackage.dtu
    public final void c(bnvs bnvsVar, bnvq bnvqVar) {
        dbeb dbebVar;
        dbeb l = this.a.l();
        dbdq dbdqVar = this.a.r;
        dbdr dbdrVar = dbdqVar != null ? dbdqVar.b : null;
        if (dbdrVar == null) {
            bnvsVar.a(l.a, l.b, l.c);
            bnvqVar.b();
            bnvqVar.c();
            bnvqVar.d();
            return;
        }
        if (dbdrVar instanceof dbdp) {
            dbdp dbdpVar = (dbdp) dbdrVar;
            dbeb b = dbdpVar.b();
            bnvsVar.a(b.a, b.b, b.c);
            dbebVar = dbdpVar.e();
        } else if (dbdrVar instanceof dbdw) {
            dbdw dbdwVar = (dbdw) dbdrVar;
            dbeb b2 = dbdwVar.b();
            bnvsVar.a(b2.a, b2.b, b2.c);
            float f = dbdwVar.b;
            dbebVar = new dbeb(f, f, f);
        } else {
            bnvsVar.a(l.a, l.b, l.c);
            bnvqVar.b();
            bnvqVar.c();
            bnvqVar.d();
            return;
        }
        dbeb dbebVar2 = new dbeb(this.a.F());
        dbea m = this.a.m();
        this.e.l(m.a, m.b, m.c, m.d);
        float f2 = dbebVar2.a;
        float f3 = dbebVar2.b;
        float f4 = dbebVar2.c;
        float[] fArr = bnvsVar.a;
        fArr[0] = fArr[0] * f2;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f4;
        ahrn ahrnVar = this.e;
        this.f.l(bnvsVar.e(), bnvsVar.f(), bnvsVar.g(), 0.0f);
        ahrn ahrnVar2 = this.f;
        ahrnVar2.k(ahrnVar2, ahrnVar);
        ahrn ahrnVar3 = this.f;
        bnvsVar.a(ahrnVar3.a, ahrnVar3.b, ahrnVar3.c);
        float f5 = l.a;
        float f6 = l.b;
        float f7 = l.c;
        float[] fArr2 = bnvsVar.a;
        fArr2[0] = fArr2[0] + f5;
        fArr2[1] = fArr2[1] + f6;
        fArr2[2] = fArr2[2] + f7;
        float f8 = dbebVar.a * dbebVar2.a;
        float f9 = dbebVar.b * dbebVar2.b;
        float f10 = dbebVar.c * dbebVar2.c;
        dbdz dbdzVar = this.h;
        dbjb.d(m, "Parameter \"rotation\" was null.");
        dbdzVar.a(dbdz.a);
        m.f();
        float f11 = m.a;
        float f12 = f11 * f11;
        float f13 = m.b;
        float f14 = f11 * f13;
        float f15 = m.c;
        float f16 = f11 * f15;
        float f17 = m.d;
        float f18 = f11 * f17;
        float f19 = f13 * f13;
        float f20 = f13 * f15;
        float f21 = f13 * f17;
        float f22 = f15 * f15;
        float f23 = f15 * f17;
        float[] fArr3 = dbdzVar.b;
        float f24 = f19 + f22;
        fArr3[0] = 1.0f - (f24 + f24);
        float f25 = f14 - f23;
        fArr3[4] = f25 + f25;
        float f26 = f16 + f21;
        fArr3[8] = f26 + f26;
        float f27 = f14 + f23;
        fArr3[1] = f27 + f27;
        float f28 = f12 + f22;
        fArr3[5] = 1.0f - (f28 + f28);
        float f29 = f20 - f18;
        fArr3[9] = f29 + f29;
        float f30 = f16 - f21;
        fArr3[2] = f30 + f30;
        float f31 = f20 + f18;
        fArr3[6] = f31 + f31;
        float f32 = f12 + f19;
        fArr3[10] = 1.0f - (f32 + f32);
        float[] fArr4 = this.g;
        float[] fArr5 = this.h.b;
        fArr4[0] = fArr5[0] * f8;
        fArr4[1] = fArr5[1] * f8;
        fArr4[2] = fArr5[2] * f8;
        fArr4[3] = fArr5[4] * f9;
        fArr4[4] = fArr5[5] * f9;
        fArr4[5] = fArr5[6] * f9;
        fArr4[6] = fArr5[8] * f10;
        fArr4[7] = fArr5[9] * f10;
        fArr4[8] = fArr5[10] * f10;
        System.arraycopy(fArr4, 0, bnvqVar.a, 0, 9);
    }

    @Override // defpackage.dtu
    public final bnvs d() {
        dbeb l = this.a.l();
        return new bnvs(l.a, l.b, l.c);
    }

    @Override // defpackage.dtu
    public final ahrn e() {
        dbea m = this.a.m();
        return new ahrn(m.a, m.b, m.c, m.d);
    }

    @Override // defpackage.dtu
    public final void f() {
        if (this.o == null) {
            return;
        }
        for (dtu dtuVar : F()) {
            dtuVar.f();
        }
        this.o = null;
        this.a.f(null);
        this.a.d(null);
        duw duwVar = this.p;
        if (duwVar == null) {
            return;
        }
        dbsk.l(this.o == null);
        dbsk.l(duwVar.b.remove(this));
        this.p = null;
    }

    @Override // defpackage.dtu
    public final void g(boolean z) {
        dut dutVar = this.a;
        dbix.a();
        if (dutVar.m == z) {
            return;
        }
        dutVar.m = z;
        dutVar.C();
    }

    @Override // defpackage.dtu
    public final boolean h() {
        return this.a.m;
    }

    @Override // defpackage.dtu
    public final void i(bnvs bnvsVar) {
        this.a.p(new dbeb(bnvsVar.e(), bnvsVar.f(), bnvsVar.g()));
    }

    @Override // defpackage.dtu
    public final void j(float f) {
        dbhe u = this.a.u();
        if (u != null) {
            for (int i = 0; i < u.i(); i++) {
                u.f(i).b("opacity", f);
            }
        }
        for (dtu dtuVar : F()) {
            dtuVar.j(f);
        }
    }

    @Override // defpackage.dtu
    public final void k(int i) {
        this.m = i;
        this.l = true;
        dbhe u = this.a.u();
        if (u != null) {
            G(u, i);
        }
    }

    @Override // defpackage.dtu
    public final void l(float f) {
        dbhe u = this.a.u();
        if (u != null) {
            for (int i = 0; i < u.i(); i++) {
                u.e().b("time", f);
            }
        }
        for (dtu dtuVar : F()) {
            dtuVar.l(f);
        }
    }

    @Override // defpackage.dtu
    public final void m(boolean z) {
        this.j = z;
        dbhe u = this.a.u();
        if (u != null) {
            u.g(z);
        }
    }

    @Override // defpackage.dtu
    public final void n() {
        this.i = true;
        dbhe u = this.a.u();
        if (u != null) {
            u.p();
        }
    }

    @Override // defpackage.dtu
    public final void o(String str, @dzsi dtu dtuVar) {
        duu duuVar = (duu) dtuVar;
        if (duuVar != null) {
            this.a.c(str, duuVar.a);
        } else {
            this.a.c(str, null);
        }
    }

    @Override // defpackage.dtu
    public final int p() {
        dbgt dbgtVar = (dbgt) this.a.u();
        if (dbgtVar != null) {
            return dbgtVar.b();
        }
        return 0;
    }

    @Override // defpackage.dtu
    public final String q(int i) {
        dbgt dbgtVar = (dbgt) this.a.u();
        return dbgtVar != null ? dbgtVar.a(i) : "";
    }

    @Override // defpackage.dtu
    public final int r(int i) {
        dbhx dbhxVar;
        dbgt dbgtVar = (dbgt) this.a.u();
        if (dbgtVar == null || (dbhxVar = dbgtVar.b) == null) {
            return -1;
        }
        if (i < dbhxVar.e()) {
            dbji dbjiVar = dbhxVar.c;
            int g = dbjiVar.g(6);
            int i2 = g != 0 ? dbjiVar.b.get(dbjiVar.k(g) + i) & 255 : 0;
            if (i2 != 255) {
                return i2;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException("boneIndex must be less than boneCount.");
    }

    @Override // defpackage.dtu
    @dzsi
    public final dva s(String str) {
        dbef dbefVar;
        dbhe u = this.a.u();
        dbgt dbgtVar = u instanceof dbgt ? (dbgt) u : null;
        if (dbgtVar == null) {
            return null;
        }
        ArrayList<dbef> arrayList = dbgtVar.a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                dbefVar = arrayList.get(i);
                i++;
                if (dbefVar.a().equals(str)) {
                    break;
                }
            }
        }
        dbefVar = null;
        if (dbefVar != null) {
            return new dva(new dbdj(dbefVar, dbgtVar));
        }
        return null;
    }

    @Override // defpackage.dtu
    public final dae t() {
        duy duyVar = new duy();
        dbhe u = this.a.u();
        if (u != null) {
            u.f(1).e("texture", duyVar.a);
        }
        return duyVar;
    }

    @Override // defpackage.dtu
    public final void u() {
    }

    @Override // defpackage.dtu
    public final void v(@dzsi final View view) {
        Context context;
        if (view == null) {
            this.a.d(null);
            return;
        }
        dvd dvdVar = this.o;
        dbsk.s(dvdVar);
        dbhq dbhqVar = dvdVar.c;
        int i = dbip.o;
        dbix.b();
        dbio dbioVar = new dbio();
        Context c = dbhqVar.c();
        dbioVar.f = view;
        dbioVar.b = c;
        dbioVar.a = view;
        if (!dbioVar.e().booleanValue() && (context = dbioVar.b) != null) {
            int a = dbhr.a(9);
            dbioVar.d = dbja.a(context, a);
            dbioVar.b = context;
            Resources resources = context.getResources();
            dbioVar.c = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(a)).appendPath(resources.getResourceTypeName(a)).appendPath(resources.getResourceEntryName(a)).build();
        }
        dbioVar.a = dbioVar.f;
        CompletableFuture<dbip> g = dbioVar.g();
        dbsk.s(g);
        g.thenAcceptAsync(new Consumer(this, view) { // from class: duj
            private final duu a;
            private final View b;

            {
                this.a = this;
                this.b = view;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                duu duuVar = this.a;
                View view2 = this.b;
                dbip dbipVar = (dbip) obj;
                if (dbipVar == null) {
                    return;
                }
                dbipVar.k = new dbeu();
                dbipVar.a();
                duuVar.E(dbipVar);
                duuVar.a.d(dbipVar);
                if (!view2.hasOnClickListeners()) {
                    return;
                }
                dut dutVar = duuVar.a;
                dum dumVar = new dum(view2);
                if (dumVar != dutVar.v) {
                    dutVar.u = null;
                }
                dutVar.v = dumVar;
            }
        }, this.d).exceptionally(new Function(view) { // from class: dun
            private final View a;

            {
                this.a = view;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                return null;
            }
        });
    }

    @Override // defpackage.dtu
    public final void w(cze czeVar, czd czdVar, bnvs bnvsVar) {
        b(((daa) czdVar).a, czeVar.a(czdVar), bnvsVar);
    }

    @Override // defpackage.dtu
    public final void x() {
        this.k = true;
        dbhe u = this.a.u();
        if (u != null) {
            u.h(true);
        }
    }

    @Override // defpackage.dtu
    public final void y(float f) {
        this.n = new PointF(0.0f, f);
        dbhe u = this.a.u();
        if (u != null) {
            PointF pointF = this.n;
            dbsk.s(pointF);
            H(u, pointF);
        }
    }

    @Override // defpackage.dtu
    public final void z(final float... fArr) {
        this.c.a(R.raw.opaque_unlit_colored).thenApply(new Function() { // from class: duq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Material material = (Material) obj;
                material.d("color", new dbep(-1));
                return material;
            }
        }).thenAccept((Consumer<? super U>) new Consumer(this, fArr) { // from class: dur
            private final duu a;
            private final float[] b;

            {
                this.a = this;
                this.b = fArr;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                duu duuVar = this.a;
                dbgt a = dvb.a((Material) obj, this.b);
                duuVar.E(a);
                duuVar.a.d(a);
            }
        }).exceptionally(new Function() { // from class: dus
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                return null;
            }
        });
    }
}
