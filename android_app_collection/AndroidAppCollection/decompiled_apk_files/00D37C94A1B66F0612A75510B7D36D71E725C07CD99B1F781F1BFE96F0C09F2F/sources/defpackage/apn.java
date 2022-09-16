package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: apn  reason: default package */
/* loaded from: classes.dex */
public final class apn extends apm {
    private final ViewGroup b;

    public apn(dp dpVar, ViewGroup viewGroup) {
        super(dpVar);
        this.b = viewGroup;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempting to add fragment " + this.a + " to container " + this.b + " which is not a FragmentContainerView";
    }
}
