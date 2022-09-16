package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: xfp  reason: default package */
/* loaded from: classes4.dex */
public final class xfp implements xfj, airt {
    public final aibj a;
    public Bitmap b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final ajmy f;
    private final yiw g;
    private yiy h;
    private Uri i;

    public xfp(aibj aibjVar, ajmy ajmyVar) {
        aibjVar.getClass();
        this.a = aibjVar;
        ajmyVar.getClass();
        this.f = ajmyVar;
        this.g = yje.c(new Handler(), new xfo(this));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aizf, aibj] */
    @Override // defpackage.xfj
    public final void a(aozt aoztVar) {
        avhn avhnVar;
        if (aoztVar == null) {
            return;
        }
        aozu aozuVar = aoztVar.h;
        if (aozuVar == null) {
            aozuVar = aozu.a;
        }
        if ((aozuVar.b & 1) != 0) {
            aozu aozuVar2 = aoztVar.h;
            if (aozuVar2 == null) {
                aozuVar2 = aozu.a;
            }
            avhi avhiVar = aozuVar2.c;
            if (avhiVar == null) {
                avhiVar = avhi.a;
            }
            avhnVar = avhiVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        if (avhnVar != null) {
            View kZ = this.a.kZ();
            Uri r = akel.r(avhnVar, kZ != null ? kZ.getWidth() : 480, kZ != null ? kZ.getHeight() : 320);
            if (r == null || !r.equals(this.i)) {
                b();
            }
            this.i = r;
        }
        c();
    }

    public final void b() {
        this.i = null;
        this.b = null;
        yiy yiyVar = this.h;
        if (yiyVar != null) {
            yiyVar.d();
            this.h = null;
        }
        this.a.nC();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.Z(new xfn(this, 2)), airwVar.s().a.Z(new xfn(this)), airwVar.s().b.Z(new xfn(this, 1))};
    }

    public final void c() {
        if (!this.c || (!this.d && !this.e)) {
            this.a.kT();
            return;
        }
        Bitmap bitmap = this.b;
        if (bitmap != null || this.i == null || this.h != null) {
            this.a.b(bitmap);
        } else {
            yiy c = yiy.c(this.g);
            this.h = c;
            this.f.l(this.i, c);
        }
        this.a.kU();
    }
}
