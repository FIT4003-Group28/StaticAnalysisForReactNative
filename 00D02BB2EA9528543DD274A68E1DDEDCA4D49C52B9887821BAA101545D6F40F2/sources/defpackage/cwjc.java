package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cwjc  reason: default package */
/* loaded from: classes5.dex */
public final class cwjc {
    public static <T extends acl> void a(RecyclerView recyclerView, abg<T> abgVar) {
        cwjb cwjbVar = new cwjb(recyclerView, abgVar);
        if (od.ak(recyclerView)) {
            cwjbVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(cwjbVar);
    }
}
