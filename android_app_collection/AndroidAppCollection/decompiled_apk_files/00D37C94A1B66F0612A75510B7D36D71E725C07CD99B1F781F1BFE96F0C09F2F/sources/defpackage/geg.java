package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: geg  reason: default package */
/* loaded from: classes3.dex */
final class geg extends gei {
    public final TextView a;
    final /* synthetic */ gej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geg(gej gejVar, View view) {
        super(gejVar, view);
        this.b = gejVar;
        this.a = (TextView) view.findViewById(R.id.description);
    }

    @Override // defpackage.gei
    public final void a(int i) {
        super.a(i);
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(((Integer) this.b.b.b.get(this.g)).intValue());
        }
        if (this.c != null) {
            if (this.b.b.a() == this.g) {
                this.d.setBackgroundColor(zhn.d(this.b.b.getContext(), R.attr.yt10PercentLayer));
            }
            int dimension = (int) this.b.b.getResources().getDimension(R.dimen.upload_activity_privacy_popup_vertical_padding);
            int i2 = i == 0 ? dimension : 0;
            if (i != this.b.getCount() - 1) {
                dimension = 0;
            }
            this.c.setPadding(0, i2, 0, dimension);
        }
    }
}
