package com.google.android.libraries.youtube.metadataeditor.geo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationSearchView extends LinearLayout implements TextWatcher, afqu {
    public final EditText a;
    public final RecyclerView b;
    public final TextView c;
    public final afra d;
    public afqv e;
    private final ImageButton f;
    private final ImageButton g;

    public LocationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.metadataeditor_location_search_view, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.back_to_basic_settings_button);
        this.f = imageButton;
        EditText editText = (EditText) findViewById(R.id.autocomplete_text);
        this.a = editText;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.reset_autocomplete_button);
        this.g = imageButton2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.autocomplete_results);
        this.b = recyclerView;
        this.c = (TextView) findViewById(R.id.autocomplete_no_results_text);
        afra afraVar = new afra(from, new afqy(this));
        this.d = afraVar;
        recyclerView.ad(afraVar);
        recyclerView.ag(new LinearLayoutManager());
        imageButton.setOnClickListener(new afqx(this, 1));
        editText.addTextChangedListener(this);
        imageButton2.setOnClickListener(new afqx(this));
    }

    @Override // defpackage.afqu
    public final void a(List list) {
        afra afraVar = this.d;
        afraVar.d = list;
        afraVar.mr();
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        afqv afqvVar = this.e;
        if (afqvVar != null) {
            afqvVar.c.filter(editable);
        }
        if (editable.length() == 0) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
        }
    }

    public final void b(boolean z) {
        EditText editText = this.a;
        if (editText != null) {
            boolean z2 = !z;
            editText.setCursorVisible(z2);
            this.a.setFocusable(z2);
            this.a.setFocusableInTouchMode(z2);
            if (!z) {
                return;
            }
            zag.i(this.a);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
