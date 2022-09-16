package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnn  reason: default package */
/* loaded from: classes.dex */
public final class abnn extends abmd {
    private final ajnj c;

    public abnn(Context context, ajmy ajmyVar) {
        super(context);
        this.c = new ajnj(ajmyVar.b(), this.b);
    }

    @Override // defpackage.abmd
    protected final int d() {
        return R.layout.live_chat_legacy_paid_message;
    }

    @Override // defpackage.abmd
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    @Override // defpackage.abmd
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    @Override // defpackage.abmd
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    @Override // defpackage.abmd
    protected final void h(avhn avhnVar) {
        this.c.k(avhnVar);
    }

    @Override // defpackage.abmd, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.a();
    }
}
