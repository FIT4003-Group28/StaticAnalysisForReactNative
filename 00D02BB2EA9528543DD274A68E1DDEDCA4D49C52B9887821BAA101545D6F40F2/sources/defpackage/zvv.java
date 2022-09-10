package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zvv  reason: default package */
/* loaded from: classes7.dex */
public class zvv implements dbty<Integer> {
    @dzsi
    private final View a;

    public zvv(@dzsi View view) {
        this.a = view;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zvv(defpackage.cqkf<?> r3) {
        /*
            r2 = this;
            android.view.View r0 = r3.c()
            boolean r0 = r0 instanceof com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar
            if (r0 == 0) goto Ld
            android.view.View r3 = r3.c()
            goto L25
        Ld:
            android.view.View r0 = r3.c()
            cqjg r1 = defpackage.icu.m
            android.view.View r0 = defpackage.cqkx.d(r0, r1)
            if (r0 != 0) goto L24
            android.view.View r3 = r3.c()
            cqjg r0 = defpackage.isf.i
            android.view.View r3 = defpackage.cqkx.d(r3, r0)
            goto L25
        L24:
            r3 = r0
        L25:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvv.<init>(cqkf):void");
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public Integer a() {
        View view = this.a;
        return Integer.valueOf(view != null ? view.getHeight() : 0);
    }
}
