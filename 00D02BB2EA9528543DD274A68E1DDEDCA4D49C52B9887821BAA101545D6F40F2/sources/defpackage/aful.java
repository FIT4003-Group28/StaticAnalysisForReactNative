package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aful  reason: default package */
/* loaded from: classes.dex */
final class aful extends anh {
    final /* synthetic */ afuu a;
    private final String b;

    public aful(afuu afuuVar) {
        this.a = afuuVar;
        this.b = afuuVar.b.getString(R.string.ACCESSIBILITY_MENU_OPENED);
    }

    @Override // defpackage.anh, defpackage.ane
    public final void a(View view) {
        this.a.y.c(view, 8);
        this.a.e.b(new afws(2));
        this.a.y.f(view, this.b);
        cjsz cjszVar = new cjsz(dtye.h);
        this.a.g.i(this.a.g.e(this.a.f.r(cjszVar), cjszVar), view);
    }

    @Override // defpackage.anh, defpackage.ane
    public final void b(View view) {
        this.a.e.b(new afws(3));
        this.a.g.h(view);
    }

    @Override // defpackage.anh, defpackage.ane
    public final void c(int i) {
        this.a.e();
        if (i == 1) {
            this.a.e.b(new afws(1));
        }
    }
}
