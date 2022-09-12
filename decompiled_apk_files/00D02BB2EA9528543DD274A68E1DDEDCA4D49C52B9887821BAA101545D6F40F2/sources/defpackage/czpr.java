package defpackage;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czpr  reason: default package */
/* loaded from: classes5.dex */
final class czpr implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ czpu a;
    private final int b;

    public czpr(czpu czpuVar, int i) {
        this.a = czpuVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            czpu czpuVar = this.a;
            czpuVar.a[this.b] = z;
            if (z) {
                czpuVar.getChildCount();
                int length = this.a.a.length + 1;
                for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                    CheckBox checkBox2 = (CheckBox) this.a.getChildAt(i2).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            this.a.a[this.b] = z;
            if (z) {
                while (true) {
                    if (i >= this.a.getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) this.a.getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            czpu czpuVar2 = this.a;
            czpuVar2.a[this.b] = z;
            if (z && (checkBox = (CheckBox) czpuVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        czpu czpuVar3 = this.a;
        czpuVar3.c.a(new czps(czpuVar3.b, czpuVar3.a));
    }
}
