package defpackage;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: lvm  reason: default package */
/* loaded from: classes3.dex */
public final class lvm implements fsd {
    private final gbu a;
    private final yrj b;
    private final yzv c;
    private final kva d;
    private apzg e = apzg.a;
    private String f;
    private int g;
    private final sdb h;

    public lvm(gbu gbuVar, yrj yrjVar, sdb sdbVar, yzv yzvVar, kva kvaVar, byte[] bArr) {
        this.a = gbuVar;
        yrjVar.getClass();
        this.b = yrjVar;
        sdbVar.getClass();
        this.h = sdbVar;
        yzvVar.getClass();
        this.c = yzvVar;
        this.d = kvaVar;
    }

    private final void e(boolean z, int i) {
        gbu gbuVar = this.a;
        gbuVar.d(this.d.a(this.e, this.f, this.g, z, i, gbuVar.j()));
    }

    @Override // defpackage.fsd
    public final void a() {
        e(false, -1);
    }

    @Override // defpackage.fsd
    public final void b(int i) {
        e(false, i);
    }

    @Override // defpackage.fsd
    public final void c() {
        e(true, -1);
    }

    @Override // defpackage.fsd
    public final void d(String str) {
        apzg apzgVar = apzg.a;
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        apzgVar.getClass();
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopg aopgVar = SearchEndpointOuterClass.searchEndpoint;
        aopc aopcVar2 = (aopc) ((auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint)).mo52toBuilder();
        aopcVar2.copyOnWrite();
        auoy auoyVar = (auoy) aopcVar2.instance;
        str.getClass();
        auoyVar.b = 1 | auoyVar.b;
        auoyVar.c = str;
        aopcVar.e(aopgVar, (auoy) aopcVar2.mo39build());
        this.e = (apzg) aopcVar.mo39build();
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_search;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_search;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        menuItem.setActionView((View) null);
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        if (this.h.a || this.b.o()) {
            a();
            return true;
        }
        this.c.b();
        return false;
    }

    @Override // defpackage.fsm
    public final void n(String str) {
        this.f = str;
    }

    @Override // defpackage.fsm
    public final void o() {
        this.g = 10349;
    }
}
