package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: uki  reason: default package */
/* loaded from: classes4.dex */
public final class uki implements ujx {
    public static final Map a = DesugarCollections.synchronizedMap(new afw());
    public static final Map b = DesugarCollections.synchronizedMap(new afw());
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ComponentCallbacks2 d = new ujz();
    public final Executor e;
    public final uop f;
    public final zgd g;

    public uki(Context context, ExecutorService executorService, zgd zgdVar, uor uorVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        uor uorVar2;
        vgu vguVar;
        uot uotVar = new uot(context);
        uon uonVar = new uon();
        uonVar.a(new uoo[0]);
        if (uorVar != null) {
            uonVar.a = uorVar;
            uonVar.d = new vgu();
            uonVar.b = new ujy(uotVar, zgdVar, null, null, null);
            uonVar.a(uoo.a);
            uor uorVar3 = uonVar.a;
            if (uorVar3 == null || (uorVar2 = uonVar.b) == null || (vguVar = uonVar.d) == null) {
                StringBuilder sb = new StringBuilder();
                if (uonVar.a == null) {
                    sb.append(" imageRetriever");
                }
                if (uonVar.b == null) {
                    sb.append(" secondaryImageRetriever");
                }
                if (uonVar.d == null) {
                    sb.append(" defaultImageRetriever");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            uop uopVar = new uop(uorVar3, uorVar2, vguVar, uonVar.c, null);
            this.e = executorService;
            this.f = uopVar;
            this.g = zgdVar;
            return;
        }
        throw new NullPointerException("Null imageRetriever");
    }

    public static void a(ImageView imageView, ukh ukhVar) {
        uwp.f();
        ukh ukhVar2 = (ukh) imageView.getTag(R.id.tag_account_image_request);
        if (ukhVar2 != null) {
            ukhVar2.d = true;
        }
        imageView.setTag(R.id.tag_account_image_request, ukhVar);
    }
}
