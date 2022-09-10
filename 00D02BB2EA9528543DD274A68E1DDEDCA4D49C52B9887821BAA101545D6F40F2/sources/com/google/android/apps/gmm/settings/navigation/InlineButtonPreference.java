package com.google.android.apps.gmm.settings.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InlineButtonPreference extends Preference {
    RadioGroup a;
    final RadioButton[] b;
    final CharSequence c;
    public int d;
    @dzsi
    public aub e;
    private final CharSequence f;
    private final CharSequence g;
    private final CharSequence h;
    private final int i;

    public InlineButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RadioButton[3];
        this.d = 1;
        this.y = R.layout.inline_button_layout;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bsue.a, 0, 0);
        try {
            this.f = obtainStyledAttributes.getString(3);
            this.g = obtainStyledAttributes.getString(2);
            this.h = obtainStyledAttributes.getString(1);
            this.c = obtainStyledAttributes.getString(4);
            this.i = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.preference.Preference
    public final void J(aub aubVar) {
        this.e = aubVar;
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        this.a = (RadioGroup) aveVar.C(R.id.inlinebuttonlayout);
        int i = 0;
        this.b[0] = (RadioButton) aveVar.C(R.id.start);
        this.b[1] = (RadioButton) aveVar.C(R.id.middle);
        this.b[2] = (RadioButton) aveVar.C(R.id.end);
        this.a.setPadding(0, 0, 0, this.i);
        this.b[0].setText(this.f);
        this.b[1].setText(this.g);
        this.b[2].setText(this.h);
        ((TextView) aveVar.C(R.id.title)).setText(this.c);
        while (true) {
            RadioButton[] radioButtonArr = this.b;
            int length = radioButtonArr.length;
            if (i < 3) {
                radioButtonArr[i].setOnClickListener(new btdv(this, i));
                i++;
            } else {
                m();
                this.a.check(this.b[this.d].getId());
                return;
            }
        }
    }

    public final void m() {
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.b;
            int length = radioButtonArr.length;
            if (i < 3) {
                if (i == this.d) {
                    radioButtonArr[i].setTextColor(this.j.getResources().getColor(R.color.mod_daynight_white));
                } else {
                    radioButtonArr[i].setTextColor(this.j.getResources().getColor(R.color.mod_daynight_blue600));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void n(btdw btdwVar) {
        this.d = btdwVar.d;
    }
}
