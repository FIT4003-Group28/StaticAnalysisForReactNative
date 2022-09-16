package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: qnd  reason: default package */
/* loaded from: classes4.dex */
final class qnd implements qoi {
    final /* synthetic */ qnf a;
    final /* synthetic */ qng b;

    public qnd(qng qngVar, qnf qnfVar) {
        this.b = qngVar;
        this.a = qnfVar;
    }

    @Override // defpackage.qoi
    public final void a(Bitmap bitmap) {
        qnf qnfVar = this.a;
        qnfVar.b = bitmap;
        qng qngVar = this.b;
        qngVar.c = qnfVar;
        qngVar.a();
    }
}
