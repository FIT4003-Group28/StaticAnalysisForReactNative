package defpackage;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
/* compiled from: PG */
/* renamed from: bqg  reason: default package */
/* loaded from: classes2.dex */
public final class bqg extends bqp {
    public bqg(Class cls) {
        super(cls);
        this.c.e = OverwritingInputMerger.class.getName();
    }

    @Override // defpackage.bqp
    public final /* bridge */ /* synthetic */ bqq a() {
        if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.k.c) {
            return new bqq(this.b, this.c, this.d);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
