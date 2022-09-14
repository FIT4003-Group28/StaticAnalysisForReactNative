package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cppr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cppr<T, D> extends View implements cpqf<T, D> {
    private String a;
    private final boolean b;
    public boolean c;

    public cppr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cpqj.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.f, i, 0);
        String string = obtainStyledAttributes.getString(0);
        this.a = string;
        if (string != null && string.trim().length() <= 0) {
            this.a = null;
        }
        obtainStyledAttributes.recycle();
        this.b = true;
        a();
    }

    private void a() {
        cppw cppwVar = new cppw(-1, (byte) 2);
        cppwVar.d();
        setLayoutParams(cppwVar);
    }

    public CharSequence e() {
        throw null;
    }

    public void f(cpoj<T, D> cpojVar, List<cpot> list, cptb<T, D> cptbVar) {
        boolean z = false;
        if (cpojVar.d && cpojVar.c > 0) {
            z = true;
        }
        this.c = z;
    }

    public List<cpvg<T, D>> h(int i, int i2, boolean z) {
        throw null;
    }

    @Override // defpackage.cpqf
    public final String j() {
        return this.a;
    }

    @Override // defpackage.cpqf
    public final boolean k() {
        return this.b;
    }

    public void setLegendSymbolRenderer(cpqh<T> cpqhVar) {
        cpwl.h(cpqhVar, "symbolDrawer");
    }

    @Override // defpackage.cpqf
    public void setRendererId(String str) {
        this.a = str;
    }

    public cppr(Context context) {
        super(context);
        cpqj.a();
        this.b = true;
        a();
    }
}
