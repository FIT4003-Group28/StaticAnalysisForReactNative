package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: cpos  reason: default package */
/* loaded from: classes5.dex */
public final class cpos<T> extends cpny<T, Double, cprl> {
    public cpos(Context context) {
        super(context);
    }

    @Override // defpackage.cpoj
    public final cpvf<Double> a() {
        return cpvf.c;
    }

    @Override // defpackage.cpny
    protected final /* bridge */ /* synthetic */ cprl b(AttributeSet attributeSet) {
        Context context = getContext();
        boolean z = ((cpny) this).a;
        cprl cprlVar = new cprl(context, attributeSet);
        cprm cprmVar = new cprm();
        cprmVar.a = false;
        cprlVar.setAutoAdjustViewportToNiceValues(false);
        cprlVar.e = cprmVar;
        cprlVar.b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.c, 0, 0);
        cprmVar.a(Integer.valueOf(obtainStyledAttributes.getInt(6, 0)));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, (int) cpqk.a(context, 10.0f));
        cprlVar.c = dimensionPixelSize;
        cprlVar.d = dimensionPixelSize;
        obtainStyledAttributes.recycle();
        if (!(!z)) {
            cptd.c(cprlVar);
        } else {
            cptd.d(cprlVar);
        }
        return cprlVar;
    }

    public cpos(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpos(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
