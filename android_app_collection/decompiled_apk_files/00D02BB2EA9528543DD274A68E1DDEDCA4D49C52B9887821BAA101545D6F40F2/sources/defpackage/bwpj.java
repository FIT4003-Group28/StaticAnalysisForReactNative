package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwpj  reason: default package */
/* loaded from: classes4.dex */
public class bwpj extends iwx {
    final /* synthetic */ bwpn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpj(bwpn bwpnVar, Activity activity) {
        super(activity);
        this.a = bwpnVar;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        Runnable runnable = this.a.b;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }
}
