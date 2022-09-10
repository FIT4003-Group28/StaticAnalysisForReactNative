package defpackage;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
/* compiled from: PG */
/* renamed from: bca  reason: default package */
/* loaded from: classes3.dex */
public final class bca extends bcm<bca, bcb> {
    public bca(Class<? extends ListenableWorker> cls) {
        super(cls);
        this.b.c = OverwritingInputMerger.class.getName();
    }

    @Override // defpackage.bcm
    public final /* bridge */ /* synthetic */ bcb a() {
        if (!this.b.o || Build.VERSION.SDK_INT < 23 || !this.b.i.c) {
            return new bcb(this);
        }
        throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
    }
}
