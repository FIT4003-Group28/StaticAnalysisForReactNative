package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pyt  reason: default package */
/* loaded from: classes4.dex */
public final class pyt {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public pyt(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        boolean z = false;
        this.f = false;
        this.g = false;
        if (this.h.K()) {
            FlexboxLayoutManager flexboxLayoutManager = this.h;
            if (flexboxLayoutManager.b != 0) {
                this.e = false;
                return;
            }
            if (flexboxLayoutManager.a == 1) {
                z = true;
            }
            this.e = z;
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager2 = this.h;
        if (flexboxLayoutManager2.b != 0) {
            this.e = false;
            return;
        }
        if (flexboxLayoutManager2.a == 3) {
            z = true;
        }
        this.e = z;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }

    public final void a() {
        int j;
        int j2;
        if (!this.h.K()) {
            FlexboxLayoutManager flexboxLayoutManager = this.h;
            if (flexboxLayoutManager.c) {
                if (this.e) {
                    j2 = flexboxLayoutManager.f.f();
                } else {
                    j2 = flexboxLayoutManager.H - flexboxLayoutManager.f.j();
                }
                this.c = j2;
                return;
            }
        }
        if (this.e) {
            j = this.h.f.f();
        } else {
            j = this.h.f.j();
        }
        this.c = j;
    }
}
