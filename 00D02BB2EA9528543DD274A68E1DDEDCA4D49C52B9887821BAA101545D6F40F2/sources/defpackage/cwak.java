package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: cwak  reason: default package */
/* loaded from: classes5.dex */
public final class cwak<T> {
    public final rb a;
    public final cvze<T> b;
    public final SelectedAccountDisc<T> c;
    public final cvyo<T> d;

    public cwak(rb rbVar, cvze<T> cvzeVar, SelectedAccountDisc<T> selectedAccountDisc) {
        dbsk.b(true, "Activity or Fragment should be non-null but not both");
        this.a = rbVar;
        dbsk.s(cvzeVar);
        this.b = cvzeVar;
        dbsk.s(selectedAccountDisc);
        this.c = selectedAccountDisc;
        this.d = new cvyo<>(selectedAccountDisc, cvzeVar);
    }
}
