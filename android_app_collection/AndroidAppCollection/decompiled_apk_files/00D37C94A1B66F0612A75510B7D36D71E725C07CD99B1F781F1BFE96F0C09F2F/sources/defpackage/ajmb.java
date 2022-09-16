package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: ajmb  reason: default package */
/* loaded from: classes.dex */
public final class ajmb implements tej {
    public long a;

    @Override // defpackage.tej
    public final aooq a() {
        return auoi.b;
    }

    public final MotionEvent b(long j, int i, tfi tfiVar) {
        return MotionEvent.obtain(this.a, j, i, tfiVar.a, tfiVar.b, 0);
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        if (!((auoi) obj).c) {
            return;
        }
        akee c = akef.c();
        tdqVar.n(new ajly(this, c));
        tdqVar.o(new ajlz(this, c));
        tdqVar.m(new ajma(this, c));
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
        throw null;
    }
}
