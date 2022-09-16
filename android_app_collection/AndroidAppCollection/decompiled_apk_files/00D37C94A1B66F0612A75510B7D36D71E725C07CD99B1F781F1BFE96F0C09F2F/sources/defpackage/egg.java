package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: egg  reason: default package */
/* loaded from: classes3.dex */
public final class egg implements yjo {
    private final aget a;
    private final agcp b;
    private final yrj c;
    private final ces d;

    public egg(aget agetVar, agcp agcpVar, yrj yrjVar, ces cesVar) {
        this.a = agetVar;
        this.b = agcpVar;
        this.c = yrjVar;
        this.d = cesVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        if (this.c.o()) {
            this.a.b(ages.LOCALE_CHANGED);
        } else {
            try {
                ylx.d(this.b.r(true), egf.a);
            } catch (Exception unused) {
                return 1;
            }
        }
        this.d.b();
        return 0;
    }
}
