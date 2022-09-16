package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
/* compiled from: PG */
/* renamed from: adaq  reason: default package */
/* loaded from: classes.dex */
public final class adaq implements yiw {
    final /* synthetic */ adpz a;

    public adaq(adpz adpzVar) {
        this.a = adpzVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zep.f(adas.a, "error updating AppStatus.", exc);
        this.a.a(AppStatus.d(-2));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        this.a.a((AppStatus) obj2);
    }
}
