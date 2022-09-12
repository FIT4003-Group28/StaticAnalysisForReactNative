package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acpm  reason: default package */
/* loaded from: classes2.dex */
public final class acpm implements dsmz<String> {
    final /* synthetic */ Uri a;
    final /* synthetic */ acpo b;

    public acpm(acpo acpoVar, Uri uri) {
        this.b = acpoVar;
        this.a = uri;
    }

    @Override // defpackage.dsmz
    public final String a() {
        return this.a.getPath();
    }

    @Override // defpackage.dsmz
    public final dsmz<String> b(String str) {
        return this.b.b(this.a.buildUpon().encodedPath(str).build());
    }

    @Override // defpackage.dsmz
    /* renamed from: toString */
    public final String c() {
        return this.a.toString();
    }
}
