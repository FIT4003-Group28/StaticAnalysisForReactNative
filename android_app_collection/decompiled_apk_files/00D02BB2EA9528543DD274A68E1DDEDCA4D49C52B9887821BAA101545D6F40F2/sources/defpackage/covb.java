package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: covb  reason: default package */
/* loaded from: classes5.dex */
public final class covb extends cove {
    public covb(Context context, GoogleApiClient googleApiClient) {
        super(context, googleApiClient, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cove
    public final void a(covc covcVar, Bitmap bitmap) {
        if (bitmap == null) {
            covcVar.e.setImageBitmap(b(this.b));
        } else {
            super.a(covcVar, bitmap);
        }
    }

    public final Bitmap b(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), 2131230873);
    }
}
