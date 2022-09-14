package com.google.android.apps.gmm.directions.appwidget;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.filament.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CreateDirectionsShortcutActivity extends gga implements bxeq, btss {
    public bttf A;
    public efc B;
    public qeg C;
    public ite D;
    public dehq E;
    @dzsi
    public cjql F;
    @dzsi
    public cjql G;
    private cqho H;
    private TextView I;
    private qep J;
    public EditText k;
    public EditText l;
    public CheckBox m;
    public dqvj n = dqvj.DRIVE;
    public CheckBox o;
    public CheckBox p;
    public CheckBox q;
    public qes r;
    public btvo s;
    public bvrb t;
    public dxio<ahjq> u;
    public gdo v;
    public btpa w;
    public cjqq x;
    public cjqy y;
    public bvjj z;

    private final void N(String str) {
        this.k.setText(str);
        EditText d = this.r.d();
        if (d != null) {
            d.setText(str);
        }
        g().f();
    }

    public final void M() {
        if (this.n == dqvj.DRIVE || this.n == dqvj.TWO_WHEELER) {
            this.o.setVisibility(0);
            this.q.setVisibility(0);
        } else {
            this.o.setVisibility(8);
            this.q.setVisibility(8);
        }
        if (this.n == dqvj.DRIVE || this.n == dqvj.TWO_WHEELER || this.n == dqvj.WALK || this.n == dqvj.BICYCLE) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        if ((dxbpVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            N(dxbpVar.d);
            return;
        }
        int i = dxbpVar.h;
        char c = 1810;
        if (i == 97) {
            c = 'b';
        } else if (i == 98) {
            c = 'c';
        } else if (i == 113) {
            c = 'r';
        } else if (i == 114) {
            c = 's';
        } else if (i != 1809) {
            if (i != 1810) {
                switch (i) {
                    case 0:
                        c = 1;
                        break;
                    case 1:
                        c = 2;
                        break;
                    case 2:
                        c = 3;
                        break;
                    case 3:
                        c = 4;
                        break;
                    case 4:
                        c = 5;
                        break;
                    case 5:
                        c = 6;
                        break;
                    case 6:
                        c = 7;
                        break;
                    case 7:
                        c = '\b';
                        break;
                    case 8:
                        c = '\t';
                        break;
                    case 9:
                        c = '\n';
                        break;
                    case 10:
                        c = 11;
                        break;
                    case 11:
                        c = '\f';
                        break;
                    case 12:
                        c = '\r';
                        break;
                    case 13:
                        c = 14;
                        break;
                    case 14:
                        c = 15;
                        break;
                    default:
                        switch (i) {
                            case 17:
                                c = 18;
                                break;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                c = '2';
                                break;
                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                c = 'B';
                                break;
                            case 129:
                                c = 130;
                                break;
                            case 161:
                                c = 162;
                                break;
                            case 209:
                                c = 210;
                                break;
                            case 273:
                                c = 274;
                                break;
                            case 1553:
                                c = 1554;
                                break;
                            case 3105:
                                c = 3106;
                                break;
                            case 3857:
                                c = 3858;
                                break;
                            case 3967:
                                c = 3968;
                                break;
                            case 3969:
                                c = 3970;
                                break;
                            case 3985:
                                c = 3986;
                                break;
                            case 4049:
                                c = 4050;
                                break;
                            case 4065:
                                c = 4066;
                                break;
                            case 61953:
                                c = 61954;
                                break;
                            case 61954:
                                c = 61955;
                                break;
                            case 61955:
                                c = 61956;
                                break;
                            case 61956:
                                c = 61957;
                                break;
                            case 61957:
                                c = 61958;
                                break;
                            case 61958:
                                c = 61959;
                                break;
                            case 61959:
                                c = 61960;
                                break;
                            case 61960:
                                c = 61961;
                                break;
                            case 61961:
                                c = 61962;
                                break;
                            case 61962:
                                c = 61963;
                                break;
                            case 61963:
                                c = 61964;
                                break;
                            case 61964:
                                c = 61965;
                                break;
                            case 61965:
                                c = 61966;
                                break;
                            case 61966:
                                c = 61967;
                                break;
                            case 61967:
                                c = 61968;
                                break;
                            case 61968:
                                c = 61969;
                                break;
                            case 61969:
                                c = 61970;
                                break;
                            case 61970:
                                c = 61971;
                                break;
                            case 61971:
                                c = 61972;
                                break;
                            case 61972:
                                c = 61973;
                                break;
                            case 61973:
                                c = 61974;
                                break;
                            case 61974:
                                c = 61975;
                                break;
                            case 61975:
                                c = 61976;
                                break;
                            case 61976:
                                c = 61977;
                                break;
                            case 61977:
                                c = 61978;
                                break;
                            case 61978:
                                c = 61979;
                                break;
                            case 61979:
                                c = 61980;
                                break;
                            case 61980:
                                c = 61981;
                                break;
                            case 61981:
                                c = 61982;
                                break;
                            case 61982:
                                c = 61983;
                                break;
                            case 61983:
                                c = 61984;
                                break;
                            case 61984:
                                c = 61985;
                                break;
                            case 61985:
                                c = 61986;
                                break;
                            case 61986:
                                c = 61987;
                                break;
                            case 61987:
                                c = 61988;
                                break;
                            case 61988:
                                c = 61989;
                                break;
                            case 61989:
                                c = 61990;
                                break;
                            case 61990:
                                c = 61991;
                                break;
                            case 61991:
                                c = 61992;
                                break;
                            case 61992:
                                c = 61993;
                                break;
                            case 61993:
                                c = 61994;
                                break;
                            case 61994:
                                c = 61995;
                                break;
                            case 61995:
                                c = 61996;
                                break;
                            case 61996:
                                c = 61997;
                                break;
                            case 61997:
                                c = 61998;
                                break;
                            case 61998:
                                c = 61999;
                                break;
                            case 61999:
                                c = 62000;
                                break;
                            case 62000:
                                c = 62001;
                                break;
                            case 62001:
                                c = 62002;
                                break;
                            case 62002:
                                c = 62003;
                                break;
                            case 62003:
                                c = 62004;
                                break;
                            case 62004:
                                c = 62005;
                                break;
                            case 62005:
                                c = 62006;
                                break;
                            case 62006:
                                c = 62007;
                                break;
                            case 62007:
                                c = 62008;
                                break;
                            case 63249:
                                c = 63250;
                                break;
                            case 63265:
                                c = 63266;
                                break;
                            case 63281:
                                c = 63282;
                                break;
                            case 63297:
                                c = 63298;
                                break;
                            case 63313:
                                c = 63314;
                                break;
                            case 63473:
                                c = 63474;
                                break;
                            case 65409:
                                c = 65410;
                                break;
                            case 65410:
                                c = 65411;
                                break;
                            case 65457:
                                c = 65458;
                                break;
                            case 65473:
                                c = 65474;
                                break;
                            case 65505:
                                c = 65506;
                                break;
                            case 65521:
                                c = 65522;
                                break;
                            case 65522:
                                c = 65523;
                                break;
                            case 65523:
                                c = 65524;
                                break;
                            case 65524:
                                c = 65525;
                                break;
                            case 1048337:
                                c = 65298;
                                break;
                            case 1048338:
                                c = 65299;
                                break;
                            case 1048339:
                                c = 65300;
                                break;
                            default:
                                switch (i) {
                                    case 193:
                                        c = 194;
                                        break;
                                    case 194:
                                        c = 195;
                                        break;
                                    case 195:
                                        c = 196;
                                        break;
                                    case 196:
                                        c = 197;
                                        break;
                                    default:
                                        switch (i) {
                                            case 241:
                                                c = 242;
                                                break;
                                            case 242:
                                                c = 243;
                                                break;
                                            case 243:
                                                c = 244;
                                                break;
                                            case 244:
                                                c = 245;
                                                break;
                                            case 245:
                                                c = 246;
                                                break;
                                            case 246:
                                                c = 247;
                                                break;
                                            case 247:
                                                c = 248;
                                                break;
                                            case 248:
                                                c = 249;
                                                break;
                                            case 249:
                                                c = 250;
                                                break;
                                            case 250:
                                                c = 251;
                                                break;
                                            case 251:
                                                c = 252;
                                                break;
                                            case 252:
                                                c = 253;
                                                break;
                                            case 253:
                                                c = 254;
                                                break;
                                            case 254:
                                                c = 255;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 3937:
                                                        c = 3938;
                                                        break;
                                                    case 3938:
                                                        c = 3939;
                                                        break;
                                                    case 3939:
                                                        c = 3940;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 3953:
                                                                c = 3954;
                                                                break;
                                                            case 3954:
                                                                c = 3955;
                                                                break;
                                                            case 3955:
                                                                c = 3956;
                                                                break;
                                                            case 3956:
                                                                c = 3957;
                                                                break;
                                                            case 3957:
                                                                c = 3958;
                                                                break;
                                                            case 3958:
                                                                c = 3959;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 4081:
                                                                        c = 4082;
                                                                        break;
                                                                    case 4082:
                                                                        c = 4083;
                                                                        break;
                                                                    case 4083:
                                                                        c = 4084;
                                                                        break;
                                                                    case 4084:
                                                                        c = 4085;
                                                                        break;
                                                                    case 4085:
                                                                        c = 4086;
                                                                        break;
                                                                    case 4086:
                                                                        c = 4087;
                                                                        break;
                                                                    case 4087:
                                                                        c = 4088;
                                                                        break;
                                                                    case 4088:
                                                                        c = 4089;
                                                                        break;
                                                                    case 4089:
                                                                        c = 4090;
                                                                        break;
                                                                    case 4090:
                                                                        c = 4091;
                                                                        break;
                                                                    case 4091:
                                                                        c = 4092;
                                                                        break;
                                                                    case 4092:
                                                                        c = 4093;
                                                                        break;
                                                                    case 4093:
                                                                        c = 4094;
                                                                        break;
                                                                    case 4094:
                                                                        c = 4095;
                                                                        break;
                                                                    default:
                                                                        c = 0;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                c = 1811;
            }
        }
        if (c == 0) {
            throw null;
        }
        if (c == 4092 || c == 4093 || c == 5 || c == 4094) {
            N(dxbpVar.b);
        } else {
            N(String.format("%s %s", dxbpVar.c, dxbpVar.d));
        }
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        N(str);
    }

    public final boolean o() {
        return this.n == dqvj.DRIVE || this.n == dqvj.WALK || this.n == dqvj.BICYCLE || this.n == dqvj.TWO_WHEELER;
    }

    @Override // defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        qep qepVar = (qep) btsq.a(qep.class, this);
        this.J = qepVar;
        qepVar.wD(this);
        super.onCreate(bundle);
        if (!bycr.a(this.A)) {
            this.A.e();
        }
        this.t.b(new qei(this), bvrj.BACKGROUND_THREADPOOL);
        this.H = new qej(this, this, new cqhw(), this.E);
        Typeface typeface = ((cqvi) irn.b).a;
        Typeface typeface2 = ((cqvi) irn.e).a;
        setContentView(com.google.android.apps.maps.R.layout.qu_appwidget_directionsshortcut_page);
        this.n = dqvj.DRIVE;
        TextView textView = (TextView) findViewById(com.google.android.apps.maps.R.id.title_textview);
        dbsk.s(textView);
        this.I = textView;
        EditText editText = (EditText) findViewById(com.google.android.apps.maps.R.id.shortcutname_textbox);
        dbsk.s(editText);
        this.l = editText;
        EditText editText2 = (EditText) findViewById(com.google.android.apps.maps.R.id.destination_textbox);
        dbsk.s(editText2);
        this.k = editText2;
        CheckBox checkBox = (CheckBox) findViewById(com.google.android.apps.maps.R.id.turnbyturn_checkbox);
        dbsk.s(checkBox);
        this.m = checkBox;
        checkBox.setChecked(true);
        v();
        int i = 8;
        if (!p()) {
            this.m.setVisibility(8);
        }
        CheckBox checkBox2 = (CheckBox) findViewById(com.google.android.apps.maps.R.id.avoid_tolls);
        dbsk.s(checkBox2);
        this.o = checkBox2;
        CheckBox checkBox3 = (CheckBox) findViewById(com.google.android.apps.maps.R.id.avoid_ferries);
        dbsk.s(checkBox3);
        this.p = checkBox3;
        CheckBox checkBox4 = (CheckBox) findViewById(com.google.android.apps.maps.R.id.avoid_highways);
        dbsk.s(checkBox4);
        this.q = checkBox4;
        M();
        RadioGroup radioGroup = (RadioGroup) findViewById(com.google.android.apps.maps.R.id.travelmode_radiogroup);
        dbsk.s(radioGroup);
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(com.google.android.apps.maps.R.id.modedrive_button);
        dbsk.s(radioButton);
        RadioButton radioButton2 = (RadioButton) radioGroup.findViewById(com.google.android.apps.maps.R.id.modetransit_button);
        dbsk.s(radioButton2);
        RadioButton radioButton3 = (RadioButton) radioGroup.findViewById(com.google.android.apps.maps.R.id.modebicycle_button);
        dbsk.s(radioButton3);
        RadioButton radioButton4 = (RadioButton) radioGroup.findViewById(com.google.android.apps.maps.R.id.modewalk_button);
        dbsk.s(radioButton4);
        RadioButton radioButton5 = (RadioButton) radioGroup.findViewById(com.google.android.apps.maps.R.id.modetwowheeler_button);
        dbsk.s(radioButton5);
        radioButton.setTag(dqvj.DRIVE);
        radioButton2.setTag(dqvj.TRANSIT);
        radioButton3.setTag(dqvj.BICYCLE);
        radioButton4.setTag(dqvj.WALK);
        radioButton5.setTag(dqvj.TWO_WHEELER);
        radioGroup.check(radioGroup.findViewWithTag(this.n).getId());
        radioGroup.setOnCheckedChangeListener(new qek(this));
        dkiy enableFeatureParameters = this.s.getEnableFeatureParameters();
        radioButton3.setVisibility((enableFeatureParameters == null || !enableFeatureParameters.n) ? 8 : 0);
        if (true == this.C.b()) {
            i = 0;
        }
        radioButton5.setVisibility(i);
        Button button = (Button) findViewById(com.google.android.apps.maps.R.id.save_button);
        dbsk.s(button);
        qel qelVar = new qel(this, button);
        this.k.addTextChangedListener(qelVar);
        this.l.addTextChangedListener(qelVar);
        this.k.setFocusable(false);
        this.k.setOnClickListener(new qem(this));
        button.setEnabled(false);
        button.setOnClickListener(new qen(this));
        Button button2 = (Button) findViewById(com.google.android.apps.maps.R.id.cancel_button);
        dbsk.s(button2);
        button2.setOnClickListener(new qeo(this));
        this.I.setTypeface(typeface);
        this.m.setTypeface(typeface2);
        this.k.setTypeface(typeface2);
        this.l.setTypeface(typeface2);
        button.setTypeface(typeface);
        button2.setTypeface(typeface);
        cjqp f = this.x.f(this.I.getRootView());
        f.d(cjtd.a(dtxn.dn));
        this.F = f.d(cjtd.a(dtxn.dk));
        this.G = f.d(cjtd.a(dtxn.dg));
    }

    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.H.c();
    }

    @Override // defpackage.gga, defpackage.ff, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.v.d();
    }

    @Override // defpackage.gga, defpackage.ff, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.a();
        this.I.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.w.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gga, defpackage.rb, defpackage.ff, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.w.h();
    }

    public final boolean p() {
        return getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    @Override // defpackage.gga
    protected final void q() {
    }

    @Override // defpackage.gga
    public final efc r() {
        return this.B;
    }

    @Override // defpackage.gga
    public final void s() {
    }

    @Override // defpackage.btss
    public final <T extends btsy> T t(Class<T> cls) {
        return cls.cast(this.J);
    }

    public final void v() {
        if (o()) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
    }
}
