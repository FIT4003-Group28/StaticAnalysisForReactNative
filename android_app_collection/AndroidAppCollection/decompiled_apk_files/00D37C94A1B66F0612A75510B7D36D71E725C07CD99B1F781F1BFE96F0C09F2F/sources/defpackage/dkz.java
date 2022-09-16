package defpackage;

import com.facebook.litho.ComponentTree;
/* compiled from: PG */
/* renamed from: dkz  reason: default package */
/* loaded from: classes3.dex */
final class dkz implements Runnable {
    final /* synthetic */ dci a;

    public dkz(dci dciVar) {
        this.a = dciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbq dbqVar;
        dci dciVar = this.a;
        ComponentTree componentTree = dciVar.r;
        if (componentTree == null || (dbqVar = componentTree.t) == null) {
            return;
        }
        int c = dbqVar.c();
        for (int i = 0; i < c; i++) {
            daq daqVar = dbqVar.f(i).e;
            if (daqVar != null) {
                if (czu.e == null) {
                    czu.e = new dbw();
                }
                czu.e.a = dciVar;
                czu.e.b = null;
                daqVar.a(czu.e);
                czu.e.a = null;
                czu.e.b = null;
            }
        }
    }
}
