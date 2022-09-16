package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnm  reason: default package */
/* loaded from: classes.dex */
public final class abnm extends abmc {
    public abnm(Context context, ajmr ajmrVar, aafo aafoVar, acth acthVar) {
        super(context, ajmrVar, aafoVar, acthVar);
    }

    @Override // defpackage.abmc
    protected final int d() {
        return R.layout.live_chat_donation_announcement;
    }

    @Override // defpackage.abmc
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.avatar);
    }

    @Override // defpackage.abmc
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.subtext);
    }

    @Override // defpackage.abmc
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.text);
    }
}
