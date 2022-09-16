package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwhv  reason: default package */
/* loaded from: classes5.dex */
final class cwhv<AccountT> extends LinearLayout {
    public final RecyclerView a;

    public cwhv(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.signed_out_content, this);
        setOrientation(1);
        this.a = (RecyclerView) findViewById(R.id.action_groups);
    }
}
