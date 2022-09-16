package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xwk  reason: default package */
/* loaded from: classes4.dex */
public final class xwk extends xwo {
    public static final bakk ae = bakj.a("MMMM dd, yyyy");
    public static final bakk af = bakj.a("hh:mm a");
    private static final bakk ap = bakj.a("Z");
    private YouTubeButton aA;
    public aagi ag;
    public snc ah;
    public Dialog ai;
    public bahm aj;
    public List ak;
    public avip al;
    public String am;
    public TextView an;
    public TextView ao;
    private aqkn aq;
    private avir ar;
    private String as;
    private Toolbar at;
    private TextView au;
    private View av;
    private TextView aw;
    private View ax;
    private TextView ay;
    private Spinner az;

    public final void aE() {
        if (this.aj.a <= this.ah.c()) {
            this.aA.setEnabled(false);
        } else {
            this.aA.setEnabled(true);
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        aoqu aoquVar;
        bahm bahmVar;
        String str;
        super.mQ(bundle);
        try {
            aoquVar = aphq.j(this.m, "renderer", aqkn.a, aoos.b());
        } catch (RuntimeException unused) {
            zep.b("Failed to merge proto for renderer");
            aoquVar = null;
        }
        aqkn aqknVar = (aqkn) aoquVar;
        this.aq = aqknVar;
        aqxo.y((aqknVar.b & 128) != 0);
        String str2 = this.aq.i;
        this.am = str2;
        this.al = aviq.f(str2);
        avir avirVar = (avir) this.ag.c().f(this.am).W();
        this.ar = avirVar;
        if (avirVar == null) {
            bahmVar = new bahm(this.ah.c());
        } else {
            bahmVar = new bahm(TimeUnit.SECONDS.toMillis(this.ar.getTimestamp().c), baht.j(baht.k().a(this.ah.c())));
        }
        this.aj = bahmVar;
        this.as = rb().getResources().getString(R.string.local_timezone_label);
        ArrayList arrayList = new ArrayList();
        this.ak = arrayList;
        String string = rb().getResources().getString(R.string.utc_offset_format);
        String string2 = rb().getResources().getString(R.string.city_timezone_format);
        baht k = baht.k();
        bahm bahmVar2 = new bahm(this.ah.c());
        String format = String.format(string, ap.a(bahmVar2));
        aopa createBuilder = aqko.a.createBuilder();
        createBuilder.copyOnWrite();
        aqko aqkoVar = (aqko) createBuilder.instance;
        aqkoVar.b |= 1;
        aqkoVar.c = "Etc/Unknown";
        String str3 = this.as;
        createBuilder.copyOnWrite();
        aqko aqkoVar2 = (aqko) createBuilder.instance;
        str3.getClass();
        aqkoVar2.b |= 2;
        aqkoVar2.d = str3;
        createBuilder.copyOnWrite();
        aqko aqkoVar3 = (aqko) createBuilder.instance;
        format.getClass();
        aqkoVar3.b |= 4;
        aqkoVar3.e = format;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(k.a(bahmVar2.a));
        createBuilder.copyOnWrite();
        aqko aqkoVar4 = (aqko) createBuilder.instance;
        aqkoVar4.b |= 8;
        aqkoVar4.f = seconds;
        if (this.aq.d.size() > 0 && (((aqko) this.aq.d.get(0)).b & 16) != 0) {
            Object[] objArr = new Object[1];
            int a = bahmVar2.k().a(bahmVar2.a);
            if (a != 0) {
                int hours = (int) TimeUnit.MILLISECONDS.toHours(Math.abs(a));
                int minutes = (int) (TimeUnit.MILLISECONDS.toMinutes(Math.abs(a)) - TimeUnit.HOURS.toMinutes(hours));
                if (a < 0) {
                    str = String.format(Locale.getDefault(), "-%d", Integer.valueOf(hours));
                } else {
                    str = String.format(Locale.getDefault(), "+%d", Integer.valueOf(hours));
                }
                if (minutes > 0) {
                    str = String.format(Locale.getDefault(), "%s:%d", str, Integer.valueOf(minutes));
                }
            } else {
                str = "";
            }
            objArr[0] = String.format(string, str);
            String format2 = String.format(string2, objArr);
            createBuilder.copyOnWrite();
            aqko aqkoVar5 = (aqko) createBuilder.instance;
            format2.getClass();
            aqkoVar5.b |= 16;
            aqkoVar5.g = format2;
        }
        arrayList.add((aqko) createBuilder.mo39build());
        this.ak.addAll(this.aq.d);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        Dialog dialog = this.d;
        this.ai = dialog;
        dialog.getClass();
        dialog.getWindow().requestFeature(1);
        View inflate = layoutInflater.inflate(R.layout.date_time_picker_fragment, viewGroup, false);
        this.at = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.au = (TextView) inflate.findViewById(R.id.date_picker_header);
        this.av = inflate.findViewById(R.id.date_picker_container);
        this.an = (TextView) inflate.findViewById(R.id.date_picker_text);
        this.aw = (TextView) inflate.findViewById(R.id.time_picker_header);
        this.ax = inflate.findViewById(R.id.time_picker_container);
        this.ao = (TextView) inflate.findViewById(R.id.time_picker_text);
        this.ay = (TextView) inflate.findViewById(R.id.timezone_picker_header);
        this.az = (Spinner) inflate.findViewById(R.id.timezone_spinner);
        this.aA = (YouTubeButton) inflate.findViewById(R.id.confirm_button);
        this.at.l(R.menu.date_time_picker_action_menu);
        Toolbar toolbar = this.at;
        arag aragVar = this.aq.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        toolbar.w(ajgl.b(aragVar));
        this.at.o(R.string.accessibility_close_dialog);
        this.at.r(new xwg(this, 3));
        yzh yzhVar = new yzh(rb());
        Toolbar toolbar2 = this.at;
        toolbar2.q(yzhVar.b(toolbar2.e(), zhn.j(rb(), R.attr.ytTextPrimary).orElse(0)));
        MenuItem findItem = this.at.g().findItem(R.id.remove_button);
        if ((this.aq.b & 4) == 0 || this.ar == null) {
            findItem.setVisible(false);
        } else {
            this.at.q = new aaj() { // from class: xwf
                @Override // defpackage.aaj
                public final boolean a(MenuItem menuItem) {
                    xwk xwkVar = xwk.this;
                    if (((si) menuItem).a != R.id.remove_button) {
                        return false;
                    }
                    aahb c = ((aagu) xwkVar.ag.c()).c();
                    c.g(xwkVar.am);
                    c.b().Q();
                    xwkVar.ai.cancel();
                    return true;
                }
            };
            MenuItem findItem2 = this.at.g().findItem(R.id.remove_button);
            aunb aunbVar = this.aq.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            arag aragVar2 = ((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            findItem2.setTitle(ajgl.b(aragVar2));
            findItem.setVisible(true);
        }
        TextView textView = this.au;
        arag aragVar3 = this.aq.f;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        textView.setText(ajgl.b(aragVar3));
        View view = this.av;
        zag.k(view, view.getBackground());
        this.av.setOnClickListener(new xwg(this));
        this.an.setText(ae.a(this.aj));
        TextView textView2 = this.aw;
        arag aragVar4 = this.aq.g;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar4));
        View view2 = this.ax;
        zag.k(view2, view2.getBackground());
        this.ax.setOnClickListener(new xwg(this, 2));
        this.ao.setText(af.a(this.aj));
        TextView textView3 = this.ay;
        arag aragVar5 = this.aq.h;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar5));
        Spinner spinner = this.az;
        zag.k(spinner, spinner.getBackground());
        ArrayList arrayList = new ArrayList();
        for (aqko aqkoVar : this.ak) {
            if ((aqkoVar.b & 16) != 0) {
                arrayList.add(aqkoVar.g);
            } else {
                arrayList.add(rb().getString(R.string.timezone_format, aqkoVar.e, aqkoVar.d));
            }
        }
        this.az.setAdapter((SpinnerAdapter) new ArrayAdapter(rb(), (int) R.layout.timezone_spinner_item, arrayList));
        this.az.setOnItemSelectedListener(new xwj(this));
        YouTubeButton youTubeButton = this.aA;
        zag.k(youTubeButton, youTubeButton.getBackground());
        this.aA.setOnClickListener(new xwg(this, 1));
        aE();
        return inflate;
    }
}
