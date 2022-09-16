package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
/* compiled from: PG */
/* renamed from: bdvc  reason: default package */
/* loaded from: classes3.dex */
public final class bdvc {
    public final dfxs a;
    public final dhjx b;
    public final Application c;
    public final bvrb d;
    public final btvo e;
    public final ckcw f;
    public final cjqy g;
    public final View.OnAttachStateChangeListener h = new bdvb(this);
    @dzsi
    public bwuj i;

    public bdvc(dwfl dwflVar, Application application, bvrb bvrbVar, btvo btvoVar, ckcw ckcwVar, cjqy cjqyVar) {
        dbsk.a(a(dwflVar));
        this.c = application;
        this.d = bvrbVar;
        this.e = btvoVar;
        this.f = ckcwVar;
        this.g = cjqyVar;
        if ((dwflVar.a & 4096) != 0) {
            dhjx dhjxVar = dwflVar.m;
            this.b = dhjxVar == null ? dhjx.f : dhjxVar;
        } else {
            UserOrientation userOrientation = new UserOrientation();
            dhjw bZ = dhjx.f.bZ();
            userOrientation.f(bZ);
            this.b = bZ.bK();
        }
        this.a = cknv.l(dwflVar);
    }

    public static boolean a(dwfl dwflVar) {
        return cknv.g(dwflVar) || cknv.h(dwflVar);
    }
}
