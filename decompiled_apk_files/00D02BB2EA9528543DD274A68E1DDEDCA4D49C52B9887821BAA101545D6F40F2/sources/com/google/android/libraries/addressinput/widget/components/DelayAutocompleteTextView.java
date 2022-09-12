package com.google.android.libraries.addressinput.widget.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DelayAutocompleteTextView extends AutoCompleteTextView {
    public final Context a;
    public cpnd b;
    private final List<cpne> c;
    private cpnj d;
    private boolean e;
    private boolean f;
    private final Handler g;

    public DelayAutocompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.e = true;
        this.f = true;
        this.b = cpnd.USER_INPUT_NOT_VERIFIED;
        this.g = new cpng(this);
        this.a = context;
    }

    public final void a(cpne cpneVar) {
        this.c.add(cpneVar);
    }

    public final void b() {
        new Handler(Looper.getMainLooper()).post(new cpnh(this));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
    public final void onFilterComplete(int i) {
        super.onFilterComplete(i);
        int dimension = (int) this.a.getResources().getDimension(R.dimen.autocomplete_dropdown_max_height);
        int dimension2 = (((int) this.a.getResources().getDimension(R.dimen.autocomplete_item_text_main_height)) + ((int) this.a.getResources().getDimension(R.dimen.autocomplete_item_text_detail_height))) * i;
        if (dimension2 > dimension) {
            setDropDownHeight(dimension);
        } else {
            setDropDownHeight(dimension2);
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cpnj cpnjVar = this.d;
        if (cpnjVar != null) {
            cpnjVar.a(charSequence.toString());
        }
        if (this.f) {
            setAddressInputState(cpnd.USER_INPUT_NOT_VERIFIED);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    protected final void performFiltering(CharSequence charSequence, int i) {
        if (this.e) {
            this.g.removeMessages(100);
            this.g.sendMessageDelayed(this.g.obtainMessage(100, charSequence), 500L);
        }
    }

    public void setAddressInputState(cpnd cpndVar) {
        this.b = cpndVar;
        for (cpne cpneVar : this.c) {
            cpneVar.a(cpndVar);
        }
    }

    public void setInputListener(cpnj cpnjVar) {
        this.d = cpnjVar;
    }

    public void setTextSilently(String str) {
        this.e = false;
        this.f = false;
        setText(str);
        this.e = true;
        this.f = true;
    }
}
