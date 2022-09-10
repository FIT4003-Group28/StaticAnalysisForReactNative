package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ajew  reason: default package */
/* loaded from: classes2.dex */
public class ajew {
    public final Resources a;

    public ajew(Resources resources) {
        this.a = resources;
    }

    public static boolean a(dqyh dqyhVar) {
        int a = dqjn.a(dqyhVar.b);
        if (a == 0) {
            a = 1;
        }
        dqjl b = dqjl.b(dqyhVar.c);
        if (b == null) {
            b = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        return (b == dqjl.UNKNOWN_ACTIVITY_TYPE || a == 1 || a == 2) ? false : true;
    }
}
