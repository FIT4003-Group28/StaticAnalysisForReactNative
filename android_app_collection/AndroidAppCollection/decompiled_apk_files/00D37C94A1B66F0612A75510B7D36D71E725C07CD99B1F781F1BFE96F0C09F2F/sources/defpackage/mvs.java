package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvs  reason: default package */
/* loaded from: classes3.dex */
public final class mvs extends mxi {
    public final TextView a;
    public final ImageView b;
    public final TextView c;

    public mvs(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, View view3, Context context, aafo aafoVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mbw mbwVar, mcj mcjVar, ajrx ajrxVar, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, view3, context, aafoVar, inlinePlaybackLifecycleController, mbwVar, mcjVar, ajrxVar, fjnVar, akemVar);
        this.a = (TextView) view3.findViewById(R.id.description);
        this.c = (TextView) view3.findViewById(R.id.advertiser_name_or_website);
        this.b = (ImageView) view3.findViewById(R.id.channel_thumbnail);
    }
}
