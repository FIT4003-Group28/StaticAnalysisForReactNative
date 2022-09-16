package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreEditTextPreference;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProtoDataStoreEditTextPreference extends EditTextPreference implements zcj {
    private zbu G;
    private amfb H;
    private Object I;
    private yzj h;
    private apy i;

    public ProtoDataStoreEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final boolean Q(Object obj) {
        ankt q;
        boolean Q = super.Q(obj);
        if (Q) {
            apy apyVar = this.i;
            if (U()) {
                q = this.G.b(obj);
            } else {
                q = anlz.q(null);
            }
            yzj yzjVar = this.h;
            yzjVar.getClass();
            ylx.n(apyVar, q, new epl(yzjVar, 3), new zbx(2));
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void Y(String str) {
    }

    @Override // defpackage.zcj
    public final void af(yzj yzjVar) {
        yzjVar.getClass();
        this.h = yzjVar;
    }

    @Override // defpackage.zcj
    public final void ag(apy apyVar) {
        this.i = apyVar;
    }

    @Override // defpackage.zcj
    public final void ah(Map map) {
        zbu zbuVar = (zbu) map.get(this.s);
        zbuVar.getClass();
        this.G = zbuVar;
        Object obj = this.I;
        amfb amfbVar = new amfb(new zcc(ylx.b(this.i, zbuVar.a(), new ampg() { // from class: zcb
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                ProtoDataStoreEditTextPreference.this.k(str);
                return str;
            }
        })), anjk.a);
        this.H = amfbVar;
        final String str = (String) obj;
        ylx.n(this.i, amfbVar.c(), new zdt() { // from class: zca
            @Override // defpackage.zdt
            public final void a(Object obj2) {
                Throwable th = (Throwable) obj2;
                ProtoDataStoreEditTextPreference.this.i(str);
            }
        }, new zdt() { // from class: zbz
            @Override // defpackage.zdt
            public final void a(Object obj2) {
                ProtoDataStoreEditTextPreference.this.i((String) obj2);
            }
        });
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final Object jP(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.I = string;
        return string;
    }

    public final /* synthetic */ void k(String str) {
        if (!TextUtils.isEmpty(str)) {
            super.i(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String s(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
