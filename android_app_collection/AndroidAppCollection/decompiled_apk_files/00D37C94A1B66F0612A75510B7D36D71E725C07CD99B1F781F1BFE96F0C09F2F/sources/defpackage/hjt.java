package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hjt  reason: default package */
/* loaded from: classes3.dex */
public final class hjt extends hkb {
    final /* synthetic */ Context a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjt(ShortsVideoTrimView2 shortsVideoTrimView2, Context context) {
        super(shortsVideoTrimView2);
        this.b = shortsVideoTrimView2;
        this.a = context;
    }

    @Override // defpackage.hkb
    protected final long a() {
        return this.b.B;
    }

    @Override // defpackage.hkb
    protected final String b(long j) {
        return fcw.i(this.a, j, TimeUnit.MICROSECONDS.toMillis(this.b.e()));
    }

    @Override // defpackage.hkb
    protected final String c() {
        return this.b.getContext().getResources().getString(R.string.trim_playhead_short);
    }

    @Override // defpackage.hkb
    protected final void d(long j) {
        long max = Math.max(this.b.k(), j);
        this.b.v(max);
        this.b.p(max);
    }

    @Override // defpackage.hkb
    protected final void e(long j) {
        long min = Math.min(this.b.j(), j);
        this.b.v(min);
        this.b.p(min);
    }
}
