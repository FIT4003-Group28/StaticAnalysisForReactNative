package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ayob  reason: default package */
/* loaded from: classes3.dex */
class ayob implements aymo {
    final /* synthetic */ aydj a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;

    public ayob(aydj aydjVar, Context context, int i) {
        this.a = aydjVar;
        this.b = context;
        this.c = i;
    }

    @Override // defpackage.aymo
    public jic a() {
        return this.a.c();
    }

    @Override // defpackage.aymo
    public CharSequence b() {
        return this.b.getString(this.c, this.a.a());
    }
}
