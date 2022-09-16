package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {
    private final Context D;
    private final ArrayAdapter E;
    private Spinner F;
    private final AdapterView.OnItemSelectedListener G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.G = new atm(this);
        this.D = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.E = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.E.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        Spinner spinner = (Spinner) aveVar.a.findViewById(R.id.spinner);
        this.F = spinner;
        spinner.setAdapter((SpinnerAdapter) this.E);
        this.F.setOnItemSelectedListener(this.G);
        Spinner spinner2 = this.F;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.Rk(aveVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.F.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.E;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
