package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mvm  reason: default package */
/* loaded from: classes3.dex */
final class mvm implements View.OnClickListener {
    final /* synthetic */ mvo a;
    private final /* synthetic */ int b;

    public mvm(mvo mvoVar) {
        this.a = mvoVar;
    }

    public mvm(mvo mvoVar, int i) {
        this.b = i;
        this.a = mvoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            mvo mvoVar = this.a;
            apzg apzgVar = mvoVar.h;
            if (apzgVar != null) {
                mvoVar.a.g(apzgVar);
            }
            this.a.c.a();
            return;
        }
        mvo mvoVar2 = this.a;
        apzg apzgVar2 = mvoVar2.i;
        if (apzgVar2 == null) {
            return;
        }
        mvoVar2.a.g(apzgVar2);
    }
}
