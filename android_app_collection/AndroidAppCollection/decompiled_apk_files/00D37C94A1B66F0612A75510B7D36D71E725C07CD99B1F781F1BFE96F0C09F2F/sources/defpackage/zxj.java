package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: zxj  reason: default package */
/* loaded from: classes4.dex */
public final class zxj implements aldm {
    private final Context a;
    private final alco b;
    private final akze c;
    private final aacz d;

    public zxj(Context context, aacz aaczVar, alco alcoVar, akze akzeVar) {
        this.a = context;
        aaczVar.getClass();
        this.d = aaczVar;
        this.b = alcoVar;
        this.c = akzeVar;
    }

    @Override // defpackage.aldm
    public final String a() {
        return "goog-edited-video";
    }

    @Override // defpackage.aldm
    public final /* bridge */ /* synthetic */ aldj b(int i, Uri uri, aldi aldiVar) {
        return new zxi(i, uri, this.a, this.d, this.c, aldiVar, this.b);
    }
}
