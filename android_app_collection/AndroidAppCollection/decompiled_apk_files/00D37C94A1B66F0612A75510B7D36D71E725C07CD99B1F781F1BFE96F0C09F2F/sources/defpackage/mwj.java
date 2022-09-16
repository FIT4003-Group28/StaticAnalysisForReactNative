package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mwj  reason: default package */
/* loaded from: classes3.dex */
public final class mwj extends mxi {
    public final TextView a;
    public final RatingBar b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public mwj(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, View view3, Context context, aafo aafoVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mbw mbwVar, mcj mcjVar, ajrx ajrxVar, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, view3, context, aafoVar, inlinePlaybackLifecycleController, mbwVar, mcjVar, ajrxVar, fjnVar, akemVar);
        this.a = (TextView) view3.findViewById(R.id.rating_text);
        this.b = (RatingBar) view3.findViewById(R.id.rating_bar);
        this.c = (TextView) view3.findViewById(R.id.price_text);
        this.d = (TextView) view3.findViewById(R.id.description);
        this.e = (ImageView) view3.findViewById(R.id.channel_thumbnail);
    }
}
