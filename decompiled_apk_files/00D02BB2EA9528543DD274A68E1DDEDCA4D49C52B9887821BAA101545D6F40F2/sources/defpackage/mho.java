package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mho  reason: default package */
/* loaded from: classes7.dex */
public class mho implements mhm {
    private final mhl a;
    private final Context b;
    private boolean c = true;

    public mho(Context context, mhl mhlVar, cqhn cqhnVar) {
        this.b = context;
        this.a = mhlVar;
    }

    @Override // defpackage.mhm
    public cqkl a() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.mhm
    public CharSequence b() {
        return this.b.getResources().getString(R.string.CAR_PERSONAL_PLACES_SAVE_TITLE);
    }

    @Override // defpackage.mhm
    public CharSequence c() {
        return this.b.getResources().getString(R.string.CAR_PERSONAL_PLACES_SAVE_LOADING);
    }

    @Override // defpackage.mhm
    public void d() {
        this.c = false;
        cqkx.p(this);
    }

    @Override // defpackage.mhm
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }
}
