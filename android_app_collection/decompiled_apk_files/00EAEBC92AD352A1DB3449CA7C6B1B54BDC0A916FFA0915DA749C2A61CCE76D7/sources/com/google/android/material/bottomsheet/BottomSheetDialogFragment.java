package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean k0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BottomSheetBehavior.e {
        private b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void a(View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void a(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.r0();
            }
        }
    }

    private void a(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.k0 = z;
        if (bottomSheetBehavior.b() == 5) {
            r0();
            return;
        }
        if (o0() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) o0()).d();
        }
        bottomSheetBehavior.a(new b());
        bottomSheetBehavior.e(5);
    }

    private boolean j(boolean z) {
        Dialog o0 = o0();
        if (o0 instanceof com.google.android.material.bottomsheet.a) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) o0;
            BottomSheetBehavior<FrameLayout> b2 = aVar.b();
            if (!b2.c() || !aVar.c()) {
                return false;
            }
            a(b2, z);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        if (this.k0) {
            super.n0();
        } else {
            super.m0();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void m0() {
        if (!j(false)) {
            super.m0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog n(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(n(), p0());
    }
}
