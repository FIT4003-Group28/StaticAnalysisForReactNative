package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwoi  reason: default package */
/* loaded from: classes5.dex */
public final class cwoi implements cwlw, cwnc {
    public static final /* synthetic */ int d = 0;
    public cwlw a;
    public boolean b = false;
    public final List<cwgc> c = new ArrayList();

    static {
        cwjy.a();
    }

    public cwoi(cwlw cwlwVar, cwlw cwlwVar2) {
        this.a = new cwoh(this, cwlwVar, cwlwVar2);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        return this.a.a();
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return this.a.b();
    }

    @Override // defpackage.cwlw
    public final void c(cwgc cwgcVar) {
        this.a.c(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        this.a.d(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        return this.a.e(str, i);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return this.a.f(str, i);
    }
}
