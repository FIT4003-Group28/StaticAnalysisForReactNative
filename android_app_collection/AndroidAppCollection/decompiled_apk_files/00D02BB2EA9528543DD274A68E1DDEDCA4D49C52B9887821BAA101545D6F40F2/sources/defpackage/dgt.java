package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dgt  reason: default package */
/* loaded from: classes6.dex */
public final class dgt implements dfeq<dfgm> {
    private static final cjtd c = cjtd.a(dtxj.bK);
    public final dgb a;
    private final cqat d;
    private final View e;
    private final dbsg<cjqp> f;
    private long g;
    public boolean b = false;
    private int h = 1;

    public dgt(cqat cqatVar, dgc dgcVar, czz czzVar, dbsg<cjqp> dbsgVar, dfy dfyVar) {
        this.d = cqatVar;
        ViewGroup a = czzVar.a();
        this.e = a;
        this.f = dbsgVar;
        dgb b = dgcVar.b(czzVar.a(), czzVar.c(), dfyVar);
        this.a = b;
        b.d(a.getResources().getString(R.string.LIGHTHOUSE_OFFSCREEN_INDICATOR_THIS_WAY));
    }

    public final void b(String str, boolean z) {
        this.a.d(str);
        this.a.e(z);
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfgm dfgmVar) {
        dfgm dfgmVar2 = dfgmVar;
        if (this.b || dfgmVar2 == null) {
            return;
        }
        int a = dfz.a(dfgmVar2);
        this.a.b(true);
        dgb dgbVar = this.a;
        long g = this.d.g();
        long j = this.g;
        float f = 0.0f;
        if (((float) j) > 0.0f) {
            f = ((float) (g - j)) / 1000.0f;
        }
        this.g = g;
        dgbVar.f(f, a, dfgmVar2.b * this.e.getWidth(), dfgmVar2.c * this.e.getHeight());
        if (a == 3) {
            if (this.h != 3 && this.f.a()) {
                this.f.b().d(c);
            }
            a = 3;
        }
        this.h = a;
    }
}
