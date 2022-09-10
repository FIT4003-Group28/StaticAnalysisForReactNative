package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozn  reason: default package */
/* loaded from: classes7.dex */
public class ozn implements oxu {
    private final jic a;
    private final Context b;

    public ozn(jic jicVar, Context context) {
        this.a = jicVar;
        this.b = context;
    }

    @Override // defpackage.oxu
    public jic a() {
        return this.a;
    }

    @Override // defpackage.oxu
    public Float b() {
        return Float.valueOf(bfki.a(this.b.getResources()));
    }
}
