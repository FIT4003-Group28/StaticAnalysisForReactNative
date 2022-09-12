package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzru  reason: default package */
/* loaded from: classes4.dex */
public final class bzru {
    public static final dcqe a = dcqe.c("bzru");
    public final bzrq b;
    public final Resources c;
    public final int d;
    private final ckcw e;

    public bzru(bzrq bzrqVar, Resources resources, ckcw ckcwVar) {
        this.b = bzrqVar;
        this.c = resources;
        this.e = ckcwVar;
        this.d = resources.getDimensionPixelSize(R.dimen.notification_large_icon_size);
    }

    public final void a(int i) {
        ((ckco) this.e.a(ckdz.l)).a(i - 1);
    }
}
