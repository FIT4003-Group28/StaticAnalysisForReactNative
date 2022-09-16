package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ijp  reason: default package */
/* loaded from: classes3.dex */
public final class ijp implements tct {
    private final Activity a;

    public ijp(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return asvl.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        asvl asvlVar = (asvl) obj;
        Activity activity = this.a;
        if (activity instanceof ijq) {
            return ((ijq) activity).i(asvlVar);
        }
        String valueOf = String.valueOf(activity.getClass().getName());
        return aynr.s(new IllegalStateException(valueOf.length() != 0 ? "Handler for LocationPickerOnTapCommand was asked from an Activity which doesn't provide one: ".concat(valueOf) : new String("Handler for LocationPickerOnTapCommand was asked from an Activity which doesn't provide one: ")));
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
