package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aikp  reason: default package */
/* loaded from: classes2.dex */
public class aikp {
    public final Map<String, Bitmap> a = new ConcurrentHashMap();
    public final Executor b;
    private final dbty<Bitmap> c;
    private final Application d;
    private final amfi e;
    private final float f;

    public aikp(final Application application, amfi amfiVar, Executor executor) {
        this.d = application;
        this.e = amfiVar;
        this.b = executor;
        this.f = application.getResources().getDisplayMetrics().density;
        this.c = dbud.a(new dbty(application) { // from class: aikj
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return BitmapFactory.decodeResource(this.a.getResources(), 2131232998);
            }
        });
    }

    public static cqtd c(Bitmap bitmap) {
        return new aikn(new Object[]{bitmap}, bitmap);
    }

    public final Bitmap a(String str, aiko aikoVar, dbsz<Bitmap> dbszVar) {
        Bitmap a = this.c.a();
        int i = (int) (this.f * 50.0f);
        String a2 = aikoVar.c.a(str, i, i, null);
        if (dbsj.d(a2)) {
            return a;
        }
        Bitmap bitmap = this.a.get(a2);
        if (bitmap != null) {
            return bitmap;
        }
        this.e.d(a2, new aikm(this, a2, dbszVar), null);
        return a;
    }

    public final cqtd b(String str, aiko aikoVar, final dbsz<cqtd> dbszVar) {
        return c(a(str, aikoVar, new dbsz(dbszVar) { // from class: aikk
            private final dbsz a;

            {
                this.a = dbszVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.NU(aikp.c((Bitmap) obj));
            }
        }));
    }
}
