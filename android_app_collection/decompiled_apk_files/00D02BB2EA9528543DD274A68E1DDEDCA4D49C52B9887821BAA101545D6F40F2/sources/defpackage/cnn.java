package defpackage;

import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
/* compiled from: PG */
/* renamed from: cnn  reason: default package */
/* loaded from: classes5.dex */
final class cnn implements Runnable {
    final /* synthetic */ NavigationSuggestion a;
    final /* synthetic */ cnr b;

    public cnn(cnr cnrVar, NavigationSuggestion navigationSuggestion) {
        this.b = cnrVar;
        this.a = navigationSuggestion;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
