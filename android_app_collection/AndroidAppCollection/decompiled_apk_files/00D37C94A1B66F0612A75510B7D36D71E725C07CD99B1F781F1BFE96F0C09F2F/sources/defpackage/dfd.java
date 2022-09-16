package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: dfd  reason: default package */
/* loaded from: classes3.dex */
public final class dfd {
    public static final dfe a = new dfc(5);
    public static final dfe b = new dfc(6);
    public static final dfe c = new dfc(4);
    public static final dfe d = new dfc();
    public static final dfe e = new dfc(1);
    public static final dfe f = new dfc(3);
    public static final dfe g = new dfc(2);

    public static float a(View view, boolean z) {
        float f2 = 0.0f;
        while (view != null) {
            if (view instanceof dci) {
                return f2;
            }
            f2 += z ? view.getX() : view.getY();
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                String valueOf = String.valueOf(view.getParent());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Expected parent to be View, was ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
        }
        throw new RuntimeException("Got unexpected null parent");
    }

    public static View b(Object obj, dfe dfeVar) {
        if (!(obj instanceof View)) {
            String b2 = dfeVar.b();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(b2.length() + 46 + String.valueOf(valueOf).length());
            sb.append("Animating '");
            sb.append(b2);
            sb.append("' is only supported on Views (got ");
            sb.append(valueOf);
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
        return (View) obj;
    }

    public static View c(Drawable drawable) {
        Drawable.Callback callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }
}
