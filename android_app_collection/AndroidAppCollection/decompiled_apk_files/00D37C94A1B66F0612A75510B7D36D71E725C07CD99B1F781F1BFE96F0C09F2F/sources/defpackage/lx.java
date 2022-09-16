package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lx  reason: default package */
/* loaded from: classes3.dex */
public class lx extends lw {
    public lx(mb mbVar, WindowInsets windowInsets) {
        super(mbVar, windowInsets);
    }

    @Override // defpackage.lv, defpackage.ma
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return Objects.equals(this.a, lxVar.a) && Objects.equals(this.b, lxVar.b);
    }

    @Override // defpackage.ma
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ma
    public final jx o() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new jx(displayCutout);
    }

    @Override // defpackage.ma
    public final mb p() {
        return mb.q(this.a.consumeDisplayCutout());
    }
}
