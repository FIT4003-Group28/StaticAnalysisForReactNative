package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProtoDataStoreListPreference extends ListPreference implements zcj {
    public zcn G;
    private zbu H;
    private yzj I;

    /* renamed from: J  reason: collision with root package name */
    private amfb f163J;
    private ankt K;
    private apy L;
    private Object M;

    public ProtoDataStoreListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = anlz.q(null);
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final void F(Object obj) {
        this.M = obj;
        this.y = obj;
    }

    @Override // androidx.preference.Preference
    public final boolean Q(final Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            apy apyVar = this.L;
            ankt ab = ab((String) obj);
            yzj yzjVar = this.I;
            yzjVar.getClass();
            ylx.n(apyVar, ab, new epl(yzjVar, 4), new zdt() { // from class: zcd
                @Override // defpackage.zdt
                public final void a(Object obj2) {
                    ProtoDataStoreListPreference protoDataStoreListPreference = ProtoDataStoreListPreference.this;
                    Object obj3 = obj;
                    Void r3 = (Void) obj2;
                    zcn zcnVar = protoDataStoreListPreference.G;
                    if (zcnVar != null) {
                        zcnVar.a(obj3);
                    }
                }
            });
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void Y(String str) {
    }

    protected final ankt ab(String str) {
        if (U()) {
            return this.H.b(str);
        }
        return anlz.q(null);
    }

    public final /* synthetic */ void ac(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            super.o(str);
        } else {
            super.o(str2);
        }
    }

    public final /* synthetic */ void ad(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            super.o(str2);
        } else if (str == null) {
        } else {
            super.o(str);
        }
    }

    public final /* synthetic */ void ae(String str) {
        super.o(str);
    }

    @Override // defpackage.zcj
    public final void af(yzj yzjVar) {
        yzjVar.getClass();
        this.I = yzjVar;
    }

    @Override // defpackage.zcj
    public final void ag(apy apyVar) {
        this.L = apyVar;
    }

    @Override // defpackage.zcj
    public final void ah(Map map) {
        zbu zbuVar = (zbu) map.get(this.s);
        zbuVar.getClass();
        this.H = zbuVar;
        final String str = (String) this.M;
        amfb amfbVar = new amfb(new zcc(ylx.b(this.L, zbuVar.a(), new ampg() { // from class: zcf
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ProtoDataStoreListPreference.this.ad(str, str2);
                return str2;
            }
        }), 2), anjk.a);
        this.f163J = amfbVar;
        ylx.n(this.L, amfbVar.c(), new zce(this, str), new zce(this, str, 1));
    }

    public final /* synthetic */ void ai(String str) {
        super.o(str);
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final Object jP(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.M = string;
        return string;
    }

    @Override // androidx.preference.ListPreference
    public final void o(String str) {
        ankt ab = ab(str);
        this.K = ab;
        apy apyVar = this.L;
        yzj yzjVar = this.I;
        yzjVar.getClass();
        ylx.n(apyVar, ab, new epl(yzjVar, 4), new zce(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String s(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
