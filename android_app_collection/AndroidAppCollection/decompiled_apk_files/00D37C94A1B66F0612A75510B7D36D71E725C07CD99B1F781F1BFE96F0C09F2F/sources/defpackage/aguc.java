package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aguc  reason: default package */
/* loaded from: classes.dex */
public final class aguc {
    public static Uri a(aipk aipkVar, String str, int i, String str2, long j, long j2, long j3) {
        if (aipkVar == null) {
            return null;
        }
        aipi a = aipkVar.a("/pudl", str, i, str2, j, j2);
        a.c("e", j3);
        return a.a();
    }
}
