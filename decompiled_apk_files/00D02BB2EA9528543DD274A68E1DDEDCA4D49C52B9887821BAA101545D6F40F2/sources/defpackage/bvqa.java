package defpackage;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvqa  reason: default package */
/* loaded from: classes.dex */
public class bvqa<T> implements degu<T> {
    @Override // defpackage.degu
    public void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        th.getMessage();
        int i = dbsj.a;
        bvoo.j(th);
    }

    @Override // defpackage.degu
    public void b(T t) {
    }
}
