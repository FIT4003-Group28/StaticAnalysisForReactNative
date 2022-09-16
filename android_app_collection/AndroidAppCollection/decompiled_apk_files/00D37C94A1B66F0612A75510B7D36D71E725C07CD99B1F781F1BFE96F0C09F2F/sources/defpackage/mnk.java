package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mnk  reason: default package */
/* loaded from: classes3.dex */
public final class mnk extends fsz {
    private final Context a;

    public mnk(ViewStub viewStub, Context context) {
        super(viewStub);
        this.a = context;
    }

    public final void a(apmf apmfVar) {
        ImageView imageView = (ImageView) this.f;
        if (apmfVar == null) {
            if (!this.e || imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) c();
        imageView2.setVisibility(0);
        int bX = awwc.bX(apmfVar.c);
        if (bX == 0) {
            bX = 1;
        }
        int i = bX - 1;
        if (i == 0) {
            imageView2.setImageResource(2131231766);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_private_description));
        } else if (i != 2) {
            imageView2.setImageResource(2131231768);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_public_description));
        } else {
            imageView2.setImageResource(2131231769);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_unlisted_description));
        }
    }

    public mnk(ImageView imageView, Context context) {
        super(imageView);
        this.a = context;
    }
}
