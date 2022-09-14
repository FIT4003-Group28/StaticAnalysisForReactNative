package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
/* compiled from: PG */
/* renamed from: dapi  reason: default package */
/* loaded from: classes5.dex */
public final class dapi extends ne {
    final /* synthetic */ ExpandableSwitchItem b;

    public dapi(ExpandableSwitchItem expandableSwitchItem) {
        this.b = expandableSwitchItem;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        oy oyVar;
        super.f(view, pcVar);
        if (this.b.a) {
            oyVar = oy.g;
        } else {
            oyVar = oy.f;
        }
        pcVar.h(oyVar);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 262144 || i == 524288) {
            ExpandableSwitchItem expandableSwitchItem = this.b;
            expandableSwitchItem.c(!expandableSwitchItem.a);
            return true;
        }
        return super.i(view, i, bundle);
    }
}
