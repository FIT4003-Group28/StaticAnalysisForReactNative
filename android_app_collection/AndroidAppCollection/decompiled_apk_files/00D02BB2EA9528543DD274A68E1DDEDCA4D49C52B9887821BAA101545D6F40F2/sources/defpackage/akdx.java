package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: akdx  reason: default package */
/* loaded from: classes2.dex */
final class akdx implements DialogInterface.OnClickListener {
    final /* synthetic */ akea a;

    public akdx(akea akeaVar) {
        this.a = akeaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.w() && this.a.b.getEnableFeatureParameters().m && this.a.d.s().size() > 1) {
            this.a.h.k(null, null);
        }
    }
}
