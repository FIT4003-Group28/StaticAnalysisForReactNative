package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProtoDataStoreCheckBoxPreference extends CheckBoxPreference implements zcj {
    private zbu c;
    private yzj d;
    private ankt e;
    private apy f;
    private Object g;

    public ProtoDataStoreCheckBoxPreference(Context context) {
        super(context);
        this.e = anlz.q(null);
        this.g = false;
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    private final ankt ak(Boolean bool) {
        if (U()) {
            return this.c.b(bool);
        }
        return anlz.q(null);
    }

    @Override // androidx.preference.Preference
    public final boolean Q(Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            apy apyVar = this.f;
            ankt ak = ak((Boolean) obj);
            yzj yzjVar = this.d;
            yzjVar.getClass();
            ylx.n(apyVar, ak, new epl(yzjVar, 2), new zbx());
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final boolean R(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void X(boolean z) {
    }

    protected void ad() {
    }

    public final /* synthetic */ void ae(boolean z) {
        super.k(z);
    }

    @Override // defpackage.zcj
    public final void af(yzj yzjVar) {
        this.d = yzjVar;
    }

    @Override // defpackage.zcj
    public final void ag(apy apyVar) {
        this.f = apyVar;
    }

    @Override // defpackage.zcj
    public final void ah(Map map) {
        zbu zbuVar = (zbu) map.get(this.s);
        zbuVar.getClass();
        this.c = zbuVar;
        final Boolean bool = (Boolean) this.g;
        ylx.n(this.f, zbuVar.a(), new zdt() { // from class: zbw
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Throwable th = (Throwable) obj;
                ProtoDataStoreCheckBoxPreference.this.aj(bool);
            }
        }, new zdt() { // from class: zbv
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ProtoDataStoreCheckBoxPreference.this.ae(((Boolean) obj).booleanValue());
            }
        });
    }

    public final /* synthetic */ void ai(boolean z) {
        super.k(z);
        ad();
    }

    public final /* synthetic */ void aj(Boolean bool) {
        super.k(bool.booleanValue());
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final Object jP(TypedArray typedArray, int i) {
        Object jP = super.jP(typedArray, i);
        this.g = jP;
        return jP;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(final boolean z) {
        ankt ak = ak(Boolean.valueOf(z));
        this.e = ak;
        apy apyVar = this.f;
        yzj yzjVar = this.d;
        yzjVar.getClass();
        ylx.n(apyVar, ak, new epl(yzjVar, 2), new zdt() { // from class: zby
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Void r3 = (Void) obj;
                ProtoDataStoreCheckBoxPreference.this.ai(z);
            }
        });
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = anlz.q(null);
        this.g = false;
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = anlz.q(null);
        this.g = false;
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = anlz.q(null);
        this.g = false;
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }
}
