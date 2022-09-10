package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kef  reason: default package */
/* loaded from: classes7.dex */
public final class kef {
    public final keg a;
    public final kdr b;
    public dbsg<crzp<Rect>> c = dbpy.a;
    public final Executor d;

    public kef(kdr kdrVar, keg kegVar, Executor executor) {
        this.a = kegVar;
        this.b = kdrVar;
        this.d = executor;
    }

    public final void a(crzm<Rect> crzmVar) {
        bvrj.UI_THREAD.c();
        bvor.a(dbsg.j(crzmVar.l()), new mw(this) { // from class: kee
            private final kef a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                Rect rect = (Rect) obj;
                keg kegVar = this.a.a;
                bvrj.UI_THREAD.c();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kegVar.c.getLayoutParams();
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
                kegVar.c.setLayoutParams(marginLayoutParams);
            }
        });
    }
}
