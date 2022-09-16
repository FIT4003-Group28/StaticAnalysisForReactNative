package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: zuo  reason: default package */
/* loaded from: classes4.dex */
public final class zuo implements Callable {
    private final Context a;

    public zuo(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return GalleryActivity.a(this.a);
    }
}
