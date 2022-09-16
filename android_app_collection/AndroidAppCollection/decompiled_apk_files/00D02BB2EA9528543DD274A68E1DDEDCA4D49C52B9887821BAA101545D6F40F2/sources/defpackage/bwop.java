package defpackage;

import android.content.Context;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bwop  reason: default package */
/* loaded from: classes4.dex */
public final class bwop {
    public final String a;
    public final String b;
    public final dpvf c;
    public final cqtd d;
    public final ddho e;

    public bwop(Context context, dpvf dpvfVar, int i, int i2, ddho ddhoVar) {
        this.c = dpvfVar;
        String string = context.getString(i);
        this.a = string;
        this.d = cqrt.g(i2, ibl.b());
        this.b = string.toLowerCase(Locale.getDefault());
        this.e = ddhoVar;
    }

    public bwop(String str, String str2, int i, cqtd cqtdVar, ddho ddhoVar) {
        this.a = str;
        this.b = str2;
        this.c = dpvf.b(i);
        this.d = cqrt.i(cqtdVar, ibl.b());
        this.e = ddhoVar;
    }
}
