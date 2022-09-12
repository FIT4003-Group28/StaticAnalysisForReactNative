package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: czww  reason: default package */
/* loaded from: classes5.dex */
public final class czww implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ChipGroup a;

    public czww(ChipGroup chipGroup) {
        this.a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChipGroup chipGroup = this.a;
        if (chipGroup.f) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < chipGroup.getChildCount(); i++) {
            View childAt = chipGroup.getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (chipGroup.b) {
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            ChipGroup chipGroup2 = this.a;
            if (chipGroup2.c) {
                chipGroup2.c(compoundButton.getId(), true);
                this.a.b(compoundButton.getId(), false);
                return;
            }
        }
        int id = compoundButton.getId();
        if (!z) {
            ChipGroup chipGroup3 = this.a;
            if (chipGroup3.e != id) {
                return;
            }
            chipGroup3.a(-1);
            return;
        }
        ChipGroup chipGroup4 = this.a;
        int i2 = chipGroup4.e;
        if (i2 != -1 && i2 != id && chipGroup4.b) {
            chipGroup4.c(i2, false);
        }
        this.a.a(id);
    }
}
