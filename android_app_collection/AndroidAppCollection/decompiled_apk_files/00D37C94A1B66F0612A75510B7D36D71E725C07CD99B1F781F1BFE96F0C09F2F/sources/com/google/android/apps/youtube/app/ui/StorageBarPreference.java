package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class StorageBarPreference extends Preference implements ynl {
    public afvn a;
    public azqb b;
    public ywa c;
    public yni d;
    private final boolean e;

    public StorageBarPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void B() {
        P();
        this.d.m(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        this.d.m(this);
        super.P();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agnn agnnVar = (agnn) obj;
                d();
                return null;
            } else if (i == 1) {
                agoa agoaVar = (agoa) obj;
                d();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agnn.class, agoa.class};
    }

    @Override // androidx.preference.Preference
    public final void qB(bke bkeVar) {
        super.qB(bkeVar);
        long j = 0;
        if (this.a.t()) {
            aghc aghcVar = (aghc) ((agrf) this.b.get()).a().b();
            if (this.e) {
                if (aghcVar.d != null) {
                    j = aghcVar.d.a();
                }
            } else if (aghcVar.c != null) {
                j = aghcVar.c.a();
            }
            j = zew.Q(j);
        }
        long Q = this.e ? zew.Q(this.c.a()) : zew.Q(zew.f());
        ProgressBar progressBar = (ProgressBar) bkeVar.a.findViewById(R.id.storage_bar);
        progressBar.setMax(1000);
        float f = (float) j;
        progressBar.setProgress((int) ((1000.0f * f) / (f + ((float) Q))));
        ((TextView) bkeVar.a.findViewById(R.id.storage_used)).setText(this.j.getResources().getString(R.string.pref_offline_storage_used, zgh.g(this.j.getResources(), j)));
        ((TextView) bkeVar.a.findViewById(R.id.storage_free)).setText(this.j.getResources().getString(R.string.pref_offline_storage_free, zgh.g(this.j.getResources(), Q)));
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.E();
        this.d.g(this);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ((lts) antz.u(this.j, lts.class)).ii(this);
        if (attributeSet == null) {
            this.e = false;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lrx.a);
        this.e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
