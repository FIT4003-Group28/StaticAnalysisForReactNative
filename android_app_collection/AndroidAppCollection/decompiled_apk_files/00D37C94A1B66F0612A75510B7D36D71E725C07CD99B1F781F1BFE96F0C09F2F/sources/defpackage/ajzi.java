package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajzi  reason: default package */
/* loaded from: classes.dex */
public abstract class ajzi {
    public final ajsm a;
    public final ajsf b;
    private final acth c;
    private final ajrc d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ajsa] */
    public ajzi(RecyclerView recyclerView, ajsg ajsgVar, ajyi ajyiVar, acth acthVar) {
        this.c = acthVar;
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.b = a;
        a.h(ajsmVar);
        ajrc ajrcVar = new ajrc();
        this.d = ajrcVar;
        a.rZ(ajrcVar);
        recyclerView.ad(a);
    }

    public abstract void a(Object obj, ajsm ajsmVar);

    public final void b(List list) {
        this.d.a = this.c.oi();
        for (Object obj : list) {
            a(obj, this.a);
        }
    }
}
