package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajmk  reason: default package */
/* loaded from: classes.dex */
public final class ajmk implements yiw {
    final /* synthetic */ Uri a;
    final /* synthetic */ afsl b;

    public ajmk(afsl afslVar, Uri uri) {
        this.b = afslVar;
        this.a = uri;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zep.g("error");
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        afsk afskVar = new afsk((byte[]) obj2, this.b.c.c());
        if (this.b.f != null) {
            zep.g("put in bitmap bytes requester cache.");
            this.b.f.d(this.a, afskVar);
        }
        this.b.g.a().d(this.a, afskVar);
    }
}
