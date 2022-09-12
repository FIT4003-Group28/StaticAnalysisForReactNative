package com.google.android.apps.auto.sdk.nav.suggestion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationSuggestion extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationSuggestion> CREATOR = new cld(NavigationSuggestion.class);
    public Intent a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public double g = Double.MAX_VALUE;
    public double h = Double.MAX_VALUE;
    public int i;
    public coc[] j;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        double[] dArr;
        bundle.putCharSequence("name", this.b);
        bundle.putCharSequence("route", this.c);
        bundle.putParcelable("intent", this.a);
        bundle.putCharSequence("address", this.d);
        bundle.putDouble("lat", this.g);
        bundle.putDouble("lng", this.h);
        bundle.putCharSequence("formatted_tta", this.e);
        bundle.putInt("sec_to_dest", this.f);
        coc[] cocVarArr = this.j;
        if (cocVarArr == null) {
            dArr = null;
        } else {
            int length = cocVarArr.length;
            double[] dArr2 = new double[length + length];
            for (int i = 0; i < cocVarArr.length; i++) {
                int i2 = i + i;
                coc cocVar = cocVarArr[i];
                dArr2[i2] = cocVar.a;
                dArr2[i2 + 1] = cocVar.b;
            }
            dArr = dArr2;
        }
        bundle.putDoubleArray("waypoints", dArr);
        bundle.putInt("traffic", this.i);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        coc[] cocVarArr;
        this.b = bundle.getCharSequence("name");
        this.c = bundle.getCharSequence("route");
        this.a = (Intent) bundle.getParcelable("intent");
        this.d = bundle.getCharSequence("address");
        this.g = bundle.getDouble("lat");
        this.h = bundle.getDouble("lng");
        this.f = bundle.getInt("sec_to_dest");
        this.e = bundle.getCharSequence("formatted_tta");
        double[] doubleArray = bundle.getDoubleArray("waypoints");
        if (doubleArray == null) {
            cocVarArr = null;
        } else {
            coc[] cocVarArr2 = new coc[doubleArray.length >> 1];
            for (int i = 0; i < (doubleArray.length >> 1); i++) {
                int i2 = i + i;
                cocVarArr2[i] = new coc(doubleArray[i2], doubleArray[i2 + 1]);
            }
            cocVarArr = cocVarArr2;
        }
        this.j = cocVarArr;
        this.i = bundle.getInt("traffic");
    }
}
