package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
import java.util.List;
/* compiled from: PG */
/* renamed from: czwt  reason: default package */
/* loaded from: classes.dex */
public final class czwt extends ams {
    final /* synthetic */ Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czwt(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    @Override // defpackage.ams
    protected final void p(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f;
            chip.g = z;
            chip.refreshDrawableState();
        }
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        return (!this.f.f() || !this.f.g().contains(f, f2)) ? 0 : 1;
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        list.add(0);
        if (!this.f.f() || !this.f.i() || this.f.e == null) {
            return;
        }
        list.add(1);
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.f;
            czwv czwvVar = chip.d;
            CharSequence charSequence2 = czwvVar != null ? czwvVar.h : null;
            if (charSequence2 != null) {
                pcVar.G(charSequence2);
            } else {
                CharSequence text = chip.getText();
                Context context = this.f.getContext();
                Object[] objArr = new Object[1];
                if (true != TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                pcVar.G(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            pcVar.k(this.f.h());
            pcVar.h(oy.c);
            pcVar.v(this.f.isEnabled());
            return;
        }
        pcVar.G(charSequence);
        pcVar.k(Chip.c);
    }

    @Override // defpackage.ams
    protected final void y(pc pcVar) {
        pcVar.n(this.f.j());
        pcVar.t(this.f.isClickable());
        if (this.f.j() || this.f.isClickable()) {
            pcVar.B(true != this.f.j() ? "android.widget.Button" : "android.widget.CompoundButton");
        } else {
            pcVar.B("android.view.View");
        }
        CharSequence text = this.f.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            pcVar.D(text);
        } else {
            pcVar.G(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f.performClick();
            }
            if (i != 1) {
                return false;
            }
            return this.f.e();
        }
        return false;
    }
}
