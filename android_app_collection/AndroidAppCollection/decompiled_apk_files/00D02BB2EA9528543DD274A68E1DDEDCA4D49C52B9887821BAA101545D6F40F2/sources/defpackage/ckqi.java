package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ckqi  reason: default package */
/* loaded from: classes.dex */
final class ckqi implements dsmz<String> {
    private final Uri a;

    public ckqi(Uri uri) {
        this.a = uri;
    }

    public ckqi(String str) {
        this.a = Uri.parse(str);
    }

    @Override // defpackage.dsmz
    public final String a() {
        return this.a.getPath();
    }

    @Override // defpackage.dsmz
    public final /* bridge */ /* synthetic */ dsmz<String> b(String str) {
        return new ckqi(this.a.buildUpon().encodedPath(str).build());
    }

    @Override // defpackage.dsmz
    /* renamed from: toString */
    public final String c() {
        return this.a.toString();
    }
}
