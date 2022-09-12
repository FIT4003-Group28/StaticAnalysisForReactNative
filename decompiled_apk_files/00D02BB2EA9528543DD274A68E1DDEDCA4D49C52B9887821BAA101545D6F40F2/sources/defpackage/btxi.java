package defpackage;

import android.content.Context;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btxi  reason: default package */
/* loaded from: classes.dex */
public final class btxi implements Runnable {
    @dzsi
    final btlu a;
    final Locale b;
    final String c;
    final boolean d;
    public volatile boolean e = false;
    public volatile btzc f;
    final /* synthetic */ btxk g;

    public btxi(@dzsi btxk btxkVar, btlu btluVar, Locale locale, String str, boolean z) {
        this.g = btxkVar;
        this.a = btluVar;
        this.b = locale;
        this.c = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            return;
        }
        long j = btxk.a;
        this.b.toString();
        btwo btwoVar = this.g.c;
        btlu btluVar = this.a;
        Locale locale = this.b;
        btxh btxhVar = new btxh(this);
        btwoVar.a.a().a().e = btluVar;
        ckcq a = ((ckcr) btwoVar.b.a().a(ckja.c)).a();
        Context context = btwoVar.e;
        this.f = btwoVar.a.a().c().a(btxd.b(btwoVar.f, locale, btwoVar.c, btwoVar.d, context), new btwn(a, btxhVar), bvrj.BACKGROUND_THREADPOOL);
    }
}
