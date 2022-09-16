package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aldf  reason: default package */
/* loaded from: classes.dex */
public final class aldf implements aldm {
    private final Context a;
    private final alco b;
    private final akze c;
    private final /* synthetic */ int d;

    public aldf(Context context, alco alcoVar, akze akzeVar) {
        this.a = context;
        this.b = alcoVar;
        this.c = akzeVar;
    }

    public aldf(Context context, alco alcoVar, akze akzeVar, int i) {
        this.d = i;
        this.a = context;
        this.b = alcoVar;
        this.c = akzeVar;
    }

    @Override // defpackage.aldm
    public final String a() {
        return this.d != 0 ? "content" : "file";
    }

    @Override // defpackage.aldm
    public final /* bridge */ /* synthetic */ aldj b(int i, Uri uri, aldi aldiVar) {
        if (this.d == 0) {
            return aldd.a(i, uri, this.a, this.c);
        }
        return aldd.a(i, uri, this.a, this.c);
    }
}
