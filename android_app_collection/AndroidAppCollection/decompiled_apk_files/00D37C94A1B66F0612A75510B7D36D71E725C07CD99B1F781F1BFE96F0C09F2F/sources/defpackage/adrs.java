package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.youtube.R;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: adrs  reason: default package */
/* loaded from: classes.dex */
public final class adrs extends amh {
    final /* synthetic */ DpadView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adrs(DpadView dpadView, View view) {
        super(view);
        this.f = dpadView;
    }

    @Override // defpackage.amh
    protected final int k(float f, float f2) {
        adrt a = this.f.a(f, f2);
        if (a != null) {
            int ordinal = a.ordinal();
            return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? CellularSignalStrengthError.ERROR_NOT_SUPPORTED : R.id.dpadEnterKey : R.id.dpadRightKey : R.id.dpadLeftKey : R.id.dpadDownKey : R.id.dpadUpKey;
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.amh
    protected final void m(List list) {
        list.add(Integer.valueOf((int) R.id.dpadLeftKey));
        list.add(Integer.valueOf((int) R.id.dpadRightKey));
        list.add(Integer.valueOf((int) R.id.dpadUpKey));
        list.add(Integer.valueOf((int) R.id.dpadDownKey));
        list.add(Integer.valueOf((int) R.id.dpadEnterKey));
    }

    @Override // defpackage.amh
    protected final void q(int i, mh mhVar) {
        adrt adrtVar;
        String str;
        if (i == R.id.dpadLeftKey) {
            adrtVar = adrt.LEFT;
        } else if (i == R.id.dpadRightKey) {
            adrtVar = adrt.RIGHT;
        } else if (i == R.id.dpadUpKey) {
            adrtVar = adrt.UP;
        } else if (i == R.id.dpadDownKey) {
            adrtVar = adrt.DOWN;
        } else {
            adrtVar = i == R.id.dpadEnterKey ? adrt.ENTER : null;
        }
        Context context = this.f.getContext();
        if (adrtVar != null) {
            Resources resources = context.getResources();
            int ordinal = adrtVar.ordinal();
            if (ordinal == 0) {
                str = resources.getString(R.string.mdx_dpad_up_contentDesc);
            } else if (ordinal == 1) {
                str = resources.getString(R.string.mdx_dpad_down_contentDesc);
            } else if (ordinal == 2) {
                str = resources.getString(R.string.mdx_dpad_left_contentDesc);
            } else if (ordinal == 3) {
                str = resources.getString(R.string.mdx_dpad_right_contentDesc);
            } else if (ordinal == 4) {
                str = resources.getString(R.string.mdx_dpad_enter_contentDesc);
            }
            mhVar.v(str);
            mhVar.n((Rect) this.f.b.get(adrtVar));
            mhVar.E(true);
            mhVar.y(true);
            mhVar.s(true);
            mhVar.h(16);
        }
        str = "";
        mhVar.v(str);
        mhVar.n((Rect) this.f.b.get(adrtVar));
        mhVar.E(true);
        mhVar.y(true);
        mhVar.s(true);
        mhVar.h(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amh
    public final boolean u(int i, int i2) {
        return false;
    }
}
