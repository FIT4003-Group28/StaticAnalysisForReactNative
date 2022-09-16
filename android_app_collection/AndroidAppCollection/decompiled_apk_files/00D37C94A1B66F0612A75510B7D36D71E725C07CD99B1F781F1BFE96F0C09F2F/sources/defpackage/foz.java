package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: foz  reason: default package */
/* loaded from: classes3.dex */
public final class foz implements fpf, akev {
    private static final long b = TimeUnit.DAYS.toMillis(1);
    public View a;
    private final fpg c;
    private final SharedPreferences d;
    private final int e;
    private final String f;
    private final int g;
    private final akfo h;
    private akfq i;

    public foz(fpg fpgVar, SharedPreferences sharedPreferences, int i, String str, int i2, akfo akfoVar) {
        fpgVar.getClass();
        this.c = fpgVar;
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        this.e = i;
        this.f = str;
        this.g = i2;
        akfoVar.getClass();
        this.h = akfoVar;
    }

    @Override // defpackage.fpc
    public final int c() {
        return this.e;
    }

    @Override // defpackage.fpc
    public final void d() {
        this.h.b(this.i);
    }

    @Override // defpackage.fpc
    public final void e() {
        if (this.a == null) {
            return;
        }
        akfo akfoVar = this.h;
        akfp a = akfoVar.a();
        a.a = this.a;
        a.c = this.a.getContext().getText(this.g);
        a.c(2);
        a.h(2);
        a.f = this;
        a.l();
        akfoVar.c(a.a());
    }

    @Override // defpackage.fpf
    public final boolean f() {
        View view = this.a;
        return view != null && view.isShown() && this.d.getBoolean(this.f, true) && g(etk.TIME_LAST_BROWSE_CLING_SHOWN) && this.d.getLong(etk.TIME_FUSION_ENABLED, 0L) != 0 && g(etk.TIME_FUSION_ENABLED);
    }

    final boolean g(String str) {
        return ghj.d(this.d, str, b, System.currentTimeMillis());
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        this.i = null;
        this.d.edit().putBoolean(this.f, false).putLong(etk.TIME_LAST_BROWSE_CLING_SHOWN, System.currentTimeMillis()).apply();
        this.c.f(this);
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        this.i = (akfq) obj;
    }
}
