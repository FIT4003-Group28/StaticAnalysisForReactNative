package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ardc  reason: default package */
/* loaded from: classes.dex */
public final class ardc {
    public final Resources a;
    public final akxa b;
    public final arcz c;
    private final Map<arda, dbty<akuh>> d = new HashMap();
    private final SparseArray<arcp> e = new SparseArray<>();

    public ardc(Resources resources, akxa akxaVar) {
        this.a = resources;
        this.b = akxaVar;
        this.c = new arcz(akxaVar.c, resources);
    }

    public final synchronized arcp a(int i) {
        arcp arcpVar = this.e.get(i);
        if (arcpVar == null) {
            final akxa akxaVar = this.b;
            final bnrd b = bnrh.b(this.a, i);
            bnuw b2 = b.b();
            arcp arcpVar2 = new arcp(b2.a(), b2.b(), dbud.a(new dbty(akxaVar, b) { // from class: arcn
                private final akxa a;
                private final bnrd b;

                {
                    this.a = akxaVar;
                    this.b = b;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    akxa akxaVar2 = this.a;
                    return akxaVar2.c.m(this.b, arcq.b);
                }
            }));
            this.e.put(i, arcpVar2);
            return arcpVar2;
        }
        return arcpVar;
    }

    public final void b(arcq arcqVar, int i) {
        arcp a = a(i);
        arcqVar.e = a;
        arcqVar.c.a().b(a.c.a());
    }

    public final synchronized void c() {
        for (int i = 0; i < this.e.size(); i++) {
            SparseArray<arcp> sparseArray = this.e;
            this.b.c.j(sparseArray.get(sparseArray.keyAt(i)).c.a());
        }
        this.e.clear();
        arcz arczVar = this.c;
        dzrn<akuh> a = arczVar.c.values().a();
        while (a.hasNext()) {
            arczVar.a.j(a.next());
        }
        arczVar.c.clear();
        for (akuh akuhVar : arczVar.d.values()) {
            arczVar.a.j(akuhVar);
        }
        arczVar.d.clear();
        for (akuh akuhVar2 : arczVar.e) {
            arczVar.a.j(akuhVar2);
        }
        arczVar.e.clear();
    }

    public final arcq d(String str, int i) {
        final akxa akxaVar = this.b;
        return new arcq(this.b, str, new arcp(1, 1, dbud.a(new dbty(akxaVar) { // from class: arco
            private final akxa a;

            {
                this.a = akxaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                akxa akxaVar2 = this.a;
                int i2 = arcq.b;
                dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                dmoo dmooVar = (dmoo) dmop.h.bZ();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar = (dmop) dmooVar.b;
                dmopVar.a |= 1;
                dmopVar.b = 0;
                dmmx bZ = dmne.l.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmne dmneVar = (dmne) bZ.b;
                int i3 = dmneVar.a | 2;
                dmneVar.a = i3;
                dmneVar.c = -1;
                int i4 = i3 | 8;
                dmneVar.a = i4;
                dmneVar.e = true;
                int i5 = i4 | 16;
                dmneVar.a = i5;
                dmneVar.f = false;
                int i6 = i5 | 4;
                dmneVar.a = i6;
                dmneVar.d = i2;
                dmneVar.a = i6 | 32;
                dmneVar.g = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAA1JREFUCJljYGBgYAAAAAUAAYehTtQAAAAASUVORK5CYII=";
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                dmne bK = bZ.bK();
                bK.getClass();
                dmopVar2.c = bK;
                dmopVar2.a |= 2;
                dmqtVar.a(dmooVar);
                return akxaVar2.c.c((dmqx) dmqtVar.bK());
            }
        })), i, 8);
    }

    public final arcq e(int i, String str, int i2) {
        return new arcq(this.b, str, a(i), i2);
    }

    public final ardd f(int i, final boolean z, final bnrz bnrzVar, final int i2) {
        final dbty<akuh> dbtyVar;
        aksp akspVar = this.b.a;
        final int color = this.a.getColor(i);
        arby arbyVar = new arby(color, z);
        synchronized (this) {
            if (!this.d.containsKey(arbyVar)) {
                dbtyVar = dbud.a(new dbty(this, color, z, bnrzVar) { // from class: arcx
                    private final ardc a;
                    private final int b;
                    private final boolean c;
                    private final bnrz d;

                    {
                        this.a = this;
                        this.b = color;
                        this.c = z;
                        this.d = bnrzVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        ardc ardcVar = this.a;
                        int i3 = this.b;
                        boolean z2 = this.c;
                        bnrz bnrzVar2 = this.d;
                        akvz akvzVar = ardcVar.b.c;
                        int argb = Color.argb(255, Color.red(i3), Color.green(i3), Color.blue(i3));
                        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                        dmoo dmooVar = (dmoo) dmop.h.bZ();
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = false;
                        }
                        dmop dmopVar = (dmop) dmooVar.b;
                        dmopVar.a |= 1;
                        dmopVar.b = 0;
                        dmmx bZ = dmne.l.bZ();
                        int c = bnrzVar2.c();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dmne dmneVar = (dmne) bZ.b;
                        int i4 = dmneVar.a | 4;
                        dmneVar.a = i4;
                        dmneVar.d = c;
                        int i5 = i4 | 2;
                        dmneVar.a = i5;
                        dmneVar.c = i3;
                        int i6 = i5 | 16;
                        dmneVar.a = i6;
                        dmneVar.f = z2;
                        dmneVar.a = i6 | 8;
                        dmneVar.e = !z2;
                        dmsk bZ2 = dmsl.l.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dmsl dmslVar = (dmsl) bZ2.b;
                        int i7 = dmslVar.a | 1;
                        dmslVar.a = i7;
                        dmslVar.b = argb;
                        dmslVar.a = i7 | 4;
                        dmslVar.d = 1;
                        bZ.a(bZ2);
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = false;
                        }
                        dmop dmopVar2 = (dmop) dmooVar.b;
                        dmne bK = bZ.bK();
                        bK.getClass();
                        dmopVar2.c = bK;
                        dmopVar2.a |= 2;
                        dmqtVar.a(dmooVar);
                        return akvzVar.c((dmqx) dmqtVar.bK());
                    }
                });
                this.d.put(arbyVar, dbtyVar);
            } else {
                dbtyVar = this.d.get(arbyVar);
            }
        }
        return new ardd(akspVar, dbud.a(new dbty(this, dbtyVar, z, i2) { // from class: arcy
            private final ardc a;
            private final dbty b;
            private final boolean c;
            private final int d;

            {
                this.a = this;
                this.b = dbtyVar;
                this.c = z;
                this.d = i2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ardc ardcVar = this.a;
                dbty dbtyVar2 = this.b;
                akta b = ardcVar.b.b(dcyn.a, dcyn.a, 100, 2.0f, false, (akuh) dbtyVar2.a(), false, this.c, 3, arca.a(this.d));
                aksz d = b.d();
                d.c(100.0f, aksy.PIXEL);
                b.c(d);
                return b;
            }
        }));
    }

    public final aktc g(int i, int i2, int i3) {
        arcz arczVar = this.c;
        Bitmap bitmap = ((BitmapDrawable) arczVar.b.getDrawable(2131232697)).getBitmap();
        Bitmap bitmap2 = ((BitmapDrawable) arczVar.b.getDrawable(2131232562)).getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        Bitmap copy = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copy);
        double d = width2;
        Double.isNaN(d);
        double d2 = width;
        Double.isNaN(d2);
        float f = (float) ((d * 0.5d) - (d2 * 0.5d));
        double d3 = height2;
        Double.isNaN(d3);
        double d4 = height;
        Double.isNaN(d4);
        canvas.drawBitmap(bitmap, f, (float) ((d3 * 0.5d) - (d4 * 0.5d)), (Paint) null);
        akuh d5 = arczVar.a.d(copy);
        arczVar.e.add(d5);
        akuh b = this.c.b(i, i2);
        akuh a = this.c.a(i3);
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        int a2 = arca.a(4);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmpnVar.a |= 8192;
        dmpnVar.m = a2;
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        int a3 = a.a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a3;
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a4 = d5.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a4;
        dmpeVar.b(dmpcVar);
        dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
        String valueOf = String.valueOf(this.a.getString(R.string.GPS_SIGNAL_LOST_CALLOUT_TEXT));
        String concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar2 = (dmpd) dmpcVar2.b;
        concat.getClass();
        dmpdVar2.a |= 1;
        dmpdVar2.b = concat;
        int a5 = b.a();
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar3 = (dmpd) dmpcVar2.b;
        dmpdVar3.a |= 2;
        dmpdVar3.c = a5;
        dmpeVar.b(dmpcVar2);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        dmphVar2.getClass();
        dmpnVar2.b = dmphVar2;
        dmpnVar2.a |= 1;
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = dmlo.BOTTOM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        dmlqVar.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a |= 4;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.a |= 32;
        dmpnVar4.g = 3;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.b((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        return this.b.b.d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
    }
}
