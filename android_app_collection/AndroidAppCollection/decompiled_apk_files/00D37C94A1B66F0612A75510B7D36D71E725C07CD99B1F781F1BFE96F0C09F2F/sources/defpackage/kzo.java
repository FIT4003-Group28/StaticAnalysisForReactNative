package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzo  reason: default package */
/* loaded from: classes3.dex */
public final class kzo implements ajru {
    public final Resources a;
    public final yni b;
    public final TextView c;
    public final Spinner d;
    private final View e;
    private final Context f;

    public kzo(Context context, yni yniVar, ViewGroup viewGroup) {
        this.f = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown, viewGroup, false);
        this.e = inflate;
        this.b = yniVar;
        this.d = (Spinner) inflate.findViewById(R.id.dropdown_spinner);
        this.c = (TextView) inflate.findViewById(R.id.subtitles);
        this.a = context.getResources();
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new kzn(this, inflate));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        awdu awduVar = (awdu) obj;
        int i = 0;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f, (int) R.layout.uwc_spinner_title, ajgl.o((arag[]) awduVar.d.toArray(new arag[0])));
        arrayAdapter.setDropDownViewResource(R.layout.uwc_spinner_item);
        this.d.setAdapter((SpinnerAdapter) arrayAdapter);
        this.d.setOnTouchListener(new kzl(awduVar, ajrsVar));
        this.d.setOnItemSelectedListener(new kzm(this, awduVar));
        if (awduVar.qn(awcp.b)) {
            i = ((Integer) awduVar.qm(awcp.b)).intValue();
        }
        this.d.setSelection(i);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
