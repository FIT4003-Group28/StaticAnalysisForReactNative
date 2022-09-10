package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzff  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzff implements bzdk {
    @Override // defpackage.bzdk
    public final boolean a(amub amubVar) {
        if (h() != bzdj.STARTED) {
            return false;
        }
        return c(amubVar);
    }

    @Override // defpackage.bzdk
    public final boolean c(amub amubVar) {
        if (h() == bzdj.UNINITIALIZED) {
            return false;
        }
        amub u = u();
        dbsk.s(u);
        if (!u.l().d(amubVar.l())) {
            return false;
        }
        return u.d.a.g.equals(amubVar.d.a.g);
    }

    @Override // defpackage.bzdk
    @dzsi
    public final amub l(Context context) {
        amte k = k();
        dbsk.s(k);
        return k.b(m(), context);
    }

    @Override // defpackage.bzdk
    public final boolean p() {
        return q() != null;
    }

    @dzsi
    public abstract amub u();

    public abstract byys v();
}
