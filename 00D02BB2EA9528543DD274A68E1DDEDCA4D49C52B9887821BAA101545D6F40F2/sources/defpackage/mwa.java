package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.ar.core.ImageMetadata;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: mwa  reason: default package */
/* loaded from: classes7.dex */
public final class mwa extends cmq {
    public static final dcqe a = dcqe.c("mwa");
    @dzsi
    public final dndr b;
    public final ckco c;
    public final mvv d;
    private final Context e;
    private final btpc f;
    private final cjqy g;
    private final ckcw h;
    private final cjqq i;
    private final kpl j;
    private final dehn<kdj> k;
    private final dbty<nct> l;
    private final FrameLayout m;
    private final bxla n;
    private final ckco o;
    private final ckco p;
    @dzsi
    private nct q;
    private boolean r;

    public mwa(cjqy cjqyVar, final cqat cqatVar, Context context, final btpc btpcVar, final btrm btrmVar, final dxio dxioVar, ckcw ckcwVar, cjqq cjqqVar, kpl kplVar, dehn dehnVar, final dxio dxioVar2, mvv mvvVar, FrameLayout frameLayout, dndr dndrVar) {
        this.g = cjqyVar;
        dbsk.s(context);
        this.e = context;
        dbsk.s(btpcVar);
        this.f = btpcVar;
        dbsk.s(ckcwVar);
        this.h = ckcwVar;
        dbsk.s(cjqqVar);
        this.i = cjqqVar;
        this.j = kplVar;
        dbsk.s(dehnVar);
        this.k = dehnVar;
        dbsk.s(mvvVar);
        this.d = mvvVar;
        if (dndrVar != null) {
            boolean z = true;
            if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
                z = false;
            }
            dbsk.l(z);
        }
        this.b = dndrVar;
        if (dndrVar == dndr.HOME) {
            this.n = bxla.HOME;
        } else if (dndrVar == dndr.WORK) {
            this.n = bxla.WORK;
        } else {
            this.n = bxla.SEARCH;
        }
        this.l = new dbty(btrmVar, dxioVar2, cqatVar, dxioVar, btpcVar) { // from class: mvw
            private final btrm a;
            private final dxio b;
            private final cqat c;
            private final dxio d;
            private final btpc e;

            {
                this.a = btrmVar;
                this.b = dxioVar2;
                this.c = cqatVar;
                this.d = dxioVar;
                this.e = btpcVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btrm btrmVar2 = this.a;
                dxio dxioVar3 = this.b;
                cqat cqatVar2 = this.c;
                dxio dxioVar4 = this.d;
                return new nct(btrmVar2, (akox) dxioVar3.a(), cqatVar2, (bxer) dxioVar4.a(), this.e);
            }
        };
        dbsk.s(frameLayout);
        this.m = frameLayout;
        this.c = (ckco) ckcwVar.a(ckee.K);
        this.o = (ckco) ckcwVar.a(ckee.L);
        this.p = (ckco) ckcwVar.a(ckee.M);
    }

    static cjtd h(ddho ddhoVar, @dzsi String str, int i) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        if (!dbsj.d(str)) {
            b.g(str);
        }
        if (i != -1) {
            b.i(i);
        }
        return b.a();
    }

    private final void i(String str, ddho ddhoVar, dwir dwirVar) {
        ((kdj) deha.s(this.k)).h(str, ddhoVar, dwirVar);
    }

    private final kcz<dcdc<bxmh>> j(String str) {
        return new mvx(this, str);
    }

    @Override // defpackage.cmq
    public final void a() {
        this.r = true;
        nct nctVar = this.q;
        if (nctVar != null) {
            nctVar.b();
            this.q = null;
        }
        nct a2 = this.l.a();
        this.q = a2;
        a2.a();
        cms cmsVar = this.d.a;
        if (cmsVar.a == null) {
            throw new IllegalStateException("No SearchCallback is set");
        }
        try {
            cmsVar.b.e();
        } catch (RemoteException unused) {
        }
        if (npv.a().booleanValue()) {
            this.m.setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
        }
        kty.a(this.h, ckee.O);
    }

    @Override // defpackage.cmq
    public final void b() {
        cms cmsVar = this.d.a;
        if (cmsVar.a == null) {
            throw new IllegalStateException("No SearchCallback is set");
        }
        try {
            cmsVar.b.f();
        } catch (RemoteException unused) {
        }
        if (this.r) {
            ((kdj) deha.s(this.k)).a();
            this.r = false;
        }
        if (npv.a().booleanValue()) {
            this.m.setDescendantFocusability(131072);
            nol.b(this.m);
        }
        nct nctVar = this.q;
        if (nctVar == null) {
            return;
        }
        nctVar.b();
        this.q = null;
    }

    @Override // defpackage.cmq
    public final void c(String str) {
        nct nctVar = this.q;
        if (nctVar == null) {
            return;
        }
        nctVar.c(str, j(str), this.n);
    }

    @Override // defpackage.cmq
    public final boolean d(String str) {
        nct nctVar;
        cjtd h = h(dtxm.bq, null, -1);
        this.g.j(this.i.g().d(h), h);
        if (this.b == null || (nctVar = this.q) == null) {
            this.r = false;
            i(str, dtyi.L, mex.a());
            return true;
        }
        this.r = true;
        nctVar.c(str, j(str), this.n);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    @Override // defpackage.cmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.auto.sdk.SearchItem r12) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.e(com.google.android.apps.auto.sdk.SearchItem):void");
    }

    public final dcdc<SearchItem> f(int i, @dzsi Bitmap bitmap, @dzsi String str) {
        SearchItem searchItem = new SearchItem();
        cmt.e(this.e.getString(i).toUpperCase(Locale.getDefault()), searchItem);
        if (bitmap != null) {
            cmt.c(bitmap, searchItem);
        }
        Bundle bundle = new Bundle();
        if (str == null) {
            bundle.putBoolean("Ignore", true);
        } else {
            bundle.putString("SuggestionSearchQuery", str);
        }
        cmt.b(bundle, searchItem);
        return dcdc.f(cmt.a(searchItem));
    }

    public final Bitmap g(cqtd cqtdVar) {
        Drawable a2 = cqtdVar.a(this.e);
        Bitmap createBitmap = Bitmap.createBitmap(this.e.getResources().getDisplayMetrics(), a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        a2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        a2.draw(canvas);
        return createBitmap;
    }
}
