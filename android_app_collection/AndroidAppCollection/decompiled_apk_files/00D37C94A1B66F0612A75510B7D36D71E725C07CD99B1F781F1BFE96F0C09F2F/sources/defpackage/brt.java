package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: PG */
/* renamed from: brt  reason: default package */
/* loaded from: classes2.dex */
public final class brt {
    final Context a;
    final btk b;
    final bps c;
    final WorkDatabase d;
    final String e;
    List f;
    final bwn g;

    public brt(Context context, bps bpsVar, bwn bwnVar, btk btkVar, WorkDatabase workDatabase, String str) {
        new aed();
        this.a = context.getApplicationContext();
        this.g = bwnVar;
        this.b = btkVar;
        this.c = bpsVar;
        this.d = workDatabase;
        this.e = str;
    }
}
