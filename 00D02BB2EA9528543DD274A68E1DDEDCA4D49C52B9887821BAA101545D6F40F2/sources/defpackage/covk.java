package defpackage;

import android.view.View;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
/* compiled from: PG */
/* renamed from: covk  reason: default package */
/* loaded from: classes5.dex */
public final class covk implements View.OnClickListener {
    final /* synthetic */ SelectedAccountNavigationView a;

    public covk(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(1);
    }
}