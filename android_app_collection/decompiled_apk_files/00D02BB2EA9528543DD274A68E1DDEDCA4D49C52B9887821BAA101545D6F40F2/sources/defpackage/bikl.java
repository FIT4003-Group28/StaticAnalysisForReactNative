package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bikl  reason: default package */
/* loaded from: classes3.dex */
class bikl implements bikf {
    final dnnz a;
    final Context b;

    public bikl(dnnz dnnzVar, Context context) {
        this.a = dnnzVar;
        this.b = context;
    }

    @Override // defpackage.bike
    public String a() {
        return this.a.c;
    }

    @Override // defpackage.bike
    public int b() {
        return 2131231656;
    }

    @Override // defpackage.bikf
    public String c() {
        int i = this.a.d;
        return this.b.getResources().getQuantityString(R.plurals.PERSONAL_HOTEL_RESERVATION_LENGTH, i, Integer.valueOf(i));
    }
}
