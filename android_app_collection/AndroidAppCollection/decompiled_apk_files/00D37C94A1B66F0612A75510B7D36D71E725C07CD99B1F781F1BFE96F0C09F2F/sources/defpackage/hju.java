package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hju  reason: default package */
/* loaded from: classes3.dex */
public final class hju extends hkb {
    final /* synthetic */ Context a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hju(ShortsVideoTrimView2 shortsVideoTrimView2, Context context) {
        super(shortsVideoTrimView2);
        this.b = shortsVideoTrimView2;
        this.a = context;
    }

    @Override // defpackage.hkb
    protected final long a() {
        return this.b.k();
    }

    @Override // defpackage.hkb
    protected final String b(long j) {
        Context context = this.a;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        vqp vqpVar = this.b.t;
        long j2 = 0;
        long millis = timeUnit.toMillis(vqpVar == null ? 0L : vqpVar.e(0.0f));
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        vqp vqpVar2 = this.b.t;
        if (vqpVar2 != null) {
            j2 = vqpVar2.e(1.0f);
        }
        return context.getResources().getString(R.string.accessibility_trim_filmstrip_time, zgt.z(context.getResources(), fcw.j(millis)), zgt.z(context.getResources(), fcw.j(timeUnit2.toMillis(j2))));
    }

    @Override // defpackage.hkb
    protected final String c() {
        return this.b.getContext().getResources().getString(R.string.filmstrip_content_description);
    }

    @Override // defpackage.hkb
    protected final void d(long j) {
        this.b.x();
        this.b.d(j - a(), false);
    }

    @Override // defpackage.hkb
    protected final void e(long j) {
        this.b.x();
        this.b.d(j - a(), false);
    }
}
