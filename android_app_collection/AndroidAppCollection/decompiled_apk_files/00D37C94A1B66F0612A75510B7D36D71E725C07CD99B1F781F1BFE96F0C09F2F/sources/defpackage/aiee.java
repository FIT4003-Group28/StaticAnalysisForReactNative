package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
/* compiled from: PG */
/* renamed from: aiee  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiee implements ayqb {
    public final /* synthetic */ WillAutonavInformer a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiee(WillAutonavInformer willAutonavInformer, int i) {
        this.b = i;
        this.a = willAutonavInformer;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            WillAutonavInformer willAutonavInformer = this.a;
            Throwable th = (Throwable) obj;
            zep.c("WillAutonavInformer", "Error with retrieving isAutoNavDisabled value.");
            willAutonavInformer.g = false;
            return;
        }
        this.a.g = ((Boolean) obj).booleanValue();
    }
}
