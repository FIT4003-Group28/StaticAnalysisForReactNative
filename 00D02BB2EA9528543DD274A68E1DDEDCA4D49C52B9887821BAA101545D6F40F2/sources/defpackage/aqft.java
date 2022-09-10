package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqft  reason: default package */
/* loaded from: classes2.dex */
public final class aqft implements bvqg<Void> {
    private final WeakReference<aqfu> a;

    public aqft(WeakReference<aqfu> weakReference) {
        this.a = weakReference;
    }

    @Override // defpackage.bvqg
    public final /* bridge */ /* synthetic */ void NU(Void r2) {
        aqfu aqfuVar = this.a.get();
        if (aqfuVar != null) {
            aqfuVar.B.set(true);
        }
    }
}
