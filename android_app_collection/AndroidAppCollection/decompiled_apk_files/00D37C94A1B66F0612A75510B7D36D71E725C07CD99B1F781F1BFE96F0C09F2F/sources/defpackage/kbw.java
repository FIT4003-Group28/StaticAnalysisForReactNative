package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.DefaultThumbnailOverlayView;
/* compiled from: PG */
/* renamed from: kbw  reason: default package */
/* loaded from: classes3.dex */
public final class kbw extends aibn {
    final /* synthetic */ DefaultThumbnailOverlayView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbw(DefaultThumbnailOverlayView defaultThumbnailOverlayView, Context context) {
        super(context);
        this.a = defaultThumbnailOverlayView;
    }

    @Override // defpackage.aibn, defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        return this.a;
    }

    @Override // defpackage.aibn
    public final ImageView g(Context context) {
        return this.a;
    }
}
