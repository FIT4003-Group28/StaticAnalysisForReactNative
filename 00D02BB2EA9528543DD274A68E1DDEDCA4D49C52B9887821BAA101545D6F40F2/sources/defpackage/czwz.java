package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
/* compiled from: PG */
/* renamed from: czwz  reason: default package */
/* loaded from: classes5.dex */
public final class czwz implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    final /* synthetic */ ChipGroup b;

    public czwz(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup;
        int id;
        int i;
        if (view == this.b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(od.ap());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked() && (id = chip.getId()) != (i = (chipGroup = (ChipGroup) view).e)) {
                if (i != -1 && chipGroup.b) {
                    chipGroup.c(i, false);
                }
                if (id != -1) {
                    chipGroup.c(id, true);
                }
                chipGroup.a(id);
            }
            chip.f = this.b.d;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.b && (view2 instanceof Chip)) {
            ((Chip) view2).f = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
