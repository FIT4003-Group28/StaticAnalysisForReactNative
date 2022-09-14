package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cppt  reason: default package */
/* loaded from: classes5.dex */
public final class cppt {
    public static void a(View view, cpps... cppsVarArr) {
        if (view.getLayerType() == 1) {
            return;
        }
        for (cpps cppsVar : cppsVarArr) {
            if (!cppsVar.a()) {
                String name = cppsVar.name();
                String simpleName = view.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 64 + String.valueOf(simpleName).length());
                sb.append("Feature: ");
                sb.append(name);
                sb.append(" caused hardware acceleration to be disabled for view: ");
                sb.append(simpleName);
                sb.toString();
                view.setLayerType(1, null);
                return;
            }
        }
    }

    public static boolean b(View view, cpps... cppsVarArr) {
        if (view.getLayerType() == 1) {
            return true;
        }
        for (cpps cppsVar : cppsVarArr) {
            if (!cppsVar.a()) {
                return false;
            }
        }
        return true;
    }
}
