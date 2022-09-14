package defpackage;

import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
/* compiled from: PG */
/* renamed from: covh  reason: default package */
/* loaded from: classes5.dex */
public final class covh implements Runnable {
    final /* synthetic */ SelectedAccountNavigationView a;

    public covh(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.a();
    }
}
