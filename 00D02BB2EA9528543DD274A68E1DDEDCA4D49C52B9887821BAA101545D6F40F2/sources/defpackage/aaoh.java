package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: aaoh  reason: default package */
/* loaded from: classes2.dex */
public class aaoh implements aaof {
    public dbsg<gn> a;
    public dbsg<aazh> b;
    private final Context c;
    private final ckcw d;
    private final aaku e;
    private final bvvw f;
    private final aazg g;
    private final View.OnAttachStateChangeListener h = new aaog(this);
    private final cjtd i;
    private boolean j;
    private dbsg<String> k;

    public aaoh(Context context, ckcw ckcwVar, aaku aakuVar, bvvw bvvwVar, aazg aazgVar) {
        cjta b = cjtd.b();
        b.d = dtxo.aM;
        this.i = b.a();
        this.j = true;
        this.a = dbpy.a;
        this.b = dbpy.a;
        this.k = dbpy.a;
        this.c = context;
        this.d = ckcwVar;
        this.e = aakuVar;
        this.f = bvvwVar;
        this.g = aazgVar;
    }

    private static String g(String str) {
        debv a = debv.a(str);
        a.e("uule", new String[0]);
        return a.toString();
    }

    @Override // defpackage.aaof
    public View.OnAttachStateChangeListener a() {
        return this.h;
    }

    @Override // defpackage.aaof
    public cjtd b() {
        return this.i;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        boolean z = false;
        if (this.j && this.b.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void d(dbsg<gn> dbsgVar) {
        this.a = dbsgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(defpackage.diwb r11) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaoh.e(diwb):void");
    }

    public void f() {
        this.j = false;
        ((aagi) this.e).b.a(null);
    }
}
