package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: akw  reason: default package */
/* loaded from: classes.dex */
public final class akw implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ akv c;
    final /* synthetic */ int d;

    public akw(String str, Context context, akv akvVar, int i) {
        this.a = str;
        this.b = context;
        this.c = akvVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return alb.a(this.a, this.b, this.c, this.d);
    }
}
