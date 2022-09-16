package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: umg  reason: default package */
/* loaded from: classes4.dex */
public final class umg extends yo {
    public final ImageView t;
    public final TextView u;
    public final int v;
    public final upq w;
    public final SimpleActionView x;

    public umg(Context context, upq upqVar, ViewGroup viewGroup, umf umfVar) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.a;
        this.x = (SimpleActionView) view;
        this.w = upqVar;
        this.t = (ImageView) view.findViewById(R.id.icon);
        TextView textView = (TextView) this.a.findViewById(R.id.text);
        this.u = textView;
        this.v = umfVar.a;
        textView.setTextColor(umfVar.b);
    }
}
