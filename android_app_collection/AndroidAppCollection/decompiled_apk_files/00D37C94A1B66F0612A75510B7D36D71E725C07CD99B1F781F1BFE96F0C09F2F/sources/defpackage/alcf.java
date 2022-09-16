package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alcf  reason: default package */
/* loaded from: classes.dex */
final class alcf extends zer {
    final /* synthetic */ alck a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alcf(alck alckVar) {
        super("NotificationBuilderLazy");
        this.a = alckVar;
    }

    @Override // defpackage.zer
    protected final /* bridge */ /* synthetic */ Object a() {
        alck alckVar = this.a;
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = alckVar.a;
            yhr.d(context, "UploadNotifications", context.getString(R.string.upload_notification_channel));
        }
        if (alckVar.c == null) {
            alckVar.c = "";
        }
        if (alckVar.d == null) {
            alckVar.d = "";
        }
        if (alckVar.e == null) {
            alckVar.e = "";
        }
        alckVar.b = null;
        alckVar.f = -2;
        int color = alckVar.a.getResources().getColor(R.color.upload_color_primary);
        fi fiVar = new fi(alckVar.a);
        fiVar.r(2131232804);
        fiVar.q(0, 0, true);
        fiVar.z = color;
        fiVar.i("");
        fiVar.j("");
        fiVar.k("");
        fiVar.l = true;
        Bitmap bitmap = alckVar.b;
        if (bitmap != null) {
            fiVar.n(bitmap);
        }
        yhr.e(fiVar, "UploadNotifications");
        return fiVar;
    }
}
