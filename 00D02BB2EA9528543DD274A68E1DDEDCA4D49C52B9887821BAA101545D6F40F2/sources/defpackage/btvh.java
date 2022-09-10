package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: btvh  reason: default package */
/* loaded from: classes4.dex */
public final class btvh<T> extends btrh<T> {
    public btvh(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        btvg btvgVar = (btvg) this.a;
        btwe btweVar = (btwe) obj;
        URL a = btvgVar.f.a();
        synchronized (btvgVar) {
            if (btvgVar.d == null || (a != null && !a.equals(btvgVar.c))) {
                if (a != null) {
                    btvgVar.c.toString();
                    a.toString();
                    btvgVar.c = a;
                }
                btvgVar.e();
            }
        }
        btvgVar.e.j(null);
        synchronized (btvgVar) {
            dbsk.s(btvgVar.d);
        }
    }
}
