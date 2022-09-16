package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zgc  reason: default package */
/* loaded from: classes4.dex */
final class zgc implements zfx {
    private final int a;
    private final /* synthetic */ int b;

    public zgc(int i) {
        this.a = i;
    }

    public zgc(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.zfx
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.b == 0) {
            int i = layoutParams.width;
            int i2 = this.a;
            if (i == i2) {
                return false;
            }
            layoutParams.width = i2;
            return true;
        }
        int i3 = layoutParams.height;
        int i4 = this.a;
        if (i3 == i4) {
            return false;
        }
        layoutParams.height = i4;
        return true;
    }
}
