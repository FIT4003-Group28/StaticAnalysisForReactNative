package defpackage;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkss  reason: default package */
/* loaded from: classes3.dex */
public final class bkss extends aah {
    final /* synthetic */ bksv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkss(bksv bksvVar, Context context) {
        super(context);
        this.f = bksvVar;
    }

    @Override // defpackage.aah
    protected final int e() {
        return 0;
    }

    @Override // defpackage.aah
    public final int h(View view, int i) {
        int left = view.getLeft();
        int right = view.getRight();
        int i2 = view.getContext().getResources().getDisplayMetrics().widthPixels;
        int i3 = this.f.a;
        int i4 = i2 - i3;
        if (left < i3) {
            return i3 - left;
        }
        if (i4 >= right) {
            return 0;
        }
        return i4 - right;
    }
}
