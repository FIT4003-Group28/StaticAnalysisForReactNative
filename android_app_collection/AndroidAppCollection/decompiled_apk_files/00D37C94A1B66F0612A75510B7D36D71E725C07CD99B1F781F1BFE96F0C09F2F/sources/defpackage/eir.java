package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eir  reason: default package */
/* loaded from: classes3.dex */
public final class eir {
    public final Activity a;
    public final ajmy b;
    public final aafo c;
    public aptb d;
    public apvf e;
    public AlertDialog f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    private final View n;
    private final View o;
    private final TextView p;
    private final TextView q;
    private final TextView r;

    public eir(Activity activity, ajmy ajmyVar, aafo aafoVar, View view) {
        this.a = activity;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.n = view;
        this.p = (TextView) view.findViewById(R.id.header);
        this.q = (TextView) view.findViewById(R.id.prices);
        this.r = (TextView) view.findViewById(R.id.additional_info);
        View findViewById = view.findViewById(R.id.additional_offers);
        this.o = findViewById;
        findViewById.setOnClickListener(new eip(this));
    }

    public static apvf a(aptb aptbVar) {
        if (aptbVar != null) {
            aptd aptdVar = aptbVar.d;
            if (aptdVar == null) {
                aptdVar = aptd.a;
            }
            if ((aptdVar.b & 1) == 0) {
                return null;
            }
            aptd aptdVar2 = aptbVar.d;
            if (aptdVar2 == null) {
                aptdVar2 = aptd.a;
            }
            apvf apvfVar = aptdVar2.c;
            return apvfVar == null ? apvf.a : apvfVar;
        }
        return null;
    }

    public final void b(aptb aptbVar) {
        arag aragVar;
        this.d = aptbVar;
        int i = 8;
        if (aptbVar == null) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        TextView textView = this.p;
        if (textView != null) {
            arag aragVar2 = aptbVar.b;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar2));
        }
        aptd aptdVar = aptbVar.c;
        if (aptdVar == null) {
            aptdVar = aptd.a;
        }
        apvf apvfVar = aptdVar.c;
        if (apvfVar == null) {
            apvfVar = apvf.a;
        }
        TextView textView2 = this.q;
        arag aragVar3 = null;
        if ((apvfVar.b & 16) != 0) {
            aragVar = apvfVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView2.setText(ajgl.b(aragVar));
        TextView textView3 = this.r;
        if ((apvfVar.b & 32) != 0 && (aragVar3 = apvfVar.h) == null) {
            aragVar3 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar3));
        View view = this.o;
        if (a(aptbVar) != null) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
