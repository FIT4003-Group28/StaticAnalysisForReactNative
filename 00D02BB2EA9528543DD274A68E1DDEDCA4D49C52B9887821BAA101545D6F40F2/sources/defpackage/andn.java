package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: andn  reason: default package */
/* loaded from: classes2.dex */
public final class andn<T> extends btrh<T> {
    public andn(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        andm andmVar = (andm) this.a;
        ardp ardpVar = (ardp) obj;
        GmmLocation a = andmVar.ag.a();
        if (a == null) {
            return;
        }
        andmVar.aR(a.B());
        andmVar.c = null;
    }
}
