package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acmd  reason: default package */
/* loaded from: classes.dex */
public final class acmd extends abmq {
    public acmd(Context context, aafo aafoVar, ajxz ajxzVar) {
        super(context, aafoVar, ajxzVar);
    }

    @Override // defpackage.abmq
    protected final int d() {
        return R.layout.live_chat_light_overlay_metadata_item;
    }

    @Override // defpackage.abmq
    protected final int e() {
        return R.dimen.live_chat_overlay_vertical_margin;
    }

    @Override // defpackage.abmq
    protected final int f() {
        return -2;
    }

    @Override // defpackage.abmq
    protected final ViewGroup g() {
        return null;
    }

    @Override // defpackage.abmq
    protected final ImageView h() {
        return (ImageView) this.c.findViewById(R.id.icon);
    }

    @Override // defpackage.abmq
    protected final TextView i() {
        return (TextView) this.c.findViewById(R.id.subtitle);
    }

    @Override // defpackage.abmq
    protected final TextView j() {
        return (TextView) this.c.findViewById(R.id.title);
    }
}
