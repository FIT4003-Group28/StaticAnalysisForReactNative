package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdq  reason: default package */
/* loaded from: classes3.dex */
public final class bdq {
    final Context a;
    final bfh b;
    final bbj c;
    final WorkDatabase d;
    final String e;
    List<bcx> f;
    bcr g = new bcr();
    final bif h;

    public bdq(Context context, bbj bbjVar, bif bifVar, bfh bfhVar, WorkDatabase workDatabase, String str) {
        this.a = context.getApplicationContext();
        this.h = bifVar;
        this.b = bfhVar;
        this.c = bbjVar;
        this.d = workDatabase;
        this.e = str;
    }
}
