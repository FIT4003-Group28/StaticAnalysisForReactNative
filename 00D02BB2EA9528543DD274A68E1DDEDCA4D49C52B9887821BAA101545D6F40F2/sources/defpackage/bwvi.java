package defpackage;

import android.app.Application;
import com.google.geo.imagery.viewer.api.IconHandle;
import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconRendererSwigJNI;
import com.google.geo.imagery.viewer.api.Text;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwvi  reason: default package */
/* loaded from: classes4.dex */
public final class bwvi {
    private static int l = 1;
    public final int a;
    public final bwrs<ilo> b;
    @dzsi
    public dftz c;
    @dzsi
    public IconHandle d;
    @dzsi
    public cjql e;
    @dzsi
    public ddho f;
    public dhjz g;
    public boolean h;
    private final Application m;
    public boolean i = false;
    private boolean n = true;
    public double j = dcyn.a;
    public float k = 1.0f;

    public final void a(double d) {
        this.j = d;
        d();
    }

    public final void b(boolean z) {
        this.i = z;
        d();
    }

    public final void c(boolean z) {
        this.n = z;
        d();
    }

    public final void d() {
        dfsr dfsrVar;
        dftz dftzVar = this.c;
        if (dftzVar == null || dftzVar.c()) {
            return;
        }
        IconHandle iconHandle = this.d;
        dbsk.t(iconHandle, "This icon has been deleted");
        ilo c = this.b.c();
        dbsk.s(c);
        int e = cqrp.d(this.j / 0.4166666666666667d).e(this.m);
        dfsp bZ = dfss.k.bZ();
        float f = this.k;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss dfssVar = (dfss) bZ.b;
        dfssVar.a |= 64;
        dfssVar.f = f;
        dhkc bZ2 = dhkd.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ2.b;
        int i = dhkdVar.a | 1;
        dhkdVar.a = i;
        dhkdVar.b = e;
        dhkdVar.a = i | 2;
        dhkdVar.c = e * 3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss dfssVar2 = (dfss) bZ.b;
        dhkd bK = bZ2.bK();
        bK.getClass();
        dfssVar2.g = bK;
        dfssVar2.a |= 128;
        double d = (true != this.i ? dcyn.a : 0.3333333333333333d) + 0.09722222222222221d;
        double d2 = 0.1388888888888889d + d;
        dfsn bZ3 = dfso.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dfso dfsoVar = (dfso) bZ3.b;
        int i2 = dfsoVar.a | 1;
        dfsoVar.a = i2;
        dfsoVar.b = d;
        int i3 = i2 | 4;
        dfsoVar.a = i3;
        dfsoVar.d = d2;
        dfsoVar.a = i3 | 2;
        dfsoVar.c = 0.29166666666666663d;
        dfso dfsoVar2 = (dfso) bZ3.b;
        dfsoVar2.a |= 8;
        dfsoVar2.e = 0.7083333333333334d;
        dfso bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss dfssVar3 = (dfss) bZ.b;
        bK2.getClass();
        dfssVar3.i = bK2;
        dfssVar3.a |= 1024;
        Application application = this.m;
        float f2 = this.k;
        boolean z = this.i;
        boolean z2 = this.n;
        if (!z || !z2) {
            dfsrVar = dfsr.f;
        } else {
            List<String> a = dfyn.a(c.n(), 20, 2, 20);
            dfsq bZ4 = dfsr.f.bZ();
            dfts bZ5 = Text.k.bZ();
            String g = dbrz.e("\n").g(a);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            Text text = (Text) bZ5.b;
            g.getClass();
            text.a |= 1;
            text.b = g;
            int size = a.size();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            Text text2 = (Text) bZ5.b;
            text2.a |= 4;
            text2.d = size;
            float e2 = cqrp.f(16.0d).e(application);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            Text text3 = (Text) bZ5.b;
            int i4 = text3.a | 2;
            text3.a = i4;
            text3.c = e2;
            text3.a = i4 | 8;
            text3.e = 1.5f;
            Text text4 = (Text) bZ5.b;
            text4.a |= 16;
            text4.f = true;
            Text text5 = (Text) bZ5.b;
            text5.a |= 64;
            text5.h = 0;
            Text text6 = (Text) bZ5.b;
            text6.a |= 128;
            text6.i = -16777216;
            Text text7 = (Text) bZ5.b;
            text7.a |= 256;
            text7.j = -1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dfsr dfsrVar2 = (dfsr) bZ4.b;
            Text bK3 = bZ5.bK();
            bK3.getClass();
            dfsrVar2.b = bK3;
            dfsrVar2.a |= 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dfsr dfsrVar3 = (dfsr) bZ4.b;
            dfsrVar3.a |= 2;
            dfsrVar3.c = 0.5f;
            dfsr dfsrVar4 = (dfsr) bZ4.b;
            dfsrVar4.a |= 4;
            dfsrVar4.d = 0.75f;
            dfsr dfsrVar5 = (dfsr) bZ4.b;
            dfsrVar5.a |= 8;
            dfsrVar5.e = f2;
            dfsrVar = bZ4.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfss dfssVar4 = (dfss) bZ.b;
        dfsrVar.getClass();
        dfssVar4.j = dfsrVar;
        dfssVar4.a |= 2048;
        dftzVar.b(iconHandle, bZ.bK());
    }

    public final void e() {
        dftz dftzVar = this.c;
        if (dftzVar != null && this.d != null && !dftzVar.c()) {
            dftz dftzVar2 = this.c;
            IconHandle iconHandle = this.d;
            dbsk.s(iconHandle);
            synchronized (dftzVar2.b) {
                IconRenderer iconRenderer = dftzVar2.a;
                if (iconRenderer != null) {
                    IconRendererSwigJNI.IconRenderer_deleteIcon(iconRenderer.a, iconRenderer, IconHandle.a(iconHandle), iconHandle);
                }
            }
        }
        this.c = null;
        this.d = null;
    }

    public bwvi(Application application, bwrs<ilo> bwrsVar, dhjz dhjzVar, String str, dftz dftzVar, boolean z) {
        IconHandle iconHandle;
        this.m = application;
        this.c = dftzVar;
        this.g = dhjzVar;
        this.b = bwrsVar;
        this.h = z;
        double d = dhjzVar.c;
        double d2 = dhjzVar.b;
        double d3 = dhjzVar.d;
        synchronized (dftzVar.b) {
            IconRenderer iconRenderer = dftzVar.a;
            iconHandle = iconRenderer == null ? null : new IconHandle(IconRendererSwigJNI.IconRenderer_addIcon__SWIG_0(iconRenderer.a, iconRenderer, d, d2, d3, str));
        }
        this.d = iconHandle;
        int i = l;
        l = i + 1;
        this.a = i;
        d();
    }
}
