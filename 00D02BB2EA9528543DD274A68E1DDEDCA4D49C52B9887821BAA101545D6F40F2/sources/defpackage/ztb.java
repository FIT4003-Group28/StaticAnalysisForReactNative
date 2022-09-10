package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ztb  reason: default package */
/* loaded from: classes7.dex */
public final class ztb {
    public static final int a = cqir.a();
    public static final int b = cqir.a();
    private static final dcqe c = dcqe.c("ztb");
    private static final cqrp d = cqrp.d(10.0d);
    private static final cqrp e = cqrp.d(4.0d);
    private static final Rect f = new Rect();
    private final Activity g;
    private final gdk h;
    private final int i;
    private idc j = null;
    private int k = 0;
    private boolean l = false;

    public ztb(Activity activity) {
        this.g = activity;
        this.h = new gdk(activity, ibm.b(), 0, d.e(activity));
        this.i = e.NR(activity);
    }

    public static int d(zut zutVar) {
        View findViewById = zutVar.findViewById(b);
        if (findViewById == null || zutVar.getChildCount() == 0) {
            bvoo.h("Unable to determine content offset in bottom sheet", new Object[0]);
            return cqrp.d(22.0d).NR(zutVar.getContext());
        }
        Rect rect = f;
        findViewById.getDrawingRect(rect);
        zutVar.offsetDescendantRectToMyCoords(findViewById, rect);
        return rect.top - zutVar.getChildAt(0).getTop();
    }

    public static void e(egj egjVar, final dbty<Integer> dbtyVar, final zut zutVar, final cqrp cqrpVar) {
        egjVar.E(new dbty(dbtyVar, cqrpVar, zutVar) { // from class: zta
            private final dbty a;
            private final cqrp b;
            private final zut c;

            {
                this.a = dbtyVar;
                this.b = cqrpVar;
                this.c = zutVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dbty dbtyVar2 = this.a;
                cqrp cqrpVar2 = this.b;
                zut zutVar2 = this.c;
                return Integer.valueOf(Math.max(((zvv) dbtyVar2).a().intValue() + cqrpVar2.e(zutVar2.getContext()), ztb.d(zutVar2)));
            }
        });
    }

    public final void a(idc idcVar) {
        this.j = idcVar;
        idcVar.c(this.l, false);
        this.j.setBackground(this.h);
    }

    public final void b(cqrp cqrpVar) {
        this.k = cqrpVar.e(this.g);
    }

    public final void c(zut zutVar) {
        int height = zutVar.getHeight() - zutVar.e;
        this.l = height == 0;
        idc idcVar = this.j;
        if (idcVar != null) {
            ViewGroup viewGroup = (ViewGroup) idcVar.getRootView();
            if (viewGroup == zutVar.getRootView()) {
                Rect rect = f;
                zutVar.getDrawingRect(rect);
                viewGroup.offsetDescendantRectToMyCoords(zutVar, rect);
                viewGroup.offsetRectIntoDescendantCoords(this.j, rect);
                int height2 = (this.j.getHeight() - rect.top) - this.k;
                int i = height2 - height;
                int i2 = this.i;
                if (i <= i2) {
                    this.h.a(0, false);
                } else {
                    this.h.a(i - i2, true ^ this.l);
                }
                int max = Math.max((this.j.getHeight() + this.k) - d(zutVar), 0);
                float max2 = Math.max(max * (i / height2), 0.0f);
                View findViewById = zutVar.findViewById(a);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), max);
                findViewById.setTranslationY(max2);
            }
            idc idcVar2 = this.j;
            boolean z = this.l;
            idcVar2.c(z, z);
        }
    }
}
