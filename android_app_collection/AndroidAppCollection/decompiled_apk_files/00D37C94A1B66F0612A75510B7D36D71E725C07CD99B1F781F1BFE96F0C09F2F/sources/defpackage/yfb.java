package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yfb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yfb implements View.OnClickListener {
    public final /* synthetic */ yfe a;
    private final /* synthetic */ int b;

    public /* synthetic */ yfb(yfe yfeVar, int i) {
        this.b = i;
        this.a = yfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        if (this.b == 0) {
            yfe yfeVar = this.a;
            if (yfeVar.b.isSelected()) {
                yfeVar.j();
                yfeVar.b.setSelected(false);
            } else {
                yfeVar.f(yfeVar.c);
                yfeVar.b.setSelected(true);
            }
            ImageView imageView = yfeVar.b;
            if (imageView.isSelected()) {
                string = yfeVar.a.getString(R.string.load_less_label);
            } else {
                string = yfeVar.a.getString(R.string.load_more_label);
            }
            imageView.setContentDescription(string);
            return;
        }
        yfe yfeVar2 = this.a;
        yfeVar2.g();
        yfeVar2.h();
    }
}
