package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: begv  reason: default package */
/* loaded from: classes3.dex */
public final class begv implements bwrr<ilo> {
    final /* synthetic */ begx a;

    public begv(begx begxVar) {
        this.a = begxVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ValueAnimator valueAnimator;
        begx begxVar = this.a;
        ilo iloVar2 = begxVar.f;
        begxVar.f = iloVar;
        if (iloVar2 == null) {
            begxVar.b.e(begxVar.f);
            valueAnimator = this.a.c;
        } else {
            valueAnimator = begxVar.d;
        }
        valueAnimator.start();
    }
}
