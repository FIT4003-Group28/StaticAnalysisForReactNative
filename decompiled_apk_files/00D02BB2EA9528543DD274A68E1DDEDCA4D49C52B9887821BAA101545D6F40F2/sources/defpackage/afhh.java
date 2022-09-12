package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: afhh  reason: default package */
/* loaded from: classes2.dex */
public final class afhh {
    public final String a;
    public final akqq b;

    public afhh(@dzsi String str, akqq akqqVar) {
        this.a = str;
        this.b = akqqVar;
    }

    public final String a() {
        return String.format(Locale.US, "%f, %f", Double.valueOf(this.b.a), Double.valueOf(this.b.b));
    }
}
