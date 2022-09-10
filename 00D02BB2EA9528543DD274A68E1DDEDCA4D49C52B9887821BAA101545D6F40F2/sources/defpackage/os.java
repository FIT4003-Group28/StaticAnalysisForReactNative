package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: os  reason: default package */
/* loaded from: classes7.dex */
public class os extends or {
    public os(ow owVar, WindowInsets windowInsets) {
        super(owVar, windowInsets);
    }

    @Override // defpackage.ov
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof os) {
            return Objects.equals(this.a, ((os) obj).a);
        }
        return false;
    }

    @Override // defpackage.ov
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ov
    public final ng j() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ng(displayCutout);
    }

    @Override // defpackage.ov
    public final ow k() {
        return ow.a(this.a.consumeDisplayCutout());
    }
}
