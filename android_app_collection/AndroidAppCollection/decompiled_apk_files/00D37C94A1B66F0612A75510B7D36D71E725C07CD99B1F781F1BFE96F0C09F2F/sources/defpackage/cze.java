package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentTree;
/* compiled from: PG */
/* renamed from: cze  reason: default package */
/* loaded from: classes3.dex */
public final class cze implements Runnable {
    final /* synthetic */ ComponentTree a;
    private final /* synthetic */ int b;

    public cze(ComponentTree componentTree) {
        this.a = componentTree;
    }

    public cze(ComponentTree componentTree, int i) {
        this.b = i;
        this.a = componentTree;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar;
        Context context;
        dcm a;
        if (this.b == 0) {
            this.a.i();
            return;
        }
        ComponentTree componentTree = this.a;
        synchronized (componentTree) {
            dbq dbqVar = componentTree.t;
            if (dbqVar == null && (dbqVar = componentTree.u) == null) {
                return;
            }
            tha u = componentTree.u();
            if (u != null) {
                cyv cyvVar = componentTree.h;
                ddbVar = czu.D(cyvVar, u, u.a(cyvVar, 8));
            } else {
                ddbVar = null;
            }
            if (!dbqVar.e.isEmpty()) {
                int size = dbqVar.e.size();
                for (int i = 0; i < size; i++) {
                    cyr cyrVar = ((dbn) ((dmw) dbqVar.e.get(i)).a).b;
                    if (cyr.z(cyrVar) && (a = czo.a((context = dbqVar.c.b), cyrVar)) != null) {
                        a.b(context, cyrVar);
                    }
                }
            }
            if (ddbVar == null) {
                return;
            }
            tha.d(ddbVar);
        }
    }
}
