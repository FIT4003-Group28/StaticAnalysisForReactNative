package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nsh  reason: default package */
/* loaded from: classes7.dex */
public final class nsh {
    @dzsi
    public static View a(View view, int i) {
        cov covVar = (cov) view;
        cok cokVar = covVar.b;
        View aK = cokVar.aK(cokVar.aJ() - 1);
        if (aK == null) {
            return null;
        }
        Rect rect = new Rect();
        aK.getLocalVisibleRect(rect);
        return rect.height() < i ? covVar.b.q() : aK;
    }
}
