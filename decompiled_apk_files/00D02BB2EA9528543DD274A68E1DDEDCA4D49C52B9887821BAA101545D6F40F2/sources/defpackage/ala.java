package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ala  reason: default package */
/* loaded from: classes2.dex */
final class ala implements Callable<alg> {
    final /* synthetic */ Context a;
    final /* synthetic */ akz b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    public ala(Context context, akz akzVar, int i, String str) {
        this.a = context;
        this.b = akzVar;
        this.c = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final alg call() {
        alg a = alh.a(this.a, this.b, this.c);
        if (a.a != null) {
            alh.a.c(this.d, a.a);
        }
        return a;
    }
}
