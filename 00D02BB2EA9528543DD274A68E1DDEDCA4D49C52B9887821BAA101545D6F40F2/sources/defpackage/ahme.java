package defpackage;

import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
/* compiled from: PG */
/* renamed from: ahme  reason: default package */
/* loaded from: classes2.dex */
final class ahme implements ahsu {
    final /* synthetic */ ahmf a;

    public ahme(ahmf ahmfVar) {
        this.a = ahmfVar;
    }

    @Override // defpackage.ahsu
    public final void a(int i, float f, boolean z) {
        this.a.a.b(new GpsStatusEvent(f));
    }
}
