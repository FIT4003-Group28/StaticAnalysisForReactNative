package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: shs  reason: default package */
/* loaded from: classes4.dex */
public final class shs {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/FaceViewerManager");
    public final List b = new ArrayList();
    public ViewGroup c;
    public final shx d;
    public final sif e;
    public final sju f;
    public final sjy g;
    public final Executor h;
    public final Executor i;
    public final Executor j;
    public final ankt k;
    protected final shr l;

    public shs(Context context, ski skiVar, gpn gpnVar, Executor executor, Executor executor2, Executor executor3, Callable callable, aoik aoikVar, sht shtVar) {
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.main_view, (ViewGroup) null);
        this.h = executor2;
        this.i = executor;
        this.j = executor3;
        this.k = anlz.u(callable, executor);
        sju sjuVar = new sju(context, skiVar, aoikVar, executor2, executor);
        a(sjuVar);
        this.f = sjuVar;
        skc skcVar = new skc(context);
        ((ViewGroup) this.c.findViewById(R.id.web_container)).addView(skcVar.b);
        sjy sjyVar = new sjy(skcVar);
        a(sjyVar);
        this.g = sjyVar;
        shx shxVar = new shx(context, executor, executor2);
        a(shxVar);
        this.d = shxVar;
        sif sifVar = new sif(gpnVar, shxVar);
        a(sifVar);
        this.e = sifVar;
        sie sieVar = new sie(shtVar);
        a(sieVar);
        shu shuVar = new shu(amok.a);
        a(shuVar);
        this.l = new shr(this, sieVar, shuVar);
        this.c.addView(sjuVar.a(), 0);
    }

    protected final void a(skq skqVar) {
        this.b.add(skqVar);
    }
}
