package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: apf  reason: default package */
/* loaded from: classes.dex */
public final class apf extends apm {
    private final ViewGroup b;

    public apf(dp dpVar, ViewGroup viewGroup) {
        super(dpVar);
        this.b = viewGroup;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempting to use <fragment> tag to add fragment " + this.a + " to container " + this.b;
    }
}
