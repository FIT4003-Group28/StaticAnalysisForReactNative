package defpackage;

import android.app.Application;
import android.content.Context;
import android.widget.ImageView;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ashf  reason: default package */
/* loaded from: classes2.dex */
public class ashf {
    public static final cqss a = ibl.b();
    public final btrm b;
    public final Executor d;
    public final dxio<aufc> e;
    public final dxio<efa> f;
    public ImageView g;
    public int h;
    public boolean i;
    public boolean j;
    private final Context l;
    private final dxio<cpwx> m;
    public final ashe c = new ashe(this);
    public final crzp<aufb> k = new ashd(this);

    public ashf(btrm btrmVar, gga ggaVar, Executor executor, Application application, dxio<cpwx> dxioVar, dxio<aufc> dxioVar2, dxio<efa> dxioVar3) {
        this.b = btrmVar;
        this.d = executor;
        this.l = application;
        this.m = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = new ImageView(ggaVar);
    }

    public final boolean b() {
        return this.h > 0;
    }

    public final void a(boolean z) {
        this.g.setBackgroundColor(z ? -15263716 : a.b(this.l));
        int i = 3;
        if (this.m.a().a() == 3) {
            cpwx a2 = this.m.a();
            if (!z) {
                i = 2;
            }
            cpzg cpzgVar = (cpzg) cpzi.c.bZ();
            if (cpzgVar.c) {
                cpzgVar.bF();
                cpzgVar.c = false;
            }
            cpzi cpziVar = (cpzi) cpzgVar.b;
            cpziVar.b = 2;
            cpziVar.a |= 1;
            dsqv<cpzi, cqak> dsqvVar = cqai.a;
            cqaj bZ = cqak.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cqak cqakVar = (cqak) bZ.b;
            cqakVar.b = i - 1;
            cqakVar.a |= 1;
            cpzgVar.k(dsqvVar, bZ.bK());
            a2.d(cpzgVar);
        }
    }
}
