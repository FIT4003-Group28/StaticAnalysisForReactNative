package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwgz  reason: default package */
/* loaded from: classes5.dex */
public final class cwgz<AccountT> extends LinearLayout {
    public cwgz(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.choose_an_account_content, this);
        setOrientation(1);
    }

    public static <T extends acl> void a(RecyclerView recyclerView, abg<T> abgVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new aag());
        cwjc.a(recyclerView, abgVar);
    }
}
