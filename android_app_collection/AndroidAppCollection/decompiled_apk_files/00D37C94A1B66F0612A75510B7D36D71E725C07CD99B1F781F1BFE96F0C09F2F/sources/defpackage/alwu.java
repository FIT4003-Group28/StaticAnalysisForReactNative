package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
/* compiled from: PG */
/* renamed from: alwu  reason: default package */
/* loaded from: classes.dex */
public final class alwu extends jo {
    final /* synthetic */ ExpandableSwitchItem b;

    public alwu(ExpandableSwitchItem expandableSwitchItem) {
        this.b = expandableSwitchItem;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        mf mfVar;
        super.d(view, mhVar);
        if (this.b.a) {
            mfVar = mf.f;
        } else {
            mfVar = mf.e;
        }
        mhVar.i(mfVar);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 262144 || i == 524288) {
            ExpandableSwitchItem expandableSwitchItem = this.b;
            expandableSwitchItem.c(!expandableSwitchItem.a);
            return true;
        }
        return super.j(view, i, bundle);
    }
}
