package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwif  reason: default package */
/* loaded from: classes5.dex */
public final class cwif extends acl {
    public final cwla s;
    private final ImageView t;
    private final TextView u;
    private final int v;

    public cwif(Context context, cwla cwlaVar, ViewGroup viewGroup, cwie cwieVar) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        this.s = cwlaVar;
        this.t = (ImageView) this.a.findViewById(R.id.icon);
        TextView textView = (TextView) this.a.findViewById(R.id.text);
        this.u = textView;
        cwia cwiaVar = (cwia) cwieVar;
        this.v = cwiaVar.a;
        textView.setTextColor(cwiaVar.b);
    }

    public final void C(final cwic cwicVar) {
        this.s.c(this.a, cwicVar.d());
        this.t.setImageDrawable(cwiz.b(cwicVar.b(), this.v));
        this.u.setText(cwicVar.c());
        this.a.setOnClickListener(new View.OnClickListener(this, cwicVar) { // from class: cwid
            private final cwif a;
            private final cwic b;

            {
                this.a = this;
                this.b = cwicVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwif cwifVar = this.a;
                cwic cwicVar2 = this.b;
                cwifVar.s.d(csgw.a(), view);
                cwicVar2.e().onClick(view);
            }
        });
    }

    public final void D() {
        this.s.e(this.a);
    }

    public final void E(int i) {
        View view = this.a;
        od.y(view, od.w(view) + i, this.a.getPaddingTop(), od.x(this.a) + i, this.a.getPaddingBottom());
    }
}
