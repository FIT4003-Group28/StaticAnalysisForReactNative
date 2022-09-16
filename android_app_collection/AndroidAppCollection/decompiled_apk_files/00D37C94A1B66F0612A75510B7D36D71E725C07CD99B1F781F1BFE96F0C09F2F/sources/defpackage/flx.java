package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: flx  reason: default package */
/* loaded from: classes3.dex */
public final class flx implements ajru {
    public final aafo a;
    public final fma b;
    public final ViewGroup c;
    final Spinner d;
    public ajrs e;
    private final faq f;
    private final ajxz g;
    private final flv h;

    public flx(Context context, aafo aafoVar, faq faqVar, ajxz ajxzVar, akem akemVar, ViewGroup viewGroup, int i, int i2) {
        this.a = aafoVar;
        this.f = faqVar;
        this.g = ajxzVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sort_filter, viewGroup, false);
        this.c = viewGroup2;
        Spinner spinner = (Spinner) viewGroup2.findViewById(R.id.spinner);
        this.d = spinner;
        akemVar.b(spinner, akemVar.a(spinner, null));
        fma r = hqs.r(viewGroup2, spinner, i2, i, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        this.b = r;
        r.a.add(new flu(this));
        spinner.setAdapter((SpinnerAdapter) r);
        this.h = new flv(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, final auxr auxrVar) {
        int i;
        this.e = ajrsVar;
        this.b.b = auxrVar.d;
        this.d.setOnItemSelectedListener(null);
        fma fmaVar = this.b;
        aopu<auxq> aopuVar = auxrVar.c;
        ArrayList arrayList = new ArrayList();
        for (auxq auxqVar : aopuVar) {
            arrayList.add(new flw(auxqVar));
        }
        fmaVar.a(arrayList);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= auxrVar.c.size()) {
                i2 = 0;
                break;
            } else if (((auxq) auxrVar.c.get(i2)).g) {
                break;
            } else {
                i2++;
            }
        }
        this.h.a = i2;
        this.d.setSelection(i2, false);
        this.d.setOnItemSelectedListener(this.h);
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: flt
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ajrs ajrsVar2;
                flx flxVar = flx.this;
                auxr auxrVar2 = auxrVar;
                if (motionEvent.getAction() != 1 || (ajrsVar2 = flxVar.e) == null) {
                    return false;
                }
                nni.w(ajrsVar2, auxrVar2);
                view.performClick();
                return false;
            }
        });
        if (!kxi.b(ajrsVar)) {
            this.f.a(this);
        }
        if ((auxrVar.b & 2) != 0) {
            ajxz ajxzVar = this.g;
            arhs arhsVar = auxrVar.e;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        View findViewById = this.d.findViewById(R.id.icon);
        if (findViewById instanceof ImageView) {
            if (i != 0) {
                ((ImageView) findViewById).setImageResource(i);
            }
            if (i != 0) {
                z = true;
            }
            zag.o(findViewById, z);
        }
        this.b.c = i;
        nni.x(ajrsVar, auxrVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajrs ajrsVar = this.e;
        if (ajrsVar == null || kxi.b(ajrsVar)) {
            return;
        }
        this.f.c(this);
    }
}
