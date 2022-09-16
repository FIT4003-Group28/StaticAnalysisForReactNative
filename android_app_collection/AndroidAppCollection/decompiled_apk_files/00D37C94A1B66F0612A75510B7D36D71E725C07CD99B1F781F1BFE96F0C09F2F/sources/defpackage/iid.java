package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: iid  reason: default package */
/* loaded from: classes3.dex */
public final class iid implements TextWatcher, iik {
    public final Context a;
    public final iic b;
    public final iil c;
    public final EditText d;
    private final ImageButton e;
    private final ImageButton f;
    private final RecyclerView g;
    private final TextView h;

    public iid(Context context, iim iimVar, ViewGroup viewGroup, iic iicVar, acti actiVar, avvq avvqVar, apzg apzgVar) {
        this.a = context;
        this.b = iicVar;
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.back_to_basic_settings_button);
        this.e = imageButton;
        EditText editText = (EditText) viewGroup.findViewById(R.id.autocomplete_text);
        this.d = editText;
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(R.id.reset_autocomplete_button);
        this.f = imageButton2;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.autocomplete_results);
        this.g = recyclerView;
        this.h = (TextView) viewGroup.findViewById(R.id.autocomplete_no_results_text);
        imageButton.setOnClickListener(new iib(this, 1));
        editText.addTextChangedListener(this);
        imageButton2.setOnClickListener(new iib(this));
        this.c = iimVar.a(this, recyclerView, apzgVar, actiVar, avvqVar);
    }

    public final void a(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.g.setVisibility(8);
        this.h.setVisibility(0);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        this.c.d(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.iik
    public final void e(boolean z) {
        String string;
        if (z) {
            if (this.d.getText().length() > 0) {
                string = this.a.getString(R.string.user_mention_search_view_no_results_message);
            } else {
                string = this.a.getString(R.string.user_mention_search_view_results_box_hint);
            }
            a(string);
            return;
        }
        this.g.setVisibility(0);
        this.h.setVisibility(8);
    }

    @Override // defpackage.iik
    public final void g(avvu avvuVar) {
        hub hubVar = (hub) this.b;
        hubVar.f.b(hubVar.l, hubVar.d);
        hubVar.d();
        hubVar.p.a();
        axbl j = axbm.j();
        aopa createBuilder = awzu.a.createBuilder();
        String str = avvuVar.d;
        createBuilder.copyOnWrite();
        awzu awzuVar = (awzu) createBuilder.instance;
        str.getClass();
        awzuVar.b |= 2;
        awzuVar.d = str;
        if ((avvuVar.b & 4) != 0) {
            avhn avhnVar = avvuVar.e;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            String uri = akel.q(avhnVar).toString();
            createBuilder.copyOnWrite();
            awzu awzuVar2 = (awzu) createBuilder.instance;
            uri.getClass();
            awzuVar2.b |= 4;
            awzuVar2.e = uri;
        }
        ArrayList<awzv> arrayList = new ArrayList();
        arrayList.add(awzv.CHANNEL_MENTION_NORMAL);
        arrayList.add(awzv.CHANNEL_MENTION_LIGHT);
        aopa createBuilder2 = awzt.b.createBuilder();
        createBuilder2.copyOnWrite();
        awzt awztVar = (awzt) createBuilder2.instance;
        aopq aopqVar = awztVar.e;
        if (!aopqVar.c()) {
            awztVar.e = aopi.mutableCopy(aopqVar);
        }
        for (awzv awzvVar : arrayList) {
            awztVar.e.g(awzvVar.d);
        }
        awzv awzvVar2 = hub.b;
        createBuilder2.copyOnWrite();
        awzt awztVar2 = (awzt) createBuilder2.instance;
        awztVar2.d = awzvVar2.d;
        awztVar2.c |= 1;
        createBuilder.copyOnWrite();
        awzu awzuVar3 = (awzu) createBuilder.instance;
        awzt awztVar3 = (awzt) createBuilder2.mo39build();
        awztVar3.getClass();
        awzuVar3.f = awztVar3;
        awzuVar3.b |= 8;
        aopa createBuilder3 = axbk.a.createBuilder();
        boolean z = hubVar.m;
        createBuilder3.copyOnWrite();
        axbk axbkVar = (axbk) createBuilder3.instance;
        axbkVar.b |= 4096;
        axbkVar.e = z;
        createBuilder3.copyOnWrite();
        axbk axbkVar2 = (axbk) createBuilder3.instance;
        awzu awzuVar4 = (awzu) createBuilder.mo39build();
        awzuVar4.getClass();
        axbkVar2.d = awzuVar4;
        axbkVar2.c = 6;
        boolean b = hubVar.i.b();
        createBuilder3.copyOnWrite();
        axbk axbkVar3 = (axbk) createBuilder3.instance;
        axbkVar3.b |= 8192;
        axbkVar3.f = b;
        j.copyOnWrite();
        ((axbm) j.instance).F((axbk) createBuilder3.mo39build());
        aopa createBuilder4 = axau.a.createBuilder();
        String str2 = avvuVar.c;
        createBuilder4.copyOnWrite();
        axau axauVar = (axau) createBuilder4.instance;
        str2.getClass();
        axauVar.b |= 1;
        axauVar.c = str2;
        axau axauVar2 = (axau) createBuilder4.mo39build();
        aopa createBuilder5 = axax.a.createBuilder();
        createBuilder5.copyOnWrite();
        axax axaxVar = (axax) createBuilder5.instance;
        axaxVar.e = 1;
        axaxVar.b |= 1;
        createBuilder5.copyOnWrite();
        axax axaxVar2 = (axax) createBuilder5.instance;
        axauVar2.getClass();
        axaxVar2.d = axauVar2;
        axaxVar2.c = 2;
        aopa createBuilder6 = axav.a.createBuilder();
        aotm f = aahp.f();
        createBuilder6.copyOnWrite();
        axav axavVar = (axav) createBuilder6.instance;
        f.getClass();
        axavVar.c = f;
        axavVar.b = 1;
        createBuilder5.bA(createBuilder6);
        j.a((axax) createBuilder5.mo39build());
        hubVar.c(j, hub.b, true);
        hubVar.h.oi().n(new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
        zag.i(this.d);
        this.c.f();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
