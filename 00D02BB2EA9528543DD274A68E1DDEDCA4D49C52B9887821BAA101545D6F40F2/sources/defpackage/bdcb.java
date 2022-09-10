package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bdcb  reason: default package */
/* loaded from: classes3.dex */
public class bdcb implements bdac {
    public final cjqy a;
    public final dfxs b;
    public final dhjx c;
    public final iys d;
    public final bvrb e;
    public final btvo f;
    public final ckcw g;
    private final cjtd h;
    private final bdby i;
    private final View.OnAttachStateChangeListener j = new bdca(this);

    public bdcb(Context context, dwfl dwflVar, int i, bvrb bvrbVar, btvo btvoVar, ckcw ckcwVar, cjqy cjqyVar, bwsh bwshVar, @dzsi ilo iloVar) {
        this.a = cjqyVar;
        this.e = bvrbVar;
        this.f = btvoVar;
        this.g = ckcwVar;
        boolean z = true;
        if (!cknv.g(dwflVar) && !cknv.h(dwflVar)) {
            z = false;
        }
        dbsk.a(z);
        this.b = cknv.l(dwflVar);
        if ((dwflVar.a & 4096) != 0) {
            dhjx dhjxVar = dwflVar.m;
            this.c = dhjxVar == null ? dhjx.f : dhjxVar;
        } else {
            UserOrientation userOrientation = new UserOrientation();
            dhjw bZ = dhjx.f.bZ();
            userOrientation.f(bZ);
            this.c = bZ.bK();
        }
        cjta b = cjtd.b();
        b.d = dtxy.fq;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        if ((dwflVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dpsn dpsnVar = dwflVar.t;
            b.g = decs.a((dpsnVar == null ? dpsn.d : dpsnVar).c);
        }
        this.h = b.a();
        cjta b2 = cjtd.b();
        b2.d = dtxy.ct;
        b2.b = dwflVar.b;
        b2.g(dwflVar.c);
        this.i = new bdby(context, dwflVar, iloVar, bwshVar, b2.a(), true, R.id.photo_lightbox_expand360_button);
        this.d = new iys();
    }

    @Override // defpackage.bdac
    public View.OnAttachStateChangeListener a() {
        return this.j;
    }

    @Override // defpackage.bdac
    public Float b() {
        return Float.valueOf(1.0f);
    }

    @Override // defpackage.bdac
    public jar c() {
        return this.i;
    }

    @Override // defpackage.bdac
    public jbu d() {
        return this.d;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcty(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.h;
    }
}
