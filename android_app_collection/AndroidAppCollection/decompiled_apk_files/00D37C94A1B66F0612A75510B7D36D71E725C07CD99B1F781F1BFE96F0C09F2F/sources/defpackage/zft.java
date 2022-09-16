package defpackage;

import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zft  reason: default package */
/* loaded from: classes4.dex */
public final class zft implements zfx {
    private final Iterable a;

    public zft(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.zfx
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        boolean z = false;
        for (zfx zfxVar : this.a) {
            z |= zfxVar.a(layoutParams);
        }
        return z;
    }
}
