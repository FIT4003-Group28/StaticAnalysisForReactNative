package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aauu  reason: default package */
/* loaded from: classes.dex */
public final class aauu {
    public final arna a;
    public aaux b;

    public aauu(arna arnaVar) {
        arnaVar.getClass();
        this.a = arnaVar;
    }

    public final byte[] a() {
        return this.a.f.I();
    }

    public aauu(String str) {
        aqxo.p(!TextUtils.isEmpty(str));
        this.a = (arna) abgb.e(str, arna.a.getParserForType());
    }
}
