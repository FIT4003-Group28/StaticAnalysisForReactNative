package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: csqc  reason: default package */
/* loaded from: classes5.dex */
public abstract class csqc<T extends dssj> implements cspy<T> {
    @Override // defpackage.cspy
    public final /* bridge */ /* synthetic */ Object a() {
        dtrw b = b();
        dsqv dsqvVar = (dsqv) c();
        b.f(dsqvVar);
        if (b.V.k(dsqvVar.d)) {
            dtrw b2 = b();
            dsqv dsqvVar2 = (dsqv) c();
            b2.f(dsqvVar2);
            Object l = b2.V.l(dsqvVar2.d);
            return (dssj) (l == null ? dsqvVar2.b : dsqvVar2.b(l));
        }
        throw new csqa("Missing MoonLanderData extension");
    }

    public abstract dtrw b();

    public abstract dspy<dtrw, T> c();
}
