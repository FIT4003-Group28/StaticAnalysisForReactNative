package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: lnf  reason: default package */
/* loaded from: classes3.dex */
final class lnf implements fqc {
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ lni b;

    public lnf(lni lniVar, ContentResolver contentResolver) {
        this.b = lniVar;
        this.a = contentResolver;
    }

    @Override // defpackage.fqc
    public final void a() {
        this.a.unregisterContentObserver(this.b);
    }

    @Override // defpackage.fqc
    public final void b() {
        this.a.registerContentObserver(Settings.System.CONTENT_URI, true, this.b);
        this.b.d();
    }
}
