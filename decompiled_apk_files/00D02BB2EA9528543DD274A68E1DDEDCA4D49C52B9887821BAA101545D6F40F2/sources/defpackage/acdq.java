package defpackage;

import android.app.Application;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acdq  reason: default package */
/* loaded from: classes2.dex */
public final class acdq {
    public static final cqtv a = cqrp.d(6.0d);
    public static final cqtv b = cqrp.d(6.0d);
    public final dxio<akvz> c;
    public final dbsz<acdl> d;
    public final amfi e;
    public final acdp f;

    public acdq(dbsz<acdl> dbszVar, final Application application, dxio<akvz> dxioVar, amfi amfiVar) {
        this.d = dbszVar;
        this.e = amfiVar;
        this.c = dxioVar;
        this.f = new acdp(application, dbud.a(new dbty(application) { // from class: acdm
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Application application2 = this.a;
                cqtv cqtvVar = acdq.a;
                return BitmapFactory.decodeResource(application2.getResources(), 2131231041);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        if (!ckqj.e(str)) {
            return str;
        }
        dsnh c = ckqj.c(100, 100, -1, null);
        c.d();
        c.a.d(dsne.REQUEST_WEBP, true);
        c.a.c(dsne.REQUEST_WEBP);
        c.c(26);
        return ckqj.a(c, str);
    }
}
