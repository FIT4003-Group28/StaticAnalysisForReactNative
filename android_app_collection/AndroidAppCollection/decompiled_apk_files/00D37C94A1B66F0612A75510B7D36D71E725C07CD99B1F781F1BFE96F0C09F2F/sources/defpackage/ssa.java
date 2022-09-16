package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: ssa  reason: default package */
/* loaded from: classes4.dex */
public final class ssa implements tct {
    public final Context a;

    public ssa(Context context) {
        this.a = context;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awqd.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        awqd awqdVar = (awqd) obj;
        return aynr.w(new Runnable() { // from class: srz
            @Override // java.lang.Runnable
            public final void run() {
                ((InputMethodManager) ssa.this.a.getSystemService("input_method")).hideSoftInputFromWindow(tcsVar.a.getWindowToken(), 0);
            }
        }).E(aypa.a());
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
