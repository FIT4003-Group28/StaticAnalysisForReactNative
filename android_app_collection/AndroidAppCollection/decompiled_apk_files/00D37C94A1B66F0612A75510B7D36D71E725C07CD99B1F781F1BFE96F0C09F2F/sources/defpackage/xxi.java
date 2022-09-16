package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xxi  reason: default package */
/* loaded from: classes4.dex */
public final class xxi implements yiw {
    public final ImageView a;
    public final Animation b;
    public final boolean c;
    private final afts d;
    private final Executor e;

    public xxi(ImageView imageView, afts aftsVar, Executor executor, boolean z) {
        this.a = imageView;
        this.d = aftsVar;
        this.e = executor;
        imageView.setTag(R.id.bitmap_loader_tag, this);
        Animation loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), 17432576);
        this.b = loadAnimation;
        loadAnimation.setDuration(imageView.getContext().getResources().getInteger(17694720));
        this.c = z;
    }

    private final void c() {
        this.a.setTag(R.id.bitmap_loader_tag, null);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.a.getTag(R.id.bitmap_loader_tag) != this) {
            return;
        }
        c();
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Failed to load image. ");
        sb.append(valueOf);
        zep.b(sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Drawable drawable;
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        if (this.a.getTag(R.id.bitmap_loader_tag) != this) {
            return;
        }
        c();
        try {
            drawable = (Drawable) this.d.b(bArr);
        } catch (IOException | zhy unused) {
            zep.b("Failed to decode the image bytes to Drawable.");
            drawable = null;
        }
        this.e.execute(new xxh(this, drawable, uri));
    }
}
