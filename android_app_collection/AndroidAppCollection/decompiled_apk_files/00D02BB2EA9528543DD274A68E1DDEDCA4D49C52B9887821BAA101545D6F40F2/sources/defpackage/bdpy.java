package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdpy  reason: default package */
/* loaded from: classes3.dex */
public final class bdpy extends ges implements bdpj {
    private static final dcqe d = dcqe.c("bdpy");
    public bwqv a;
    private bcan ad;
    private boolean ae;
    public bbtk b;
    public bdpw c;
    private bcpa e;
    private bdpk f;
    private bwrs<bcan> g;

    public static bdpy g(bwqv bwqvVar, bcpa bcpaVar, bwrs<bcan> bwrsVar) {
        bdpy bdpyVar = new bdpy();
        Bundle bundle = new Bundle();
        bundle.putSerializable("action", bcpaVar);
        bwqvVar.c(bundle, "photoSelectionContext", bwrsVar);
        bdpyVar.B(bundle);
        return bdpyVar;
    }

    private final void i() {
        if (bdur.b(this.ad.b)) {
            this.ad.I();
        }
    }

    private final void q() {
        if (!this.aD) {
            this.ae = true;
            return;
        }
        gn gnVar = this.A;
        if (gnVar == null) {
            return;
        }
        gnVar.e();
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        this.f.d(i, i2, intent);
    }

    @Override // defpackage.bdpj
    public final void a(List<Uri> list) {
        i();
        for (Uri uri : list) {
            bbtl w = bbtm.w(uri);
            w.r(dddn.IMAGE_CAPTURE_INTENT);
            bbtj b = this.b.b(w.a());
            this.ad.z(b);
            this.ad.J(b);
        }
        q();
        Nw(bcpb.b(bcpa.TAKE_FROM_CAMERA));
    }

    @Override // defpackage.bdpj
    public final void b(List<Uri> list) {
        i();
        for (Uri uri : list) {
            bbtl w = bbtm.w(uri);
            w.r(dddn.PICK_INTENT);
            bbtj b = this.b.b(w.a());
            this.ad.z(b);
            this.ad.E(b);
        }
        q();
        Nw(bcpb.b(bcpa.PICK_FROM_GALLERY));
    }

    @Override // defpackage.bdpj
    public final void c() {
        q();
    }

    @Override // defpackage.bdpj
    public final void d(Uri uri, Uri uri2) {
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dwyd dwydVar;
        super.l(bundle);
        Bundle bundle2 = bundle != null ? bundle : this.o;
        this.f = this.c.a(this, this);
        if (bundle2 != null) {
            this.e = (bcpa) bundle2.getSerializable("action");
            this.ae = bundle2.getBoolean("shouldPopItselfOnStart", false);
            try {
                bwrs<bcan> e = this.a.e(bcan.class, bundle2, "photoSelectionContext");
                dbsk.s(e);
                this.g = e;
                bcan c = e.c();
                dbsk.s(c);
                this.ad = c;
            } catch (IOException unused) {
                bvoo.h("IOException deserializing item from bundle.", new Object[0]);
            }
            this.f.a(bundle2);
        } else {
            bvoo.h("Bundle should exist all the time", new Object[0]);
        }
        if (bundle != null) {
            return;
        }
        bcan bcanVar = this.ad;
        if (bcanVar == null) {
            dwydVar = dwyd.UNKNOWN_ENTRY_POINT;
        } else {
            dwydVar = bcanVar.b;
        }
        bcpa bcpaVar = bcpa.TAKE_FROM_CAMERA;
        int ordinal = this.e.ordinal();
        if (ordinal == 0) {
            bdpk bdpkVar = this.f;
            bvrj.UI_THREAD.c();
            final bdpv bdpvVar = (bdpv) bdpkVar;
            if (bdpvVar.d.I) {
                return;
            }
            bdpvVar.h.b(new Runnable(bdpvVar) { // from class: bdpl
                private final bdpv a;

                {
                    this.a = bdpvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final bdpv bdpvVar2 = this.a;
                    final Uri a = bdpvVar2.b.a();
                    bdpvVar2.h.b(new Runnable(bdpvVar2, a) { // from class: bdpu
                        private final bdpv a;
                        private final Uri b;

                        {
                            this.a = bdpvVar2;
                            this.b = a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bdpv bdpvVar3 = this.a;
                            Uri uri = this.b;
                            bvrj.UI_THREAD.c();
                            if (bdpvVar3.d.I) {
                                bdpvVar3.a = null;
                                return;
                            }
                            bdpvVar3.a = uri;
                            if (bdpvVar3.a == null) {
                                ((ckcn) bdpvVar3.i.a(ckdz.U)).a();
                                return;
                            }
                            Intent i = bdpvVar3.i("android.media.action.IMAGE_CAPTURE", null);
                            if (i == null) {
                                bdpvVar3.a = null;
                                bdpvVar3.f(R.string.NO_PHOTO_TAKING_APP_AVAILABLE);
                                return;
                            }
                            Uri uri2 = bdpvVar3.a;
                            if (uri2 != null) {
                                ContentResolver contentResolver = bdpvVar3.d.J().getContentResolver();
                                i.putExtra("output", uri2);
                                i.setClipData(ClipData.newUri(contentResolver, "photos", uri2));
                                i.setFlags(3);
                            }
                            bdpvVar3.k.a().p(bdpvVar3.d, i, awnn.TAKE_PICTURE.ordinal(), 4);
                        }
                    }, bvrj.UI_THREAD);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            return;
        }
        int i = 1;
        if (ordinal != 1) {
            return;
        }
        bdpk bdpkVar2 = this.f;
        boolean a = bdur.a(dwydVar);
        if (true == bdur.b(dwydVar)) {
            i = 2;
        }
        bdpkVar2.e(a, i);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        gn gnVar;
        super.s();
        if (!this.ae || (gnVar = this.A) == null) {
            return;
        }
        gnVar.e();
        this.ae = false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("action", this.e);
        bundle.putSerializable("shouldPopItselfOnStart", Boolean.valueOf(this.ae));
        this.a.c(bundle, "photoSelectionContext", this.g);
        this.f.b(bundle);
    }
}
