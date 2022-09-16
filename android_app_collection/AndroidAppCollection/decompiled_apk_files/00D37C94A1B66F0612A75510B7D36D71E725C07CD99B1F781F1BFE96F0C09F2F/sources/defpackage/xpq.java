package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xpq  reason: default package */
/* loaded from: classes4.dex */
final class xpq implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ xps c;

    public xpq(xps xpsVar, int i, ImageView imageView) {
        this.c = xpsVar;
        this.a = i;
        this.b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xps xpsVar = this.c;
        int i = xpsVar.b;
        int i2 = this.a;
        if (i == i2) {
            i2 = 0;
        }
        xpsVar.b = i2;
        xpsVar.a();
        xps xpsVar2 = this.c;
        this.b.setImageDrawable(((ImageView) xpsVar2.c.getChildAt(xpsVar2.b).findViewById(R.id.filter_thumbnail)).getDrawable());
    }
}
