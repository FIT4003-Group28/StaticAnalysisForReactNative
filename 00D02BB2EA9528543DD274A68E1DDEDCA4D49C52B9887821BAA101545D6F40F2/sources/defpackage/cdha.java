package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: cdha  reason: default package */
/* loaded from: classes4.dex */
public final class cdha {
    public final Application a;
    public final dvln b;

    public cdha(Application application, btvo btvoVar) {
        this.a = application;
        dvln dvlnVar = btvoVar.getPhotoTakenNotificationParameters().i;
        this.b = dvlnVar == null ? dvln.e : dvlnVar;
    }
}
