package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProtoDataStoreSwitchPreference extends SwitchPreference implements zcj {
    public zcn c;
    private zbu d;
    private yzj e;
    private ankt f;
    private apy g;
    private Object h;
    private ankt i;

    public ProtoDataStoreSwitchPreference(Context context) {
        super(context);
        this.f = anlz.q(null);
    }

    private final ankt ak(Boolean bool) {
        if (U()) {
            return this.d.b(bool);
        }
        return anlz.q(null);
    }

    @Override // androidx.preference.Preference
    public final boolean Q(final Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            apy apyVar = this.g;
            ankt ak = ak((Boolean) obj);
            yzj yzjVar = this.e;
            yzjVar.getClass();
            ylx.n(apyVar, ak, new epl(yzjVar, 5), new zdt() { // from class: zck
                @Override // defpackage.zdt
                public final void a(Object obj2) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = ProtoDataStoreSwitchPreference.this;
                    Object obj3 = obj;
                    Void r3 = (Void) obj2;
                    zcn zcnVar = protoDataStoreSwitchPreference.c;
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
    public final boolean R(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void X(boolean z) {
    }

    public final ankt ad() {
        return ylx.b(this.g, this.i, new zcm(this));
    }

    public final ankt ae(Boolean bool) {
        return anlz.r(ylx.b(this.g, anhq.h(anko.q(this.d.a()), Exception.class, new liw(bool, 8), ylx.a), new zcm(this, 1)));
    }

    @Override // defpackage.zcj
    public final void af(yzj yzjVar) {
        this.e = yzjVar;
    }

    @Override // defpackage.zcj
    public final void ag(apy apyVar) {
        this.g = apyVar;
    }

    @Override // defpackage.zcj
    public final void ah(Map map) {
        zbu zbuVar = (zbu) map.get(this.s);
        zbuVar.getClass();
        this.d = zbuVar;
        this.i = ae((Boolean) this.h);
    }

    public final /* synthetic */ void ai(boolean z) {
        super.k(z);
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
        this.h = jP;
        return jP;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(final boolean z) {
        ankt ak = ak(Boolean.valueOf(z));
        this.f = ak;
        apy apyVar = this.g;
        yzj yzjVar = this.e;
        yzjVar.getClass();
        ylx.n(apyVar, ak, new epl(yzjVar, 5), new zdt() { // from class: zcl
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Void r3 = (Void) obj;
                ProtoDataStoreSwitchPreference.this.ai(z);
            }
        });
    }

    public ProtoDataStoreSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = anlz.q(null);
        aqxo.q(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }
}
