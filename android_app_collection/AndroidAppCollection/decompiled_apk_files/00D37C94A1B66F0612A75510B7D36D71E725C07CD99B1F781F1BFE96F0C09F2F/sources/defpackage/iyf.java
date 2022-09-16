package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxLivestreamMealbarController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: iyf  reason: default package */
/* loaded from: classes3.dex */
public final class iyf implements airt {
    final /* synthetic */ MdxLivestreamMealbarController a;

    public iyf(MdxLivestreamMealbarController mdxLivestreamMealbarController) {
        this.a = mdxLivestreamMealbarController;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().I().G(aypa.a()).Z(new ayqb() { // from class: iye
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                PlayerResponseModel b;
                iyf iyfVar = iyf.this;
                ahhm ahhmVar = (ahhm) obj;
                if (!iyfVar.a.j.c().g() && ahhmVar.c().b(aijx.VIDEO_WATCH_LOADED) && (b = ahhmVar.b()) != null && b.F() && iyfVar.a.m.g().i() && iyfVar.a.c.e() == null && !iyfVar.a.k.j().isEmpty()) {
                    aopu aopuVar = iyfVar.a.f.g;
                    asap asapVar = b.a.g;
                    if (asapVar == null) {
                        asapVar = asap.a;
                    }
                    String str = asapVar.l;
                    if (!aopuVar.isEmpty() && !aopuVar.contains(str)) {
                        return;
                    }
                    long j = iyfVar.a.e.getLong("com.google.android.apps.youtube.mdx.watch.LAST_MEALBAR_PROMOTED_LIVE_FEED_CHANNELS", -1L);
                    long millis = TimeUnit.SECONDS.toMillis(iyfVar.a.f.h);
                    if (j != -1 && iyfVar.a.i.c() - j < millis) {
                        return;
                    }
                    final MdxLivestreamMealbarController mdxLivestreamMealbarController = iyfVar.a;
                    iyd iydVar = new iyd();
                    final acti oi = mdxLivestreamMealbarController.l.oi();
                    oi.n(new acte(actj.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR));
                    oi.n(new acte(actj.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_ACTION_BUTTON));
                    oi.n(new acte(actj.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_DISMISS_BUTTON));
                    Resources resources = mdxLivestreamMealbarController.a.getResources();
                    akfd akfdVar = mdxLivestreamMealbarController.b;
                    akfe l = akfdVar.l();
                    l.c = resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_title);
                    l.d = resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_detail_text);
                    l.m = iydVar;
                    akfe c = l.a(resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_connect_button_text), new View.OnClickListener() { // from class: iyb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MdxLivestreamMealbarController mdxLivestreamMealbarController2 = MdxLivestreamMealbarController.this;
                            acti actiVar = oi;
                            bew a = mdxLivestreamMealbarController2.h.a();
                            a.aE(mdxLivestreamMealbarController2.g);
                            a.qv(mdxLivestreamMealbarController2.d, a.getClass().getCanonicalName());
                            actiVar.H(3, new acte(actj.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_ACTION_BUTTON), null);
                        }
                    }).c(resources.getText(R.string.mdx_promotional_mealbar_livefeed_channels_mealbar_dismiss_button_text), new View.OnClickListener() { // from class: iyc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            acti.this.H(3, new acte(actj.CAST_PROMOTE_LIVE_CHANNEL_STREAM_MEALBAR_DISMISS_BUTTON), null);
                        }
                    });
                    c.h(false);
                    akfdVar.n(c.d(2131232829).e());
                    iyfVar.a.e.edit().putLong("com.google.android.apps.youtube.mdx.watch.LAST_MEALBAR_PROMOTED_LIVE_FEED_CHANNELS", iyfVar.a.i.c()).apply();
                }
            }
        })};
    }
}
