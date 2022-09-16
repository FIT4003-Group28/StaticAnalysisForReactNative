package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czh  reason: default package */
/* loaded from: classes3.dex */
public final class czh implements Callable {
    final /* synthetic */ czi a;

    public czh(czi cziVar) {
        this.a = cziVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        dbq dbqVar;
        dbq dbqVar2;
        cyv cyvVar;
        synchronized (this.a) {
            dbqVar = null;
            if (!this.a.j) {
                czi cziVar = this.a;
                ComponentTree componentTree = cziVar.k;
                czi cziVar2 = true != componentTree.z ? null : cziVar;
                synchronized (componentTree) {
                    ddm a = ddm.a(cziVar.k.w);
                    dbqVar2 = cziVar.k.v;
                    cyvVar = new cyv(cziVar.a, a, cziVar.l, (dbp) null, (byte[]) null);
                    cziVar.k.d.a(a);
                }
                dbq n = dbq.n(cyvVar, cziVar.b, cziVar2, cziVar.k.x, cziVar.c, cziVar.d, cziVar.e, dbqVar2, cziVar.h, cziVar.i);
                synchronized (this.a) {
                    if (!this.a.j) {
                        dbqVar = n;
                    }
                }
            }
        }
        return dbqVar;
    }
}
