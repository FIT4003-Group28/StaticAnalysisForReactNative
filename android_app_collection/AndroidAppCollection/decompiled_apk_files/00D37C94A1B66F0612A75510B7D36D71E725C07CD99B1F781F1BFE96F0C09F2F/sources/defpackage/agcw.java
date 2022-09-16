package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agcw  reason: default package */
/* loaded from: classes.dex */
public final class agcw {
    public final aafo a;
    public final Context b;
    public final afvn c;
    public final abad d;
    public final azqb e;
    public final acti f;

    public agcw(aafo aafoVar, afvn afvnVar, abab ababVar, Context context, azqb azqbVar, acti actiVar, Executor executor) {
        this.b = context;
        this.a = aafoVar;
        this.c = afvnVar;
        this.d = new abad(ababVar, null, executor);
        this.e = azqbVar;
        this.f = actiVar;
    }
}
