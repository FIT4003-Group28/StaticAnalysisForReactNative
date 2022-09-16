package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aky  reason: default package */
/* loaded from: classes.dex */
public final class aky implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ akv c;
    final /* synthetic */ int d;

    public aky(String str, Context context, akv akvVar, int i) {
        this.a = str;
        this.b = context;
        this.c = akvVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final ala call() {
        return alb.a(this.a, this.b, this.c, this.d);
    }
}
