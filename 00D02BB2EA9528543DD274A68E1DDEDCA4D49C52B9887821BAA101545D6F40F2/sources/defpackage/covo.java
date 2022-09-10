package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
/* compiled from: PG */
/* renamed from: covo  reason: default package */
/* loaded from: classes5.dex */
public final class covo implements covt {
    final /* synthetic */ SelectedAccountNavigationView a;

    public covo(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    @Override // defpackage.covt
    public final covs a(View view) {
        covs covsVar = new covs();
        covsVar.b = view;
        covsVar.c = view.findViewById(R.id.account_text);
        covsVar.e = view.findViewById(R.id.avatar);
        covsVar.k = (ImageView) covsVar.e;
        covsVar.f = (TextView) view.findViewById(R.id.account_display_name);
        covsVar.g = (TextView) view.findViewById(R.id.account_address);
        covsVar.j = (ImageView) view.findViewById(R.id.cover_photo);
        covsVar.d = (ExpanderView) view.findViewById(R.id.account_list_button);
        view.findViewById(R.id.account_list_wrapper);
        covsVar.a = view.findViewById(R.id.scrim);
        covsVar.x = this.a.findViewById(R.id.account_switcher_lib_view_wrapper);
        if (this.a.e) {
            covsVar.h = view.findViewById(R.id.avatar_recents_one);
            covsVar.l = (ImageView) view.findViewById(R.id.avatar_recents_one_image);
            covsVar.i = view.findViewById(R.id.avatar_recents_two);
            covsVar.m = (ImageView) view.findViewById(R.id.avatar_recents_two_image);
            if (covsVar.l == null) {
                View view2 = covsVar.h;
                if (view2 instanceof ImageView) {
                    covsVar.l = (ImageView) view2;
                }
            }
            if (covsVar.m == null) {
                View view3 = covsVar.i;
                if (view3 instanceof ImageView) {
                    covsVar.m = (ImageView) view3;
                }
            }
            covsVar.q = view.findViewById(R.id.offscreen_avatar);
            covsVar.u = (ImageView) covsVar.q;
            covsVar.r = (ImageView) view.findViewById(R.id.offscreen_cover_photo);
            covsVar.n = view.findViewById(R.id.offscreen_text);
            covsVar.o = (TextView) view.findViewById(R.id.offscreen_account_display_name);
            covsVar.p = (TextView) view.findViewById(R.id.offscreen_account_address);
            covsVar.s = view.findViewById(R.id.crossfade_avatar_recents_one);
            covsVar.v = (ImageView) covsVar.s;
            covsVar.t = view.findViewById(R.id.crossfade_avatar_recents_two);
            covsVar.w = (ImageView) covsVar.t;
        }
        return covsVar;
    }
}
