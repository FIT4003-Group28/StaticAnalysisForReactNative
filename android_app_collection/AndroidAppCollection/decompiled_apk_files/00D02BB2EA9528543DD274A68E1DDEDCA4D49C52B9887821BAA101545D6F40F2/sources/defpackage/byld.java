package defpackage;

import android.content.Context;
/* renamed from: byld  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class byld implements cqjb {
    static final cqjb a = new byld();

    private byld() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjb<byng, Boolean> cqjbVar = byne.a;
        return Boolean.valueOf(((byng) cqkpVar).v() != bynf.LOADING);
    }
}
