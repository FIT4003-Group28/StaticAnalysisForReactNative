package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gei  reason: default package */
/* loaded from: classes3.dex */
public class gei {
    public final FrameLayout c;
    public final RelativeLayout d;
    public final ImageView e;
    public final TextView f;
    public ghi g;
    final /* synthetic */ gej h;

    public gei(gej gejVar, View view) {
        this.h = gejVar;
        this.c = (FrameLayout) view.findViewById(R.id.item_container);
        this.d = (RelativeLayout) view.findViewById(R.id.inner_item_container);
        this.e = (ImageView) view.findViewById(R.id.icon);
        this.f = (TextView) view.findViewById(R.id.label);
    }

    public void a(int i) {
        this.g = (ghi) this.h.a.get(i);
        if (this.e != null) {
            ghi ghiVar = ghi.PUBLIC;
            int ordinal = this.g.ordinal();
            if (ordinal == 0) {
                this.e.setImageResource(2131233376);
            } else if (ordinal == 1) {
                this.e.setImageResource(2131233408);
            } else if (ordinal == 2) {
                this.e.setImageResource(2131233417);
            }
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(this.h.b.getContext().getResources().getText(this.g.d));
        }
    }
}
