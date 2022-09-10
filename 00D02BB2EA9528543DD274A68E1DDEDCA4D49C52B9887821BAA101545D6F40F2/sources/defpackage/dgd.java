package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgd  reason: default package */
/* loaded from: classes6.dex */
public final class dgd {
    public final ViewGroup a;
    public final dgs b;
    public final int c;
    public final int d;
    public final int e;
    public final dfy f;
    public float m;
    public final dfv g = new dfv();
    public final dfv h = new dfv();
    public final Rect i = new Rect();
    public final Rect j = new Rect();
    public final Rect k = new Rect();
    public final akra l = new akra();
    public final akra n = new akra();
    public final akra o = new akra();
    public final akra p = new akra();
    public final akra q = new akra();

    public dgd(dgs dgsVar, ViewGroup viewGroup, dfy dfyVar) {
        this.a = viewGroup;
        this.b = dgsVar;
        this.f = dfyVar;
        Resources resources = viewGroup.getResources();
        this.c = a(42.0f, resources);
        this.d = a(15.0f, resources);
        this.e = a(5.0f, resources);
    }

    static int a(float f, Resources resources) {
        return Math.round(TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
    }
}
